package week2.day1;

import java.util.stream.IntStream;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "We learn java basics as part of java sessions in java week1";
		int count=1;
		char[] charArray = text.toCharArray();
		int length = text.length();
		//System.out.println(text);
		//System.out.println(length);
		String[] split = text.split("");
		for(int i=0;i<split.length;i++) {
			for(int j=i+1;j<split.length;j++) {
				if(split[i].equals(split[j])) {
					count++;
				}
			}
				if(count>1) {
					text=text.replace(split[i], "");
					System.out.println(text);
					
			}
			
				
				
			
		}
	}

}
