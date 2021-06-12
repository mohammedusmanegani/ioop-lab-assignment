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
	
	
}
