import java.util.Scanner;

public class lab01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name;
        int age;
        char gender;
        boolean married;
        float salary;
        String region = "";
        String gen = " ";

        System.out.println("Enter your monthly salary: ");
        salary = Float.parseFloat(scan.nextLine());

        System.out.println("You are married: True or False? ");
        married = Boolean.parseBoolean(scan.nextLine());

        System.out.println("Enter you name: ");
        name = scan.nextLine();

        System.out.println("Enter age: ");
        age = Integer.parseInt(scan.nextLine());

        String state;

        System.out.println("Enter you state: ");
        state = scan.nextLine();

        System.out.println("Enter 'm' for male or 'f' for female: ");
        gender = scan.next().charAt(0);

        if (gender == 'm') {
            gen = "MALE";
        } else if (gender == 'f') {
            gen = "FEMALE";
        }

        switch (state) {
            case "Chandigarh":
            case "Delhi":
            case "Haryana":
            case "Jammu kashmir":
                region = "North";
                break;

            case "Karnataka":
            case "Kerala":
            case "Andhra Pradesh":
            case "Telangana":
            case "Arunachal Pradesh":
                region = "South";
                break;

            case "Mizoram":
            case "Odisha":
            case "Jharkhand":
            case "AndhraPradesh":
            case "Bihar":
            case "Nagaland":
            case "Assam":
                region = "East";
                break;
        }

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gen);
        System.out.println("Married: " + married);
        System.out.println("Salary: " + salary);
        System.out.println("The student is from region " + region);

        scan.close();
    }
}