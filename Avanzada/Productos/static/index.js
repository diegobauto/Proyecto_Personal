const elemento = document.getElementById("datos");
cadena = "";

const url = 'http://localhost:5000';
fetch(url)
.then(response => response.json())
.then(data => {
    console.log(data);
    cadena = "<table>";
    cadena += "<tr>";
    cadena += "<th> Nombre </th><th> Cantidad </th><th> Valor </th><th colspan=5> Operaciones </th>";
    cadena += "</tr>";
    log = Object.keys(data['PRODUCTOS']).length;
    if(log>0){
        for (x in data['PRODUCTOS']){
            console.log(x)
            cadena += "<tr>";
            cadena += "<td> " + data['PRODUCTOS'][x].nombre + "</td><td>" + data['PRODUCTOS'][x].cantidad + "</td><td>" +  data['PRODUCTOS'][x].valor + "</td>";
            cadena += "<td><a href="+ document.getElementById("enlace").href +">Cambiar Cantidad</a></td>";
            cadena += "<td><a href="+ document.getElementById("enlace1").href +">Cambiar Valor</a></td>";
            cadena += "<td><a href="+ document.getElementById("enlace2").href +">Sacar Cantidad</a></td>";
            cadena += "<td><a href="+ document.getElementById("enlace3").href +">Introducir Cantidad</a></td>";
            cadena += "<td><a href="+ document.getElementById("enlace4").href +">Eliminar</a></td>";
            cadena += "</tr>";
        }
        cadena += "</table>";
        elemento.innerHTML = cadena;
    }
    else{
        alert("no hay nada");
    }
    
    
})