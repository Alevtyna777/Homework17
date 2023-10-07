package fruit_box;
import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private final List<T> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public boolean add(T fruit) {
        return fruits.add(fruit);
    }

    public boolean addAll(List<T> fruitsToAdd) {
        return fruits.addAll(fruitsToAdd);
    }

    public float getWeight() {
        if (!fruits.isEmpty()) {
            float fruitWeight = fruits.get(0).getWeight();
            return fruitWeight * fruits.size();
        } else {
            return 0;
        }
    }

    public boolean compare(Box<?> box) {
        return Math.abs(this.getWeight() - box.getWeight()) < 0.0001;
    }

    public void merge(Box<T> box) {
        if (fruits.size() == 0 || box.fruits.size() == 0) {
            return;
        }
        fruits.addAll(box.fruits);
        box.fruits.clear();
    }
}