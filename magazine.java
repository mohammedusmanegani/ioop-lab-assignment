import java.util.Vector;

/*
* Class Name: magazine
* Author: Mohammed Usman E Gani
* Class Description: An object of magazine class creates a stack using vector of size 5.
* operations that can be performed on the stack are:
* 				->reFillMagazine(x)
* 				->fireBullet()
* 				->getMagazineStack()
*/
public class magazine {
	private Vector<Integer> bullet_stack;
	private int top = -1;
	private int size = 5;
	
	public magazine() {
		bullet_stack = new Vector<Integer>(size);
	}
	
	/*
	* Function Name: reFillMagazine
	* Author: Narasimha
	* Function Parameter: int
	* Return Type: Integer
	* Function Description: This function takes an integer and pushes it on top of the bullet_stack.
	*/
	public Integer reFillMagazine(int x) {
		if(top == size-1) {
			return 2;
		}
		top++;
		bullet_stack.add(top,x);
		return 1;
	}
	
	/*
	* Function Name: fireBullet
	* Author: Narasimha
	* Function Parameter: none
	* Return Type: String
	* Function Description: this function when called pops an integer from the top of the bullet_stack.
	*/
	public String fireBullet(){
		String message;
		if(top == -1){
			message = "#Stack Empty";
			return message;
		}
		message = bullet_stack.get(top)+"#Successful";
		top--;
		return message;
	}
	
	/*
	* Function Name: getMagazineStack
	* Author: Narasimha
	* Function Parameter: none
	* Return Type: Vector object
	* Function Description: this function creates a clone of the stack that is currently being used.
	*/
	public Vector<Integer> getMagazineStack(){
		@SuppressWarnings("UseOfObsoleteCollectionType")
		Vector<Integer> object_clone = (Vector<Integer>) bullet_stack.clone();
		return object_clone;
	}
}
