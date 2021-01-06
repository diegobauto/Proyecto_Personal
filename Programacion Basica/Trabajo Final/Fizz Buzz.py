#Fizz Buzz

"""
Tú deberías escribir una función que recibirá un entero positivo y devolver: 
Fizz Buzz" si el número es divisible por 3 y por 5;
Fizz" si el número es divisible por 3;
Buzz" si el número es divisible por 5;
El número como una cadena para los otros casos

Entrada: Un número como un entero.
Salida: La respuesta como una cadena de caracteres.

Precondición: 0 < número ≤ 1000
"""

num=(int(input("Digitar un número: ")))

while(num<0 or num>1000):
	num=(int(input("Digitar un número positivo: ")))

if((num%3)==0 and (num%5)==0):
	print(num,"== Fizz Buzz")
elif(num%3==0):
	print(num,"== Fizz ")
elif(num%5==0):
	print(num,"== Buzz ")
else:
	print(num,"==",str(num))
