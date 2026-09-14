def fib(n):
    if n <= 1:
        return n
    return fib(n-1) + fib(n-2)

q = int(input("Insira a quantidade de elementos"))

for i in range(1,q):
    print(fib(i))


