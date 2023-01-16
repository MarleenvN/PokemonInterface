import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon   {
    List<String> attacks = Arrays.asList("leafstorm", "solarbeam", "leechseed", "leaveblade");

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, "grass");
    }

    @Override
    public List<String> getAttacks() {
        return attacks;
    }


    public void leafStorm(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with leafstorm");

        switch (enemy.getType()) {
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp(enemy.getHp() - 40);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void solarBeam(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with solarbeam");

        switch (enemy.getType()) {
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp(enemy.getHp() - 40);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void leechSeed(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with leechseed");

        switch (enemy.getType()) {
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 5 hp");
                System.out.println(pokemon.getName() + " gaines 5 hp");
                enemy.setHp(enemy.getHp() - 5);
                pokemon.setHp(enemy.getHp() + 5);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                System.out.println(pokemon.getName() + " gaines 10 hp");
                enemy.setHp(enemy.getHp() - 10);
                pokemon.setHp(enemy.getHp() + 10);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                System.out.println(pokemon.getName() + " gaines 20 hp");
                enemy.setHp(enemy.getHp() - 20);
                pokemon.setHp(enemy.getHp() + 20);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 50 hp");
                System.out.println(pokemon.getName() + " gaines 50 hp");
                enemy.setHp(enemy.getHp() - 50);
                pokemon.setHp(enemy.getHp() + 50);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
        System.out.println(pokemon.getName() + " has " + pokemon.getHp() + " hp left");
    }

    public void leaveBlade(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with leaveblade");

        switch (enemy.getType()) {
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 5 hp");
                enemy.setHp(enemy.getHp() - 5);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }
}
