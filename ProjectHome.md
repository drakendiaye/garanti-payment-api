This project is developed for public usage of T. Garanti Bankası A.Ş. online payment systems Java API, considering Gitti Gidiyor Bilgi Teknolojileri San. ve Tic. A.Ş. requirements.

Technology Stack: Java, Maven3

Project Version: 1.3
http://garanti-payment-api.googlecode.com/files/garanti-payment-api-1.3.jar

Maven Definitions:
```
<!-- garanti payment api repository definition -->
<repository>
  <id>garanti-payment-api-repository</id>
  <name>Maven Repository for garanti-payment-api</name>
  <url>http://garanti-payment-api.googlecode.com/svn/maven/repo</url>
  <releases>
    <enabled>true</enabled>
  </releases>
  <snapshots>
    <enabled>true</enabled>
  </snapshots>
</repository>

<!-- garanti payment api dependency -->
<dependency>
  <groupId>com.gittigidiyor.payment.garanti.api</groupId>
  <artifactId>garanti-payment-api</artifactId>
  <version>${payment-garanti.version}</version>
</dependency>

<!-- garanti payment api version -->
<payment-garanti.version>1.3</payment-garanti.version>
```