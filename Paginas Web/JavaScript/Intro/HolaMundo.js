/*
La variables son dinamicas
No definimos el tipo de la variable*/

//Variable de tipo String
var nombre = "Diego Alejandro"

//Variable de tipo entero
var numero = 98
console.log("Bienvenido "+nombre);


//Variable de tipo Objeto
var objeto = {
    nombre: "Diego",
    edad: 20
}

console.log(objeto);
console.log(typeof objeto);
console.log(typeof numero);


//Tipo de dato Simbolo
var simbolo = Symbol("mi Simbolo");
console.log(typeof simbolo);


//Clase
class Persona{
    //Creacion del constructor
    constructor(nombre,apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
console.log(typeof Persona)


//Arreglos
var paises = ["Colombia","Argentina","Chile"]
console.log(paises)
//For Each
paises.forEach(element => {
    console.log(element)
});