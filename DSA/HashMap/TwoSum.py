target=9

list1=[2,7,11,15]

dict1={}

for i in range(len(list1)):

    dict1[list1[i]]=i


list3=[]
for key in dict1.keys():
    comp=target-key
    if comp in dict1.keys():
        list3.append(dict1[key])
            
        list3.append(dict1[target-key])
        break

print(list3)