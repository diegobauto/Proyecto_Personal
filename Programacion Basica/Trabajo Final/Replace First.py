#Replace First

"""
En una lista dada, el primer elemento 
debe convertirse en el último. Una lista vacía 
o una lista con solo un elemento debe permanecer igual

Entrada: Lista.
Salida: Iterable.
"""


lista= []

n=int(input("Digite la cantidad de numeros de la lista: "))

if (n==0):
	print("lista",lista)
else:
	for i in range(n):
		print("Numero(",i+1,"):",end="")
		num=int(input())
		lista.append(num)

	lista.append(lista[0])
	lista.pop(0)

	print("Lista:",lista)