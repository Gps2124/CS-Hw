public class CalculateGrade {
    public class Main {
        public static void main(String[] args) {
            System.out.println("Hello world!");

            calculateGrade(80, 80, 80, 80, 80);
        }

        public static double calculateGrade(double discussions, double midterm, double Final, double assignments, double groupProject ) {
            double totalGrade = 0.2 * (discussions + midterm + Final + assignments + groupProject);
            double Gpa;
            if (totalGrade >= 95)
                Gpa = 4.0;
            else if (totalGrade < 60)
                Gpa = 0;
            else
                Gpa = (3.0/35) * (totalGrade - 60) + 1;
            System.out.println(String.format("%.1f", Gpa));
            return Gpa;
        }
    }
}
