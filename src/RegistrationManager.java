import java.util.Scanner;

public class RegistrationManager {
    Scanner scan= new Scanner(System.in);

    public User registerUser(){
        System.out.println("Regjistrimi i userit!");
        System.out.println("Shkruaj username: ");
        String username= scan.nextLine();
        System.out.println("Shkruaj password: ");
        String password= scan.nextLine();

        User user= new User();
        user.setUsername(username);
        user.setPassword(password);

        System.out.println("Regjistrimi u krye me sukses");


        return user;



    }



































}