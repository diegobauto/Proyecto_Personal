#Correct Sentence

"""
Para la entrada de su función, se le dará una oración. 
Debe devolver una versión corregida, que comienza con una letra mayúscula 
y termina con un punto (punto).

Preste atención al hecho de que no todas las soluciones son necesarias. 
Si una oración ya termina con un punto (punto), entonces agregar otra será un error.

Entrada: una cadena.
Salida: una cadena.

Condición previa: sin espacios iniciales y finales, el texto contiene solo espacios, az AZ y. 
"""

#lower() Convertir una cadena a minúsculas
#upper() Convertir una cadena a mayúsculas

cadena = input("Digite una cadena: ")


lista=[]

for i in cadena:
	lista.append(i)

lista[0] = lista[0].upper()

if(lista[-1]!="."):
	lista.append(".")

for i in lista:
	print(i,end="")