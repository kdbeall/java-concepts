package language;

public class Break {

  public static void main(String[] args){
    outer:
      for(int i = 0; i<100; i++){
        for(int j = 0; j<100; j++){
          for(int k = 0; k<100; k++){
            if(i == 50 && j == 30 && k == 80){
              System.out.println(i);
              System.out.println(j);
              System.out.println(k);
              break outer;
            }  
          }
        }
      }
  }
}
