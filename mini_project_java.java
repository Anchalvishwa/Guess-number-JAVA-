import java.util.Scanner;
public class mini_project_java {
    public static void main(String[] args) {
        int random_number;
        int user_input;
        random_number= (int)(Math.random()*100);
        System.out.println("----**WELCOME TO THE GAME: GUESS THE NUMBER**----");
        System.out.println("Guess the number or enter -1 to quite the game :");
        while(true){
         
            Scanner sc= new Scanner((System.in));
            user_input= sc.nextInt();

            if(user_input == -1){
                System.out.println("Well the number was:" +random_number);
                System.out.println("Quiting the game...");
                break;

            }

            else if(user_input == random_number){
                System.out.println("Wooho!! Congratulation you guessed correctly.");
                System.out.println("___GAME OVER___");
                break;
            }
            else if(user_input > random_number){
                System.out.println("Hint: Choose smaller numbers!!");
            }
            else if(user_input < random_number){
                System.out.println("Hint: Choose greater numbers!!");
            }
            else{
                System.out.println("Please input only numbers!!");
            }

        }
    }
    
}
