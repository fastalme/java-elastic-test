# Sending Java application logs to Elasticsearch
This is a very basic example of sending logs from a classic Java application to a local instance of Elasticsearch.

There is only 1 class that writes 3 log lines when it is executed, one line of each (debug, info, error) level.  And accordingly to the configuration declared in the `logback.xml` file, each line loggged to the Console will be inserted into Elasticsearch asynchronously in the `java-logs` index

It uses [internetitem/logback-elasticsearch-appender] library and a local [Elasticsearch container] that you have to start for the test.

Tha configuration that makes 

## Technologies and versions

- Java 11
- Elasticsearch 7.13.3

## Steps to run this example project:
1. Start the Elasticsearch container: `docker run -p 9200:9200 -e "discovery.type=single-node" docker.elastic.co/elasticsearch/elasticsearch:7.13.3`
2. Import this maven project in your favorite IDE
3. Run the application from the main class (Program.java)
4. Hit http://localhost:9200/java-logs/_search to see the generated documents

This is what the output should look like:

![query result]

[internetitem/logback-elasticsearch-appender]: <https://github.com/internetitem/logback-elasticsearch-appender>
[Elasticsearch container]: <https://www.elastic.co/guide/en/elasticsearch/reference/current/docker.html>
[query result]: <https://github.com/fastalme/java-elastic-test/blob/master/query-result.png?raw=true>
