//Balanced strings are those that have an equal quantity of 'L' and 'R' characters.
//Given a balanced string s, split it in the maximum amount of balanced strings.
//Return the maximum amount of split balanced strings.
//
//Example 1:
//Input: s = "RLRRLLRLRL"
//Output: 4
//Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.

//Example 2:
//Input: s = "RLLLLRRRLR"
//Output: 3
//Explanation: s can be split into "RL", "LLLRRR", "LR", each substring contains same number of 'L' and 'R'.

//Example 3:
//Input: s = "LLLLRRRR"
//Output: 1
//Explanation: s can be split into "LLLLRRRR".

//Example 4:
//Input: s = "RLRRRLLRLL"
//Output: 2
//Explanation: s can be split into "RL", "RRRLLRLL", since each substring contains an equal number of 'L' and 'R'


public class SplitAStringInBalancedStrings {
	
	public static int balancedStringSplit(String s) {
		int count=0;
		int bal =0;
	        for(int i=0;i<s.length();i++) {
	        	if(s.charAt(i)=='R') {
	        		bal++;
	        	}else {
	        		bal--;
	        	}
	        	if(bal==0) {
	        		count++;
	        	}
	        }
	        return count;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(balancedStringSplit("RLRRLLRLRL"));
		System.out.println(balancedStringSplit("RLLLLRRRLR"));
		System.out.println(balancedStringSplit("LLLLRRRR"));
		System.out.println(balancedStringSplit("RLRRRLLRLL"));



	}

}
