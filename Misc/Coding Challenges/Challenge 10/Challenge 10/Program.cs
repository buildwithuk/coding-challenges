// See https://aka.ms/new-console-template for more information

/**
    * nt n: the length of array 
int ar[n]: an array of integers
int k: the integer divisor
    *
    *
    **/
static int divisibleSumPairs(int n, int k, int[] ar) {


    int countOfPairs = 0;

    for (int i = 0; i < n - 1 ; i++) {
        for (int j = i + 1; j < n; j++) {

            int a = ar[i];
            int b = ar[j];

            int total = a + b;
            bool perfectDivisible = total %  k == 0;

            if (perfectDivisible) {
                countOfPairs++;
            }


        }
    }

    return countOfPairs;

}

int k = 3;
int[] ar = new int[]{1, 3, 2, 6, 1, 2};

int countOfPairs =  divisibleSumPairs(ar.Length, k, ar);

Console.WriteLine("No of pairs: " + countOfPairs);