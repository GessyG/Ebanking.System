import java.util.Scanner;

public class LoginMenager {
    Scanner scan= new Scanner(System.in);
    public boolean loginUser(User user){
        System.out.println("Hyrja i userit!");
        System.out.println("Shkruaj usernamin: ");
        String username= scan.nextLine();
        System.out.println("Shkruaj password: ");
        String password= scan.nextLine();
        if(username.equals(user.getUsername())&& password.equals(user.getPassword())){
            System.out.println("Hyrja eshte bere me sukses! ");
            return true;
        } else {
            System.out.println("Ka probleme me usernamin ose passwordin!!! ");
            return false;
        }
    }
}

