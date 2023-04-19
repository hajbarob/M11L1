import java.util.function.Consumer;
import java.util.function.Function;

public class HumanToIntegerTransformertest {

    public static void main(String[] args) {
        firstExample();
    }

    public static void firstExample() {
        Human human = new Human("Inna", 1000);

        HumanToIntegerTransformerImpl humanToIntegerTransformerImpl = new HumanToIntegerTransformerImpl();

        System.out.println("humanToIntegerTransformer.transform(human) = " +
                humanToIntegerTransformerImpl.transform(human));
    }

    public static void secondExample() {
        Human human = new Human("Inna", 1000);

        HumanToIntegerTransformer humanToIntegerTransformer = new HumanToIntegerTransformer() {
            @Override
            public int transform(Human human) {
                return human.getSalary();
            }
        };

        System.out.println("humanToIntegerTransformer.transform(human) = " +
                humanToIntegerTransformer.transform(human));
    }

    public static void thirdExample() {
        Human human = new Human("Inna", 1000);

        HumanToIntegerTransformer lambdaTransformer = (Human h) -> {
            System.out.println("first action");
            System.out.println("second action");
            return h.getSalary();
        };

        System.out.println("lambdaTransformer.transform(human) = " + lambdaTransformer.transform(human));
    }

    public static void fourthExample() {
        Human human = new Human("Inna", 1000);

        HumanToIntegerTransformer lambdaTransformer = h -> h.getSalary();

        System.out.println("lambdaTransformer.transform(human) = " + lambdaTransformer.transform(human));
    }

    public static void fifthExample() {
        Human human = new Human("Inna", 1000);

        Function<Human, Integer> lambdaTransformer = h -> h.getSalary();

        System.out.println("lambdaTransformer.apply(human) = " + lambdaTransformer.apply(human));
    }
}
