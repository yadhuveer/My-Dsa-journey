def subset(nums):
    res=[]
    subset=[]

    def dfs(i):
        if i>=len(nums):
            res.append(subset.copy())
            return
        


        subset.append(nums[i])
        dfs(i+1)

        subset.pop()
        dfs(i+1)

    dfs(0)
    return res

result= subset([1,2,3])
print(result)