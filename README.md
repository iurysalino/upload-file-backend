# Upload File API Backend 

This API is constructed to upload and read files, and print the agent code. The `file Read` method is responsible to execute this. </br>

I am use the JAX-B to realize the Unmarshller Process. </br>

`
		<dependency> </br>
			<groupId>javax.xml.bind</groupId> </br>
			<artifactId>jaxb-api</artifactId> </br>
			<version>2.3.1</version> </br>
		</dependency> </br>
		<dependency> </br>
			<groupId>org.glassfish.jaxb</groupId> </br>
			<artifactId>jaxb-runtime</artifactId> </br>
			<version>2.3.1</version> </br>
			<scope>runtime</scope> </br>
		</dependency> </br>
`

I'm use this Tecnologies: </br>

✅ IntelliJ Idea </br>
✅ Maven 3+ </br>
✅ SpringBoot 2.7.4 </br>
✅ springdoc-openapi-ui </br>
✅ Postman </br>

For run and test this project, follew the next steps: </br>

✅ Clone this repository; </br>
✅ Open into IntelliJ Idea and Click Run; </br>
✅ Open a software for test, for example: Postman or Insominia </br>
✅ Make a new `POST` request to the endpoint:  http://localhost:8080/upload-file </br>
✅ Add files to body params and click send: </br>

![image](https://user-images.githubusercontent.com/4906986/197214895-548e0fdd-8c3a-437b-8f08-05396072bd96.png) </br>

Maked by Iury da Guia Salino
