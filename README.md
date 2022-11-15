# Activitat 7 Spring Boot: introducció guiada a les relacions 2

Introducció a les relacions entre entitats/taules 

Relacions @OneToMany/ManyToOne (continuació)
A l’exemple anterior hem pogut observar que el controlador de curs també descarrega la llista de materials d’aquest curs. També hem pogut evitar el bucle recursiu amb la anotació @JsonIgnore. Aquesta anotació permet evitar que alguns dels camps de l’entitat es mostrin.
En general, cal tenir molt present la problemàtica que es produeix quan tenim la mateixa informació a dos llocs simultàniament: als objectes de l’aplicació i a la BD. Per exemple, si es modifica la BD (cosa que podria fer una altre usuari) potser els objectes que ja hem baixat poden ser inconsistents. 

Abans que res, anem a introduir una dependència que ha de permetre mirar les rutes i fer proves amb el format de Swagger https://swagger.io/, cosa que ens facilitarà la feina quan n’hi hagi moltes.
En aquest tutorial https://www.baeldung.com/spring-rest-openapi-documentation podem veure que només cal afegir una dependència Maven al POM (assegureu-vos de posar-hi la dependència de la versió més recent).

