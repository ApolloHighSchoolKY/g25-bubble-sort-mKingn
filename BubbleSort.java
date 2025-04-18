import java.util.Arrays;
public class BubbleSort
{

	public static void main(String[] args)
	{
		int[] myNums = {12, 15, 0, 44, 13, 1, 2};
		int passes =myNums.length -2;
		int comparisons=myNums.length-1;
		int tempNum=0;

		//Loop once for each pass, where passes is one less than the number of items.
			//Loop once for each comparison, where comparisons are one less than the number of unsorted.
				//If they are out of order, swap the values
			//End Loop for comparisons
    
			//The next pass will use one less comparison
    
		//End Loop for passes

		for (int i=0; i <=passes; i++){
			for (int k=0; k < comparisons; k++){
				if (myNums[k]>myNums[k+1]){
					tempNum = myNums[k];
					myNums[k]= myNums[k+1];
					myNums[k+1] = tempNum;

				}
				
			}
			comparisons--;
			tempNum=0;
			System.out.println(Arrays.toString(myNums));
		}
		System.out.println(Arrays.toString(myNums));

	}
}
