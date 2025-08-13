package LogicBuilding;
import java.util.*;

class GetCodeThroughStrings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your sentence: "); 

        String input1 = sc.nextLine().trim();

        if (input1.isEmpty()) {
            System.out.println(0);
            return;
        }

        String words[] = input1.split("\\s+");
        int sum = 0;

        for (String word : words) {
            sum += word.length();
        }

        while (sum >= 10) {
            int temp = sum;
            sum = 0;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
        }

        System.out.println("Code: " + sum);
    }
}

