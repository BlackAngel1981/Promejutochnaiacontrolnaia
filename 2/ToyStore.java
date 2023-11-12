import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToyStore {

    private final List<Toy> toys;
    private final List<Toy> winners;
    private final Random random = new Random();

    public ToyStore() {
        this.toys = new ArrayList<>();
        this.winners = new ArrayList<>();
    }

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public void setFrequency(int id, double newFrequency) {
        for (Toy toy : toys) {
            if (toy.getId() == id) toy.setFrequency(newFrequency);
            break;
        }
    }

    public void Play(){
        double randNumber = random.nextDouble(100);
        System.out.println(randNumber);
        toys.forEach(toy -> {
            if (randNumber < toy.getFrequency()) {
                winners.add(toy);
            }
        });

    }

    public void show() {
        System.out.println("All toys:");
        toys.forEach(toy -> System.out.printf("%s, %.2f\n", toy.getName(), toy.getFrequency()));
        System.out.println("Winners:");
        winners.forEach(win -> System.out.printf("%s, %.2f\n", win.getName(), win.getFrequency()));
    }

}
