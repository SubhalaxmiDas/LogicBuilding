package String;

public class ReverseString {

	public static void main(String[] args)
	{
		String str="Hello";
		String reverse="";
		for(int i=str.length()-1;i>=0;i--)
		{
			char ch=str.charAt(i);
			reverse=reverse+ch;
		}
		System.out.println("Reverse String: "+reverse);
	}

}
