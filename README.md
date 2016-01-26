# Simple Spring Example
This is a very simple Spring project. It's purpose is to quickly have a running Spring application.

# Project structure
Project consists of a web module (frontend part), core module (with business logic).

# Building & running the project
Build with Gradle (runs unit and integration tests as well):

```bash
$ gradle build
```
and then copy WAR to Tomcat's webapps directory. Open the following URL in browser: http://localhost:8080/web-0.0.1/

# TODO
- [x] Create useful core module. For instance, core module could provide API for simple arithmetic operations (addition, subtraction, multiplication, division).
- [x] Add unit tests for core module.
- [x] Use core module in web module.
- [x] Add integration tests for web module.
- [x] Change the name of built WAR.
- [x] Change the path where WAR is placed after building it.
- [x] Add more user friendly URL for application. For instance, it could be /simplespringexample/ instead of /web-0.0.1/
- [x] Add logger (log4j or slf4j).
- [x] Remove springexample*.jar from build directory.
- [x] Add REST endpoint for Arithmetic service and test for it.
- [ ] Refactor tests - create abstract integration test class with MockMVC. 
- [ ] Configure IntelliJ IDEA settings to support integration-test directory. Since now, after changes in build.gradle this directory is marked as sources root, instead of test root.
- [ ] Create automatic Ansible deploy script to Tomcat. Alternative idea is to ship project with embedded Tomcat (thanks for an idea to: @AndriusDap).
- [ ] Review all @Configuration files. Maybe it's worth to merge web module's configuration files into one.
- [ ] Review all build configuration.
