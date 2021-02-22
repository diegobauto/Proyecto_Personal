from turtle import *

cont = ["^:",10,"v:",10,"<-:",10,"->:",10,"(q):",10,"(c):",10,"(+):",10,"(-):",10,"(s):",10,"(b):",10,"Space:",10,"(.):",10,"(*):",10,
        "(m):",10,"(l):",10,"(0):",10,"(1):",10,"(2):",10,"(3):",10,"(4):",10,"(5):",10,"(6):",10,"(7):",10,"(8):",10,"(9):",10,"(f):",10]

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
    cont[1] = cont[1] - 1
    print("Arriba: %d" % cont[1])
    if(cont[1]==0):
        global velocidad
        velocidad=0
        hideturtle()
        write("GAME OVER",font=("Arial",54))

def abajo():
    setheading(270)
    cont[3] = cont[3] - 1
    print("Abajo: %d" % (cont[3]))
    if (cont[3] == 0):
        bye()

def izq():
    setheading(180)
    cont[5] = cont[5] - 1
    print("Izquierda: %d" % cont[5])
    if (cont[5] == 0):
        bye()

def der():
    setheading(360)
    cont[7] = cont[7] - 1
    print("Derecha: %d" % cont[7])
    if (cont[7] == 0):
        bye()

def salir():
    bye()
    cont[9] = cont[9] - 1
    print("Salir: %d" % (cont[9]))
    if (cont[9] == 0):
        bye()

def color():
    pencolor("red")
    cont[11] = cont[11] - 1
    print("Color: %d" % cont[11])
    if (cont[11] == 0):
        bye()

def aum_tamaño():
    pensize(5)
    cont[13] = cont[13] - 1
    print("Tamaño(+): %d" % cont[13])
    if (cont[13] == 0):
        bye()

def dis_tamaño():
    pensize(1)
    cont[15] = cont[15] - 1
    print("Tamaño(-): %d" % cont[15])
    if (cont[15] == 0):
        bye()

def sub_lapiz():
    penup()
    cont[17] = cont[17] - 1
    print("Subir Lapiz: %d" % cont[17])
    if (cont[17] == 0):
        bye()

def baj_lapiz():
    pendown()
    cont[19] = cont[19] - 1
    print("Bajar Lapiz: %d" % cont[19])
    if (cont[19] == 0):
        bye()

def linea_punteada():
    cont[21] = cont[21] - 1
    print("Punteada: %d" % cont[21])
    if (cont[21] == 0):
        bye()
    j = 1
    while (j == 1):
        pendown()
        forward(velocidad)
        penup()
        forward(velocidad)

def linea_solida():
    cont[23] = cont[23] - 1
    print("Solida: %d" % cont[23])
    if (cont[23] == 0):
        bye()
    j = 2
    while (j == 2):
        forward(1)

def salto():
    cont[25] = cont[25] - 1
    print("Salto: %d" % cont[25])
    if (cont[25] == 0):
        bye()
    penup()
    fd(50)
    pendown()

def marca():
    cont[27] = cont[27] - 1
    print("Marca: %d" % cont[27])
    stamp()
    if (cont[27] == 0):
        bye()


def limpiar():
    cont[29] = cont[29] - 1
    print("Limpiar: %d" % cont[29])
    if (cont[29] == 0):
        bye()
    clear()


velocidad = 1
def vl0():
    global velocidad
    velocidad = 0
    cont[31] = cont[31] - 1
    print("Vel(0): %d" % cont[31])
    if (cont[31] == 0):
        bye()
def vl1():
    global velocidad
    velocidad = 1
    cont[33] = cont[33] - 1
    print("Vel(1): %d" % cont[33])
    if (cont[33] == 0):
        bye()
def vl2():
    global velocidad
    velocidad = 2
    cont[35] = cont[35] - 1
    print("Vel(2): %d" % cont[35])
    if (cont[35] == 0):
        bye()
def vl3():
    global velocidad
    velocidad = 3
    cont[37] = cont[37] - 1
    print("Vel(3): %d" % cont[37])
    if (cont[37] == 0):
        bye()
def vl4():
    global velocidad
    velocidad = 4
    cont[39] = cont[39] - 1
    print("Vel(4): %d" % cont[39])
    if (cont[39] == 0):
        bye()
def vl5():
    global velocidad
    velocidad = 5
    cont[41] = cont[41] - 1
    print("Vel(5): %d" % cont[41])
    if (cont[41] == 0):
        bye()
def vl6():
    global velocidad
    velocidad = 6
    cont[43] = cont[43] - 1
    print("Vel(6): %d" % cont[43])
    if (cont[43] == 0):
        bye()
def vl7():
    global velocidad
    velocidad = 7
    cont[45] = cont[45] - 1
    print("Vel(7): %d" % cont[45])
    if (cont[45] == 0):
        bye()
def vl8():
    global velocidad
    velocidad = 8
    cont[47] = cont[47] - 1
    print("Vel(8): %d" % cont[47])
    if (cont[47] == 0):
        bye()
def vl9():
    global velocidad
    velocidad = 9
    cont[49] = cont[49] - 1
    print("Vel(9): %d" % cont[49])
    if (cont[1] == 0):
        bye()

def estadisticas():
        print(cont)

def fondo():
    bgcolor("red")
    cont[51] = cont[51] - 1
    print("Fondo: %d" % cont[51])

"""def mostrar():
    clear()
    goto(-500,500)
    write()"""

def main():
    inicializar()
    while (True):
        forward(velocidad)


main()