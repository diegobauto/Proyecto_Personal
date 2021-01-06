#Menu
def opcion1():
	print("opcion 1 acyivada")

def opcion2():
	print("opcion 2 acyivada")

def opcion3():
	print("opcion 3 acyivada")

def terminar():
	print("*********** FIN ************")


def main():
	opcion=0
	while opcion!=4:
		print("-----MENU-----")
		print("1.Opcion 1")
		print("2.Opcion 2")
		print("3.Opcion 3")
		print("4.Opcion 4")
		opcion=int(input("Digite su opcion: "))
		if (opcion==1):
			opcion1()
		elif (opcion==2):
			opcion2()
		elif (opcion==3):
			opcion3()
		else:
			terminar()

main()