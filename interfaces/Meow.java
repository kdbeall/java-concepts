package interfaces;

public interface Meow {

    default void meow(){
        System.out.println("Meow!");
    }

}
