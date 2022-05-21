package OOPs_Concepts.interfacesDemos.InterfacesNewFeatures;

import OOPs_Concepts.interfacesDemos.InterfaceRefernce.ClassA;
import OOPs_Concepts.interfacesDemos.InterfaceRefernce.I1;

public class MainClass implements I1 {

	public static void main(String[] args) {
		ClassA obj = new ClassA();
		//System.out.println(obj.a);
		
		MainClass mc = new MainClass();
		mc.a =100;
		System.out.println(mc.a);
		

	}

}
