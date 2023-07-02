public class Main {
    public static void main(String[] args) {
        RegistrationManager reg1= new RegistrationManager();
        User newUser= reg1.registerUser();

        LoginMenager log1= new LoginMenager();
        log1.loginUser(newUser);
    }
}