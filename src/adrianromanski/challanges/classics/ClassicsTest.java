package adrianromanski.challanges.classics;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class   ClassicsTest {

    private FizzBuzz fizzBuzz;
    private RansomNote ransomNote;
    private CaesarCipher caesarCipher;
    private SieveOfEratosthenes sieveOfEratosthenes;
    private StringReverser stringReverser;
    private IntReverser intReverser;
    private Anagram anagram;
//    private CharacterCount characterCount;

    @Before
    public void SetUp() {
        fizzBuzz = new FizzBuzz();
        ransomNote = new RansomNote();
        caesarCipher = new CaesarCipher();
        sieveOfEratosthenes = new SieveOfEratosthenes();
        stringReverser = new StringReverser();
        intReverser = new IntReverser();
        anagram = new Anagram();
//        characterCount = new CharacterCount();
    }

    @Test
    public void FizzBuzz() {
        // Challenge: Write a program that prints 1 to 100.
        // But for multiples of three print 'Fizz' instead of the number.
        // And for multiples of five  print 'Buzz'.
        // For numbers which are multiples of both three and five print 'FizzBuzz'.
        //
        // Example
        // 1
        // 2
        // Fizz
        // 4
        // Buzz

        fizzBuzz.print();
    }


    @Test
    public void HarmlessRansomNote() {
        // Challenge: Write a ransom note by cutting letters out of the available
        // magazines and pasting them together to form a letter. Given an arbitrary
        // ransom note string and another string containing all the contents of all
        // the magazines, write a function that will return true if the ransom
        // note can be made from the magazines; otherwise, it will return false.
        // Every letter found in the magazine string can only be used once in your
        // ransom note.

        Assert.assertTrue(ransomNote.canWrite("Pay", "yaP"));
        Assert.assertTrue(ransomNote.canWrite("Pay", "yaP a"));
        Assert.assertTrue(ransomNote.canWrite("Pay me $1000", "ayPem0001$"));

        Assert.assertFalse(ransomNote.canWrite("Pay", "Pa"));
    }



    @Test
    public void CaesarCipher() {
        // Challenge: Implement a Caesar Cipher.
        //
        // A Caesar Cipher is a basic encryption algorithm that takes all the letters message
        // and encrypts them by shifting them over some fixed amount.
        //
        // For example a Caesar Cipher of x3 would map the alphabet like this:
        //
        // Plain:    ABCDEFGHIJKLMNOPQRSTUVWXYZ
        // Cipher:   XYZABCDEFGHIJKLMNOPQRSTUVW
        //
        // And the following text like this:
        //
        // Plaintext:  THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG
        // Ciphertext: QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD
        //
        // Write an encrypt and decrypt method of a Caesar Cipher using an offset of 3
        //


        Assert.assertEquals("DEF", caesarCipher.encrypt("ABC", 3));
        Assert.assertEquals("D E F", caesarCipher.encrypt("A B C", 3));
        Assert.assertEquals("WKH TXLFN EURZQ IRA MXPSV RYHU WKH ODCB GRJ", caesarCipher.encrypt("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG", 3));

        Assert.assertEquals("A B C", caesarCipher.decrypt("D E F", 3));

    }

    @Test
    public void SieveOfEratosthenes() {
        // Challenge: Given a number n, print all primes smaller than or equal to n (assume n < 30).
        //
        // Hint: https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
        //

        sieveOfEratosthenes.print(30);
    }

    @Test
    public void ReverseString() {
        // Challenge: Given a string, return it's reverse.
        // "abc" => "cba"

        // Soln1
        Assert.assertEquals("olleH", stringReverser.reverse("Hello"));
        Assert.assertEquals("maS", stringReverser.reverse("Sam"));


    }

    @Test
    public void ReverseInt() {
        // Challenge: Given an int, reverse its digits.
        // x = 123, return 321
        // x= -123, return -321

        Assert.assertEquals(321, intReverser.reverse(123));
        Assert.assertEquals(-321, intReverser.reverse(-123));
    }

    @Test
    public void Anagram() {
        // Challenge: Given two strings, write an algorithm to detect whether one word is an anagram of the other.
        // An anagram is a word that can be made by changing the order of the letters in another word.
        //
        // For example:
        // tar => rat
        // state => taste

        // Soln1
        Assert.assertTrue(anagram.isAnagram("arc", "car"));
        Assert.assertTrue(anagram.isAnagram("night", "thing"));
        Assert.assertFalse(anagram.isAnagram("cat", "dog"));


    }
//
//    @Test
//    public void CharacterCount() {
//        // Challenge: Given a string, return the character that occurs most often in the string.
//        // In the event of a tie, return the larger character.
//        //
//        // For example:
//        // abbbbc => b
//        // abcxxxyyyzzz => z
//
//        Assert.assertEquals("b", characterCount.maxChar("abbbbc"));
//        Assert.assertEquals("z", characterCount.maxChar("shazzzzzam!"));
//
//        // What about a tie?
//    }

}
