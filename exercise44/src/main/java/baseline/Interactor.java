package baseline;

import java.util.Map;
import java.util.Scanner;

//class for interacting with the user. wanted to call it "interface" or something similar, but figured that could
//be confusing given that "interface" means something in java already
public class Interactor {

    //method to prompt the user for a product name and return their entry
    public String promptUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the product name?");
        return input.nextLine();
    }

    //method that, while true, calls promptUser
    public Product getProduct(Map<String, Product> inventory, String input){

        }
    }
}
