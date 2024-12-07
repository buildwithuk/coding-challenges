static int findTheLargestSumOfArray(int[] array) {

    int largestSum = 0;

    if (array.Length == 1) {
        return largestSum = array[0];
    }

    int tempSum = array[0];
    int maxSum = array[0];

    for(int i = 1; i < array.Length; i++) {

        tempSum = Math.Max(array[i], tempSum + array[i]);

        maxSum = Math.Max(maxSum, tempSum);


    }

    return maxSum;
}


int[] array = {-2,1,-3,4,-1,2,1,-5,4};

var sum = findTheLargestSumOfArray(array);

Console.WriteLine("Sum of the largest array: " +  sum);