#Parcial programación
#Segunda pregunta

"""Definir un diccionario con los nombres de las localidades de Bogota y la cantidad 
correspondiente de casos de coronavirus en ellas. 
Crear un menú que permita al usuario consultar o incrementar el 
número de casos en una respectiva localidad."""

import random

diccionario = { "Teusaquillo":random.randint(0,100),
				"Kennedy":random.randint(0,100),
				"Chapinero":random.randint(0,100),
				"Suba":random.randint(0,100),
				"Bosa":random.randint(0,100),
				"Usaquen":random.randint(0,100),
				"Santa Fe":random.randint(0,100),
				"San cristobal":random.randint(0,100),
				"Usme":random.randint(0,100),
				"Fontibon":random.randint(0,100),
				"Engativa":random.randint(0,100),
				"Barrios Unidos":random.randint(0,100),
				"Martires":random.randint(0,100),
				"Antonio Nariño":random.randint(0,100),
				"Puente Aranda":random.randint(0,100),
				"Candelaria":random.randint(0,100),
				"Rafael Uribe":random.randint(0,100),
				"Cuidad Bolivar":random.randint(0,100),
				"Sumapaz":random.randint(0,100),
				"Tunjuelito":random.randint(0,100)
				}

x=1
while(int(x)<2):
	print()
	print("Que desea Realizar?")
	print("1.Consultar")
	print("2.Modificar casos")
	n = input("Respuesta:")
	print()
	if(int(n)==1):
		for i in diccionario:
			print(i,":",diccionario[i])
	elif(int(n)==2):
		print()
		print("Listado de las localidades:")

		for i in diccionario:
				print(i,":",diccionario[i])
		print()
		m1=input("Introduce la localidad a Modificar:")
		if m1 in diccionario.keys():
			print("Esta en el diccionario")
			print("Cuantos casos de Coronavirus hay en",m1,":")
			valor = input()
			diccionario[m1]= valor
			for i in diccionario:
				print(i,":",diccionario[i])
		else:
			print("La localidad ingresada no pertenece")
			print("Por favor digite la primera letra en mayuscula")
	else:
		print("No digito ninguna opción")

	print()
	print("Desea Realizar otra acción: ")
	print("1.Si:")
	print("2.No")
	x = int(input("Respuesta:"))
	if(int(x)<1 or int(x)>2):
		print()
		print("No eligio ninguna opción")
		print("Gracias")



