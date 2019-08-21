package exercises7;

/**
 * 
 * Identify the parts of this object:
 *      Constructor
 *      Instance variables
 *      Methods
 *         Accessors -- returns the value of the instance variables
 *         Mutators -- change by fiat the value of an instance variable
 *         Other
 *
 */
public class Person {
	
	/**
	 * Instance variables
	 */
	private int height, age;
	
	/**
	 * Constructor
	 * @param height
	 */
	public Person(int height) {
		this.height = height;
		this.age    = 0;
	}
	
	/**
	 * Mutator
	 * @param height
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	
	/**
	 * "other"--ages the person by one year
	 */
	public void happyBirthday() {
		this.age = this.age + 1;
	}
	
	/**
	 * Accessor
	 */
	public int getHeight() {
		return this.height;
	}
	
	/**
	 * Accessor
	 * @return
	 */
	public int getAge() {
		return this.age;
	}
	

}
