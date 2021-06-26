# Student CRUD RestAPI - database used #POSTGRESQL

**3 layers**
* API Layer
* Service Layer
* Data Access Layer

## NOTES

* Use [Spring Initializr](https://start.spring.io/) build a new application with several dependencies(Basic - Spring Boot DevTools, Spring Web, Spring Data JPA, H2 Database). 

#### Create Student Model Class
###### Annotation Used - `@Entity`, `@Table`, `@Id`, `@Transient`
1. create `private` variables with their type.
2. generate `getter` and `setter`
3. use @SequenceGenerator and @GeneratedValue to use JPA.



#### Create Student Controller Class
###### Annotation Used - 
`@RestController`, `@RequestBody Student student`, `@RequestParam(required = false) String name` , `@PathVariable("studentId") Long studentId`, `@RequestMapping(path = "api/v1/student")`, `@GetMapping`, `@PostMapping`, `@PutMapping(path = {"studentId"})`, `@DeleteMapping(path = "{studentId}")`
1.  create `private` instance for StudentService and create a `constructor` with it. 
2.  simply add 4(getAllStudents, registerNewStudent, updateStudent, deleteStudent) function and redirect to service's function with its instance.


#### Create Student Service Class
###### Annotation Used - `@Service`
1.  create `private` instance for StudentRepository and create a `constructor` with it.
2.  receive param datas from controller and use save, findById or throw exception, setName [setVariable], deleteById functions through repository's instance.


#### Create Student Repository Class
###### Annotation Used - `@Query`
1.  We can write raw query here to fetch data from database.


#### Making Package of this application(making an instance for docarization)
1. Open Maven from right bar and click `Clean`. It will delete `target` folder from the source.
2. Click `Install` and It will create a new instance of the project.
3. Run `cd target`
4. Run `java -jar demo-0.0.1-SNAPSHOT.jar --server.port=8081`



