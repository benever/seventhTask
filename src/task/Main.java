package task;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        Scanner intScan = new Scanner(System.in), strScan = new Scanner(System.in);

        String name;
        int age;

        for (int i = 0; i < 5; i++) {
            System.out.println("Введите имя пользователя " + (i+1));
            name = strScan.nextLine();
            System.out.println("Введите возраст пользователя " + (i+1));
            age = intScan.nextInt();

            userList.add(new User(name,age));
        }
        userList.sort(Comparator.comparingInt(User::getAge));

        for (int i = 0; i < 5; i++) {
            System.out.println(userList.get(i).toString());
        }
    }

}