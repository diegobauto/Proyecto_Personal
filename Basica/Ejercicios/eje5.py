lista1 = [ 10 , 20 , 30 , 40 , 50 ]
lista2 = [ 100 , 200 , 300 , 400 , 500 ]

longitud=len(lista2)
for i in range(longitud):
	print(lista1[i],lista2[longitud-i-1])