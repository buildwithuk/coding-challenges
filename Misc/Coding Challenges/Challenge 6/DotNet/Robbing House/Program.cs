

static int MaxRobHouse(int[] houses) {

    int[] amount = new int[houses.Length];

    amount[0] = houses[0];
    amount[1] = houses[1];

    for(int i = 2; i < houses.Length; i++) {

        amount[i] = Math.Max(amount[i-1], amount[i-2] + houses[i]);

    }

    return amount[houses.Length - 1];

}



int[] amount = [2,7,9,3,1];

Console.WriteLine("Amount: " + MaxRobHouse(amount));