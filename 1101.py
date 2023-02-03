x, y= map(int,input().split())
while True:
    if (x<=0) or (y<=0):
        break
    else:
        
        list = []
        X = min(x,y)
        Y = max(x,y)
    
        for i in range(X, Y+1):
            list.append(i)
            
        output = " ".join(map(str,list))
        print(f"{output} Sum={sum(list)}")

    x, y= map(int,input().split())
