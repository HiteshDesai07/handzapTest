# handzapTest

Required Dependencies 

        <dependency>
            <groupId>org.jsoup</groupId>
            <artifactId>jsoup</artifactId>
            <version>1.11.3</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/javax.ws.rs/javax.ws.rs-api -->
        <dependency>
            <groupId>javax.ws.rs</groupId>
            <artifactId>javax.ws.rs-api</artifactId>
            <version>2.0</version>
        </dependency>
        <dependency>
            <groupId>org.glassfish.jersey.containers</groupId>
            <artifactId>jersey-container-servlet</artifactId>
            <version>2.25.1</version>
        </dependency>

        <!-- for data exchange format -->
        <dependency>
            <groupId>org.glassfish.jersey.media</groupId>
            <artifactId>jersey-media-json-jackson</artifactId>
            <version>2.25</version>
        </dependency>
        
 Jsoup = use for data crawling from web.
 javax.ws.rs-api = for j2ee rest api specification
 jersey-container-servlet = for javax.ws.rs implementation.
 jersey-media-json-jackson = for json data exchange format.
 
 
 Available Rest end points to query article data
 
 Data exchange format is application/json
 
  GET /article/authors -returns available authors
  GET /article/authors/{authorName} -returns articles by authorName where authorName is path variable
  GET /article:search?title=&description= -returns articles by title or description where title and description are query params
  
  Note : considered 10 articles data only to avoid more memory consumptions. 
