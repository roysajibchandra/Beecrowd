N = int(input())

for i in range(N):
    x , y = map(int,input().split())

    odd_num = []
    count = 0
    while(count < y):
        z = x
        if z%2 != 0:
            odd_num.append(x)
            count+=1
        x += 1
    
    print(sum(odd_num))

    
