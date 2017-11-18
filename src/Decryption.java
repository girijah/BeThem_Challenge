import java.util.Scanner;

/**
 * Created by girijah on 11/26/2016.
 */
public class Decryption {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        String letter = sc.nextLine();
        int N = sc.nextInt();
        char[] words = letter.toCharArray();

        if(N >0 && N < 27){
            int currentDecrementFactor = 0;
            for(int alphabetIndex = 0; alphabetIndex < words.length; alphabetIndex++) {
                if(currentDecrementFactor == N) {
                    currentDecrementFactor=0;
                }
               currentDecrementFactor++;

                if(Character.isLowerCase(words[alphabetIndex])){
                    for(int l=97;l<=122;l++) {
                        if(words[alphabetIndex]==(char)l){
                            int decryptedLetterIndex = l-currentDecrementFactor;

                            if(decryptedLetterIndex < 97){
                                decryptedLetterIndex = 123 - (97-decryptedLetterIndex);
                            }
                            System.out.print((char)decryptedLetterIndex);
                        }
                    }
                }else{
                    for(int i=65;i<=90;i++) {
                        if(words[alphabetIndex]==(char)i){

                            int decryptedLetterIndex = i-currentDecrementFactor;

                            if(decryptedLetterIndex < 65){
                                decryptedLetterIndex = 91 - (65-decryptedLetterIndex);
                            }
                            System.out.print((char)decryptedLetterIndex);
                        }
                    }
                }

            }
        }


    }


}
