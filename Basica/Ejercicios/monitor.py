#Explicacion de Monitor:
notas = [2.2,3.0,1.9,3.5,2.8,2.5,4.0,2.2,3.0]

#programa que elimine los elementos duplicados
def sin_duplicados(lista):
	nueva_lista=[]
	for elementos in lista:
		if elementos not in nueva_lista:
			nueva_lista.append(elementos)
	return nueva_lista

print(sin_duplicados(notas))

#Multiplos de 0.5
def sin_duplicados(lista):
	nueva_lista=[]
	for elementos in lista:
		if elementos%0.5==0:
			nueva_lista.append(elementos)
	return nueva_lista

print(sin_duplicados(notas))

#Convertir la lista con redondeo al multiplo 0.5 mas cercano

print()
print("Parte decimal")
for nota in notas:
	print("%.lf"%(nota-int(nota)),end=", ")



#Eliminar duplicados de la lista con redondeo al multiplo de 0.5 mas cercano
			
