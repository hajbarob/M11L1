import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class HumanGenerator {

    public Collection<Human> generate(int amount) {
        Random random = new Random();

        List<String> names = List.of("Inna", "Oled", "John", "Hope", "Igor", "Vlad");
        List<String> lastNames = List.of("Gates", "Forman", "Smith", "Petrov", "Holav", "Kologoretc");

        Collection<Human> humans = new ArrayList<>();

        for (int i = 0; i<amount; i++) {
            String name = names.get(random.nextInt(names.size()));
            String lastName = lastNames.get(random.nextInt(lastNames.size()));

            String fullName = name + " " + lastName;
            int salary = 500 + random.nextInt(2001);

            humans.add(new Human(fullName, salary));
        }

        return humans;

    }
}
