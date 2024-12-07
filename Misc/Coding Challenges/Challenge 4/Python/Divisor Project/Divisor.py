from array import array


def find_divisor(number):

    # Initialize the divisor by 2
    divisor = 2

    while True:

        if number % divisor == 0:
            break;

        else:
            divisor = divisor + 1

    return divisor


def generate_divisor(number):

    # 1 is not divisible
    if number == 1:
        return array('i', [1])

    # Cannot find the divisor of 0
    if number == 0:
        raise ValueError("Cannot find the divisor of 0")

    divisors = []

    while True:
        r_divisor = find_divisor(number)
        divisors.append(r_divisor)

        number = number / r_divisor

        if number == 1:
            divisors.append(1)
            break
        else:
            continue

    return divisors


divisors = generate_divisor(17)

for i in range(len(divisors)):
    print(divisors[i])
