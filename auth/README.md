# Auth
Este artefacto entrega autenticación (token) basada en roles.

### Instalación
Carga el proyecto en el IDE de preferencia, ejecuta los comandos de **mvn** para cargas las dependencias definidas en el archivo **pom.xml**.

### Descripción
Crea autenticación con usuario y contraseña retornando un token de seguirdad para poder acceder a los diferentes recursos definidos en las Apis.

Al momento de ejecutarlos se crean las tablas **Roles** y **Usuarios** con los campos definidas en las entidades.

### Base de datos
Esta es H2 (En memoria) y para poder consultar se requiere acceder al navegador y proporcionar los siguientes datos:

- Url: http://localhost:8181/h2-ui/
- JDBC Url: jdbc:h2:mem:cruddb
- Usuario: admin
  No tiene password

### Estructura de archivos
```
src/
|-- main/
|   |-- java/
|   |   |-- com/
|   |       |-- canopus/
|   |           |-- auth/
|   |               |-- security/
|   |                   |-- config/
|   |                   |   |-- BeansConfig.java
|   |                   |
|   |                   |-- controller/
|   |                   |   |-- AuthController.java
|   |                   |
|   |                   |-- dto/
|   |                   |   |-- JwtDto.java
|   |                   |   |-- LoginUsuario.java
|   |                   |   |-- Mensaje.java
|   |                   |   |-- NuevoUsuario.java
|   |                   |
|   |                   |-- entity/
|   |                   |   |-- Rol.java
|   |                   |   |-- Usuario.java
|   |                   |   |-- UsuarioPrincipal.java
|   |                   |
|   |                   |-- enums/
|   |                   |   |-- RolNombre.java
|   |                   |
|   |                   |-- jwt/
|   |                   |   |-- JwtEntryPoint.java
|   |                   |   |-- JwtProvider.java
|   |                   |   |-- JwtTokenFilter.java
|   |                   |
|   |                   |-- repository/
|   |                   |   |-- RolRepository.java
|   |                   |   |-- UsuarioRepository.java
|   |                   |
|   |                   |-- service/
|   |                       |-- RolService.java
|   |                       |-- UserDetailsServiceImpl.java
|   |                       |-- UsuarioService.java
|   |                   |-- MainSecurity.java
|   |               |-- util/
|   |                   |-- CreateRoles.java
|   |               |-- AuthApplication.java
|   |
|   |-- resources/
|       |-- application.properties
|-- pom.xml
```