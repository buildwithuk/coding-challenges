// See https://aka.ms/new-console-template for more information
using System.Diagnostics;
using System.Numerics;

Console.WriteLine("Hello, World!");


static BigInteger returnFactorial(int i) {

    BigInteger factorial = new BigInteger(1);

    if (i == 1) {
        return factorial;
    }

    for (int j = 1; j <= i; j++) {

        factorial = BigInteger.Multiply(j , factorial);

    }

    // 1 2 3
    return factorial;


}


Console.WriteLine( returnFactorial(30));