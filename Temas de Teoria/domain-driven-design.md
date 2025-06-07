# Domain-Driven Design (DDD)

## 1. ¿Qué es Domain-Driven Design (DDD) y cuál es su objetivo principal?

DDD es un enfoque de diseño de software **centrado en el dominio del negocio**, con el objetivo de crear modelos que reflejen fielmente la realidad del negocio y faciliten la comunicación entre desarrolladores y expertos en dominio.

---

## 2. ¿Cuál es la diferencia entre una Entidad y un Objeto de Valor en DDD?

- **Entidad:** Representa un objeto con **identidad única** dentro del dominio. Su identidad persiste a lo largo del tiempo, incluso si sus atributos cambian.  
  _Ejemplo:_ un **Usuario** con un identificador único (`id`).

- **Objeto de Valor:** Conjunto de atributos que describen un concepto del dominio **sin identidad propia**. Dos objetos de valor con los mismos datos son considerados iguales.  
  _Ejemplo:_ una **Dirección** con calle, ciudad y código postal.

---

## 3. ¿Qué es un Bounded Context y por qué es importante en DDD?

Es un **límite bien definido** dentro del dominio donde se aplica un modelo específico. Es clave porque:

- Evita **ambigüedades**.
- Permite **modularidad** en sistemas complejos.
- Favorece la **coherencia interna** del modelo.

---

## 4. ¿Cuál es el propósito del Lenguaje Ubicuo (Ubiquitous Language) en DDD?

Alinear el lenguaje entre desarrolladores y expertos del negocio para:

- Mejorar la **comunicación**.
- Garantizar que el software refleje con **precisión** los conceptos del dominio.

---

## 5. ¿Qué es un Agregado (Aggregate) y cómo garantiza la consistencia en el dominio?

Es un **grupo de entidades y objetos de valor** que forman una unidad lógica, con una **entidad raíz** (Aggregate Root) que:

- Controla el acceso.
- Garantiza la **consistencia** de los datos y las invariantes del dominio.

---

## 6. ¿Cómo se relacionan los Repositorios en DDD con la infraestructura de persistencia?

Los **repositorios** actúan como **intermediarios** entre la lógica de dominio y la persistencia:

- Permiten acceder a agregados como si estuvieran en memoria.
- **Ocultan los detalles** de la base de datos y tecnología subyacente.

---

## 7. ¿Qué son los Eventos de Dominio y cómo mejoran la comunicación entre Bounded Contexts?

Son **notificaciones** sobre cambios importantes en el estado del dominio.  
Permiten:

- **Desacoplar** contextos.
- Facilitar la **integración asíncrona**.
- Sincronizar procesos sin dependencias fuertes.

---

## 8. ¿Cómo se diferencian los Servicios de Aplicación y los Servicios de Dominio en DDD?

- **Servicios de Dominio:** Contienen **lógica de negocio** que no pertenece a una entidad o agregado específico.
- **Servicios de Aplicación:** Orquestan **casos de uso**, coordinando la interacción entre:
  - Repositorios
  - Entidades
  - Servicios de dominio

---

## 9. ¿Cómo DDD facilita el diseño de software en sistemas complejos y escalables?

- Divide el sistema en **Bounded Contexts** claros.
- Promueve **modelos consistentes y enfocados**.
- Reduce el **acoplamiento**.
- Facilita la **escalabilidad** y el mantenimiento del sistema.

---

## 10. ¿Cómo se puede combinar DDD con Clean Architecture en una aplicación de microservicios?

- Usando **Bounded Contexts** como base para microservicios.
- Aplicando **Entidades y Agregados** en la capa de dominio.
- Definiendo **interfaces de repositorio** que se implementan en infraestructura.
- Empleando **Eventos de Dominio** para comunicación entre microservicios desacoplados.

---
