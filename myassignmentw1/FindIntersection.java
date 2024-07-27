package myassignmentw1;

public class FindIntersection {

	public static void main(String[] args) {

		int[] array1 = {3,2,11,4,6,7};
		int[] array2 = {1,2,8,4,9,7};
int length1 = array1.length;
//int length2 = array2.length;

for(int i=0;i<length1;i++)
{
if(array1[i]==array2[i])
{
	System.out.println(array1[i]+" same number");
}
}
	}

}
