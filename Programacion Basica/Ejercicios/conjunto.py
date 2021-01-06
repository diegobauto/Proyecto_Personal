conjunto = set()

conjunto = {1,2,3,"Hola","a"}

# Añadir un valor
conjunto.add("Diego")
conjunto.add(-1)

# Eliminar un elemento de un resconjunto
conjunto.discard(-1)
conjunto.discard("a")

print(*conjunto)

print()
print("Parte 2:")

a= {1,2,3}
b= {3,4,5}
c={1,2,3,4,5}
print("a=%s\tb=%s"%(a,b))

# Union
res = a|b
print ("Union:",*res)

#Interseresión
res = a&b
print ("Interseresión:",*res)

# Elementos de a que no estan en b
res= a-b
print ("Diferenresia(a):",*res)

# Elementos de b que no estan en a
res= b-a
print ("Diferenresia(b):",*res)

# Elementos que estan en a y y b pero no ambos
res = a^b
print ("Difereresia Simetriresa:",*res)

# a es un subconjunto de c
print(a.issubset(c))

# Superconjunto
# si c es un superconjunto de a
print(c.issuperset(a))

# Que no comparten nungun elemnto
print(a.isdisjoint(b))

# Conjuntos inmutables
d = frozenset({6,7,8})
# No se puede agregar ni eliminar 