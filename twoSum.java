import java.util.Hashtable;
public class Solution {
	public int[] twoSum(int[] numbers,int target) {
		int[] result = new int[2];
		Hashtable<Integer,Integer> table = new Hashtable<Integer,Integer>();
		for(int i=0;i<numbers.length;i++)
		{
			if(table.containsKey(numbers[i]))
			{
				result[0] = table.get(numbers[i])+1;
				result[1] = i+1;
				break;
			}
			table.put(numbers[i],i);
		}
		return result;
	}
}
