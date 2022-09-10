package week1.day2;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstNum=0, secNum=1, sum, count=8;
		System.out.print(firstNum+" "+secNum);
		
		for(int i=0;i<=count;i++)
		{
			sum = firstNum+secNum;
			System.out.print(" "+sum);
		
			firstNum = secNum;
			secNum=sum;
		}
	}

}
