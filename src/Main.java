public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        String firstName = "IvaN";
        String middleName = "ivanovicH";
        String lastName = "ivanov";
        String check = "Ivanov Ivan Ivanovich";
        firstName = firstName.replace(" ", "");
        middleName = middleName.replace(" ", "");
        lastName = lastName.replace(" ", "");
        firstName = firstName.toLowerCase();
        middleName = middleName.toLowerCase();
        lastName = lastName.toLowerCase();
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
            middleName = 'I' + middleName.substring(1);
        }
        if (lastName.charAt(0) == 'i') {
            lastName = lastName.replace('i', 'I');
        }
        String fullName = lastName + " " + firstName + " " + middleName;
        if (fullName.equals(check)) {
            System.out.println(fullName);
        } else {
            throw new RuntimeException("no matches found");
        }
        System.out.println("Задание 2");
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());

        System.out.println("Задание 3");
        fullName = "Иванов Семён Семёнович";
        check = "Иванов Семен Семенович";
        fullName = fullName.replace('ё', 'е');
        if (fullName.equals(check)) {
            System.out.println("Данные Ф. И. О. сотрудника — " + fullName);
        } else {
            System.out.println("Некорректно введенные данные");
        }
    }
}