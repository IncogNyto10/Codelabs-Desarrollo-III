# ADD + CLEAN ARCHITECTURE

## Cuestionario

### 1. ¿Qué es Attribute-Driven Design (ADD) y cuál es su objetivo en el desarrollo de software?

**R//:** ADD es una técnica de diseño arquitectónico que se enfoca en los atributos de calidad del sistema (como rendimiento, escalabilidad o seguridad). Su propósito es garantizar que la arquitectura cumpla con los requerimientos no funcionales desde las etapas iniciales del proyecto.

---

### 2. ¿Cómo se relaciona ADD con Clean Architecture al diseñar sistemas?

**R//:** ADD orienta el diseño arquitectónico en función de atributos de calidad, mientras que Clean Architecture organiza el código en capas independientes. ADD guía las decisiones estratégicas, y Clean Architecture implementa dichas decisiones de forma desacoplada y mantenible.

---

### 3. ¿Cuáles son los pasos clave de ADD para definir una arquitectura?

- **Identificación de atributos y restricciones:** Se establecen requisitos clave del sistema (como seguridad o rendimiento).
- **Diseño arquitectónico:** Se eligen tácticas y patrones para cumplir con los atributos definidos.
- **Implementación con Clean Architecture:** Se divide el sistema en capas como dominio, aplicación, infraestructura y presentación.
- **Validación y ajuste:** Se prueban los resultados y se refina la arquitectura según sea necesario.

---

### 4. ¿Cómo se determinan los atributos de calidad en ADD y por qué son fundamentales?

**R//:** Se obtienen a partir del análisis de requisitos y conversaciones con las partes interesadas. Son esenciales porque influyen directamente en las decisiones de diseño, asegurando que el sistema soporte adecuadamente los objetivos del negocio.

---

### 5. ¿Por qué Clean Architecture es una buena compañera de ADD?

**R//:** Porque Clean Architecture proporciona una estructura modular y desacoplada que permite cumplir fácilmente con los atributos definidos por ADD. Por ejemplo, si se requiere escalabilidad, es posible cambiar tecnologías o añadir servicios sin afectar el núcleo de negocio.

---

## 6. ¿Qué criterios se deben considerar al definir las capas en Clean Architecture dentro de un proceso ADD?

Para definir las capas en Clean Architecture usando ADD, se deben considerar:

- Atributos de calidad del sistema (rendimiento, seguridad, etc.).
- Separación de responsabilidades (Evitar que la infraestructura afecte la lógica de negocio).
- Modularidad (Facilitar cambios en una capa sin afectar otras).
- Inversión de dependencias (Las capas internas no dependen de las externas).

## 7. ¿Cómo ADD ayuda a tomar decisiones arquitectónicas basadas en necesidades del negocio?

ADD traduce las necesidades del negocio en decisiones arquitectónicas concretas.

## 8. ¿Cuáles son los beneficios de combinar ADD con Clean Architecture en un sistema basado en microservicios?

### Ventajas clave:

- **Arquitectura basada en calidad**: ADD garantiza que se prioricen los atributos correctos.
- **Bajo acoplamiento**: Clean Architecture evita dependencias innecesarias entre microservicios.
- **Escalabilidad optimizada**: Se pueden desplegar microservicios de forma independiente.
- **Fácil mantenimiento**: Cada microservicio sigue una estructura clara y desacoplada.
- **Pruebas más eficientes**: Se pueden probar las capas internas sin necesidad de infraestructura real.

## 9. ¿Cómo se asegura que la arquitectura resultante cumpla con los atributos de calidad definidos en ADD?

- **Revisiones arquitectónicas periódicas** (Evaluar si se cumplen los atributos de calidad).
- **Pruebas de carga y estrés** (Para evaluar rendimiento y escalabilidad).
- **Prototipos y pruebas de concepto** (Validar decisiones antes de implementarlas a gran escala).
- **Revisiones de código** (Para verificar que Clean Architecture se siga correctamente).
- **Uso de métricas y monitoreo** (Tiempo de respuesta, consumo de recursos, etc.).

## 10. ¿Qué herramientas o metodologías pueden ayudar a validar una arquitectura diseñada con ADD y Clean Architecture?

### Herramientas y enfoques útiles:

- **SonarQube**: Para evaluar calidad del código y seguir principios de Clean Architecture.
- **Arquillian o JUnit**: Para pruebas unitarias y de integración.
- **JMeter o Gatling**: Para pruebas de carga y rendimiento.
- **Architectural Decision Records (ADR)**: Para documentar decisiones arquitectónicas.
- **C4 Model**: Para visualizar la arquitectura de forma clara.
