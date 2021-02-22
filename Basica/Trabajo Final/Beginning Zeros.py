#Beginning Zeros

"""
Tiene una cadena que consta solo de dígitos. 
Necesita encontrar cuántos dígitos cero ("0") hay al comienzo de la cadena dada.

Entrada: una cadena, que consta de dígitos.
Salida: un int.

Precondición: 0-9
"""

cadena = input("Digite una cadena: ")

lista=[]

for i in cadena:
	lista.append(i)


a=0
if(len(lista)>1):
	while lista[a]=="0":
		a=a+1
	print(a)
elif len(lista)==1 and lista[0]=="0":
	print(1)
else:
	print(0)