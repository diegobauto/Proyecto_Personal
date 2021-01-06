from turtle import*
n= int(input("Ingresa n: "))
print("El valor de pasos que digito es:",n)

def inicializar():
    shapesize(2) #tamaño
    shape("turtle")
    speed(1) #velocidad
    penup()
    goto(-400,0)
    pendown()


def lineas():
    p=n/20
    for i in range(10):
        pendown()
        forward(p)
        penup()
        forward(p)
    hideturtle()

def cuadrado():
    goto(50,50)
    showturtle()
    pendown()
    for c in range(4):
        forward(n) #adelante
        left(-90) #Izq
    left(-45)
    forward(n+(n/2.3))
    penup()
    goto(50+n,50)
    pendown()
    left(-90)
    forward(n+(n/2.3))

def main():
    inicializar()
    lineas()
    cuadrado()

main()

exitonclick()