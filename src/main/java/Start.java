import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by gswiec on 03.09.2017.
 */
public class Start {

    public static Logger logger = LogManager.getLogger(Start.class);

    public static void main(String[]args){
        logger.info("Example log info");
        logger.trace("Example log trace");
        logger.debug("Example log debug");
        logger.error("Example log error");
        logger.fatal("Example log fatal");
        logger.warn("Example log warn");
        return;
    }
}
