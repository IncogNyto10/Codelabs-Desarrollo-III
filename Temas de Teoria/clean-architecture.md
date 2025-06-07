# Clean Architecture

## 1. ¿Qué problema busca resolver Clean Architecture en el desarrollo de software?

Busca crear sistemas **mantenibles**, **escalables** y **desacoplados**, separando la lógica de negocio de la infraestructura.

---

## 2. ¿Cuáles son las principales capas de Clean Architecture y qué responsabilidad tiene cada una?

1. **Entidad (Domain):** Define las reglas de negocio.
2. **Casos de uso (Application):** Contiene la lógica de aplicación.
3. **Adaptadores (Interface Adapters):** Implementa controladores, presentadores y repositorios.
4. **Infraestructura (Frameworks & Drivers):** Contiene frameworks, bases de datos y detalles técnicos.

---

## 3. ¿Qué relación tiene Clean Architecture con el principio de Inversión de Dependencias (DIP) en SOLID?

Las dependencias **apuntan hacia el dominio**, evitando acoplamiento con infraestructura, aplicando el **DIP** al depender de abstracciones.

---

## 4. ¿Por qué es importante desacoplar la lógica de negocio de la infraestructura en una aplicación?

Permite:

- Mayor **flexibilidad**.
- Facilidad para realizar **pruebas unitarias**.
- Evitar dependencias rígidas en frameworks o bases de datos.

---

## 5. ¿Cómo Clean Architecture facilita la escalabilidad y mantenibilidad de un sistema?

Al separar la lógica de negocio de la infraestructura, permite:

- Modificar componentes sin afectar otras partes del sistema.
- Evolucionar la arquitectura de manera controlada y segura.

---

## 6. ¿Qué diferencia hay entre la capa de dominio y la capa de aplicación en Clean Architecture?

- **Dominio:** Reglas de negocio puras e independientes.
- **Aplicación:** Casos de uso que orquestan la lógica de negocio e interactúan con la infraestructura mediante interfaces.

---

## 7. ¿Por qué los controladores (controllers) y la base de datos deben estar en la capa de infraestructura?

Porque **dependen de frameworks externos**, y Clean Architecture busca mantener la lógica de negocio **independiente de herramientas técnicas**.

---

## 8. ¿Qué ventajas tiene usar una interfaz en la capa de dominio para definir repositorios en lugar de usar directamente `JpaRepository`?

- **Desacopla** la lógica de negocio de la persistencia.
- Permite **cambiar la tecnología de base de datos** sin afectar el dominio.
- Facilita la **implementación de pruebas unitarias** usando mocks o fakes.

---

## 9. ¿Cómo interactúan los casos de uso (UseCases) con las entidades de dominio en Clean Architecture?

Los **casos de uso** contienen la lógica de aplicación y **manipulan las entidades del dominio** directamente, sin depender de detalles técnicos.

---

## 10. ¿Cómo se puede aplicar Clean Architecture en una aplicación de microservicios con Spring Boot?

- Definiendo **capas claras** de dominio, aplicación e infrae
