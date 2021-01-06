"""Su misión aquí es crear una función que obtenga una tupla 
y devuelva una tupla con 3 elementos: el primer, tercer y 
segundo elemento del último para la matriz dada.

Entrada: una tupla, al menos 3 elementos de largo.
Salida: una tupla.
"""

lista= []

n=int(input("Digite la cantidad de numeros de la lista: "))

while n<3:
	n=int(input("Digite la cantidad de numeros de la lista: "))

for i in range(n):
	print("Numero(",i+1,"):",end="")
	num=int(input())
	lista.append(num)


resultado = (lista[0],lista[2],lista[len(lista)-2])

print(resultado)
