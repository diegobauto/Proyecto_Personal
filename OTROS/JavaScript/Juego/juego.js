//Indicar que cuando pulse espacio(tecla 32) bote por consola que esta saltando
document.addEventListener('keydown', function(evento){
    if(evento.keyCode == 32){
        if(nivel.muerto == false){
            saltar();
        }
        else{
            nivel.velocidad = 9;
            nivel.muerto = false;
            nube.velocidad = 1;
            cactus.x = ancho + 100;
            nube.x = 700;
            nivel.marcador=0;
        }
    }
})

//Dibuje en el canvas distintos elementos
var ancho = 700;
var alto = 300;
var canvas,ctx;
var suelo = 180;
var FPS = 50;
var trex = {y:suelo, vy:0, gravedad:2, salto:28, vymax:9, saltando:false};
var nivel = {velocidad:9, marcador:0, muerto:false};
var cactus = {x:ancho+100, y:suelo-40};
var nube = {x:400, y:8, velocidad:1};
var suelog = {x:0,y: suelo};

function inicializar(){
    //Obtener un elemento del html
    canvas = document.getElementById('canvas');
    //Como funciona la pantalla, en este caso en 2d
    ctx = canvas.getContext('2d');
    cargaImagenes();
}

//Necesita borrar pantalla para que no se vea los fotogramas por segundo
function borraCanvas(){
    canvas.width = ancho;
    canvas.height = alto;
}


//Cargar imagenes
var imgRex, imgNube, imgCactus, imgSuelo;
function cargaImagenes(){
    imgRex = new Image();
    imgNube = new Image();
    imgCactus = new Image();
    imgSuelo = new Image();

    imgRex.src = 'img/mario.png';
    imgNube.src = 'img/nube.png';
    imgCactus.src = 'img/tubo.png';
    imgSuelo.src = 'img/suelo.jpg';
}

//----------------------------------------------
function dibujarMario(){
    //drawImage(imagen,recortex,recortey,pixelesancho,pixeleslargo,posiciox,posiciony,tamañoancho,tamañolargo)
    ctx.drawImage(imgRex,0,0,1812,2261,100,trex.y,60,60);
}

function saltar(){
    trex.saltando = true;
    trex.vy = trex.salto;
}

function gravedad(){
    if(trex.saltando == true){   
        if (trex.y - trex.vy - trex.gravedad > suelo){
            trex.saltando = false;
            trex.vy = 0;
            trex.y = suelo;
        }
        else{
            trex.vy -= trex.gravedad;
            trex.y -= trex.vy;
        }   
    }
}

//----------------------------------------------
function dibujarTubo(){
    //drawImage(imagen,recortex,recortey,pixelesancho,pixeleslargo,posiciox,posiciony,tamañoancho,tamañolargo)
    ctx.drawImage(imgCactus,0,0,512,512,cactus.x,cactus.y,70,100);
}

function logicaTubo(){
    if(cactus.x < -100){
        cactus.x = ancho + 100;
        nivel.marcador++;
        nivel.velocidad++;
    }
    else{
        cactus.x -= nivel.velocidad;
    }
}

//----------------------------------------------
function dibujarNube(){
    //drawImage(imagen,recortex,recortey,pixelesancho,pixeleslargo,posiciox,posiciony,tamañoancho,tamañolargo)
    ctx.drawImage(imgNube,0,0,220,220,nube.x,nube.y,100,100);
}

function logicaNube(){
    if(nube.x < -100){
        nube.x = ancho + 100;
    }
    else{
        nube.x -= nube.velocidad;
    }
}


//----------------------------------------------
function dibujarSuelo(){
    //drawImage(imagen,recortex,recortey,pixelesancho,pixeleslargo,posiciox,posiciony,tamañoancho,tamañolargo)
    ctx.drawImage(imgSuelo,suelog.x,0,960,480,0,240,1145,350);
}

function logicaSuelo(){
    if(suelog.x > 700){
        suelog.x = 0;
    }
    else{
        suelog.x += nivel.velocidad;
    }
}


function colision(){
    if(cactus.x >= 100 && cactus.x <= 160){
        if(trex.y >= suelo-40){
            nivel.muerto = true;
            nivel.velocidad = 0;
            nube.velocidad = 0;
        }
    }
}


function puntuacion(){
    ctx.font = "30px impact";
    ctx.fillStyle = '#555555';
    ctx.fillText(`${nivel.marcador}`,650,50);

    if(nivel.muerto == true){
        ctx.font = "60px impact";
        ctx.fillText(`GAME OVER`,220,150);
    }
}

//Bucle principal, LO QUE HACE ES DECIR CADA CUANTO TIEMPO TIENE QUE EJECUTARSE
//setInterval -> Intervalo de tiempo
setInterval(function(){
    principal();
}, 1000/FPS);


//Función principal - Todo lo que va haciendo el juego
function principal(){
    borraCanvas();
    gravedad();
    colision();
    logicaTubo();
    logicaNube();
    dibujarSuelo();
    dibujarTubo();
    dibujarNube();    
    dibujarMario();
    puntuacion();
}