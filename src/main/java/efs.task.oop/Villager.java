package efs.task.oop;

public class Villager implements Fighter {
    private String name;
    private int age;
    private int health;

    public Villager(String name, int age) {
        this.name = name;
        this.age = age;
        this.health = 100;
    }

    public void sayHello() {
        System.out.println(String.format("Greetings traveler... I'm %s and I'm %d years old", name, age));
    }

    @Override
    public void attack(Fighter victim) {
        System.out.println(String.format("Aktualnie walczacy osadnik to %s", name));
        victim.takeHit((int) ((100 - age * 0.5) / 10));
    }

    @Override
    public void takeHit(int damage) {
        this.health -= damage;
    }
    public int getHealth() {
        return this.health;
    }
    public void setHealth(int health) {
        this.health=health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
