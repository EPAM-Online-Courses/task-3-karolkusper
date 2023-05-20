package efs.task.oop;
public class ExtraordinaryVillager extends Villager {
    public enum Skill {
        IDENTIFY("I will identify items for you at no charge."),
        SHELTER("I can offer you poor shelter.");

        private String description;

        Skill(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }

    private Skill skill;

    public ExtraordinaryVillager(String name, int age, Skill skill) {
        super(name, age);
        this.skill = skill;
    }

    @Override
    public void sayHello() {
        System.out.println(String.format("Greetings traveler... I'm %s and I'm %d years old. %s", getName(), getAge(),
                skill.getDescription()));
    }

    @Override
    public void attack(Fighter victim) {
        // ExtraordinaryVillager does not attack
    }

    @Override
    public void takeHit(int damage) {
        super.takeHit(damage);
        setHealth(0);
    }
}
