function calcularImpuesto(){
    var capturarValor = document.getElementById("impuesto").value
    var total = 100;
    var sub_total = capturarValor/1.18
    var IGV = sub_total*0.18

    console.log("Impuesto: "+capturarValor)
    console.log("Sub tottal: "+sub_total)
    console.log("IGV: "+IGV)
}