# ACEIS
The Automatic Complex Event Implementation System (ACEIS) is a middleware for complex event services. It is implemented to fulfill large-scale data analysis requirements in the CityPulse project and is responsible for event service discovery, composition, deployment, execution and adaptation. In the CityPulse project, data streams are annotated as event services, using the Complex Event Service Ontology. Event service discovery and composition refer to finding a data stream or a composite set of data streams to address the user-defined event request. Event service deployment refers to transforming the event service composition results (a.k.a., composition plans) into RDF Stream Processing (RSP) queries and registering these queries to relevant RSP engines, e.g., CQELS and C-SPARQL. Event service execution refers to establishing the input and output connections for the RSP engines to allow them consuming real-time data from lower-level data providers and delivering query results to upper-level data consumers. Event services adaptation ensures the quality constraints over event services are ensured at run-time, by detecting quality changes and make adjustments automatically.

##Prerequisite
The following applications have to be installed before using the component:
- JDK 1.7
- Web Server (e.g., Jboss 7.1.2)
- CQELS engine 
- CSPARQL engine 
- Other Java libraries located at https://github.com/CityPulse/ACEIS

##CityPulse framework dependencies
- Resource management, including the knowledge base, to access the stream meta-data.
- Data aggregation, to consume aggregated observations.
- Data bus, to access real-time observations.
- Data quality analysis, to receive static and dynamic data quality information.

##Installation
Download resources and executables at https://github.com/CityPulse/ACEIS . No further installation required.

##Configuration
The file "aceis.properties" is the static configuration file, it consists the following configuration parameters:
- hostIp: the IP address of the server hosting data federation server,
-	port: the main port used by the data federation server,
-	ontology:  the folder storing the ontology files (used only if local dataset files are used), 
-	streams: the folder storing the stream data files for simulation (used only if operating on simulated streams), 
-	dataset: the location of stream meta-data, could be a local file or an URI for the virtuoso endpoint provided by the resource management component, and
-	request: the location of sample test queries.

##Deploying and Running the component
-	Step 1: download resources provided at https://github.com/CityPulse/ACEIS .
-	Step 2: check and edit configuration file when necessary.
-	Step 3: run ACEIS.jar or compile from Main.java to start ACEIS server, with the following program parameters: cqelsCnt: number of CQELS engine instances, csparqlCnt: number of CSPARQL engine instances, smode: load balancing strategy, could be "elastic", "balancedLatency", "balancedQueries", "rotation" or "elastic", qCnt: number of concurrent queries (used only in simulation mode), step: interval between registering new queries (used only in simulation mode), query: path to the query file (used only in simulation mode), duration: life-time of the ACEIS server instance, 0 means indefinite.
-	Alternatively to Step 3: run $sh run.sh to skip step 3 and start ACEIS with default settings.

##API specification
See javadoc hosted at: http://fenggao86.github.io/ACEIS/doc/index.html

## Contributors
ACEIS has been developed as part of the EU project CityPulse. The Unit of Reasoning and Querying of INSIGHT, NUIG has provided the main contributions for this application.

CityPulse: http://www.ict-citypulse.eu/

INSIGHT: https://www.insight-centre.org



