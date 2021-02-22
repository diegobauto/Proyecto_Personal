list1 = ["Hello ", "take "]
list2 = ["Dear", "Sir"]

resList = [x+y for x in list1 for y in list2]
print(resList)
