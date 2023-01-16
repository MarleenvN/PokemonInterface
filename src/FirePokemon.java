import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon    {

    List<String> attacks = Arrays.asList("inferno", "pyroball", "firelash", "flameThrower");


    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, "fire");
    }

    @Override
    public List<String> getAttacks() {
        return attacks;
    }


    public void inferno(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with inferno");

        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp(enemy.getHp() - 40);
            }
        }

        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");

    }
    public void pyroBall(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with pyroball");

        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 5 hp");
                enemy.setHp(enemy.getHp() - 5);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 35 hp");
                enemy.setHp(enemy.getHp() - 35);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 45 hp");
                enemy.setHp(enemy.getHp() - 45);
            }
        }

        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void fireLash(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with firelash");
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 35 hp");
                enemy.setHp(enemy.getHp() - 35);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 50 hp");
                enemy.setHp(enemy.getHp() - 50);
            }
        }

        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void flameThrower(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with flamethrower");
        switch (enemy.getType()) {
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 5 hp");
                enemy.setHp(enemy.getHp() - 5);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
        }

        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }
}
