package Q3;
// method overriding, arr of objects
public class Animal {

    public void makeNoise(){
        System.out.println("Animal making Noise");
    }

    public void eat(){
        System.out.println("Animal is eating");
    }

    public void walk(){
        System.out.println("Animal is walking");
    }

}

 class Dog extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("Barking...");
    }
}

class Cat extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("Meaw...");
    }
}

class Tiger extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("Raoring...");
    }
}

class Main{
    public static void main(String[] args) {

        Animal[] arr=new Animal[3];

        Dog dog=new Dog();
        Cat cat=new Cat();
        Tiger tiger=new Tiger();

        arr[0]=dog;
        arr[1]=cat;
        arr[2]=tiger;

        for(int i=0;i< arr.length;i++){
            System.out.println();
            arr[i].eat();
            arr[i].walk();
            arr[i].makeNoise();
        }


    }
}