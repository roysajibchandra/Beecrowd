list = []
while True:
    N = int(input())
    if N<0:
        break
    else:
        list.append(N)
        
avg = sum(list) / len(list)  
print(f'{avg:.2f}')

    
