import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        FileInputStream fis = new FileInputStream("test.properties");
        p.load(fis);
        System.out.println(p);
        System.out.println(p.getProperty("Munch"));
        p.setProperty("Kitkat", "100");
        FileOutputStream fos = new FileOutputStream("test.properties");
        p.store(fos, "Updated Price");
    }
}
