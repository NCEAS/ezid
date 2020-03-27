EZID Service Library
====================

[EZID](http://ezid.cdlib.org) is a service for creating and managing unique
identifiers for use in scholarly publishing that is provided by the California
Digital Library.  This software library, ezid, provides a Java class that
encapsulates the EZID service to simplify writing client applications that use
the EZID service. ezid provides methods for authenticating against the EZID
service and then managing identifiers.  Using the service requires an account
with the EZID service.  For more information, see:
   http://ezid.cdlib.org/doc/apidoc.html

Once you have added the library to your project classpath (see below), you can generate identifiers with EZID with simple Java calls.  Here's a simple example to mint a new identifier using a DataCite 4.0 compliant metadata file in the current directory:

```java
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import edu.ucsb.nceas.ezid.EZIDService;
import edu.ucsb.nceas.ezid.EZIDException;

public class EZIDExample {
    public static void main(String args[]) {
        try {
            String USERNAME = "apitest";
            String PASSWORD = "apitest";
            String DOISHOULDER = "doi:10.5072/FK2";

            EZIDService ezid = new EZIDService();
            ezid.login(USERNAME, PASSWORD);

            HashMap<String, String> metadata = new HashMap<String, String>();
            String xml = new String(Files.readAllBytes((Paths.get("datacite.xml"))));
            metadata.put("datacite", xml);
            String testId = ezid.mintIdentifier(DOISHOULDER, metadata);
            System.out.println("Generated: " + testId);
        } catch (EZIDException e) {
            System.err.println("Identifier minting failed: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Reading DataCiteXML failed: " + e.getMessage());
        }
    }
}
```

See the javadoc documentation for an overview of usage, as well as the
EZIDServiceTest.java JUnit class for more examples of usage.

See the License section below and LICENSE.txt for the details of distributing this software.

Contributors
------------
* [Matthew B. Jones](http://matt.magisa.org), [NCEAS](http://www.nceas.ucsb.edu)
* Ben Leinfelder, [NCEAS](http://www.nceas.ucsb.edu)

Using the library
-----------------
To use the library in your Java application, you can add it to your pom.xml
configuration if you are using Maven.  You can access the ezid jar files through
Maven by adding the appropriate maven repository to your pom.  Something like
this snippet should work:

```xml
    ...
    <repositories>
        <repository>
            <id>dataone.org</id>
            <url>http://dev-testing.dataone.org/maven</url>
            <releases>
                <enabled>true</enabled>
            </releases>
            <snapshots>
                <enabled>true</enabled>
            </snapshots>
        </repository>
    </repositories>
    <dependencies>
    	<dependency>
    		<groupId>edu.ucsb.nceas</groupId>
			<artifactId>ezid</artifactId>
			<version>1.0.3</version>
			<type>jar</type>
    	</dependency>
    </dependencies>
```

We plan to publish the ezid artifacts to Maven Central repositories, but have not gotten there yet.

Building the library
--------------------
The library is a standard Maven2 project.  To build the library, install Maven2,
and then run:

  $ mvn package

which will create the jar file in the target directory. The jar file can then be
included in applications that wish to access EZID.

Contact us: knb-help@nceas.ucsb.edu

Contributions
-------------
We welcome contributions to the project, and will incorporate pull requests after code review as long as the code requests are licensed acceptably and provide improvements that would generally be useful to the community of EZID users.  Please submit pull request via GitHub.

Issue Tracking
--------------
Bugs, new features, and comments on the EZID library are handled through the [ezid issue tracker](https://github.com/mbjones/ezid/issues?state=open "ezid issues").  

License
-------
```
This work was created by the National Center for Ecological Analysis and
Synthesis at the University of California Santa Barbara (UCSB).

  Copyright 2011-2104 Regents of the University of California

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
