import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon   {

    List<String> attacks = Arrays.asList("surf", "hydropump", "hydrocanon", "raindance");

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, "water");
    }

    @Override
    public List<String> getAttacks() {
        return attacks;
    }


    public void surf(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with surf");

        switch (enemy.getType()) {
            case "water" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp(enemy.getHp() - 40);
            }
        }

        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void hydroPump(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with hydropump");

        switch (enemy.getType()) {
            case "water" -> {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 45 hp");
                enemy.setHp(enemy.getHp() - 45);
            }
        }

        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void hydroCanon(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with hydrocanon");

        switch (enemy.getType()) {
            case "water" -> {
                System.out.println(enemy.getName() + " loses 5 hp");
                enemy.setHp(enemy.getHp() - 5);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 15 hp");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 50 hp");
                enemy.setHp(enemy.getHp() - 50);
            }
        }

        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void rainDance(Pokemon pokemon, Pokemon enemy) {
        System.out.println(pokemon.getName() + " attacks " + enemy.getName() + " with raindance");

        switch (enemy.getType()) {
            case "water" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "grass" -> {
                System.out.println(enemy.getName() + " boosted with 5 hp");
                enemy.setHp(enemy.getHp() + 5);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " is not affected by RainDance, no hp lost");
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp(enemy.getHp() - 40);
            }
        }

        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }
}
