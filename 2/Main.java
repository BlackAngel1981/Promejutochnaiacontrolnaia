
public class Main {
    public static void main(String[] args) {

        Toy teddy = new Toy(1, "bearTeddy", 15, 25.55);
        Toy sandy = new Toy(2, "dollSandy", 10, 50.44);
        Toy bmv = new Toy(3, "carBmv", 30, 44.77);

        ToyStore toyStore = new ToyStore();
        toyStore.addToy(teddy);
        toyStore.addToy(sandy);
        toyStore.addToy(bmv);

        toyStore.setFrequency(1, 75.77);
        toyStore.Play();
        toyStore.show();

    }
}
