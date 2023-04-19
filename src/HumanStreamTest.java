import java.util.*;
import java.util.stream.Collectors;

public class HumanStreamTest {

    public static void main(String[] args) {
        HumanGenerator humanGenerator = new HumanGenerator();

//        Collection<Human> humans = humanGenerator.generate(100);
//
//        List<Integer> sm = humans.stream()
//                .filter(h -> h.getSalary() > 1000 && h.getSalary() < 2000)
//                .filter(h -> h.getName().startsWith("I"))
//                .map(h -> h.getSalary())
//                .collect(Collectors.toList());
//
//        Optional<Integer> i = humans.stream()
//                .filter(h -> h.getSalary() > 1000 && h.getSalary() < 2000)
//                .filter(h -> h.getName().startsWith("I"))
//                .map(h -> h.getSalary())
//                .findFirst();
//
//
//        List<Integer> sm2 = new ArrayList<>();
//        for (Human h : humans) {
//            if (h.getSalary() > 1000) {
//                if (h.getSalary() < 2000) {
//                    if (h.getName().startsWith("I")) {
//                        Integer salary = h.getSalary();
//                        sm2.add(salary);
//                    }
//                }
//            }
//        }
//
//        System.out.println("sm = " + sm);
//
//
//        //get amount of distinct humans
//        long count = humans.stream()
//                .distinct()
//                .peek(h -> System.out.println(h))
//                .count();
//        System.out.println("count = " + count);
//
//
//        //sort humans by salary
//        List<Human> collect = humanGenerator.generate(10).stream()
//                .filter(h -> h.getSalary() > 2000)
//                .distinct()
////                .sorted((Human h1, Human h2) -> {
////                    int i1 = h1.getSalary() - h2.getSalary();
////                    System.out.println("h1.getSalary() = " + h1.getSalary() + " - " + "h2.getSalary() = " + h2.getSalary() + " = " + i1);
////                    return i1;
////                })
//                .sorted((h1, h2) -> h2.getSalary() - h1.getSalary()) // reverse sort
//                //.sorted((h1, h2) -> h1.getName().compareTo(h2.getName()))
//                .peek(h -> System.out.println(h))
//                .collect(Collectors.toList());
//        System.out.println("collect = " + collect);


//        //find second max salar
//        Optional<Human> first = humanGenerator.generate(20).stream()
//                .sorted((h1, h2) -> h2.getSalary() - h1.getSalary())
//                .peek(h -> System.out.println(h))
//                .skip(1)
//                .limit(1)
//                .findFirst();
//        System.out.println("first.get() = " + first.get());

        //Vova Ivanov -> VOVA ivanov
//        List<String> collect = humanGenerator.generate(10).stream()
//                .map(h -> {
//                    String[] s = h.getName().split(" ");
//                    String name = s[0].toUpperCase();
//                    String sName = s[1].toLowerCase();
//
//                    return new Human(name + " " + sName, h.getSalary());
//                })
//                .map(h -> h.getName() + ": " + h.getSalary())
//                .peek(str -> System.out.println(str))
//                .collect(Collectors.toList());

        //collect to map
        Map<String, Integer> collect = humanGenerator.generate(50).stream()
                .peek(str -> System.out.println(str))
                .distinct()
                .collect(Collectors.toMap(h -> h.getName(), h -> h.getSalary()));

        System.out.println(collect);
    }
}
