// See https://aka.ms/new-console-template for more information


static int returnLargestSubstring(String letters) {


        if (letters.Length == 0)
            return 0;

        if (letters.Length == 1)
            return 1;


    int count = 0; 
    HashSet<char> set = new HashSet<char>();


    for(int i = 0; i < letters.Length; i++) {

        var currenctCharacter = letters[i];

        if (set.Contains(currenctCharacter)) {

            count = count > set.Count == true ? count : set.Count;


            set = new HashSet<char>();
            set.Add(currenctCharacter);




        } else {
            set.Add(currenctCharacter);
        }

    }

    return  count > set.Count == true ? count : set.Count;
}


var largestString = "dvdf";

var length = returnLargestSubstring(largestString);


Console.WriteLine("Largest length: " + length);