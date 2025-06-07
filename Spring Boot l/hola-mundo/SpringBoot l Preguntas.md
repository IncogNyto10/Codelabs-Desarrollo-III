# SPRING BOOT I

## Cuestionario

### 1. ¿Qué es Spring Boot y cuál es su propósito?

**R//:** Spring Boot es una herramienta basada en el ecosistema de Spring que simplifica el desarrollo de aplicaciones en Java, gracias a su configuración automática, servidor embebido y buenas prácticas predefinidas.

---

### 2. ¿Qué significa la anotación `@SpringBootApplication`?

**R//:** Esta anotación combina tres funcionalidades clave:

- `@SpringBootConfiguration`: Declara la clase como fuente de configuración.
- `@EnableAutoConfiguration`: Activa la configuración automática del contexto de Spring.
- `@ComponentScan`: Permite detectar automáticamente componentes dentro del paquete.

---

### 3. ¿De qué maneras se puede iniciar una aplicación con Spring Boot?

**R//:** Se puede ejecutar de varias formas:

- Desde un **IDE** (como IntelliJ o Eclipse), ejecutando la clase principal anotada con `@SpringBootApplication`.
- Usando **Maven** con el comando: `mvn spring-boot:run`.
- Ejecutando un **archivo .jar** con: `java -jar nombre-del-archivo.jar`.

---

### 4. ¿Cuál es la función de `@RestController`?

**R//:** Indica que una clase manejará peticiones REST. Une las anotaciones `@Controller` y `@ResponseBody`, lo que permite enviar respuestas en formatos como JSON o XML directamente al cliente.

---

### 5. ¿Cómo se define una ruta (URL) dentro de un controlador en Spring Boot?

**R//:** A través de anotaciones como `@RequestMapping` o las especializadas como `@GetMapping` y `@PostMapping`.

---

### 6. ¿Cuál es el puerto por defecto en el que se ejecuta Spring Boot?

**R//:** Por defecto, la aplicación se levanta en el puerto **8080**.

---

### 7. ¿Cómo se puede cambiar el puerto en el que corre la aplicación?

**R//:** Editando el archivo `application.properties` y estableciendo una nueva configuración:

```properties
server.port=9090
```
