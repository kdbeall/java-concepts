package streams;

import java.util.Random;
import java.util.stream.*;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class StreamsExample {

  private static final long N = 10;

  /*What is a stream?
    From @link(https://docs.oracle.com/javase/8/docs/api/?java/util/stream/Stream.html) a stream is
    A sequence of elements supporting sequential and parallel aggregate operations. **/

  public static void main(String[] args){
    Random rnd = new Random();
    Stream<Integer> intStream = Stream.generate(rnd::nextInt).limit(N);
    System.out.println(intStream.collect(toList()));


    //List all integers greater than 10...
    Stream<Integer> intStream2 = Stream.generate(rnd::nextInt).limit(N);
    System.out.println(intStream2.filter(x -> x > 10).collect(toList()));
  }

}

