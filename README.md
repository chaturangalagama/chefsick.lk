# chefsick.lk
Per Week Meal Planning and Ordering Website

Clone this using git bash. -> git clone https://github.com/chaturangalagama/chefsick.lk.git


Open using IntellijIdea -> New -> Project from Existing Sourses -> Choose root pom.xml -> Ok

Build Maven ->

      -> Go to Maven projects -> chefsick(root) -> Lifecycle
      -> mvn clean install     
     
Microservices ->

      -> Service-Registry-Server (Eureka Service Registry)
      
      -> Gateway-Server (Zuul Gateway)
      
      -> Gateway-Auth-Server (Auth Service)
      
      -> Config-Server (Centralized Configuration Service (Not finished yet))
      
      -> Chefsick-Service-Cart (Cart Service)
      
      -> Chefsick-Service-Menu (Menu Service)

Runing Order 

      -> Firt Run the Service-Registry-Server 

      -> Then Run the Gateway-Server 
      
      -> Don't Run Config-Server(Not finished yet)
      
      -> Then Run the others 
      
Calling Cart Service Api

      -> First Get OAuth2+JWT Token 
            -> http://localhost:8080/oauth/token
            -> POST Request
            -> Authorization -> Basic Auth -> 
                        -> Username -> testjwtclientid2
                        -> Password -> XY7kmzoNzl1002
            -> Headers -> 
                        -> Content-Type -> application/x-www-form-urlencoded
                        -> Accept -> application/json
            -> Body -> 
                        -> username -> john.doe
                        -> password -> password
                        -> grant_type -> 123456
                       
  ![alt text](https://github.com/chaturangalagama/chefsick.lk/blob/master/images/OAUTH2%20get%20token%20Authorization%20type.png)

  ![alt text](https://github.com/chaturangalagama/chefsick.lk/blob/master/images/OAUTH2%20get%20token%20headers.png)
  
  ![alt text](https://github.com/chaturangalagama/chefsick.lk/blob/master/images/OAUTH2%20get%20token%20body.png)
  
  
      -> Then Call Cart Service -> /call-menu-from-cart  
            -> http://localhost:8085/application-server-hawking/call-menu-from-cart
            -> GET Request
            -> Authorization -> OAuth 2.0h -> 
                        -> Access Token -> eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdWQiOlsidG1ZAnoI6d4
            -> Headers -> 
                        -> Content-Type -> application/x-www-form-urlencoded
                        -> Accept -> application/json
                     
  ![alt text](https://github.com/chaturangalagama/chefsick.lk/blob/master/images/Call%20cart%20from%20menu%20Authorization%20type.png)

  ![alt text](https://github.com/chaturangalagama/chefsick.lk/blob/master/images/Call%20cart%20from%20menu%20headers.png)
      
