
public abstract class Animals implements AnimalsInterface {
    String animal;
    boolean touching;
    String colour;
}

class Bug extends Animals {
    Type type;

    public Bug(String a) {
        animal = a;
        type = Type.ANIMAL;
        this.touching = false;
        this.colour = "черный";
    }

    public void bite(String name) {
        System.out.println(animal + " укусил " + name);
    }

    public void SuckBlood(String name) {
        System.out.println(animal + " насыщается кровью у " + name);
    }


    public void move(String name) {
        System.out.println("бежит к " + name);
    }

}

class Rat extends Animals {
    Type type;

    public Rat(String a) {
        animal = a;
        type = Type.ANIMAL;
        this.touching = false;
        this.colour = "серый";
    }

    public void bite(String name) {
        System.out.println(animal + " укусила " + name);
    }

    public void move(String name) {
        System.out.println(animal + " бежит к " + name);
    }

    public void sniff(String name) {
        System.out.println(animal + " нюхает " + name);
    }

    public void WiggleNose() {
        System.out.println(animal + " шевелит носом ");
    }

}

class BigRat extends Rat {
    Type type;

    public BigRat(String a) {
        super(a);
        animal = a;
        type = Type.ANIMAL;
        this.touching = false;
        this.colour = "серый";

    }

    public void bite(String name) {
        System.out.println(animal + " больно укусила " + name);
    }


    public void move(String name) {
        System.out.println(animal + " бежит с грохотом к " + name);
    }

    public void sniff(String name) {
        System.out.println(animal + " нюхает " + name);
    }

    public void WiggleNose() {
        System.out.println(animal + " шевелит носом ");
    }

}