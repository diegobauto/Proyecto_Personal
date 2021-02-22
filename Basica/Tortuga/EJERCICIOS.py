from turtle import *

cont = ["^:",0,"v:",0,"<-:",0,"->:",0,"(q):",0,"(c):",0,"(+):",0,"(-):",0,"(s):",0,"(b):",0,"Space:",0,"(.):",0,"(*):",0,
        "(m):",0,"(l):",0,"(0):",0,"(1):",0,"(2):",0,"(3):",0,"(4):",0,"(5):",0,"(6):",0,"(7):",0,"(8):",0,"(9):",0,"(f):",0]

def inicializar():
    screensize(500, 500)
    shapesize(2)
    pensize(1)
    showturtle()
    speed(1)
    shape("turtle")
    onkey(arriba, "Up")
    onkey(abajo, "Down")
    onkey(izq, "Left")
    onkey(der, "Right")
    onkey(salir, "q")
    onkey(color, "c")
    onkey(aum_tamaño, "+")
    onkey(dis_tamaño, "-")
    onkey(sub_lapiz, "s")
    onkey(baj_lapiz, "b")
    onkey(salto, "space")
    onkey(linea_punteada, ".")
    onkey(linea_solida, "*")
    onkey(marca, "m")
    onkey(limpiar, "l")
    onkey(vl0, "0")
    onkey(vl1, "1")
    onkey(vl2, "2")
    onkey(vl3, "3")
    onkey(vl4, "4")
    onkey(vl5, "5")
    onkey(vl6, "6")
    onkey(vl7, "7")
    onkey(vl8, "8")
    onkey(vl9, "9")
    onkey(estadisticas, "v")
    onkey(fondo,"f")

    listen()

def arriba():
    setheading(90)
    cont[1] = cont[1] + 1
    print("Arriba: %d" % cont[1])

def abajo():
    setheading(270)
    cont[3] = cont[3] + 1
    print("Abajo: %d" % (cont[3]))

def izq():
    setheading(180)
    cont[5] = cont[5] + 1
    print("Izquierda: %d" % cont[5])

def der():
    setheading(360)
    cont[7] = cont[7] + 1
    print("Derecha: %d" % cont[7])

def salir():
    bye()
    cont[9] = cont[9] + 1
    print("Salir: %d" % (cont[9]))

def color():
    pencolor("red")
    cont[11] = cont[11] + 1
    print("Color: %d" % cont[11])

def aum_tamaño():
    pensize(5)
    cont[13] = cont[13] + 1
    print("Tamaño(+): %d" % cont[13])

def dis_tamaño():
    pensize(1)
    cont[15] = cont[15] + 1
    print("Tamaño(-): %d" % cont[15])

def sub_lapiz():
    penup()
    cont[17] = cont[17] + 1
    print("Subir Lapiz: %d" % cont[17])

def baj_lapiz():
    pendown()
    cont[19] = cont[19] + 1
    print("Bajar Lapiz: %d" % cont[19])

def linea_punteada():
    cont[21] = cont[21] + 1
    print("Punteada: %d" % cont[21])
    j = 1
    while (j == 1):
        pendown()
        forward(velocidad)
        penup()
        forward(velocidad)

def linea_solida():
    cont[23] = cont[23] + 1
    print("Solida: %d" % cont[23])
    j = 2
    while (j == 2):
        forward(1)

def salto():
    cont[25] = cont[25] + 1
    print("Salto: %d" % cont[25])
    penup()
    fd(50)
    pendown()

def marca():
    cont[27] = cont[27] + 1
    print("Marca: %d" % cont[27])
    stamp()


def limpiar():
    cont[29] = cont[29] + 1
    print("Limpiar: %d" % cont[29])
    clear()


velocidad = 1
def vl0():
    global velocidad
    velocidad = 0
    cont[31] = cont[31] + 1
    print("Vel(0): %d" % cont[31])
def vl1():
    global velocidad
    velocidad = 1
    cont[33] = cont[33] + 1
    print("Vel(1): %d" % cont[33])
def vl2():
    global velocidad
    velocidad = 2
    cont[35] = cont[35] + 1
    print("Vel(2): %d" % cont[35])
def vl3():
    global velocidad
    velocidad = 3
    cont[37] = cont[37] + 1
    print("Vel(3): %d" % cont[37])
def vl4():
    global velocidad
    velocidad = 4
    cont[39] = cont[39] + 1
    print("Vel(4): %d" % cont[39])
def vl5():
    global velocidad
    velocidad = 5
    cont[41] = cont[41] + 1
    print("Vel(5): %d" % cont[41])
def vl6():
    global velocidad
    velocidad = 6
    cont[41] = cont[41] + 1
    print("Vel(6): %d" % cont[41])
def vl7():
    global velocidad
    velocidad = 7
    cont[43] = cont[43] + 1
    print("Vel(7): %d" % cont[43])
def vl8():
    global velocidad
    velocidad = 8
    cont[45] = cont[45] + 1
    print("Vel(8): %d" % cont[45])
def vl9():
    global velocidad
    velocidad = 9
    cont[47] = cont[47] + 1
    print("Vel(9): %d" % cont[47])

def estadisticas():
        print(cont)

def fondo():
    bgcolor("red")
    cont[49] = cont[49] + 1
    print("Fondo: %d" % cont[49])

def main():
    inicializar()
    while (True):
        forward(velocidad)


main()