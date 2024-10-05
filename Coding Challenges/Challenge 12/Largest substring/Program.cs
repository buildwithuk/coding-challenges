// See https://aka.ms/new-console-template for more information


static int returnLargestSubstring(String letters) {

    int count = 0; 
    HashSet<char> set = new HashSet<char>();

    set.Add(letters[0]);

    for(int i = 1; i < letters.Length; i++) {

        var currenctCharacter = letters[i];

        if (set.Contains(currenctCharacter)) {

            count = count > set.Count == true ? count : set.Count;


            set = new HashSet<char>();
            set.Add(currenctCharacter);




        } else {
            set.Add(currenctCharacter);
        }

    }

    return count;
}


var largestString = "pwwkew";

var length = returnLargestSubstring(largestString);


Console.WriteLine("Largest length: " + length);