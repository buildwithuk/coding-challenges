// See https://aka.ms/new-console-template for more information
Console.WriteLine("Hello, World!");


static int[] FindTheTwoSum(int[] nums, int target){

    Dictionary<int, int> keyValuePairs= new Dictionary<int, int>();


    for (int i = 0; i < nums.Length; i++) {

        int complement = target - nums[i];

        if (!keyValuePairs.ContainsKey(complement)) {

            keyValuePairs.Add(nums[i], i);

        }

        if (keyValuePairs.ContainsKey(complement)) {
            return new int[2]{i, keyValuePairs[complement]};
        }
    }

    throw new Exception("No item present");
}


int[] nums = {2,7,11,15};

var sumArray = FindTheTwoSum(nums, 324);

foreach(var s in sumArray) {

    Console.WriteLine(s);

}
