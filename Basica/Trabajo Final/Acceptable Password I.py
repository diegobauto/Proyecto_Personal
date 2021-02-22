#Acceptable Password I

"""
En esta misión, debe crear una función de verificación de contraseña.
Condiciones de verificación:
La longitud debe ser mayor que 6.

Entrada: una cadena.
Salida: un bool.
"""

contraseña=input("Digite su contraseña: ")

if (len(contraseña)>6):
	print(True)
else:
	print(False)