import javax.swing.LookAndFeel;

public class ExecuSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,7,11,15};
		int[] results;
		results = LeetCode1.twoSum(nums, 9);
		for(int i=0; i<results.length; i++)
			System.out.println(results[i]);
		
	}

}
