package com.company;

public class Main {

    public static void main(String[] args) {
	 Parrot parrot = new Parrot();
        System.out.println("Popugaidyn svoistvalary:");
     parrot.setName("suiloochu");
     parrot.setAge(2);
     parrot.setWeight(3);
     parrot.setColor("green");
     System.out.println( "tusu:"+parrot.getColor());
     System.out.println("jashy:" +parrot.getAge());
     System.out.println("salmgy:" +parrot.getWeight());
      System.out.println( "aty:" + parrot.getName());
        System.out.println("------------------------");
        System.out.println("Balyktyn svoistvalary:");
     Fish fish = new Fish();
     fish.setAge(5);
     fish.setColor("white");
     fish.setName("farel");
     fish.setWeight(10);
     System.out.println("jashy:" + fish.getAge());
     System.out.println("tusu:" +fish.getColor());
     System.out.println("salmagy:" + fish.getWeight());
     System.out.println("any:" + fish.getName());
        System.out.println("------------------------");
        System.out.println("Myshyktyn svoistvalary:");
    Cat cat = new Cat();
    cat.setColor("black");
    cat.setAge(3);
    cat.setName("myi myi");
    cat.setWeight(2);
        System.out.println("jashy:" + cat.getAge());
        System.out.println("tusu:"+ cat.getColor());
        System.out.println("aty:" +cat.getName());
        System.out.println("salmagy:" +cat.getWeight());
        System.out.println("------------------------");
        System.out.println("Ittin svoistvalary:");
    Dog dog =  new  Dog();
    dog.setAge(4);
    dog.setColor("black");
    dog.setWeight(7);
        System.out.println("jashy:"+dog.getAge());
        System.out.println("tusu:"+dog.getColor());
        System.out.println("aty:"+dog.getName());
        System.out.println("salmagy:"+dog.getWeight());



    }

}
