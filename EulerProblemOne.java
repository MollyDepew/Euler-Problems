import java.util.ArrayList;

public class EulerProblemOne {
	private static int cap = 1000;
	private static int rThree;
	private static int rFive;
	private static ArrayList<Integer> nums = new ArrayList<Integer>();
	private static int sum = 0;
	public static void main(String[] args){
		for(int i = 0; i <cap; i++){
			rThree = findMultThree(i);
			rFive = findMultFive(i);
			if(rThree == 0 || rFive ==0 ){
				nums.add(i);
			}
		}
		for(int i = 0; i< nums.size(); i++){
			sum += nums.get(i);
			}
		System.out.println(sum);
			
		}
	
public static int findMultThree(int i){
	int r = i%3;
	return r;
	}
public static int findMultFive(int i){
	int r = i%5;
	return r;
	}
}
