# chefsick.lk
Per Week Meal Planning and Ordering Website

Clone this using git bash. -> git clone https://github.com/chaturangalagama/chefsick.lk.git


Open using IntellijIdea -> New -> Project from Existing Sourses -> Choose root pom.xml -> Ok


Execute -> mvn clean install


First -> Run the Service-Registry-Server 

      -> Then Run the Gateway-Server 
      
      -> Don't Run Config-Server(Not finished yet)
      
      -> Then Run the others 
     
     
Microservices ->

      -> Service-Registry-Server (Eureka Service Registry)
      
      -> Gateway-Server (Zuul Gateway)
      
      -> Gateway-Auth-Server (Auth Service)
      
      -> Config-Server (Centralized Configuration Service (Not finished yet))
      
      -> Chefsick-Service-Cart (Cart Service)
      
      -> Chefsick-Service-Menu (Menu Service)
