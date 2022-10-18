import java.util.Scanner;

public class Cat {
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;

    private String name;

    public Cat(String name) {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void meow() {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed() {
        weight = weight + 100;
    }

    public void drink(Double amount) {
        weight = weight + amount;
    }

    public Double getWeight() {
        return weight;
    }

    public String getStatus() {
        if (weight < minWeight) {
            return "Dead";
        } else if (weight > maxWeight) {
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }

    public boolean isDead() {
        return weight < minWeight;
    }

    public boolean isExploded() {
        return weight > maxWeight;
    }

    public void feedTillExploded() {
        while (!isExploded()) {
            feed();
            System.out.println("Cats weight: " + weight);
        }
        System.out.println("Cat is exploded");
    }

    public void meowTillDead() {
        while (!isDead()) {
            meow();
        }
        System.out.println("Cat is dead");

    }

    public double getEatenFood() {
        double result = weight - originWeight;
        if (result > 0) {
            return result;
        }
        return 0;
    }
    public void toilet() {
        weight = weight - 0.01 * weight;
        System.out.println(name + " weight after toilet " + weight);
    }

    public static double count() {
        return 0;
    }
}