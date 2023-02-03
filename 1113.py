x, y= map(int,input().split())
while True:
    if (x==y):
        break
    else:
        if x<y:
            print("Crescente")
        else:
            print("Decrescente")

    x, y= map(int,input().split())
