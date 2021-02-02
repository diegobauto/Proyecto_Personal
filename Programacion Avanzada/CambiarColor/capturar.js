function cambiarColor(){
    capturarNumero = parseInt(document.getElementById("numero").value)
    elemeto = document.getElementById("elemento").innerHTML

    switch (capturarNumero) {
        case 1:
            elemento.style.color ="yellow";
            elemento.style.fontSize = "60px"
            break;
        case 2:
            elemento.style.color ="red";
            break;
        case 3:
            elemento.style.color ="blue";
            break;
        case 4:
            elemento.style.color ="green";
            break;
        default:
            elemento.style.color ="black";
            break;
    }
}