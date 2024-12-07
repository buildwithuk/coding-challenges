// See https://aka.ms/new-console-template for more information
Console.WriteLine("Hello, World!");


int[] RotatedArray(int k, int[] nums) {

    int[] rotatedArray = new int[nums.Length];
    
    for (int i = 0; i < nums.Length; i++) {

        
        int itemAtI = nums[i];

        int nextPosition = i + k;

        if (nextPosition < nums.Length) {

            // Move 
            rotatedArray[nextPosition] = itemAtI;
            continue;

        } else {

            int temp = (nextPosition % nums.Length) ;
            rotatedArray[temp] = itemAtI;

        }

        // {1, 2, 3, 4, 5}
        // k

    }
    return rotatedArray;
}

int[] nums = [-1,-100,3,99];

int k = 2;

var returnedArray = RotatedArray(k, nums);

foreach(var i in returnedArray) {
    Console.WriteLine(i);
}
