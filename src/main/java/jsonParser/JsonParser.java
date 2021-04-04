package jsonParser;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JsonParser {
    /**
     * извлечение из строки объектов JSON,
     * перобразование их в Java Objects класса CatFact
     * и помещение их в список объектов.
     *
     * @param jsString Строка объектов JSON
     * @return отфильтрованный список объектов по полю type.
     */
    public List<CatFact> getObjectsList(String jsString) {
        List<CatFact> facts = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            facts = objectMapper.readValue(jsString, new TypeReference<>() {});
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return facts.stream()
                .filter(value -> value.getType() != null && value.getType().equals("cat"))
                .collect(Collectors.toList());
    }
}
