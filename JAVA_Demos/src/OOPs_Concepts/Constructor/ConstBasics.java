package OOPs_Concepts.Constructor;

/*
 * Constructor is special type of method which is having the same name as that of class name
 * Constructor having no return type
 * There is no need to call the constructor explicitly, it gets called automatically as we crate an object of class
 *  Why Use:  Const. is use to initialise the  object of class and also initialise the non static members
 *  
 *  Contructor Types: Parameteric Const| non-parameteric Const or default const.
 *  
 *  difference between Method and const--imp.
 *  
 *  Constructor Overloading: More than two consts. (having same name as that of class name) with samqe name, 
 *  different no. of parameters and diff. type of parameters
 *  
 */
public class ConstBasics {
	//non-parameteric Const
	public ConstBasics() {
		System.out.println("ConstBasics Constructor");

	}

	//Method
	public void ConstBasics() {
		System.out.println("Non static Method....");
	}

	public static void main(String[] args) {
		ConstBasics cb = new ConstBasics();
		cb.ConstBasics();
	}

}
