N = int(input())

for i in range(N):
    sum= 0
    x, y= map(int,input().split())
    X = min(x,y)
    Y = max(x,y)
    for i in range(X+1, Y):
        
        if i%2==1:
            sum+=i
    print(sum)
