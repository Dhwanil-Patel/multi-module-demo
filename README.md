1.  Create project using Spring Initializer and Select option "Maven POM" in type. 
    Which only includes POM file not src and other structure.
    Open pom.xml and set packaging type : pom instead of jar.
    Remove web dependency and maven plugin and put in web module.
2.  Add new module ;
    Right click on project -> New -> Module
    Select maven for create project not select arch type select jvm version.
    Click next add group id and finish.
    Change packaging type to jar.
3.  For loading module dependency define that module in dependencies section.
    Like,    
    <dependency>
        <groupId>com.dhwanil</groupId>
        <artifactId>persistence</artifactId>
        <version>0.0.1-SNAPSHOT</version>
    </dependency>
4.  Add dependency of starter jpa and h2 database.
5.  Add database configuration in application.properties file.
6.  Create entity in domain module.
7.  Create repository and service files in persistence module.   
8.  Create controller file in web module.
9.  Create java file for MultiModuleDemo which contain main method or starting execution point.
10. Errors : 
    - Service class not work
      @ComponentScan("com.dhwanil.repositories")
    - Repository class not work.
      @EnableJpaRepositories(basePackages = {"com.dhwanil.repositories"})
    - Entity class not work.
      @EntityScan("com.dhwanil.domain")
11. For permanently store persistence data we need to update url in application.config
    spring.datasource.url=jdbc:h2:file:<path>/<db_file_without_extension>;    