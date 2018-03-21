package interfaces;

public interface Woof {

    default void woof(){
        System.out.println("Woof!");
    }

}
