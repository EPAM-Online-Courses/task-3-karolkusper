package efs.task.oop;

public class Main {
    public static void walka(Fighter osadnik, Fighter potwor) {
        if(Monsters.getMonstersHealth()>0)
        {
            System.out.println("Potwory posiadaja jeszcze " + Monsters.getMonstersHealth() + " punkty zycia");
            osadnik.attack(potwor);
            if (potwor.getHealth() > 0) {
                potwor.attack(osadnik);
            }
        }
    }

    public static void main(String[] args) {
        ExtraordinaryVillager.Skill identify = ExtraordinaryVillager.Skill.IDENTIFY;
        ExtraordinaryVillager.Skill shelter = ExtraordinaryVillager.Skill.SHELTER;

        // Tworzenie osadników
        Villager kashya = new Villager("Kashya", 30);
        ExtraordinaryVillager akara = new ExtraordinaryVillager("Akara", 40, shelter);
        Villager gheed = new Villager("Gheed", 50);
        ExtraordinaryVillager deckardCain = new ExtraordinaryVillager("Deckard Cain", 85, identify);
        Villager warriv = new Villager("Warriv", 35);
        Villager flawia = new Villager("Flawia", 25);

        kashya.sayHello();
        akara.sayHello();
        gheed.sayHello();
        deckardCain.sayHello();
        warriv.sayHello();
        flawia.sayHello();

        // Ukrycie osobników ExtraordinaryVillager
        Object objectDeckardCain = deckardCain;
        Object objectAkara = akara;

        // Bitwa
        while (Monsters.getMonstersHealth() > 0) {
            walka(kashya, Monsters.andariel);
            walka(Monsters.andariel, gheed);
            walka(warriv, Monsters.blacksmith);
            walka(Monsters.blacksmith, flawia);
        }

        System.out.println("Obozowisko ocalone!");

        // Przywrócenie mocy ExtraordinaryVillager'om
        deckardCain = (ExtraordinaryVillager) objectDeckardCain;
        akara = (ExtraordinaryVillager) objectAkara;

        // Sprawdzenie, czy można wywołać metody z klasy ExtraordinaryVillager
        deckardCain.sayHello();
        akara.sayHello();
    }
}
