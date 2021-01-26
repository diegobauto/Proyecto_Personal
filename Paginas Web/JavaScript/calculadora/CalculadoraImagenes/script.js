function iniciar(){
    document.getElementById("display").innerHTML = " ";
    document.getElementById("esconder").innerHTML = " ";
}

function actualizar(elemento){
    if(document.getElementById("display").innerHTML == " "){
        document.getElementById("esconder").innerHTML = elemento.innerText;
        document.getElementById("display").innerHTML = elemento.innerText;
    }   
    else {
        document.getElementById("esconder").innerHTML += elemento.innerText;
        document.getElementById("display").innerHTML +=  elemento.innerText;
    }
}

function evaluar(){
    expresion = document.getElementById("esconder").innerHTML;
    resultado = eval(expresion);
    document.getElementById("esconder").innerHTML = resultado;
    resultadoString = resultado.toString();
    arregloCadena = [];
    for (let i=0; i<resultadoString.length; i++) {
        numero = resultadoString.charAt(i);
        arregloCadena += numero;
        document.getElementById("display").innerHTML = " ";
    }

    for (let j=0; j<arregloCadena.length; j++) {
        document.getElementById("display").innerHTML += document.getElementById("foto"+arregloCadena[j]).value
    }
}

function borrar(){
    expresion = document.getElementById("esconder").innerHTML;
    expresion1 = document.getElementById("display").innerHTML;
    document.getElementById("esconder").innerHTML = expresion.substring(0, expresion.length-1)
    document.getElementById("display").innerHTML = expresion1.substring(0, expresion1.length-1)
    if(document.getElementById("esconder").innerHTML.length <= 0){
        iniciar();
    }
}

function mostrar_imagen(num) {
    valor_actual = document.getElementById("display").innerHTML;
    valor_numero  = document.getElementById("esconder").innerHTML;
    url_imagen = document.getElementById("foto"+num).value;

    if(valor_actual == " "){
        document.getElementById("display").innerHTML = url_imagen;
        document.getElementById("esconder").innerHTML = document.getElementById("foto"+num).innerHTML;
    }
    else {
        document.getElementById("display").innerHTML = valor_actual + url_imagen;
        document.getElementById("esconder").innerHTML = valor_numero + document.getElementById("foto"+num).innerHTML;
    }
    
}