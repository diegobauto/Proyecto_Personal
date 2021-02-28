from flask import Flask, url_for, redirect, request, render_template
from werkzeug.utils import secure_filename
import json, requests

app = Flask(__name__)
auth = "ya29.A0AfH6SMDVitwV8V357BpFjQSeOGS-FZd7NepDSoa4FMw6Dxu2fLGe4UMxDw6-UNSdE-dEGMAQUQ0RHdhvc67nVjwSUgdgo5fAk2368PIxm3JnmLZxUh9ew5GNSJtoTZzK1Ks-SbB1wRIFeYT6PhZRHsFdwCM1"

def metodoRespuesta(files):
    headers = {"Authorization": "Bearer "+auth}
    r = requests.post(
        "https://www.googleapis.com/upload/drive/v3/files?uploadType=multipart",
        headers=headers,
        files=files
    )
    return r

@app.route("/crear", methods=['POST'])
def crearCarpeta():
    nombre_carpeta = request.form['carpeta']
    data = {
        "name": nombre_carpeta,
        'mimeType': 'application/vnd.google-apps.folder',
        "parents":["1XCB2OtknwzOUM-kBnI7Bjf1IQmRzWT2d"]
    }
    files = {
        'data': ('metadata', json.dumps(data), 'application/json; charset=UTF-8')
    }
    metodoRespuesta(files)
    return "<h1>Carpeta creada correctamente</h1>"

@app.route("/subir", methods=['POST'])
def subirArchivo():
    if request.method == 'POST':
        archivo = request.files['archivo']
        nombreArchivo = secure_filename(archivo.filename)
        data = {
            "name": nombreArchivo,
            "parents":["1XCB2OtknwzOUM-kBnI7Bjf1IQmRzWT2d"]
        }
        files = {
            'data': ('metadata', json.dumps(data), 'application/json; charset=UTF-8'),
            'file': (archivo)
        }
        metodoRespuesta(files)
    return redirect(url_for("principal"))

@app.route("/")
def principal():
    return render_template("index.html")

if __name__ == "__main__":
    app.run(debug=True)
