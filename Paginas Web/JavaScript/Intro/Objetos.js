//Clase persona
let persona = {
    nombre: "Diego",
    apellido: "Bautista",
    edad: 20,

    //Metodos
    nombreCompleto: function() {
        return this.nombre+" "+this.apellido;
    },

    todoIncluido: todo 
}

//Acceder a una propiedad/atributo de mi objeto
console.log(persona.nombre);
console.log(persona.edad);
console.log(persona);

//Acceder a mi metodo nombreCompleto de la clase persona
console.log(persona.nombreCompleto());

//Haciendo un metodo por fuero e incluyendolo dentro de mi clase persona
function todo() {
    return this.nombreCompleto()+" "+this.edad;
}
console.log(persona.todoIncluido());
