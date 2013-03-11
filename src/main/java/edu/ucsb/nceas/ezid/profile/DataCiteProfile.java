package edu.ucsb.nceas.ezid.profile;

/**
 * EZID profile for DataCite metadata.
 * Specifies the supported metadata elements.
 * @see http://n2t.net/ezid/doc/apidoc.html#profile-datacite
 * @author leinfelder
 *
 */
public enum DataCiteProfile {
	CREATOR("creator"),
	TITLE("title"),
	PUBLISHER("publisher"), 
	PUBLICATION_YEAR("publicationyear"), 
	RESOURCE_TYPE("resourcetype");
	
	private static final String profileName = "datacite";
	
    private final String value;

    private DataCiteProfile(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return profileName + "." + value;
    }
}
