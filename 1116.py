T = int(input())

while T>0:
    x, y= map(int,input().split())
    if y==0:
        print("divisao impossivel")
    else:
        divide = x/y
        print(f"{divide:.1f}")
    T-=1
