package ccm.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
 
 /**
 * ... 註解 ...
 */
public class HelloWorld {
    static Log logger = LogFactory.getLog(HelloWorld.class);
 
    public static void main(String[] args) {
        logger.info("Hello World!");
    }
}