package interfaces;

public interface Eat {

    default void eat(){
        System.out.println("Nom nom!");
    }

}
