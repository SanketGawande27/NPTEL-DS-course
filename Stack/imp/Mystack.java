package stack.imp;

import stack.customException.MyException;

public class Mystack {

	final int MAX = 5;
	int top = -1;
	int stk[] = new int[MAX];
	int count = 0;
	int element;

	public int insert(int element) throws MyException {
		if (top >= (MAX - 1)) {
			throw new MyException("Stack is full no element is added");
		} else {
			stk[++top] = element;
			count++;
		}

		return element;
	}

	public int delete() throws MyException {
		if (top < 0) {
			throw new MyException("Stack is already Empty element not been deleted");
		} else {
			element = stk[top--];
			count--;
		}
		return element;
	}

	public int size() {
		return count;
	}

	public void display() {
		for (int i = 0; i < count; i++) {
			System.out.print(stk[i] + " ");
		}
		System.out.println("\n");

	}

}
