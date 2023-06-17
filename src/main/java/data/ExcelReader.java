package data;

import com.github.javafaker.Pokemon;
import com.poiji.bind.Poiji;

import java.io.File;
import java.util.List;

public class ExcelReader {
    private final static String excelPath = "src/test/java/resources/data/pokemonList.xlsx";

    public static List<Pokemon> getPokemonList() {
        return Poiji.fromExcel(new File(excelPath), Pokemon.class);
    }
}
