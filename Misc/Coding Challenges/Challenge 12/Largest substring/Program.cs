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
        set.Add(currenctCharacter);



        for (int j = i+1; j < letters.Length; j++) {

            var nextCharacter = letters[j];

            if (set.Contains(nextCharacter)) {

                count = count > set.Count == true ? count : set.Count;
                set.Clear();
                break;

            } else {
                set.Add(nextCharacter);
            }

        }

        if (i == letters.Length-1) {
            
                count = count > set.Count == true ? count : set.Count;
 break;
        }
           


    }

    return  count;
}


var largestString = "abcabcbb";

var length = returnLargestSubstring(largestString);


Console.WriteLine("Largest length: " + length);