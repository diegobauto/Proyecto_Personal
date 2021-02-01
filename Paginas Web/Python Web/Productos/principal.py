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

    def __init__(self, datos):
        self.nombreProducto = datos["nombre"]
        self.valorProducto = datos["valor"]
        self.cantidadProducto = datos["cantidad"]


@app.route('/agregar',methods=["POST", "GET"])
def agregar():
    if request.method == "POST":
        datos = {"nombre": request.form["nombre"], "valor": request.form["valor"], "cantidad": request.form["cantidad"]}
        p = producto(datos)
        db.session.add(p)
        db.session.commit()
    return render_template("form.html")
    
@app.route('/eliminar/<int:id>')
def eliminar(id):
    p = producto.query.filter_by(id=id).first()
    db.session.delete(p)
    db.session.commit()
    return render_template("index.html", productos=producto.query.all())

@app.route('/')
def main():
    return render_template("index.html", productos=producto.query.all())
    

if __name__ == '__main__':
    db.create_all()
    app.run(debug=True)