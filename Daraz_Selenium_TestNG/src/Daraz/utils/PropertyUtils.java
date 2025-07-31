package Daraz.utils;

import Daraz.Enums.ConfigProperties;
import Daraz.constants.FrameworkConstants;
import Daraz.exceptions.PropertyFileUsageException;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

public final class PropertyUtils {

    //add final
    private static final Properties property =new Properties();
    private static final Map<String, String> CONFIGMAP =new HashMap<>();

    private PropertyUtils() {

    }

    static {
        try(FileInputStream file = new FileInputStream(FrameworkConstants.getConfigfilepath());
            BufferedInputStream bfis =new BufferedInputStream(file);) {

            property.load(file);

            for(Map.Entry<Object,Object> entry: property.entrySet()){
                CONFIGMAP.put(String.valueOf(entry.getKey()),String.valueOf(entry.getValue()).trim());//remove the trailing leading space
            }
        } catch ( IOException e) {
            //throw new InvalidPathForProertyFileException("Please check the path of the config file");
            e.printStackTrace();
            System.exit(0);
        }
    }

    public  static String get(ConfigProperties key)  {
        if(Objects.isNull(key) || Objects.isNull(CONFIGMAP.get(key.name().toLowerCase()))) {
            throw new PropertyFileUsageException("property name" +key +"is not found. please check config.properties");
        }
        return CONFIGMAP.get(key.name().toLowerCase());
    }
}
