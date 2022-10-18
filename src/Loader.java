
public class Loader
{

    public static void main(String[] args) {
        Cat murka = new Cat("Murka");
        System.out.println(murka.getName() + " weight: " + murka.getWeight());
        murka.meow();
        System.out.println("Murka weight: " + murka.getWeight());
        murka.getStatus();
        System.out.println("Murka status: " + murka.getStatus());
        murka.feed();
        System.out.println("Murka weight: " + murka.getWeight());
        murka.getStatus();
        System.out.println("Murka status: " + murka.getStatus());
        System.out.println("Murka sozhrala " + murka.getEatenFood());

        Cat vasya = new Cat("Vasya");
        System.out.println("Vasya weight: " + vasya.getWeight());
        //vasya.feedTillExploded();
        vasya.toilet();

        Cat barsik = new Cat("Barsik");
        //barsik.meowTillDead();
    }
}