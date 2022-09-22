import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class test1 {
  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<Integer>();
    for (int i = 0; i < 10; i++) arr.add(i);
    Stream<Integer> prr = arr.stream().map((a) -> 2 * a + 2);
    prr.forEach(a -> System.out.println(a));
    fx ff = (a) -> a * a;
    fd<Integer, Integer> af = (a) -> a * a * a;
    Function<Integer, user> df = user::new;
    System.out.println("Functional interface cuboid");
    Predicate<Integer> pr = (a) -> a > 5;
    arr.stream().map(a -> ff.fun(a)).forEach(a -> System.out.println(a));
    arr.stream().map(a -> ff.fun(a)).forEach(a -> System.out.println(a));

    System.out.println("Generic Functional interface cuboid");
    arr.stream().map(a -> af.fun(a)).forEach(a -> System.out.println(a));
    System.out.println("Constructor reference");
    arr.stream().map(a -> df.apply(a)).forEach(a -> System.out.println(a.userid));

    Stream<Long> lrr = Stream.<Long>builder().add(9L).build();
    lrr.map(a -> 2 * a).forEach(a -> System.out.println(a));
  }
}
