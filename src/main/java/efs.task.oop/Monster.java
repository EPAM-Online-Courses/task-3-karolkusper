package efs.task.oop;

public abstract class Monster implements Fighter {
    private int health;
    private int damage;

    public Monster(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    @Override
    public void takeHit(int damage) {
        this.health -= damage;
    }

    @Override
    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }
}