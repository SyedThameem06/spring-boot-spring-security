# spring-boot-spring-security
Basic spring-boot API's with two end having basic authentication using spring-security with different credentials each.

Software Requirements.
1. jdk1.8.0_231
2. sts-4.2.0.RELEASE or any equivalent IDE.

Steps to install.

1. Clone the git repository into feasible location.
2. In the IDE import the project as Existing maven project.
3. Update the project under maven to download the required libs.
4. Run maven clean install.
5. Run the project as spring boot application in the IDE.
6. After running the project check whether application is up and running using url http://localhost:8082.
7. To check the getconfigdetails API.

Use the following credentials(Basic Auth in postman) and URL.
  URL - http://localhost:8082/api/getconfigdetails
  Method - GET
  UserName - ADMIN
  Password - efgh-12ee-adbe-t12f
  
8. To check getproductdetails API.

Use the following credentials(Basic Auth in postman) and URL.
  URL - http://localhost:8082/api/getproductdetails
  Method - GET
  UserName - USER
  Password - gfgh-22ee-akbe-t12l.
