

list1 = [4,5,6,7]

for i in range(len(list1)-2):
    list2=[]
    for j in range(len(list1)-1):
        list2.append(list1[j] % 10+list1[j+1] % 10)

    list1=list2


print(list2)
    



