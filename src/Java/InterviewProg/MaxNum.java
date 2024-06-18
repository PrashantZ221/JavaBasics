package InterviewProg;

public class MaxNum {

	public void largestNum(int [] numArr)
	{
		int max = numArr[0];
		for(int i=1; i<numArr.length; i++)
		{			
			if (max < numArr[i])
			{
				max = numArr[i];
			}
		}
		System.out.println("Max number in the array is " + max);		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxNum object = new MaxNum();
		int numArray[] = {5,6,9,8,7,2};		
		System.out.println(numArray.length);
		object.largestNum(numArray);	
	}
	
	
}
