from turtle import*	

cont =[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]

def inicializar():
    screensize(500,500)
    shapesize(2)
    pensize(1)
    showturtle()
    speed(1)
    shape("turtle")
    onkey(arriba, "Up")
    onkey(abajo, "Down")
    onkey(izq,"Left")
    onkey(der,"Right")
    onkey(salir,"q")
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
    onkey(vl0,"0")
    onkey(vl1,"1")
    onkey(vl2,"2")
    onkey(vl3,"3")
    onkey(vl4,"4")
    onkey(vl5,"5")
    onkey(vl6,"6")
    onkey(vl7,"7")
    onkey(vl8,"8")
    onkey(vl9,"9")
    listen()

def arriba():
    setheading(90)
    cont[0]=cont[0]+1
    print("Arriba: %d"%cont[0])

def abajo():
    setheading(270)
    cont[1]=cont[1]+1
    print("Abajo: %d" % (cont[1]))

def izq():
    setheading(180)
    cont[2]=cont[2]+1
    print("Izquierda: %d"%cont[2])

def der():
    setheading(360)
    cont[3]=cont[3]+1
    print("Derecha: %d"%cont[3])

def salir():
	bye()
	cont[4]=cont[4]+1
	print("Salir: %d"%(cont[4]))
	
def color():
	pencolor("red")
	cont[5]=cont[5]+1
	print("Color: %d"%cont[5])

def aum_tamaño():
	pensize(5)
	cont[6]=cont[6]+1
	print("Tamaño(+): %d"%cont[6])
    
def dis_tamaño():
    pensize(1)
    cont[7]=cont[7]+1
    print("Tamaño(-): %d"%cont[7])

def sub_lapiz():
    penup()
    cont[8]=cont[8]+1
    print("Subir Lapiz: %d"%cont[8])

def baj_lapiz():
    pendown()
    cont[9]=cont[9]+1
    print("Bajar Lapiz: %d"%cont[9])

def linea_punteada():
	cont[10]=cont[10]+1
	print("Punteada: %d"%cont[10])
	j=1
	while(j==1):
	    pendown()
	    forward(2)
	    penup()
	    forward(2)
	
def linea_solida():
	cont[11]=cont[11]+1
	print("Solida: %d"%cont[11])
	j=2
	while(j==2):
		forward(1)

def salto():
	cont[11]=cont[11]+1
	print("Salto: %d"%cont[11])
	penup()
	fd(50)
	pendown()

def marca():
	cont[11]=cont[11]+1
	print("Marca: %d"%cont[11])
	stamp()

def limpiar():
	cont[12]=cont[12]+1
	print("Limpiar: %d"%cont[12])
	clear()

velocidad=1
def vl0():
	global velocidad
	velocidad=0
	cont[13]=cont[13]+1
	print("Vel(0): %d"%cont[13])
def vl1():
	global velocidad
	velocidad=1
	cont[14]=cont[14]+1
	print("Vel(1): %d"%cont[14])
def vl2():
	global velocidad
	velocidad=2
	cont[15]=cont[15]+1
	print("Vel(2): %d"%cont[15])
def vl3():
	global velocidad
	velocidad=3
	cont[16]=cont[16]+1
	print("Vel(3): %d"%cont[16])
def vl4():
	global velocidad
	velocidad=4
	cont[17]=cont[17]+1
	print("Vel(4): %d"%cont[17])
def vl5():
	global velocidad
	velocidad=5
	cont[18]=cont[18]+1
	print("Vel(5): %d"%cont[18])
def vl6():
	global velocidad
	velocidad=6
	cont[19]=cont[19]+1
	print("Vel(6): %d"%cont[19])
def vl7():
	global velocidad
	velocidad=7
	cont[20]=cont[20]+1
	print("Vel(7): %d"%cont[20])
def vl8():
	global velocidad
	velocidad=8
	cont[21]=cont[21]+1
	print("Vel(8): %d"%cont[21])
def vl9():
	global velocidad
	velocidad=9
	cont[22]=cont[22]+1
	print("Vel(9): %d"%cont[22])


def main():
    inicializar()
    while(True):
        forward(velocidad)

main()