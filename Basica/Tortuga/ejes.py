from turtle import*
from tkinter import messagebox as MessageBox
#m y b entrada
#y=mx+b

m= float(numinput("Entrada de Datos", "Pendiente(m):"))
b= float(numinput("Entrada de Datos", "Punto de corte(b): "))
while (b<0 or b>10):
    MessageBox.showinfo("¡RECORDAR!", "El punto de corte debe estar entre 0 y 10")
    b = int(numinput("Entrada de Datos", "Digite Nuevamente el punto de corte(b): "))

def inicializar():
    shapesize(2) #tamaño
    shape("turtle")
    speed(10) #velocidad
    penup()
    goto(0,0)
    pendown()
def ejes():
    left(90)
    forward(400)
    goto(0,0)
    left(-90)
    forward(400)

def plano_cartesiano():
    goto(0,0)
    e=20;x=0;y=0
    for j in range(10):
        pendown()
        forward(e)
        left(-90)
        x=x+40
        penup()
        goto(x,0)
        pendown()
        write(j+1)
        forward(5)
        left(90)
        goto(x,0)
    goto(0,0)
    left(90)
    for j in range(10):
        pendown()
        forward(e)
        left(-90)
        y=y+40
        penup()
        goto(0,y)
        pendown()
        write(j+1,True,"right")
        forward(-5)
        left(90)
        goto(0,y)
def lineas():
    y=0;x=0
    for i in range(11):
        y=((m*x)+b)
        print("Eje:(",x,",",y,")")
        goto(float(x*40),float(y*40))
        dot(10)
        x=i+1
        if(m<0):
            p=m/20
            for i in range(10):
                pendown()
                forward(p)
                penup()
                forward(p)
def main():
    inicializar()
    ejes()
    plano_cartesiano()
    hideturtle()
    lineas()

main()

exitonclick()