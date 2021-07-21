package generic;

public class Test {
public static <T> void Display(T[] arraytest){
	for(T element : arraytest) {
		System.out.print(element+"  ");
	}
}
	public static void main(String[] args) {
		Integer[] intarray = {1,5,8,9,6,3,6};
		Double[] doublearray= {1.2,55.5,8.9,44.6,77.3};
		Character[] chararray = {'k','l','D','A','b'};
		System.out.print("array int : ");
		Display(intarray);
		System.out.print("\narray double: ");
		Display(doublearray);
		System.out.print("\nchar array: ");
		Display(chararray);
		
	}

}
