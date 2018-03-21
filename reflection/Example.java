package reflection;

import java.lang.reflect.*;

public class Example{

    public static void main(String[] args){
        try{
            Object foo = Class.forName("Foo").newInstance();
            Method m = foo.getClass().getDeclaredMethod("hello", new Class<?>[0]);
            m.invoke(foo);

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
