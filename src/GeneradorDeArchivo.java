import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeneradorDeArchivo {
    public void guardarJson(Pelicula pelicula) throws IOException {
        // Implementación para guardar la película en un archivo JSON
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escritura = new FileWriter(pelicula.title()+ ".Json");
        escritura.write(gson.toJson(pelicula));
        escritura.close();
    }
}
