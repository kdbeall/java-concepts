package reflection;

import java.lang.reflect.*;

class Foo {
    public int bar;
    private String secret;
    public Foo(){
        this.bar = 1;
        this.secret = "secret";
    }
    public void hello(){
        System.out.println(Integer.toString(bar));
    }

}

class Example{

    public static void main(String[] args) throws Exception{

        /** Retrieving Class Objects */
        Class stringClass = "myString".getClass();
        System.out.println(stringClass.toString());


        /** Print all methods of a class */
        Method[] methods = stringClass.getDeclaredMethods();
        for(Method m : methods){
            System.out.println(m.toString());
        }

        /** Call a method using reflection */
        Object foo = Class.forName("reflection.Foo").newInstance();
        Method m = foo.getClass().getDeclaredMethod("hello", new Class<?>[0]);
        m.invoke(foo);

        /** Read a private variable using reflection */
        Field field = Class.forName("reflection.Foo").getDeclaredField("secret");
        field.setAccessible(true);
        Object value = field.get(foo);
        System.out.println((String) value);
    }
}
