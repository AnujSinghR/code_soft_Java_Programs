import java.util.Scanner;

 class Random_Number{
    private int random = (int)(Math.random()*101);
    public boolean Guess_Number(int UserInput){
        if(UserInput == this.random){
            System.out.println("Your guessed correctly (..--..)");
            System.out.println("your Win ***");
            return true;
        }else if(UserInput < this.random){
            System.out.println("the number you guessed is lower then the random number");
            return false;
        }else if(UserInput > this.random){
            System.out.println("the Number you guessed is higher then the Random number");
            return false;
        }
        return false; 
    }
}

public class Number_Game{
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);
        boolean Is_Number_Guessed = false;
        Random_Number Random_Number = new Random_Number();
        System.out.println("select the level of game ");
        System.out.println("1 - Entry level  (..- in Entry Level you get the 10 Chance to get the correct Guess -..) ");
        System.out.println("2 - Advanced  (..- in Advance Level You get the 7 Chances -..)");
        System.out.println("3 - Expert  (..- in Expert Level You get the 5 Chances -..)");
        int level = Input.nextInt();
        int attempts = 0;
        switch(level){
            case 1:
            attempts = 10;
            break;
            case 2:
            attempts = 7;
            break;
            case 3:
            attempts = 5;
            break;
            default:
                System.out.println("invalid choice");
                break;
        }
        for(int i = 1; i<=attempts&&!Is_Number_Guessed;i++){
        System.out.println("Attempt :- " + i);
        System.out.print("Enter the Number => ");
        int UserInput = Input.nextInt();
        Is_Number_Guessed = Random_Number.Guess_Number(UserInput);
        System.out.println();//this is used for giving space between attempts
        }
        if(!Is_Number_Guessed){
            System.out.println("your losed plss try again");
        }
    }
}