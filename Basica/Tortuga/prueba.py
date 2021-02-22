from turtle import*

i=0
x=-300;y=0

shapesize(0.5) #tamaño
speed(100) #velocidad
#hideturtle() #esconer tortuga
penup()	
goto(x,y)
pendown()

while i<4:
	c=0;t=0
	#Cuadrado
	while c<4:
		forward(100) #adelante
		left(-90) #Izq
		c=c+1
	#Triangulo
	while t<3:
		forward(100) 
		left(120)
		t=t+1
	i=i+1
	penup()
	x=x+150
	goto(x,y)
	pendown()

	
#Realizar via
i=0
while i<2:
	y=y-120
	penup()
	goto(-500,y)
	pendown()
	forward(1000)
	i=i+1

#Realizar bus
penup()
goto(-250,-190)
pendown()
i=0
while i<2:
	forward(210)
	left(90)
	forward(100)
	left(90)
	i=i+1

#Ruedas
i=0
x=-200
while i<2:
	penup()
	goto(x,-210)
	pendown()
	circle(20)
	i=i+1
	x=x+100
showturtle() #mostrar


x=-235;y=-110
i=0
penup()
goto(x,y)
pendown()
while i<3:
	c=0
	while c<4:
		forward(30) #adelante
		left(-90) #Izq
		c=c+1
	i=i+1
	penup()
	x=x+50
	goto(x,y)
	pendown()

c=0
while c<4:
	forward(40) #adelante
	left(-90) #Izq
	c=c+1

exitonclick()