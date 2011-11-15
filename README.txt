====
  This work was created by the National Center for Ecological Analysis and
  Synthesis at the University of California Santa Barbara (UCSB).
 
    Copyright 2011 Regents of the University of California
 
  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at
 
    http://www.apache.org/licenses/LICENSE-2.0
 
  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
====

EZID Service Library
--------------------

EZID is a service for creating and managing unique identifiers for use in
scholarly publishing that is provided by the California Digital Library.
This software library, ezid, provides a Java class that encapsulates the
EZID service to simplify writing client applications that use the EZID 
service. ezid provides methods for authenticating against the EZID service and
then managinfg identifiers.  Using the service requires an account with the
EZID service.  For more information, see:
   http://n2t.net/ezid/doc/apidoc.html

See the javadoc documentation for an overview of usage, as well as the
EZIDServiceTest.java JUnit class for examples of usage.

See LICENSE.txt for the details of distributing this software. 

Building the library
--------------------
The library is a standard Maven2 project.  To build the library, install Maven2, 
and then run:

  $ mvn package

which will create the jar file in the target directory. The jar file then be
included in applications that wish to access EZID.

Contact us: knb-help@nceas.ucsb.edu

