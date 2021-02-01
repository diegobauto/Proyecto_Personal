const nombres = ['Diego','Juan','Pepito'];
console.log(nombres);

console.log(nombres[0]);


nombres.forEach(element => {
    console.log(element);
});

//Modificar un valor
nombres[0] = "Alejandro";
console.log(nombres[0]);

//Agregar mas elementos
nombres.push("Oscar");
console.log(nombres);

//Preguntar si es un arreglo

console.log(Array.isArray(nombres));
console.log(nombres instanceof Array);
