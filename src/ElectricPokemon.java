import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon    {

    List<String> attacks = Arrays.asList("thunderpunch", "electroball", "thunder", "volttackle");

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, "electric");
    }

    @Override
    public List<String> getAttacks() {
        return attacks;
    }


    public void thunderPunch(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with thunderpunch");

        switch (enemy.getType()) {
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 35 hp");
                enemy.setHp(enemy.getHp() - 35);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp(enemy.getHp() - 40);
            }
        }

        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void electroBall(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with electroball");

        switch (enemy.getType()) {
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 35 hp");
                enemy.setHp(enemy.getHp() - 35);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp(enemy.getHp() - 40);
            }
        }

        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void thunder(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with thunder");

        switch (enemy.getType()) {
            case "electric" -> {
                System.out.println(enemy.getName() + " boosted with 5 hp");
                enemy.setHp(enemy.getHp() + 5);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp(enemy.getHp() - 40);
            }
        }

        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void voltTackle(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with volttackle");

        switch (enemy.getType()) {
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 5 hp");
                enemy.setHp(enemy.getHp() - 5);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 50 hp");
                enemy.setHp(enemy.getHp() - 50);
            }
        }

        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }
}
