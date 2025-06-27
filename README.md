# ORM-hospital

Trabajo práctico MAPEO ORM - Hospital
Talle de programación 4

Utilizado:
* JAVA
* Spring Boot
* H2 database
* Maven

- Avance: 
   Clase base Person con herencia JOINED
   Clase Address embebida
   Enum Gender
   Subclase Patient con List<String> para alergias y prescripciones
   Repositorio PatientRepository con métodos personalizados
   Servicio PatientService
   Controlador REST PatientController con endpoints funcionales
   La otra subclase: Staff
Falta: 
El entity Hospital con sus relaciones
Configurar application.properties para H2 (cuando quieras)
Agregar un RestController general para probar todo junto
