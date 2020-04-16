
public class array {

	public static void main(String[] args) {
		int myarray[] = new int [3];
		myarray[0]= 0;
		myarray[1]=1;
		myarray[2]=2;
		for(int i=0;i<myarray.length;i++) {
			System.out.println(myarray[i]);
		}
		int myarray1[]= {1,2,3,4};
		for (int i=0;i<myarray1.length;i++) {
			System.out.println(myarray1[i]);
		}
		int myarray2[]= {5,6,7,8};
		for (int i:myarray2) {
			System.out.println(i);
		}
		String mystring[] = new String[3];
		mystring[0]="A1";
		mystring[1]="A2";
		mystring[2]="A3";
		for (int i=0;i< mystring.length;i++) {
			System.out.println(mystring[i]);
		}
		String mystring1[] = {"B1", "B2"};
		for (int i=0;i< mystring1.length;i++) {
			System.out.println(mystring1[i]);
		}
		String mystring2[] = {"C1", ""};
		for (String i:mystring2) {
			System.out.println(i);
		}
	}

}
