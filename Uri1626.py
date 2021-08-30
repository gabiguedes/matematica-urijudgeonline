import math


def factorial(n):
    f = 1
    for i in range(1, n + 1):
        f = f * i
    return f


def divisors(num):
    yield 1
    for i in range(2, int(math.sqrt(num)) + 1):
        if num % i == 0:
            yield i
            outro_divisor = num // i
            if outro_divisor != i:
                yield outro_divisor
    yield num


def soma_divisors(resultDivisores, resultFatorial):
    soma = 0
    for k in resultDivisores:
        if k != resultFatorial:
            soma += k
        else:
            continue
    return soma


if __name__ == '__main__':
    while True:
        try:
            m = int(input())
            M = int(1000000007)
            resultFatorial = factorial(m)
            resultDivisores = divisors(resultFatorial)

            somaFinal = soma_divisors(resultDivisores, resultFatorial) % M
            modFatorial = resultFatorial % M

            print(f"{somaFinal} {modFatorial}")
        except:
            break
