X, Y=map(int,input().split())
j=0
end= int((Y/X)+1)
for i in range(1, end):
    # print(f"{i}")
    print(f"{j+1} {j+2} {j+3}")
    j += X
    
    
# or code
 
n1,n2 = list(map(int,input().split()))
cont = 1
end = (int((n2/n1))+1)
for i in range(1,end):
    r = ""
    for y in range(n1):
        r += str(cont) + " "
        cont += 1
    print(r[:-1])
