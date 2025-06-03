

list1 = [4,5,6,7]

list5=[]



list2=[]
list3=[]
for i in range(len(list1)-1):
    
    if(i==0):
       for j in range(len(list1)-1):
          list2.append(list1[j]+list1[j+1])
       print(list2)
    else:
        for k in range(len(list2)-1):
            list3.append(int(str(list2[k])[-1])+int(str(list2[k+1])[-1]))

        list2 = list3.copy()
        print(list3)
        if(i<len(list1)-2):
            list3=[]

print(list3)
       
    



