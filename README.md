<p align="center"> 
    <img src="https://jobs.coderhouse.com/assets/logos_coderhouse.png" alt="CoderHouse"  height="100"/>
</p>


# Microservicio de Intérprete

Este microservicio proporciona operaciones CRUD (Crear, Leer, Actualizar, Eliminar) para la entidad de Intérprete. Utiliza Spring Boot con Spring Data JPA para interactuar con la base de datos.

## Funcionalidades

- Crear un nuevo intérprete
- Leer la información de un intérprete por su ID
- Actualizar la información de un intérprete existente
- Eliminar un intérprete
- Listar todos los intérpretes

## Cómo usar

### Crear un nuevo intérprete
- Método: POST
- Endpoint: `http://localhost:8081/interprete`
- Parámetros: Nombre del intérprete en el cuerpo de la solicitud
- Ejemplo de solicitud:
  ```json
  {
    "nombre": "Nombre del Intérprete"
  }
  
### Leer la información de un intérprete por su ID
- Método: GET
- Endpoint: `/interprete/{id}`
- Parámetros: ID del intérprete en la URL
- Ejemplo de solicitud: `/interprete/1`

### Actualizar la información de un intérprete existente
- Método: PUT
- Endpoint: `/interprete/{id}`
- Parámetros: ID del intérprete en la URL y nuevo nombre del intérprete en el cuerpo de la solicitud
- Ejemplo de solicitud:
  - URL: `/interprete/1`
  - Cuerpo de la solicitud:
    ```json
    {
      "nombre": "Nuevo Nombre del Intérprete"
    }

### Eliminar un intérprete
- Método: DELETE
- Endpoint: `/interprete/{id}`
- Parámetros: ID del intérprete en la URL
- Ejemplo de solicitud: `/interprete/1`

### Listar todos los intérpretes
- Método: GET
- Endpoint: `/interprete`
- Ejemplo de solicitud: `/interprete`

# Microservicio de Canciones

Este microservicio proporciona operaciones CRUD para la entidad de Canciones. Al igual que el microservicio de Intérprete, utiliza Spring Boot con Spring Data JPA para interactuar con la base de datos.

## Funcionalidades

- Crear una nueva canción asociada a un intérprete
- Leer la información de una canción por su ID
- Actualizar la información de una canción existente
- Eliminar una canción
- Listar todas las canciones

## Cómo usar

### Crear una nueva canción asociada a un intérprete
- Método: POST
- Endpoint: `http://localhost:8082/canciones`
- Parámetros: Título de la canción y ID del intérprete en el cuerpo de la solicitud
- Ejemplo de solicitud:
  ```json
  {
    "titulo": "Título de la Canción",
    "interpreteId": 1
  }
  
### Leer la información de una canción por su ID
- Método: GET
- Endpoint: `/canciones/{id}`
- Parámetros: ID de la canción en la URL
- Ejemplo de solicitud: `/canciones/1`

### Actualizar la información de una canción existente
- Método: PUT
- Endpoint: `/canciones/{id}`
- Parámetros: ID de la canción en la URL y nuevo título de la canción en el cuerpo de la solicitud
- Ejemplo de solicitud:
  - URL: `/canciones/1`
  - Cuerpo de la solicitud:
    ```json
    {
      "titulo": "Nuevo Título de la Canción"
    }

### Eliminar una canción
- Método: DELETE
- Endpoint: `/canciones/{id}`
- Parámetros: ID de la canción en la URL
- Ejemplo de solicitud: `/canciones/1`

### Listar todas las canciones
- Método: GET
- Endpoint: `/canciones`
- Ejemplo de solicitud: `/canciones`

# Microservicio de Orquestación (Rockola)

Este microservicio actúa como un orquestador para obtener las canciones de un intérprete. Utiliza Spring Boot para exponer un endpoint que acepta el nombre del intérprete y devuelve las canciones asociadas a ese intérprete.

## Funcionalidad

- Obtener las canciones de un intérprete por su nombre

## Cómo usar

### Obtener las canciones de un intérprete por su nombre
- Método: GET
- Endpoint: `http://localhost:8080/rockola/canciones/{nombreInterprete}`
- Parámetros: Nombre del intérprete en la URL
- Ejemplo de solicitud: `/rockola/canciones/Nombre del Intérprete`

Esta solicitud orquestará las llamadas a los microservicios de Intérprete y Canciones para obtener las canciones del intérprete deseado.


## Script para crear la Base de Datos.

```
    CREATE DATABASE IF NOT EXISTS rockola;
    USE rockola;
```

#### Ejemplo para inyectar en las Tablas Creadas:

```
    INSERT INTO interprete (nombre) VALUES
    ('Interprete1'),
    ('Interprete2'),
    ('Interprete3');
    
    INSERT INTO cancion (titulo, interprete_id) VALUES
    ('Cancion1_Int1', 1),  
    ('Cancion2_Int1', 1),  
    ('Cancion3_Int1', 1),  
    ('Cancion4_Int1', 1),  
    ('Cancion5_Int1', 1),  
    ('Cancion6_Int1', 1),  
    ('Cancion1_Int2', 2),  
    ('Cancion2_Int2', 2), 
    ('Cancion3_Int2', 2),  
    ('Cancion4_Int2', 2),  
    ('Cancion1_Int3', 3),  
    ('Cancion2_Int3', 3), 
    ('Cancion3_Int3', 3), 
    ('Cancion4_Int3', 3), 
    ('Cancion5_Int3', 3),
    ('Cancion6_Int3', 3),
    ('Cancion7_Int3', 3);

```
---


## Autor: Profesor Alejandro Daniel Di Stefano


¡Gracias por visitar mi repositorio! 😊
<br><p align="center">
<img src="https://1000logos.net/wp-content/uploads/2020/09/Java-Logo.png" alt="Java" width=500></p>

<p align="center"> 
 <a href="#" target="_blank"> 
     <img src="https://cdn.icon-icons.com/icons2/2699/PNG/512/mysql_official_logo_icon_169938.png" alt="sql" height="100"/>
  </a> 
    &nbsp &nbsp &nbsp
 <a href="#" target="_blank"> 
  <img src="https://miro.medium.com/v2/resize:fit:1100/0*5FEJ7emIEAxZRCQF" alt="spring-boot"  height="100"/>
 </a> 
 </p>&nbsp
 <p align="center"> 

 </p>&nbsp
  <p align="center"> 
<a href="#" target="_blank"> 
  <img src="https://www.vectorlogo.zone/logos/git-scm/git-scm-icon.svg" alt="git" width="120" /> 
  </a>
   &nbsp
  <a href="#" target="_blank"> 
  <img src="https://static-00.iconduck.com/assets.00/eclipse-icon-512x479-6ivkqawb.png" alt="Eclipse" width="120" /> 
  </a> 
   &nbsp
  <a href="#" target="_blank"> 
  <img src="https://static.educacionit.com/d/q_80/tecnologias/apache-maven/logo-color.svg" alt="Apache Maven" width="120" /> 
  </a> 
</p>&nbsp
