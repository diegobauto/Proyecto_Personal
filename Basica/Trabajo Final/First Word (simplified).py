#First Word (simplified)

"""
Te dan una cadena donde tienes que encontrar su primera palabra.
"""


cadena=(input("Digite una cadena: "))

#Separar por palabras la cadena de entrada
espacios = cadena.split()

#Divido toda la cadena
print(espacios)

#Imprimir la primer palabra
#print(espacios[0])

lista = []
#Recorro toda la palabra
for x in espacios[0]:
	lista.append(x)

#Cambio por vacio
if lista[-1]==",":
	lista[-1]=" "

#Imprimo
for i in lista:
	print(i, end="")
