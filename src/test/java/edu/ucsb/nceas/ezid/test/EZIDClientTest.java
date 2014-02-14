package edu.ucsb.nceas.ezid.test;

import java.util.HashMap;
import java.util.Calendar;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

import edu.ucsb.nceas.ezid.EZIDClient;

public class EZIDClientTest {

    private static String USERNAME = "apitest";
    private static String PASSWORD = "yourpasswordhere";
    private static final String DOISHOULDER = "doi:10.5072/FK2";

    protected static Log log = LogFactory.getLog(EZIDClientTest.class);

    @Test
    public void testCreate() {
        log.debug("Starting test...");
        EZIDClient client = new EZIDClient();
        assertNotNull(client);
        boolean success = client.login(USERNAME, PASSWORD);
        assertTrue(success);
        for (int i = 0; i < 100; i ++) {
            String timestamp = EZIDServiceTest.generateTimeString();
            HashMap<String, String> metadata = new HashMap<String, String>();
            String identifier = DOISHOULDER + "/" + "TEST" + "/" + timestamp;
            String title = "Test entry from ezid client for identifier: " + identifier;
            metadata.put("datacite.title", title);
            String creator = "Keyser Söze";
            metadata.put("datacite.creator", creator);
            String publisher = "EZID Java Library";
            metadata.put("datacite.publisher", publisher);
            String year = new Integer(Calendar.getInstance().get(Calendar.YEAR)).toString();
            metadata.put("datacite.publicationyear", year);
            log.debug("Identifier under test: " + identifier);
            try {
                client.create(identifier, metadata);
            } catch (InterruptedException e) {
                fail("Create operation interrupted. " + e.getMessage());
            }
        }
        client.shutdown();
        assertTrue(true);
        log.debug("Done test!");
    }
}
