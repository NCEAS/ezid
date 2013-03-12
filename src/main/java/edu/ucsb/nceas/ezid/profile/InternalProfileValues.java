package edu.ucsb.nceas.ezid.profile;

/**
 * EZID profile for internal metadata field values
 * @see http://n2t.net/ezid/doc/apidoc.html#internal-metadata
 * @author leinfelder
 * 
 * _export values:
 * YES	yes (default)
 * NO	no
 *   
 *  _status values:
 * PUBLIC		public (default)
 * RESERVED		reserved
 * UNAVAILABLE	unavailable
 * 
 */
public enum InternalProfileValues {
	// _export values
	YES("yes"),
	NO("no"),
	// _status values
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
