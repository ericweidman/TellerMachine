import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by ericweidman on 2/3/16.
 */
public class TellerMachine {
    public static Scanner scanner = new Scanner(System.in);
    public static HashMap<String, Double> userInfo = new HashMap();
    public static UserInterface userInterface;

    public static void main(String[] args) throws Exception {


        userInterface = new UserInterface();
        userInterface.sayHello();
        userInterface.logIn();

        while (true) {


            String reason = userInterface.getReasonForVisit();


            evaluateUserSelection(reason);
            userInterface.getUserCurrentFunds();

        }
    }

    public static void evaluateUserSelection(String userOption) {
        if (userOption.equals("1")) {
            System.out.println(userInfo.get(userInterface.getUserName()));
        } else if (userOption.equals("2")) {
            System.out.println("How much money would you like to withdraw?");
        } else if (userOption.equals("3")) {
            System.out.println("Thank you and please come again.");
            System.exit(0);
        } else if (userOption.equals("4")) {
            userInfo.remove(userInterface.getUserName());
            System.out.println("Account removed.");
            System.exit(0);
        } else {
            System.out.println("Program terminated.");
        }
    }
}


