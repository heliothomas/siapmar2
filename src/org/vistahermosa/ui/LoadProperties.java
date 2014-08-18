/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */

package org.vistahermosa.ui;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import static java.lang.Thread.currentThread;
import static java.net.InetAddress.getLocalHost;
import java.util.Properties;

/**
 *
 * @author user
 */
public class LoadProperties {

    private static final Properties properties = new Properties();
//    private static final String path = System.getProperty("user.dir") + "\\src";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        saveProp();
        loadProp();
    }

    private static void saveProp() {
        try {
            Properties props = new Properties();
            props.setProperty("host", "localhost");
            props.setProperty("port", "5432");
            props.setProperty("dbname", "siapmar");
            props.setProperty("user", "martha");//postgres
            props.setProperty("pass", "Sistemas2014");//Sistemas2014

            //server.properties = se creara en el directorio raiz src
            File archivo = new File("src/org/vistahermosa/resources/confconx.properties");
            try (OutputStream out = new FileOutputStream( archivo )) {
                props.store(out, "Comentario de cabecera opcional");
                out.flush();
                out.close();
            }
            System.out.println("Success save!");
        } catch (IOException e) {
            System.out.println("Error at saving propety: " + e.getMessage());
        }
    }

    private static void loadProp() {
        try {
            properties.load(currentThread().getContextClassLoader().getResource("org/vistahermosa/resources/confconx.properties").openStream());
            String host = properties.getProperty("host");
            String port = properties.getProperty("port");
            String dbname = properties.getProperty("dbname");
            String user = properties.getProperty("user");
            String pass = properties.getProperty("pass");
            System.out.println("host:"+host+",port:"+port+",dbname:"+dbname+",user:"+user+",pass:"+pass);
        } catch (IOException e) {
            System.out.println("Error open the property: " + e.getMessage());
        }
    }
}
