import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String Scanner_Response = null;
        while (true) {
            System.out.println("Enter a string and then I will print its reverse");
            Scanner_Response = scanner.nextLine();

            //creates and assigns an array to each character in the Scanner_Response
            String[] Split_Response = Scanner_Response.split("");
            String Reversed_String = "";

            //creates a new string that adds the last index of the array
            for(int index = Split_Response.length - 1; index >= 0;index--){
                Reversed_String += Split_Response[index];
            }

            //
            System.out.println("The reversed string is " + Reversed_String);
            while(true){
                System.out.println("Type in \"continue\" to restart the program or type in \"exit\" to close the program");
                Scanner_Response = scanner.nextLine();
                switch(Scanner_Response){
                    case "exit":
                        scanner.close();
                        System.exit(0);
                    case "continue":
                        break;
                    default:
                        System.out.println("Please enter a valid key word");
                        continue;
                }
                break;
            }
        }
    }
}
