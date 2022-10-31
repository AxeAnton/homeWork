package hw119propertis;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class App {
    public static void main(String[] args) throws IOException {
        // 4.properties и добавление инфо, но в сам ФАЙЛ properties инфо не попадает
        Properties defautValue = new Properties();
        defautValue.setProperty("bla", "55");
        Properties properties = new Properties(defautValue);


//_____1. создание файла properties и добавление инфо.
/*        Properties properties = new Properties();
        properties.setProperty("key1", "3");
        properties.setProperty("key2", "2");
       System.out.println(properties.getProperty("key2"));
        System.out.println(properties.getProperty("key1"));

        try (FileOutputStream fileOutputStream = new FileOutputStream("my.properties") ) {
            properties.store( fileOutputStream, "inf (key=inf) can add hear!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //_____
*/

        // 2. можно получить значение которые были внесены в файл my.properties в ручную
        FileInputStream in = new FileInputStream("my.properties");
        properties.load(in);
        System.out.println(properties.getProperty("max"));
        // 3. так же можно задать default значение, пример ниже, но можно и пойти по другому -> 4
        //System.out.println(properties.getProperty("bla", "klkl"));
        System.out.println(properties.getProperty("bla"));

    }
}
