package edu.ucsb.nceas.ezid.profile;

/**
 * EZID profile for Dublin Core metadata
 * @see http://n2t.net/ezid/doc/apidoc.html#profile-dc
 * @author leinfelder
 *
 */
public enum DublinCoreProfile {
	CREATOR("creator"),
	TITLE("title"),
	PUBLISHER("publisher"), 
	DATE("date"), 
	TYPE("type");
	
	private static final String profileName = "dc";
	
    private final String value;

    private DublinCoreProfile(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return profileName + "." + value;
    }
}
