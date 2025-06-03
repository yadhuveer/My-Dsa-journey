

def subset(arr1,index,ref):
    if(index==len(arr1)):
        return [ref.copy()]
    
    
    #ref.pop()
    left= subset(arr1,index+1,ref)
    ref.append(arr1[index])
   
    right = subset(arr1,index+1,ref)
    ref.pop()

    #left.append(right[0])

    

    #return left+right
    listNew = left
    #listNew.append(left)

    listNew.extend(right)

    return listNew

print(subset([1,2,3],0,[]))