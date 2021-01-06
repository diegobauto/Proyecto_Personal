from turtle import*
hideturtle()
shapesize(0.5) #tamaño
speed(100) #velocidad
i=0;x=-650;y=-500

def cuadrado(b=100,a=100,der=-90,x=-500,y=-500,c=("red")):
	color(c)
	penup()
	goto(x,y)
	pendown()
	for c in range(2):
		forward(b) #adelante
		left(der) 
		forward(a) 
		left(der) 

for i in range(7):
	cuadrado(x=x+150,y=0,c="black")
	#Triangulo
	for i in range(3):
		forward(100) 
		left(120)
	x=x+150
	cuadrado(b=30,a=30,x=x+10,y=-10,c="blue")
	cuadrado(b=30,a=50,x=x+50,y=-50,c="red")

cuadrado(b=1400,a=130,y=-110,x=-700,c="orange") #via
cuadrado(b=210,a=100,x=-210,y=-120,c="blue") #bus
#Vnetanas_bus
x=-235
for i in range(3):
	cuadrado(b=30,a=30,x=x+40,y=-130)
	x=x+45
cuadrado(a=40,b=40,x=-50,y=-130)

#Ruedas
x=-170
for i in range(2):
	penup()
	goto(x,-240)
	pendown()
	circle(20)
	x=x+120
exitonclick()