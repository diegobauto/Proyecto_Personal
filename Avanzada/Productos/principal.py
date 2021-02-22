from flask import Flask, request, url_for, redirect, render_template, jsonify
from flask_sqlalchemy import SQLAlchemy
from flask_cors import CORS, cross_origin

app = Flask(__name__)
app.config['SQLALCHEMY_DATABASE_URI'] = 'sqlite:///productos.db'
app.config['SECRET_KEY'] = "123"
cors = CORS(app)

db = SQLAlchemy(app)

class producto(db.Model):
    id = db.Column("producto_id", db.Integer, primary_key=True)
    producto_nombre = db.Column(db.String(100))
    producto_valor = db.Column(db.Integer)
    producto_cantidad = db.Column(db.Integer)
    
    def __init__(self, datos):
        self.producto_nombre = datos["nombre"]
        self.producto_valor = datos["valor"]
        self.producto_cantidad = datos["cantidad"]

@app.route("/")
@cross_origin()
def principal():
    arreglo = producto.query.all()
    diccionario = {}
    if(len(arreglo)>0):
        for x in arreglo:
            diccionario[x.id] = {'nombre':x.producto_nombre, 'valor':x.producto_valor, 'cantidad':x.producto_cantidad}
            myJson = jsonify({'PRODUCTOS':diccionario})
    else:
        myJson = jsonify({'vacio':'vacio'})
    return myJson

@app.route("/index")
def index():
    return render_template('index.html')

#Agregar un producto 
@app.route("/agregar", methods=["POST", "GET"])
def agregar():
    if request.method == "POST":
        datos = {"nombre": request.form["nombre"], "valor": request.form["valor"], "cantidad": request.form["cantidad"]}
        p = producto(datos)
        db.session.add(p)
        db.session.commit()
    return render_template("agregarProducto.html")

#Sacar una cantidad del producto (restar la cantidad a un producto)
@app.route("/sacar", methods=["POST", "GET"])
def sacar():
    if request.method == "POST":
        p = producto.query.filter_by(id=producto.id).first()
        if int(request.form["cantidad"]) <= int(p.producto_cantidad):
            p.producto_cantidad -= int(request.form["cantidad"])
        db.session.commit()
    return render_template("cambiarCantidad.html", productos = producto.query.all())

#Agregar mas cantidad al producto
@app.route("/introducir", methods=["POST", "GET"])
def introducir():
    if request.method == "POST":
        p = producto.query.filter_by(id=producto.id).first()
        p.producto_cantidad += int(request.form["cantidad"])
        db.session.commit()
    return render_template("cambiarCantidad.html", productos = producto.query.all())

@app.route("/eliminar")
def eliminar():
    p = producto.query.filter_by(id=producto.id).first()
    db.session.delete(p)
    db.session.commit()
    return redirect(url_for('index'))

@app.route("/cambiarValor", methods=["POST", "GET"])
def cambiarValor():
    if request.method == "POST":
        p = producto.query.filter_by(id=producto.id).first()
        p.producto_valor = request.form["valor"]
        db.session.commit()
    return render_template("cambiarValor.html", productos = producto.query.all())

@app.route("/cambiarCantidad", methods=["POST", "GET"])
def cambiarCantidad():
    if request.method == "POST":
        p = producto.query.filter_by(id=producto.id).first()
        p.producto_cantidad = request.form["cantidad"]
        db.session.commit()
    return render_template("cambiarCantidad.html", productos = producto.query.all())

#Agregar un producto 
"""@app.route("/agregar/<nombre>/<int:valor>/<int:cantidad>")
def agregar(nombre, valor, cantidad):
    datos = {"nombre": nombre, 
             "cantidad": cantidad,
             "valor": valor
    }
    p = producto(datos)
    db.session.add(p)
    db.session.commit()
    return redirect(url_for('principal'))"""

"""#Sacar una cantidad del producto (restar la cantidad a un producto)
@app.route("/sacar/<int:id>/<int:cantidad>")
def sacar(id, cantidad):
    p = producto.query.filter_by(id=id).first()
    if cantidad <= p.producto_cantidad:
        p.producto_cantidad -= cantidad
    db.session.commit()
    return redirect(url_for('principal'))"""

#Agregar mas cantidad al producto
"""@app.route("/introducir/<int:id>/<int:cantidad>")
def introducir(id, cantidad):
    p = producto.query.filter_by(id=id).first()
    p.producto_cantidad += cantidad
    db.session.commit()
    return redirect(url_for('principal'))"""

#Eliminar un producto 
"""@app.route("/eliminar/<int:id>")
def eliminar(id):
    p = producto.query.filter_by(id=id).first()
    db.session.delete(p)
    db.session.commit()
    return redirect(url_for('principal'))"""

#Cambiar valor del producto 
"""@app.route("/cambiarValor/<int:id>/<int:valor>")
def cambiarValor(id, valor):
    p = producto.query.filter_by(id=id).first()
    p.producto_valor = valor
    db.session.commit()
    return redirect(url_for('principal'))"""

#Cambiar cantidad del producto 
"""@app.route("/cambiarCantidad/<int:id>/<int:cantidad>")
def cambiarCantidad(id, cantidad):
    p = producto.query.filter_by(id=id).first()
    p.producto_cantidad = cantidad
    db.session.commit()
    return redirect(url_for('principal'))"""

#Cambiar cantidad del producto 
@app.route("/borrarTodo")
def borrarTodo():
    arreglo = producto.query.all()
    for x in arreglo:
        db.session.delete(x)
    db.session.commit()
    return redirect(url_for('principal'))

if __name__ == "__main__":
    db.create_all()
    app.run(debug=True)


