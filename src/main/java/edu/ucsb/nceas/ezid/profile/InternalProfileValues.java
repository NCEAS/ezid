package edu.ucsb.nceas.ezid.profile;

/**
 * EZID profile for internal metadata field values
 * @see http://n2t.net/ezid/doc/apidoc.html#internal-metadata
 * @author leinfelder
 * 
 * _status options are
 * PUBLIC		public (default)
 * RESERVED		reserved
 * UNAVAILABLE	unavailable
 * 
 * _export options
 * YES	yes (default)
 * NO	no
 * 
 * EZID internal profile metadata field values
 */
public enum InternalProfileValues {
	// values for _export
	YES("yes"),
	NO("no"),
	// values for _status
	PUBLIC("public"),
	RESERVED("reserved"),
	UNAVAILABLE("unavailable");
	
    private final String value;

    private InternalProfileValues(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
