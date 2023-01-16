import java.util.List;

public class PokemonTrainer {
    // 8 variabelen, constructor, getters en setters
    private String name;
    private String town;
    private List<Pokemon> pokemons;

    public PokemonTrainer(String userA, List<Pokemon> pokemons) {
    }

    public PokemonTrainer() {

    }


    public String getName() {
        return name;
    }

    public String getTown() {
        return town;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
}
