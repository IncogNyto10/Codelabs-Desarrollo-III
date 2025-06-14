# Clean Architecture en microservicios con Spring Boot

## 1. ¿Cuál es el propósito principal de Clean Architecture en el desarrollo de software?

El propósito principal de Clean Architecture es **separar las preocupaciones del sistema** en diferentes capas con el fin de **lograr un alto nivel de independencia** entre la lógica de negocio, la infraestructura y los frameworks. Esto facilita la **mantenibilidad, escalabilidad y testabilidad** del sistema.

---

## 2. ¿Qué beneficios aporta Clean Architecture a un microservicio en Spring Boot?

- **Desacoplamiento** entre lógica de negocio e infraestructura.
- Facilita el **testing unitario** de la lógica sin depender de frameworks.
- Promueve la **reutilización del código**.
- Mejora la **organización del proyecto**.
- Facilita la **evolución y el mantenimiento** del microservicio.

---

## 3. ¿Cuáles son las principales capas de Clean Architecture y qué responsabilidad tiene cada una?

1. **Entidad (Domain Model):**

   - Contiene las reglas de negocio más puras.
   - Independiente de cualquier tecnología o framework.

2. **Casos de Uso (Application):**

   - Orquesta el flujo de negocio.
   - Ejecuta las reglas según las solicitudes del usuario.

3. **Interfaces (Adapters / Interface):**

   - Contiene controladores, servicios web, UI, etc.
   - Traduce datos hacia y desde la capa de aplicación.

4. **Infraestructura (Frameworks & Drivers):**
   - Maneja detalles técnicos como base de datos, redes, APIs, etc.

---

## 4. ¿Por qué se recomienda desacoplar la lógica de negocio de la infraestructura en un microservicio?

Porque permite:

- **Cambiar la tecnología** sin afectar el core del sistema.
- **Probar la lógica de negocio** sin dependencias externas.
- **Reutilizar la lógica** en otros contextos o servicios.
- **Reducir el acoplamiento** y aumentar la flexibilidad del sistema.

---

## 5. ¿Cuál es el rol de la capa de aplicación y qué tipo de lógica debería contener?

La capa de aplicación (casos de uso) se encarga de:

- Coordinar la ejecución de la lógica de negocio.
- Interactuar con interfaces externas mediante puertos.
- Contener la **lógica orquestadora**, no las reglas de negocio puras.

---

## 6. ¿Qué diferencia hay entre un UseCase y un Service en Clean Architecture?

- **UseCase:**  
  Representa una **acción del negocio**, define el flujo de reglas que se deben ejecutar.

- **Service (de infraestructura):**  
  Generalmente representa una **implementación técnica**, como un `EmailService` o `PaymentGateway`.

Los **UseCases son controladores del negocio**, mientras que los Services son detalles técnicos delegados a la infraestructura.

---

## 7. ¿Por qué se recomienda definir Repositories como interfaces en la capa de dominio en lugar de usar directamente JpaRepository?

Porque así se logra:

- **Desacoplamiento** del framework de persistencia.
- Dependencia de **abstracciones**, no implementaciones.
- **Facilidad para pruebas** (con mocks o en memoria).
- Posibilidad de cambiar la base de datos sin afectar el dominio.

---

## 8. ¿Cómo se implementa un UseCase en un microservicio con Spring Boot y qué ventajas tiene?

**Pasos comunes:**

- Crear una interfaz `UseCase` en el paquete `application`.
- Implementarla en una clase que contenga la lógica del caso de uso.
- Inyectar interfaces de repositorios o servicios necesarios.

**Ventajas:**

- Claridad en la **intención del código**.
- **Testabilidad** sin necesidad de contexto Spring.
- Separación de responsabilidades más clara.

---

## 9. ¿Qué problemas podrían surgir si no aplicamos Clean Architecture en un proyecto de microservicios?

- **Acoplamiento excesivo** entre lógica e infraestructura.
- Dificultad para aplicar cambios tecnológicos.
- Código difícil de **testear, entender y mantener**.
- Violación del principio de responsabilidad única.
- Escasa escalabilidad en el desarrollo por equipos.

---

## 10. ¿Cómo Clean Architecture facilita la escalabilidad y mantenibilidad en un entorno basado en microservicios?

- Cada microservicio tiene una arquitectura **modular y bien definida**.
- Permite **trabajo paralelo** entre equipos.
- Minimiza el **impacto de los cambios**.
- Facilita la integración de nuevas tecnologías.
- Fomenta el uso de **DDD** alineando el software al negocio.

---
