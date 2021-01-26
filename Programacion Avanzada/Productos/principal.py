from flask import Flask, redirect, url_for, request,render_template, session
from flask_sqlalchemy import SQLAlchemy
app = Flask(__name__)

app.config["SQLALCHEMY_DATABASE_URI"] = "sqlite:///productos.db"
app.config["SECRET_KEY"] = "123"
app.config['UPLOAD_FOLDER'] = "./static"
db = SQLAlchemy(app)

class producto(db.Model):
    id = db.Column('producto_id', db.Integer, primary_key = True)
    nombreProducto = db.Column(db.String(100))
    valorProducto = db.Column(db.Integer)
    cantidadProducto = db.Column(db.Integer)

    def __init__(self, nombre, valor, cantidad):
        self.nombreProducto = nombre
        self.valorProducto = valor
        self.cantidadProducto = cantidad


@app.route('/agregar/<nombre>')
def agregar(nombre):
    datos = {"nombreProducto": nombre, "valorProducto": 100, "cantidadProducto": 10}
    p = producto(datos)
    db.session.add(p)
    db.session.commit()

@app.route('/')
def main():
   return producto.query.all()

if __name__ == '__main__':
    db.create_all()
    app.run()