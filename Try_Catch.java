package practice;

public class Try_Catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		try {
			arr[6]=5;
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Array index is out of bounds!"); 
		}
        finally 
        {
            System.out.println("The array is of size " + arr.length);
        }
	

	}

}
