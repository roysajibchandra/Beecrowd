list = []

while True:
    for i in range(1):
    
        x= float(input())
        if 0<=x<=10:
            list.append(x)
        else:
            print("nota invalida")
        
    if len(list)==2:
        media = sum(list) / len(list)
        print(f"media = {media:.2f}")
                
        break
        
        
    
