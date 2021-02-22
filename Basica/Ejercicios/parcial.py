#Parcial programación
#capture un numero positivo n y de una lista de la cantidad n y diga cuantos son pares

import random

n = input("Introduce un numero:")
numeros = []

for i in range(int(n)):
	numeros.append(random.randint(0,100))
print("Numero al azar: ",numeros)

pares=[]
for i in range(len(numeros)):
	if (numeros[i]%2==0):
		pares.append(numeros[i])
		print("Casilla(",i+1,"):",numeros[i])
print("Los numeros pares son:",*pares)

