import random

numeros = []

#Lusta de numeros al azar del -10 hasta 10
for i in range(10):
	numeros.append(random.randint(-10,10))
print("Numero al azar: ",numeros)

#Suma de los numeros negativos
suma=0
for i in range(len(numeros)):
	if (numeros[i]<0):
		suma += numeros[i]
print("La suma de los negativos es:",suma)


#Lista de nombres
nombres = ["Sergio","Gilmer","Andres","Econometria","Faider","Diego","Yeisson","Nicolas","Cristian","Monitor",]
print(*nombres,sep="\n")

#Filtra nombre por vocales
vocales= ["a","e","i","o","u","A","E","I","O","U"]

#Nombre con longitud menor a 5
print()
print("Longitud <7:")
for nombre in range(len(nombres)):
	if(len(nombres[nombre])<7):
		print(nombres[nombre],"-Longitud",len(nombres[nombre]))

#Nombres de comiencen por una vocal 
print()
print("Comiencen en vocal:")
for nombre in nombres:
	if nombre[0] in vocales:
		print(nombre,"-Longitud:",len(nombre))

#Nombres de terminan en consonante
print()
print("Terminan consonante:")
for nombre in nombres:
	if nombre[-1] not in vocales:
		print("%s-Longitud:%d" %(nombre,len(nombre)))