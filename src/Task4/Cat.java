package Task4;

import java.lang.reflect.Field;

public class Cat {
    public static void main(String[] args) {
        try {
            Class<?> cls = Animal.class;
            Animal animal = new Animal();


            Field field = cls.getField("color");

            Field field1 = cls.getDeclaredField("age");

            Field field2 = cls.getDeclaredField("name");




            field.setAccessible(true);
            field1.setAccessible(true);
            field2.setAccessible(true);

            System.out.println("field value :" + field.get(animal));
            field.set(animal, "Black");
            System.out.println("\tnew field value :" + field.get(animal));


            System.out.println("field value :" + field1.getInt(animal));
            field1.setInt(animal, 5);
            System.out.println("\tnew field value :" + field1.getInt(animal));

            System.out.println("field value :" + field2.get(animal));
            field2.set(animal, "tirion");
            System.out.println("\tnew field value :" + field2.get(animal));


        } catch (Exception exception) {
            exception.printStackTrace();


        }


    }
}
