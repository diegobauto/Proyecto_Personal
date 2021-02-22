#Split Pairs

"""
Divide la cadena en pares de dos caracteres. 
Si la cadena contiene un número impar de caracteres,
el segundo carácter faltante del par final debe reemplazarse con un guión bajo ('_').

Entrada: una cadena.
Salida: un iterable de cadenas.

"""

cadena = input("Digite una cadena: ")

while (len(cadena)<=0 or (len(cadena)>=100)):
	cadena = input("Digite una cadena: ")

lista=[]

for i in cadena:
	lista.append(i)
	
lista_par=[]

i=0
while i<len(lista):
	lista_par.append(lista[i:i+2])
	i=i+2
	pass

for x in lista_par:
	if(len(x)==1):
		x.append("_")

print(*lista_par)