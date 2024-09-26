

using System.Collections;

static int returnStairCount(int noOfStairs) {

    int[] noOfCount = new int[noOfStairs+1];

    // No of count will always be one
    if ( noOfStairs == 1) {
        return 1;
    }

    noOfCount[0] = 1;
    noOfCount[1] = 1;

    for (int i = 2; i < noOfCount.Length; i++) {

        noOfCount[i] = noOfCount[i-2] + noOfCount[i-1];


    }
    return noOfCount[noOfStairs];


}


var r = returnStairCount(4);


Console.WriteLine("No of count: " + r);



