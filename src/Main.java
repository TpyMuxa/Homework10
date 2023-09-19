public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String check = "IvanovIvanIvanovich";
        firstName = firstName.replace(" ", "");
        middleName = middleName.replace(" ", "");
        lastName = lastName.replace(" ", "");
        if (firstName.isEmpty()) {
            throw new RuntimeException("line is empty");
        } else if (middleName.isEmpty()) {
            throw new RuntimeException("line is empty");
        } else if (lastName.isEmpty()) {
            throw new RuntimeException("line is empty");
        }
        if (firstName.charAt(0) == 'i') {
            firstName = firstName.replace('i', 'I');
        }
        if (middleName.charAt(0) == 'i') {
            middleName = middleName.replace('i', 'I');
        }
        if (lastName.charAt(0) == 'i') {
            lastName = lastName.replace('i', 'I');
        }
        String fullName = lastName + firstName + middleName;
        if (fullName.equals(check)) {
            System.out.printf(lastName + " " + firstName + " " + middleName);
        } else {
            throw new RuntimeException("no matches found");
        }
    }
}