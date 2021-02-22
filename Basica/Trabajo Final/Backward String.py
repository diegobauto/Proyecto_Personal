#Backward String

"""
Debería devolver una cadena dada en orden inverso.

Entrada: una cadena.
Salida: una cadena.
"""

cadena = input("Introduce una cadena de texto:")

lista=[]
for i in cadena:
	lista.append(i)


#tamaño de lista-i-1=4.3.2.1.0

for i in range(len(lista)):
	print(lista[len(lista)-i-1],end="")

