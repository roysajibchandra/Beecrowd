sequence = []
for i in range(1, 101):
    S = 1 / i
    sequence.append(S)
result = sum(sequence)
# print(sequence)
print(f'{result:.2f}')
