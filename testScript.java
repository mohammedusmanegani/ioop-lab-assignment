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
	* Function Name: fnTest1
	* Author: Niraj
	* Function Parameter: none
	* Return Type: void
	* Stack State: empty
	* Function Description: successful if the stack is empty else test case fails.
	*/
	public void fnTest1(){
		Vector<Integer> vector = obj.getMagazineStack();
		if(!vector.isEmpty()){
			System.out.println("Testcase-1 Fails, State = empty, Service = getMagazineStack()");
		}else{
			System.out.println("Testcase-1 Successful, State = empty, Service = getMagazineStack()");
		}
	}
	
	/*
	* Function Name: fnTest2
	* Author: Niraj
	* Function Parameter: none
	* Return Type: void
	* Stack State: empty
	* Function Description: successful if the bullet is pushed on top of the stack else fails.
	*/
	public void fnTest2(){
		int random = rand.nextInt(9);
		int flag = obj.reFillMagazine(random);
		if(flag != 1){
			System.out.println("Testcase-2 Fails, State = empty, Service = reFillMagazine()");
		}else{
			System.out.println("Testcase-2 Successful, State = empty, Service = reFillMagazine()");
		}
	}
	
	/*
	* Function Name: fnTest3
	* Author: Niraj
	* Function Parameter: none
	* Return Type: void
	* Stack State: NENF
	* Function Description: successful if the stack is neither empty nor full and fails if the stack is empty or full.
	*/
	public void fnTest3(){
		Vector<Integer> vector = obj.getMagazineStack();
		if(vector.isEmpty() || vector.size() == 5){
			System.out.println("Testcase-3 Fails, State = empty/full, Service = getMagazineStack()");
		}else{
			System.out.println("Testcase-3 Successful, State = NENF, Service = getMagazineStack()");
		}
	}
	
	/*
	* Function Name: fnTest4
	* Author: Niraj
	* Function Parameter: none
	* Return Type: void
	* Stack State: NENF
	* Function Description: successful if the top-most bullet is popped from the stack else fails.
	*/
	public void fnTest4(){
		String message = obj.fireBullet();
		if(message.equals("#Stack Empty")){
			System.out.println("Testcase-4 Fails, State = empty, Service = fireBullet()");
		}else{
			System.out.println("Testcase-4 Successful, State = empty/NENF, Service = fireBullet()");
		}
	}
	
	/*
	* Function Name: fnTest5
	* Author: Mohammed Usman E Gani
	* Function Parameter: none
	* Return Type: void
	* Stack State: NENF
	* Function Description: successful if the bullet is pushed on top of the stack else fails.
	*/
	public void fnTest5(){
		int random = rand.nextInt(9);
		int flag = obj.reFillMagazine(random);
		if(flag != 1){
			System.out.println("Testcase-5 Fails, State = NENF, Service = reFillMagazine()");
		}else{
			System.out.println("Testcase-5 Successful, State = NENF/full, Service = reFillMagazine()");
		}
		storeMax();
	}
	
	/*
	* Function Name: fnTest6
	* Author: Mohammed Usman E Gani
	* Function Parameter: none
	* Return Type: void
	* Stack State: full
	* Function Description: successful if the stack is full else fails.
	*/
	public void fnTest6(){
		Vector<Integer> vector = obj.getMagazineStack();
		if(vector.size() != 5){
			System.out.println("Testcase-6 Fails, State = NENF/empty, Service = getMagazineStack()");
		}else{
			System.out.println("Testcase-6 Successful, State = FULL, Service = getMagazineStack()");
		}
	}
	
	/*
	* Function Name: fnTest7
	* Author: Mohammed Usman E Gani
	* Function Parameter: none
	* Return Type: void
	* Stack State: full
	* Function Description: successful if the top-most bullet from the stack is popped else fails.
	*/
	public void fnTest7(){
		String message = obj.fireBullet();
		if(message.equals("#Stack Empty")){
			System.out.println("Testcase-7 Fails, State = empty, Service = fireBullet()");
		}else{
			System.out.println("Testcase-7 Successful, State = NENF, Service = fireBullet()");
		}
		storeMax();
	}
	
	/*
	* Function Name: fnTest8
	* Author: Mukesh
	* Function Parameter: none
	* Return Type: void
	* Stack State: empty
	* Function Description: fails if the stack is empty and successful if the top-most element is popped.
	*/
	public void fnTest8() {
		minStack();
		String message = obj.fireBullet();
		if(message.equals("#Stack Empty")){
			System.out.println("Testcase-8 Fails, State = empty, Service = fireBullet()");
		}else{
			System.out.println("Testcase-8 Successful, State = empty/NENF, Service = fireBullet()");
		}
	}
	
	/*
	* Function Name: fnTest9
	* Author: Mukesh
	* Function Parameter: none
	* Return Type: void
	* Stack State: full
	* Function Description: fails if the stack is full and successful if the element is pushed on top of the stack.
	*/
	public void fnTest9() {
		storeMax();
		Vector<Integer> vector = obj.getMagazineStack();
		int random = rand.nextInt(9);
		int flag = obj.reFillMagazine(random);
		if(vector.size() >= 5){
			System.out.println("Testcase-9 Fails, State = full, Service = getMagazineStack()");
		}else{
			System.out.println("Testcase-9 successful, State = NENF, Service = getMagazineStack()");
		}
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
	
	/*
	* Function Name: main
	* Author: Mohammed Usman E Gani
	* Function Parameter: String
	* Return Type: void
	* Function Description: It is a main function where we will be calling the test functions.
	*/
	public static void main(String...args){
		testScript test = new testScript();
		test.fnTest1();
		test.fnTest2();
		test.fnTest3();
		test.fnTest4();
		test.fnTest5();
		test.fnTest6();
		test.fnTest7();
		test.fnTest8();
		test.fnTest9();
	} 
}
