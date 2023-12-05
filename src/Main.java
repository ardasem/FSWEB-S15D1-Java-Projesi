import com.Workintech.model.GroceryList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GroceryList groceryList = new GroceryList();

        int choice;

        do {
            System.out.println("0 quit,1: addItem ,2:removeItems");
            choice=scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Put multiple items separated with a ',' or just add a single item. ");
                    String itemsToadd = scanner.nextLine();
                    groceryList.addItems(itemsToadd);
                    break;
                case 2:
                    System.out.println("Put multiple items separated with a ',' or just remove a single item. ");
                    String itemsToRemove = scanner.nextLine();
                    groceryList.addItems(itemsToRemove);
                    break;
            }
            groceryList.printSorted();

        }while (choice !=0) ;
        scanner.close();

    }
}