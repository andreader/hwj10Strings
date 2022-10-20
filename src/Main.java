import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        taskHard1();
        taskHard2();
        taskHard3();
        taskHard4();
    }

    private static void task1() {
        System.out.println();
        System.out.println("Задание 1.1");
        String firstName = "Ivan ";
        String middleName = "Ivanov ";
        String lastName = "Ivanovich ";
        String fullName = middleName + firstName + lastName;
        System.out.println("ФИО сотрудника - " + fullName);
    }

    private static void task2() {
        System.out.println();
        System.out.println("Задание 1.2");
        String firstName = "Ivan ";
        String middleName = "Ivanov ";
        String lastName = "Ivanovich ";
        String fullName = middleName + firstName + lastName;
        System.out.println(fullName.toUpperCase());
    }

    private static void task3() {
        System.out.println();
        System.out.println("Задание 1.3");
        String firstName = "Семён ";
        String middleName = "Иванов ";
        String lastName = "Семёнович ";
        String fullName = middleName + firstName + lastName;
        String fullName2 = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника - " + fullName2);
    }

    private static void taskHard1() {
        System.out.println();
        System.out.println("Доп. задание 1");
        String fullName = "Ivanov Ivan Ivanovich";
        char ch = ' ';
        int i1 = fullName.indexOf(ch);
        int i2 = fullName.lastIndexOf(ch);
        int i4 = fullName.length();
        int i3 = fullName.length() - fullName.length();
        String lastName = fullName.substring(i3, i1);
        String firstName = fullName.substring(i1, i2);
        String middleName = fullName.substring(i2, i4);
        System.out.println("lastName = " + lastName);
        System.out.println("firstName = " + firstName);
        System.out.println("middleName = " + middleName);
    }

    private static void taskHard2() {
        System.out.println();
        System.out.println("Доп. задание 2");
        String fullName = "ivanov ivan ivanovich";
        char ch = ' ';
        int i1 = fullName.indexOf(ch);
        int i2 = fullName.lastIndexOf(ch);
        int i4 = fullName.length();
        int i3 = fullName.length() - fullName.length();
        String lastName = fullName.substring(i3, i1);
        String firstName = fullName.substring(i1, i2);
        String middleName = fullName.substring(i2, i4);
        char[] c = lastName.toCharArray();
        char[] c1 = firstName.toCharArray();
        char[] c2 = middleName.toCharArray();
        System.out.print("Верное написание Ф. И. О. сотрудника c заглавных букв - ");
        for (int i = 0; i < c.length; i++) {
            if (i == 0) {
                System.out.print(Character.toUpperCase(c[i]));
            } else {
                System.out.print(c[i]);
            }
        }
        for (int i = 0; i < c1.length; i++) {
            if (i == 1) {
                System.out.print(Character.toUpperCase(c1[i]));
            } else {
                System.out.print(c1[i]);
            }
        }
        for (int i = 0; i < c2.length; i++) {
            if (i == 1) {
                System.out.print(Character.toUpperCase(c2[i]));
            } else {
                System.out.print(c2[i]);
            }
        }
    }

    private static void taskHard3() {
        System.out.println();
        System.out.println("Доп. задание 3");
        String s = "135";
        String s2 = "246";
        StringBuilder sb = new StringBuilder(s);
        StringBuilder sb2 = new StringBuilder(s2);
        sb.insert(1, s2.charAt(0));
        sb.insert(3, s2.charAt(1));
        sb.insert(5, s2.charAt(2));
        System.out.println("Данные строки — " + sb);
    }

    private static void taskHard4() {
        System.out.println();
        System.out.println("Доп. задание 4");
        String s = "aabccddefgghiijjkk";
        char[] c = s.toCharArray();
        Arrays.sort(c);
        for (int i = 0; i < c.length-1; i++) {
            if (c[i] == c [i+1]) {
                System.out.print(c[i]);
            }
        }
    }
}