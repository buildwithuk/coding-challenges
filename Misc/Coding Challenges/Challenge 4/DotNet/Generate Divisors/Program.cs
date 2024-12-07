// See https://aka.ms/new-console-template for more information
Console.WriteLine("Hello, World!");


static int FindDivisor(int number) {


    int divisor = 2;

    while(true) {

        if (number % divisor == 0) {
            
            break;

        } else {
            divisor++;
        }


    }


    return divisor;


}


static List<int> GenerateDivisors(int number) {


    if (number == 1)
        return new List<int>{ 1};

    if (number == 0)
        throw new Exception("Divisor not possible");

    List<int> divisors = new List<int>();

    do {
        int returnedDivisor = FindDivisor(number);
        divisors.Add(returnedDivisor);

        number = number / returnedDivisor;

        if (number == 1) {
            divisors.Add(1);
            break;
        }


    } while(true);

    return divisors;

}



var divisors = GenerateDivisors(30);


foreach(var d in divisors ) {


    Console.WriteLine(d);

}