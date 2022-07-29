package Task3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Создайте класс, в нем определите 3 поля, к этим полям создайте конструкторы и методы.Под средством рефлексии получите всю информацию о полях, методах, конструкторах, а также модификаторах доступа.
 */

public class Main {
    public static void main(String[] args) {
        Class<?> cl = Task3.class;
        System.out.println("Class Modifiers: ");
        int mod = cl.getModifiers();
        if (Modifier.isPrivate(mod)) {
            System.out.println("private");
        }
        if (Modifier.isPublic(mod)) {
            System.out.println("public");
        }
        if (Modifier.isAbstract(mod)) {
            System.out.println("Abstract");
        }
        System.out.println();



        System.out.println("Fields:  ");
        Field[] fields = cl.getDeclaredFields();
        for (Field f : fields) {
            Class<?> field = f.getType();
            System.out.println("Name: " + f.getName());
            System.out.println("\tType: " + field.getName());

        }
        System.out.println();



        Constructor<?>[] constructors = cl.getConstructors();
        int i = 0;
        System.out.println("Constructors :");
        for (Constructor<?> ctr : constructors) {
            System.out.println("\tConstructor " + (++i));
            Class<?>[] param = ctr.getParameterTypes();
            for (Class<?> p : param) {
                System.out.println(p.getName() + " ");

            }
            System.out.println();

        }
        Method[] methods = cl.getMethods();
        System.out.println("Methods : ");
        for (Method m : methods) {
            System.out.println("Name: " + m.getName());
            System.out.println("\tReturn type: " + m.getReturnType().getName());
            Class<?>[] paramTypes = m.getParameterTypes();
            for (Class<?> param : paramTypes) {
                System.out.println(" " + param.getName());

            }
            System.out.println();


        }


    }
}




