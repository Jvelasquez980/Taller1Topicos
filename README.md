# Taller1Topicos
Bueno, este trabajo es bastante similar al que realizamos en el tutorial anterior. 
Para poder ejecutar este proyecto, se deben utilizar los siguientes comandos desde gitbash, ademas de tener previamente instalado docker

docker run -d \
--name mysql-container \
--network mynetwork \
-e MYSQL_ROOT_PASSWORD=1234 \
-p 3306:3306 \
mysql:latest

Y 

docker run -d \
--name phpmyadmin-container \
--network mynetwork \
-e PMA_HOST=mysql-container \
-e PMA_PORT=3306 \
-p 8081:80 \
phpmyadmin/phpmyadmin:latest

si se cambian cosas como la contraseña o el nombre del contenedor, estos cambios tambien se deben ver reflejados en el archivo src/main/resources/application.properties

Por ultimo se debe ejecutar el sevidor desde .\mvnw.cmd spring-boot:run o si se tiene instalado maven mvn.cmd spring-boot:run desde la consola de comandos

Las paginas permitidas o que se pueden visitar son las siguientes:
"/"
"/about"
"/clients"
"/clients/create"
"/clients/created"
"/clients/{id}"
"/clients/error"

Como anotaciones, no fui capaz de utilizar el metodo "delete" para eliminar un objeto de la base de datos, por lo que utilicé el metodo "post" y no tengo inconvenientes
Ademas como anotacion, cuando se eliminan Clientes de la base de datos, igualmente el ID autogenerado sigue en aumento, por lo que no se extrañen que si borran la informacion de la tabla
los id sigan aumentando

FIN
