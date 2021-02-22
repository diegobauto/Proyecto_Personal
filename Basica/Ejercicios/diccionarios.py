#Diccionarios
#Desordenados
#Tienen dos elemetos por posicion: clave y valor

diccionario = {"nombre":"Diego","nota":4.5}
tupla = {"Alejandro": {"Edad":19,"Estatura":1.65}}

#Agregar elementos
diccionario["edad"]="19"
#Eliminar elementos
del(diccionario["nota"])

print(diccionario)
print(diccionario[("edad")])

print()
print(tupla)
print(tupla[("Alejandro")])

print(diccionario.get("estatura","no esta en el diccionario"))

#Mostrar solo claves
print(diccionario.keys())

#Mostrar valores
print(diccionario.values())

#Mostrar todo
print(diccionario.items())

#Borrar todo
print(diccionario.clear)
