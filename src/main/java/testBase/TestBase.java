package testBase;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public class TestBase {
    public static Properties config_prop = new Properties();
    private static final String config_path = "/src/main/java/configManagement/config.properties";


    public static void getReadPropertiesFile() throws IOException {

            FileInputStream fileInputStream = null;
            try{
                fileInputStream = new FileInputStream(System.getProperty("user.dir")+config_path);
                config_prop.load(fileInputStream);

            }catch(Exception e){
                e.printStackTrace();
                throw new RuntimeException(e);
            }finally{
                Objects.requireNonNull(fileInputStream).close();
            }
    }
}
