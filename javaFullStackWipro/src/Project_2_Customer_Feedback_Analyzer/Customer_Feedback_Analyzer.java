package Project_2_Customer_Feedback_Analyzer;
import java.util.*;
import java.util.regex.*;

public class Customer_Feedback_Analyzer {
	static Scanner scanner = new Scanner(System.in);
    static List<String> feedbackList = new ArrayList<>();


    public static void main(String[] args) {
		        while (true) {
		            System.out.println("\n---- Customer Feedback Analyzer ----");
		            System.out.println("1. Add Feedback");
		            System.out.println("2. View All Feedback");
		            System.out.println("3. Clean Feedback");
		            System.out.println("4. Mask Emails and Phone Numbers");
		            System.out.println("5. Keyword Occurrence Count");
		            System.out.println("6. Feedback Summary Report");
		            System.out.println("7. Exit");
		            System.out.print("Enter your choice: ");
		            
		            try {
		                int choice = Integer.parseInt(scanner.nextLine());
		                switch (choice) {
		                    case 1 -> addFeedback();
		                    case 2 -> viewFeedback();
		                    case 3 -> cleanAllFeedback();
		                    case 4 -> maskSensitiveInfo();
		                    case 5 -> keywordCount();
		                    case 6 -> summaryReport();
		                    case 7 -> {
		                        System.out.println("Exiting...");
		                        return;
		                    }
		                    default -> System.out.println("Invalid choice. Try again.");
		                }
		            } catch (NumberFormatException e) {
		                System.out.println("Please enter a valid number.");
		            }
		        }
		    }

		    static void addFeedback() {
		        System.out.print("Enter feedback: ");
		        String input = scanner.nextLine();
		        feedbackList.add(input);
		        System.out.println("Feedback added successfully.");
		    }

		    static void viewFeedback() {
		        if (feedbackList.isEmpty()) {
		            System.out.println("No feedback available.");
		        } else {
		            int i = 1;
		            for (String fb : feedbackList) {
		                System.out.println(i++ + ". " + fb);
		            }
		        }
		    }

		    static String cleanText(String text) {
		        text = text.trim();                       // remove leading/trailing spaces
		        text = text.replaceAll("[^\\w\\s@.]", ""); // remove special characters except @ and .
		        return text;
		    }

		    static void cleanAllFeedback() {
		        for (int i = 0; i < feedbackList.size(); i++) {
		            String cleaned = cleanText(feedbackList.get(i));
		            feedbackList.set(i, cleaned);
		        }
		        System.out.println("All feedback cleaned.");
		    }

		    static String maskInfo(String text) {
		        text = text.replaceAll(
		            "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-z]{2,6}", "[EMAIL]");
		        text = text.replaceAll(
		            "\\b\\d{10}\\b", "[PHONE]");
		        return text;
		    }

		    static void maskSensitiveInfo() {
		        for (int i = 0; i < feedbackList.size(); i++) {
		            String masked = maskInfo(feedbackList.get(i));
		            feedbackList.set(i, masked);
		        }
		        System.out.println("Sensitive information masked.");
		    }

		    static void keywordCount() {
		        System.out.print("Enter keyword to search: ");
		        String keyword = scanner.nextLine().toLowerCase();
		        int count = 0;
		        for (String fb : feedbackList) {
		            count += countOccurrences(fb.toLowerCase(), keyword);
		        }
		        System.out.println("Keyword \"" + keyword + "\" occurred " + count + " times.");
		    }

		    static int countOccurrences(String text, String word) {
		        Pattern pattern = Pattern.compile("\\b" + word + "\\b", Pattern.CASE_INSENSITIVE);
		        Matcher matcher = pattern.matcher(text);
		        int count = 0;
		        while (matcher.find()) count++;
		        return count;
		    }

		    static void summaryReport() {
		        int total = feedbackList.size();
		        if (total == 0) {
		            System.out.println("Total Feedbacks: 0, Avg: 0, Max: 0, Min: 0");
		            return;
		        }

		        int totalWords = 0, maxWords = Integer.MIN_VALUE, minWords = Integer.MAX_VALUE;
		        for (String fb : feedbackList) {
		            int words = fb.trim().split("\\s+").length;
		            totalWords += words;
		            maxWords = Math.max(maxWords, words);
		            minWords = Math.min(minWords, words);
		        }
		        double average = (double) totalWords / total;
		        System.out.printf("Total Feedbacks: %d, Avg: %.2f, Max: %d, Min: %d%n",
		                          total, average, maxWords, minWords);
		    }
		

		// TODO Auto-generated method stub

	}


