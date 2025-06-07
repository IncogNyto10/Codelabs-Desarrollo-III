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

### 6. ¿Qué aspectos deben considerarse al definir las capas en Clean Architecture dentro de un enfoque ADD?

- **Dominio:** Encapsula las reglas de negocio, independientes de frameworks o tecnologías.
- **Aplicación:** Orquesta los casos de uso según las necesidades del n
