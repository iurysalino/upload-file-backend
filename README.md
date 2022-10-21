# Upload File API Backend

This API is constructed to upload and read files, and print the agent code. The `file Read` method is responsible to execute this.

I am use the JAX-B to realize the Unmarshller Process.

`
		<dependency>
			<groupId>javax.xml.bind</groupId>
			<artifactId>jaxb-api</artifactId>
			<version>2.3.1</version>
		</dependency>
		<dependency>
			<groupId>org.glassfish.jaxb</groupId>
			<artifactId>jaxb-runtime</artifactId>
			<version>2.3.1</version>
			<scope>runtime</scope>
		</dependency>
`

I'm use this Tecnologies:

✅ IntelliJ Idea
✅ Maven 3+
✅ SpringBoot 2.7.4
✅ springdoc-openapi-ui
✅ Postman

For run and test this project, follew the next steps:

✅ Clone this repository;
✅ Open into IntelliJ Idea and Click Run;
✅ Open a software for test, for example: Postman or Insominia
✅ Make a new `POST` request to the endpoint:  http://localhost:8080/upload-file
✅ Add files to body params and click send:

![image](https://user-images.githubusercontent.com/4906986/197214895-548e0fdd-8c3a-437b-8f08-05396072bd96.png)

Pawered by Iury da Guia Salino
