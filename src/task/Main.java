package task;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        User person1 = new User(),person2 = new User(),person3 = new User(),person4 = new User(),person5 = new User();
        List<User> userList = Arrays.asList(person1,person2,person3,person4,person5);
        Scanner intScan = new Scanner(System.in), strScan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Введите имя пользователя " + (i+1));
            userList.get(i).setName(strScan.nextLine());
            System.out.println("Введите возраст пользователя " + (i+1));
            userList.get(i).setAge(intScan.nextInt());
        }
        userList.sort(Comparator.comparingInt(User::getAge));
        System.out.println(userList);
    }

}