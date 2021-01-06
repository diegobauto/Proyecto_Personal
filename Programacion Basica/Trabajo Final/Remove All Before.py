#Remove All Before

"""
No todos los elementos son importantes. 
Lo que debe hacer aquí es eliminar de la lista todos los elementos antes del dado.

(1) si no se puede encontrar un elemento de corte, entonces la lista no debe cambiarse. 
(2) si la lista está vacía, entonces debe permanecer vacía.
"""

numero = int(input("Digite un numero: "))

lista = []
for i in str(numero):
	lista.append(int(i))

corte = int(input("Digite un numero de corte: "))

lista_corte=[]
for i in range(len(lista)):
	if lista[i]==corte:
		lista_corte.append(lista[i::])
print(*lista_corte)



