package project_2;
import java.util.*;
import java.util.regex.*;



public class prog1 {

	
	

	    private static final List<String> feedbackList = new ArrayList<>();
	    private static final Scanner sc = new Scanner(System.in);

	    public static void main(String[] args) {
	        while (true) {
	            System.out.println("\n--- Feedback Menu ---");
	            System.out.println("1. Add Feedback");
	            System.out.println("2. View All Feedback");
	            System.out.println("3. Clean Feedback Text");
	            System.out.println("4. Mask Emails and Phone Numbers");
	            System.out.println("5. Keyword Occurrence Count");
	            System.out.println("6. Feedback Summary Report");
	            System.out.println("7. Exit");
	            System.out.print("Enter your choice: ");

	            try {
	                int choice = Integer.parseInt(sc.nextLine());

	                switch (choice) {
	                    case 1 -> addFeedback();
	                    case 2 -> viewAllFeedback();
	                    case 3 -> cleanAllFeedback();
	                    case 4 -> maskSensitiveInfo();
	                    case 5 -> keywordCount();
	                    case 6 -> generateSummaryReport();
	                    case 7 -> {
	                        System.out.println("Exiting...");
	                        return;
	                    }
	                    default -> System.out.println("Invalid choice. Try again.");
	                }

	            } catch (NumberFormatException e) {
	                System.out.println("Invalid input. Please enter a number.");
	            }
	        }
	    }

	    // 1. Add Feedback
	    private static void addFeedback() {
	        System.out.print("Enter feedback: ");
	        String input = sc.nextLine();
	        feedbackList.add(input);
	        System.out.println("Feedback added successfully");
	    }

	    // 2. View All Feedback
	    private static void viewAllFeedback() {
	        if (feedbackList.isEmpty()) {
	            System.out.println("No feedback available.");
	        } else {
	            int i = 1;
	            for (String feedback : feedbackList) {
	                System.out.println(i++ + ". " + feedback);
	            }
	        }
	    }

	    // 3. Clean Feedback Text
	    private static void cleanAllFeedback() {
	        for (int i = 0; i < feedbackList.size(); i++) {
	            feedbackList.set(i, cleanFeedback(feedbackList.get(i)));
	        }
	        System.out.println("All feedback cleaned successfully.");
	    }

	    private static String cleanFeedback(String text) {
	        text = text.trim();
	        text = text.replaceAll("[^\\w@.\\s]", ""); // remove special chars except @ and .
	        return text;
	    }

	    // 4. Mask Emails and Phone Numbers
	    private static void maskSensitiveInfo() {
	        for (int i = 0; i < feedbackList.size(); i++) {
	            String masked = feedbackList.get(i)
	                    .replaceAll("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}", "[EMAIL]")
	                    .replaceAll("\\b\\d{10}\\b", "[PHONE]");
	            feedbackList.set(i, masked);
	        }
	        System.out.println("Sensitive info masked.");
	    }

	    // 5. Keyword Occurrence Count
	    private static void keywordCount() {
	        System.out.print("Enter keyword to search: ");
	        String keyword = sc.nextLine().toLowerCase();
	        int count = 0;

	        for (String feedback : feedbackList) {
	            count += countKeywordIgnoreCase(feedback, keyword);
	        }

	        System.out.println("Keyword \"" + keyword + "\" occurred " + count + " time(s).");
	    }

	    private static int countKeywordIgnoreCase(String text, String keyword) {
	        Pattern p = Pattern.compile("\\b" + Pattern.quote(keyword) + "\\b", Pattern.CASE_INSENSITIVE);
	        Matcher m = p.matcher(text);
	        int count = 0;
	        while (m.find()) {
	            count++;
	        }
	        return count;
	    }

	    // 6. Feedback Summary Report
	    private static void generateSummaryReport() {
	        int total = feedbackList.size();
	        int sum = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

	        for (String feedback : feedbackList) {
	            int words = feedback.trim().isEmpty() ? 0 : feedback.trim().split("\\s+").length;
	            sum += words;
	            min = Math.min(min, words);
	            max = Math.max(max, words);
	        }

	        double avg = total == 0 ? 0 : (double) sum / total;
	        System.out.printf("Total Feedbacks: %d, Avg: %.2f, Max: %d, Min: %d%n",
	                total, avg, total == 0 ? 0 : max, total == 0 ? 0 : min);
	    }
	}

