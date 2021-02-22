#Parcial Tercera pregunta

def entrada():
	edad=(int(input("Digite su edad: ")))
	lugar=(input("Digite lugar: "))
	diccionario={"Edad":edad,"Lugar":lugar}
	print()
	print("Sus datos son:")
	for i in diccionario:
		print(i,":",diccionario[i])
	print()

def modificar():
	print()
	print("Que desea modificar?")
	print("1.Edad")
	print("2.Lugar de Residencia")
	r = input("Respuesta:")
	if(r==1):
		edad=(int(input("Digite su edad: ")))
		diccionario["Edad"]=edad
	elif(r==2):
		lugar=(input("Digite lugar: "))
		diccionario["Lugar"]=lugar
	print()
	print("Datos Actualizados:")
	for i in diccionario:
		print(i,":",diccionario[i])
	print()


def terminar():
	print()
	print("Secion Terminada")
	print("Muchas Gracias")


def main():
	entrada()
	respuesta=0
	while (respuesta!=2):
		print("-----MENU-----")
		print("1.Modificar")
		print("2.Terminar")
		respuesta=int(input("Respuesta: "))
		if (respuesta==1):
			modificar()
		elif(respuesta==2):
			terminar()

main()

