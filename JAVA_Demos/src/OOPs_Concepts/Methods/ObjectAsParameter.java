package OOPs_Concepts.Methods;

public class ObjectAsParameter {
	
	public void getObjectValue(ObjectAsParameter x) {
		System.out.println("in Method..."+x);
	}
	public static void main(String[] args) {
		ObjectAsParameter obj =  new ObjectAsParameter();
		System.out.println(obj);//OOPs_Concepts.Methods.ObjectAsParameter@15db9742
		obj.getObjectValue(obj);
	}
}
