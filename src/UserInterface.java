/**
 * Created by ericweidman on 2/3/16.
 */
public class UserInterface {


    String userName;
    String userResponse;
    double userCurrentFunds;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public void logIn() throws Exception {
        System.out.println("Please, enter your username.");
        userName = TellerMachine.scanner.nextLine().trim();
        if (!userName.isEmpty()) {
            TellerMachine.userInfo.put(userName, 100.);
            System.out.println("Hello " + userName + ".");
        } else {
            System.out.println("A username is required. Would you like to create one now? [Yes/No]");
            userResponse = TellerMachine.scanner.nextLine();
            if (userResponse.equalsIgnoreCase("Yes")) {
                System.out.println("Please enter a username.");
                userName = TellerMachine.scanner.nextLine();
                System.out.println("Hello " + userName + ".");
                TellerMachine.userInfo.put(userName, 100.);
            } else {
                throw new Exception("You must have a username to use this ATM.");
            }
        }
    }


    public void getUserCurrentFunds() throws Exception {

    }


        public String getReasonForVisit () {


        System.out.println("What would you like to do?");
        System.out.println("Type 1 to check your balance.");
        System.out.println("Type 2 to withdraw funds.");
        System.out.println("Type 3 to cancel.");
        System.out.println("Type 4 to remove your account.");

        return TellerMachine.scanner.nextLine().toLowerCase().trim();
    }




    public void sayHello(){
        System.out.println("Welcome to Your Shitty Bank");
    }

}
