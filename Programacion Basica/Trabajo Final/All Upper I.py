#All Upper I

"""
Compruebe si una cadena dada tiene todos los símbolos en mayúsculas. 
Si la cadena está vacía o no tiene ninguna letra, la función debería devolver True.

Entrada: una cadena.
Salida: un booleano.

Precondición: az, AZ, 1-9 y espacios
"""

#islower()contiene solo minúsculas
#isupper()contiene solo mayúsculas

cadena = (input("Digite una cadena: "))

if(cadena.isupper()):
	print(True)
elif(len(cadena)==0):
	print(True)
else:
	print(False)


