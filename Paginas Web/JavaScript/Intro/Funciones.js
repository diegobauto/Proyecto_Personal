/*
La llamamos a si misma
No la podemos reutilizar
*/
(function name() {
  console.log("Ejecuntando");
})();

(function sumar(num1, num2) {
  console.log("La suma es: " + (num1 + num2));
})(5, 3);

//Funciones tipo flecha
const sumarFuncionTipoFlecha = (a,b) => a+b;
resultado = sumarFuncionTipoFlecha(5,8);
console.log(resultado);

//Sumar todos loas argumentos de un arreglo
function sumarArgumentos(){
    let suma=0;
    for (let i = 0; i < arguments.length; i++) {
        suma += arguments[i];
    }
    return suma;
}
let resultadoArg = sumarArgumentos(1,2,3,4,5,6,7,8,9);
console.log(resultadoArg);
