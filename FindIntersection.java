package week2.day1;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1={3,2,11,4,6,7};
		int[] num2={1,2,8,4,9,7};
		int length = num1.length;
		int length2 = num2.length;
		//System.out.println(num1.length);
		//System.out.println(num2.length);
		for(int i=0;i<num1.length;i++) {
			for(int j=0;j<num2.length;j++) {
				if(num1[i]==num2[j]) {
					System.out.println(num1[i]);
				
				
			}
		}
		}

	}

}
