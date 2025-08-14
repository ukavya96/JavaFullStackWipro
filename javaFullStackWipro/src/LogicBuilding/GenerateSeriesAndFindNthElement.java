package LogicBuilding;

import java.util.*;

	class UserMainCode {
	   
	    public int seriesN(int input1, int input2, int input3, int input4) {
	    
	        int diff1 = input2 - input1;
	        int diff2 = input3 - input2;

	        if (input4 == 1) return input1;
	        if (input4 == 2) return input2;
	        if (input4 == 3) return input3;

	        int current = input3;
	        boolean useDiff1 = true; 

	        for (int i = 4; i <= input4; i++) {
	            if (useDiff1) {
	                current += diff1;
	            } else {
	                current += diff2;
	            }
	            useDiff1 = !useDiff1; 
	        }
	        return current;
	    }
	}

	class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int c = sc.nextInt();
	        int N = sc.nextInt();

	        UserMainCode obj = new UserMainCode();
	        System.out.println(obj.seriesN(a, b, c, N));
	    }
	}
