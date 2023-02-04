
while True:
    list = []
    while len(list)<2:
    
        x= float(input())
        if 0<=x<=10:
            list.append(x)
        else:
            print("nota invalida")
        
    
    media = sum(list) / len(list)
    print(f"media = {media:.2f}")
                
    check = 0
    while True:
        print("novo calculo (1-sim 2-nao)")
        check = int(input())
        if (check==1 or check==2):
            break
    if (check==2):
        break
        
        
    
