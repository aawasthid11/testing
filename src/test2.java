import java.util.ArrayList;
import java.util.List;

public class test2 {
    public static void main(String[] args)
    {
        tr<String,Integer> r=a->a.length();
        List<String> t=new ArrayList<>();
        t.add("hi");
        t.add("hello");
        t.add("world");
        t.add("tester2");
  t.stream().map(a->r.funny(a)).forEach(System.out::println);

    }
}
