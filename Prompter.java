import java.util.Random;
import java.util.Scanner;

public class Prompter {
    public int input;
    public String jarName;
    int maxNumberAllowed;
    int randomNumber;
    int playerGuess;
    
    //print the name of jar
    public void printName(){
        System.out.printf("Name of items in the jar:");
        Scanner sc = new Scanner(System.in);
        jarName = sc.nextLine();
    }
    
    //Generate random number base on user input
    public void fill(){
        Random random = new Random();
        System.out.printf("Maximum number of %s in the jar :",jarName);
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();
        maxNumberAllowed = input;
        randomNumber = random.nextInt(maxNumberAllowed)+1;
        //System.out.println(randomNumber);
    }
    //player guess
    
    public void Guess(){
        System.out.printf("Guess how many %s is in the jar.You should guess 0 to %s \n",
                        jarName,maxNumberAllowed);
        System.out.printf("You Guess is:");
        Scanner sc = new Scanner(System.in);
        playerGuess = sc.nextInt();
    }

    //compare guess with randomNumber
    public void Compare(){  
        int i = 1;
        while(playerGuess != randomNumber){
                System.out.printf("Sorry wrong guess!");
                System.out.printf("You Guess is:");
                Scanner sc = new Scanner(System.in);
                playerGuess = sc.nextInt();
                i++;  
        }
        System.out.printf("Congratulation!!! the answer is %s.You got it in %s attempts. \n",
                           randomNumber,i);
        }
    
}