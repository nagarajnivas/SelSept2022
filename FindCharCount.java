package week1.day2;

public class FindCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String str = "Nagaraj";
	char ch = 'a';
	
	int count = 0;
	char[] charArray = str.toCharArray();
	
	for(int i=0; i<charArray.length; i++)
	{
		if(charArray[i]==ch)
		{
			count++;
		}
	}
	System.out.println(count);
	}
}
