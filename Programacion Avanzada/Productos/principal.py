from flask import Flask, request, url_for, redirect, render_template, session
from flask_sqlalchemy import SQLAlchemy

app = Flask(__name__)
app.config['SQLALCHEMY_DATABASE_URI'] = 'sqlite:///productos.db'
app.config['SECRET_KEY'] = "123"

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
def principal():
    return render_template("lista.html", productos = producto.query.all())

#Agregar un producto 
@app.route("/agregar/<nombre>/<int:valor>/<int:cantidad>")
def agregar(nombre, valor, cantidad):
    datos = {"nombre": nombre, 
             "cantidad": cantidad,
             "valor": valor
    }
    p = producto(datos)
    db.session.add(p)
    db.session.commit()
    return render_template("lista.html", productos = producto.query.all())

#Sacar una cantidad del producto (restar la cantidad a un producto)
@app.route("/sacar/<int:id>/<int:cantidad>")
def sacar(id, cantidad):
    p = producto.query.filter_by(id=id).first()
    if cantidad <= p.producto_cantidad:
        p.producto_cantidad -= cantidad
    db.session.commit()
    return render_template("lista.html", productos = producto.query.all())

#Agregar mas cantidad al producto
@app.route("/introducir/<int:id>/<int:cantidad>")
def introducir(id, cantidad):
    p = producto.query.filter_by(id=id).first()
    p.producto_cantidad += cantidad
    db.session.commit()
    return render_template("lista.html", productos = producto.query.all())

#Eliminar un producto 
@app.route("/eliminar/<int:id>")
def eliminar(id):
    p = producto.query.filter_by(id=id).first()
    db.session.delete(p)
    db.session.commit()
    return render_template("lista.html", productos = producto.query.all())

#Cambiar valor del producto 
@app.route("/cambiarValor/<int:id>/<int:valor>")
def cambiarValor(id, valor):
    p = producto.query.filter_by(id=id).first()
    p.producto_valor = valor
    db.session.commit()
    return render_template("lista.html", productos = producto.query.all())


#Cambiar cantidad del producto 
@app.route("/cambiarCantidad/<int:id>/<int:cantidad>")
def cambiarCantidad(id, cantidad):
    p = producto.query.filter_by(id=id).first()
    p.producto_cantidad = cantidad
    db.session.commit()
    return render_template("lista.html", productos = producto.query.all())

#Cambiar cantidad del producto 
@app.route("/borrarTodo")
def borrarTodo():
    arreglo = producto.query.all()
    for x in arreglo:
        db.session.delete(x)
    db.session.commit()
    return render_template("lista.html", productos = producto.query.all())

if __name__ == "__main__":
    db.create_all()
    app.run(debug=True)