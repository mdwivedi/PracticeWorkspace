package MainFunction;

import DoublyLinkedLists.*;
import LinkedLists.*;

import java.util.Scanner;

public class SampleTest {
    public static void main(String[] args) {

        System.out.println("Welcome to linked List Sample Program");

//        SingleLinkedList s_list = new SingleLinkedList(null, null, 0);

        DoubleLinkedList d_list = new DoubleLinkedList(null, null, 0);

        Scanner scan = new Scanner(System.in);
        char ch;
        do {
            System.out.println("Enter 1 to insert in the list");
            System.out.println("Enter 2 to display the list forward");
            System.out.println("Enter 2 to display the list backward");

            int choice = scan.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Please enter the data you want to add to the list");
                    int data = scan.nextInt();
                    System.out.println("Please enter the position on which you want to enter the node");
                    int position = scan.nextInt();
                    list.insertNode(data, position);
                    break;
                }

                case 2: {
                    list.displayForward();
                    break;
                }

                case 3: {
                    list.displayReverse();
                    break;
                }
            }

            System.out.println("Do you want to continue 'y/n'?");
            ch = scan.next().charAt(0);

        } while (ch == 'y' || ch == 'Y');
    }
}
