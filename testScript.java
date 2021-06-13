import java.util.Random;
import java.util.Vector;

/*
* Class Name: testScript
* Author: Mukesh
* Class Description: constructor of testScript creates an object of magazine.
* there are nine test cases to be performed on the object of magazine.
* each test case is in the form of a non-static function which needs to be called with the help of an object of testScript
*/
public class testScript {
	private magazine obj;
	static public Random rand = new Random();
	
	public testScript(){
		obj = new magazine();
	}
  
  
  /*
	* Function Name: storeMax
	* Author: Mukesh
	* Function Parameter: none
	* Return Type: void
	* Function Description: it will push on top of the stack until its full.
	*/
	public void storeMax(){
		Vector<Integer> vector = obj.getMagazineStack();
		int size = vector.size();
		while(size != 5){
			int random = rand.nextInt(9);
			obj.reFillMagazine(random);
			size++;
		}
		return;
	}
	
	/*
	* Function Name: minStack
	* Author: Mukesh
	* Function parameter: none
	* Return Type: void
	* Function Description: it will pop the stack until its empty.
	*/
	public void minStack() {
		Vector<Integer> vector = obj.getMagazineStack();
		int size = vector.size();
		while(size != -1){
			obj.fireBullet();
			size--;
		}
		return;
	}
  
}
