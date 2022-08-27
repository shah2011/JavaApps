/* WAP to reverse a String.
	Input: “iNeuron”
	Output: “norueNi”  */

package Assignment3;

public class StringPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Think Twice"; // traverse in reverse. Start from n, so s1.length()-1, 7-1
		String s2=""; 
		
		for(int i=s1.length()-1; i>=0; i--)// i=s1.length()-1, start traversing from this position
		{
			s2=s2+s1.charAt(i);
		}
		System.out.println(s2); //norueNi
	}
}
