#End Zeros

"""
Intenta averiguar cuántos ceros tiene un número dado al final

Entrada: un int positivo
Salida: un int.
"""

numero = (input("Digite un numero: "))


lista=[]
for i in numero:
	lista.append(i)


if(lista[-1]=="0"):
	print(numero,":",1)
else:
	print(numero,":",0)
