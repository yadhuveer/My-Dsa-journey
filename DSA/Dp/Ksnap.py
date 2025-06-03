weights=[1,3,4,5]
values=[1,4,5,7]

maxWeight=7

dp=[]

for i in range(len(values)):
    list1=[]
    for j in range(len(maxWeight+1)):
        list1.append(0)

    dp.append(list1)

dp[0][weights[0]]=values[0]
maxValue=values[0]

for i in range(1,len(weights)):

    for j in range(len(maxWeight+1)):

        if(weights[i]<=j):
            if dp[i-1][j-weights[i]]!=0:
                max1=max(values[i]+dp[i-1][j-weights[i]],dp[i-1][j])
                dp[i][j]=max1
                maxValue = max(maxValue,dp[i][j])
            else:
                dp[i][j]=0
                maxValue = max(maxValue,dp[i][j])
        else:
            dp[i][j]=dp[i-1][j]
            maxValue = max(maxValue,dp[i][j])

   


print(maxValue)

        
        


        