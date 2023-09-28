/*Build a program that allows users to add,
remove, and view items on a to-do list.*/

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        ArrayList<String> toDoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("To-Do List Menu:");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. View List");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the item to add: ");
                    String itemToAdd = scanner.nextLine();
                    toDoList.add(itemToAdd);
                    System.out.println("Item added to the list.");
                    break;

                case 2:
                    if (toDoList.isEmpty()) {
                        System.out.println("The list is empty. Nothing to remove.");
                    } else {
                        System.out.print("Enter the index of the item to remove: ");
                        int indexToRemove = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character
                        if (indexToRemove >= 1 && indexToRemove <= toDoList.size()) {
                            String removedItem = toDoList.remove(indexToRemove - 1);
                            System.out.println("Item removed: " + removedItem);
                        } else {
                            System.out.println("Invalid index. Please enter a valid index.");
                        }
                    }
                    break;

                case 3:
                    if (toDoList.isEmpty()) {
                        System.out.println("The list is empty.");
                    } else {
                        System.out.println("To-Do List:");
                        for (int i = 0; i < toDoList.size(); i++) {
                            System.out.println((i + 1) + ". " + toDoList.get(i));
                        }
                    }
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid choice.");
            }
        }
    }
}
