package Task2;
//Напишите программу, которая будет выводить всю информацию о классе, пользователь сам выбирает, какой именно класс интересует.

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя класса (Dog / Fox / Bear) :");
        String s = scanner.nextLine();

        Class<?> cBear = Bear.class;
        Class<?> cDog = Dog.class;
        Class<?> cFox = Fox.class;

        if ("Bear".equals(s)) {
            System.out.println("Fields:  ");
            Field[] fields = cBear.getDeclaredFields();
            for (Field f : fields) {
                Class<?> field = f.getType();
                System.out.println("Name: " + f.getName());
                System.out.println("\tType: " + field.getName());
            }
            System.out.println("=========================");
            Method[] methods = cBear.getMethods();
            System.out.println("Methods : ");
            for (Method m : methods) {
                System.out.println("Name: " + m.getName());
                System.out.println("\tReturn type: " + m.getReturnType().getName());
                Class<?>[] paramTypes = m.getParameterTypes();
                for (Class<?> param : paramTypes) {
                    System.out.println(" " + param.getName());
                }
            }
            System.out.println("============================ ");
            Constructor<?>[] constructors = cBear.getConstructors();
            int i = 0;
            System.out.println("Constructors :");
            for (Constructor<?> ctr : constructors) {
                System.out.println("\tConstructor " + (++i));
                Class<?>[] param = ctr.getParameterTypes();
                for (Class<?> p : param) {
                    System.out.println(p.getName() + " ");
                }


            }
        } else if ("Dog".equals(s)) {
            System.out.println("Fields:  ");
            Field[] fields = cDog.getDeclaredFields();
            for (Field f : fields) {
                Class<?> field = f.getType();
                System.out.println("Name: " + f.getName());
                System.out.println("\tType: " + field.getName());
            }
            System.out.println("=========================");
            Method[] methods = cDog.getMethods();
            System.out.println("Methods : ");
            for (Method m : methods) {
                System.out.println("Name: " + m.getName());
                System.out.println("\tReturn type: " + m.getReturnType().getName());
                Class<?>[] paramTypes = m.getParameterTypes();
                for (Class<?> param : paramTypes) {
                    System.out.println(" " + param.getName());
                }
            }
            System.out.println("============================ ");
            Constructor<?>[] constructors = cDog.getConstructors();
            int i = 0;
            System.out.println("Constructors :");
            for (Constructor<?> ctr : constructors) {
                System.out.println("\tConstructor " + (++i));
                Class<?>[] param = ctr.getParameterTypes();
                for (Class<?> p : param) {
                    System.out.println(p.getName() + " ");
                }


            }
        } else if ("Fox".equals(s)) {
            System.out.println("Fields:  ");
            Field[] fields = cFox.getDeclaredFields();
            for (Field f : fields) {
                Class<?> field = f.getType();
                System.out.println("Name: " + f.getName());
                System.out.println("\tType: " + field.getName());
            }
            System.out.println("=========================");
            Method[] methods = cFox.getMethods();
            System.out.println("Methods : ");
            for (Method m : methods) {
                System.out.println("Name: " + m.getName());
                System.out.println("\tReturn type: " + m.getReturnType().getName());
                Class<?>[] paramTypes = m.getParameterTypes();
                for (Class<?> param : paramTypes) {
                    System.out.println(" " + param.getName());
                }
            }
            System.out.println("============================ ");
            Constructor<?>[] constructors = cFox.getConstructors();
            int i = 0;
            System.out.println("Constructors :");
            for (Constructor<?> ctr : constructors) {
                System.out.println("\tConstructor " + (++i));
                Class<?>[] param = ctr.getParameterTypes();
                for (Class<?> p : param) {
                    System.out.println(p.getName() + " ");
                }


            }
        } else {
            System.out.println("Такого класа нету");
        }

    }
}



