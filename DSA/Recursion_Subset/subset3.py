

def subset(arr1,index,ref):
    if(index==len(arr1)):
        return [ref.copy()]
    
    
    
    ref.append(arr1[index])
    left= subset(arr1,index+1,ref)
    ref.pop()
    right = subset(arr1,index+1,ref)
    listNew = left
    listNew.extend(right)

    return listNew

getNum=subset([1,2,3],0,[])
print(getNum)

getNum.pop(1)

print(getNum)