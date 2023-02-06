Alcool= 0
Gasolina=0
Diesel=0
while True:
    F= int(input())
    if F==1:
        Alcool+=1
    elif F==2:
        Gasolina+=1
    elif F==3:
        Diesel+=1
    elif F==4:
        break
    
print("MUITO OBRIGADO")
print(f"Alcool: {Alcool}")
print(f"Gasolina: {Gasolina}")
print(f"Diesel: {Diesel}")

