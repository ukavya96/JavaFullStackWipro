package Project3StudentRankingSystem;

import java.util.*;

class Student {
    String name;
    int rollNo;
    double score;

    public Student(String name, int rollNo, double score) {
        this.name = name;
        this.rollNo = rollNo;
        this.score = score;
    }

    public String toString() {
        return String.format("Name: %-10s Roll No: %-5d Score: %.2f", name, rollNo, score);
    }
}

class StudentRankingSystem {
    private List<Student> students = new ArrayList<>();
    private double totalScore = 0;

    public void addStudent(Student student) {
        students.add(student);
        totalScore += student.score;
    }

    public double getAverage() {
        return students.isEmpty() ? 0 : totalScore / students.size();
    }

    public void displayTop5() {
        List<Student> sorted = new ArrayList<>(students);
        sorted.sort((a, b) -> Double.compare(b.score, a.score)); // descending
        System.out.println("\n🔝 Top 5 Students:");
        List<Student> top5 = sorted.subList(0, Math.min(5, sorted.size()));
        for (Student s : top5) {
            System.out.println(s);
        }
    }

    public void displayAboveAverage() {
        double avg = getAverage();
        System.out.println("\n📈 Students with Score > Average (" + String.format("%.2f", avg) + "):");
        for (Student s : students) {
            if (s.score > avg) {
                System.out.println(s);
            }
        }
    }

    public void displaySameNameDifferentRolls() {
        Map<String, Set<Integer>> nameMap = new HashMap<>();
        for (Student s : students) {
            nameMap.putIfAbsent(s.name, new HashSet<>());
            nameMap.get(s.name).add(s.rollNo);
        }

        System.out.println("\n🔁 Students with Same Name but Different Roll Numbers:");
        for (Map.Entry<String, Set<Integer>> entry : nameMap.entrySet()) {
            if (entry.getValue().size() > 1) {
                String name = entry.getKey();
                System.out.println("Name: " + name);
                for (Student s : students) {
                    if (s.name.equals(name)) {
                        System.out.println("   " + s);
                    }
                }
            }
        }
    }
}

public class Project3 {
    public static void main(String[] args) {
        StudentRankingSystem srs = new StudentRankingSystem();

        srs.addStudent(new Student("Alice", 101, 88));
        srs.addStudent(new Student("Bob", 102, 92));
        srs.addStudent(new Student("Alice", 103, 75));
        srs.addStudent(new Student("David", 104, 95));
        srs.addStudent(new Student("Eva", 105, 68));
        srs.addStudent(new Student("Frank", 106, 85));
        srs.addStudent(new Student("Grace", 107, 90));
        srs.addStudent(new Student("Helen", 108, 79));
        srs.addStudent(new Student("Ian", 109, 99));
        srs.addStudent(new Student("Jack", 110, 81));

        srs.displayTop5();
        srs.displayAboveAverage();
        srs.displaySameNameDifferentRolls();
    }
}


