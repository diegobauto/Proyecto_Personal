#Max Digit

"""
Tiene un número y necesita determinar qué dígito en este número es el más grande.

Entrada: una int positiva.
Salida: un Int (0-9).
"""

numero = int(input("Digite un número: "))

numero = str(numero)

lista=[]
for i in numero:
	lista.append(int(i))
	
print(lista)


maximo = max(lista)

print("El numero maximo es:",maximo)
