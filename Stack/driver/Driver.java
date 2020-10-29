package stack.driver;

import java.util.Scanner;

import stack.customException.MyException;
import stack.imp.Mystack;

public class Driver {

	public static void main(String[] args) throws MyException {
		int choice, element;
		Mystack mystack = new Mystack();

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("*******************************************************");
			System.out.println("*\tWhich operation you want to perform on stack");
			System.out.println("*\t  1 - Insert\t");
			System.out.println("*\t  2 - Delete\t");
			System.out.println("*\t  3 - Size\t");
			System.out.println("*\t  4 - Show all Elements on Stack\t");
			System.out.println("*******************************************************\n");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.print("Enter Element:  ");
				element = sc.nextInt();
				System.out.println(mystack.insert(element) + " is added");
				break;

			case 2:
				System.out.println(mystack.delete() + " is deleted");
				break;

			case 3:
				System.out.println("Total Size of Stack: " + mystack.size());
				break;

			case 4:
				System.out.println("Total Elements on Stack: ");
				mystack.display();
				break;

			default:
				System.out.println("Choose Correct Option from menu");

			}
		}

	}

}
