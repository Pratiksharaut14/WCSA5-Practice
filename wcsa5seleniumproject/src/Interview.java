
public class Interview {

	public static void main(String[] args) {
		
		String str = "abc def abc def";
		
		char[] cArray = str.toCharArray();
		
		System.out.println("Duplicates in the string are : ");
	
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1; j<str.length();j++)
			{
				if(cArray[i]==cArray[j])
				{
					System.out.println(cArray[j]+" ");
				}
			}
		}

	}

}
