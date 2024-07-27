package myassignmentw1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
int[] input = {1, 4,3,2,8, 6, 7};    
Arrays.sort(input);
//input={1,2,3,4,6,7,8}
int length= input.length;
for(int i=0;i<input.length-1;i++)
{
int num = input[i]+1;
//num=1+1=2
//if(2 not equalto 2)

if (num!=input[i+1])
		System.out.println("Missing Number is "+num);
}
	}

}
