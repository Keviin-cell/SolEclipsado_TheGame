# ☀️ El Sol Eclipsado – Mini Proyecto #1

Un juego desarrollado en **Java + JavaFX** en el que el jugador debe adivinar una **palabra secreta** antes de que el sol se eclipse completamente. Cada error provoca que el sol se oculte un **20%**, representando las oportunidades restantes.

El objetivo es completar correctamente la palabra antes de que el eclipse sea total.

---

## 🎯 Descripción
El juego comienza cuando el usuario ingresa una **palabra secreta válida**. A partir de ese momento se generan automáticamente **campos de texto**, uno por cada letra de la palabra.

El jugador debe completar la palabra ingresando letras en los campos correspondientes.

El juego incluye:

- **5 oportunidades** antes de que el sol se eclipse completamente.
- **3 ayudas disponibles** que revelan automáticamente una letra faltante.
- Una **representación visual del eclipse solar** que indica los errores cometidos.

El juego finaliza cuando:

- El jugador completa correctamente la palabra (**victoria**).
- El sol se eclipsa completamente después de **5 errores** (**derrota**).

---

## 🛠️ Tecnologías y herramientas
- **Lenguaje:** Java SE 17+
- **Librería gráfica:** JavaFX
- **Diseño de interfaz:** Scene Builder (FXML)
- **IDE:** IntelliJ IDEA
- **Arquitectura:** MVC (Modelo – Vista – Controlador)
- **Control de versiones:** Git + GitHub
- **Documentación:** Javadoc

---

## 📌 Objetivo general
Desarrollar el juego **“El Sol Eclipsado”** implementando una interfaz gráfica funcional e intuitiva con **Java y JavaFX**, aplicando principios de **UX/UI** y fundamentos de **programación orientada a eventos**.

---

## ✅ Objetivos específicos
- Diseñar una interfaz gráfica atractiva y alineada a principios de **usabilidad**.
- Implementar **eventos de teclado y mouse** para la interacción con el juego.
- Aplicar una arquitectura **Modelo–Vista–Controlador (MVC)** para separar la lógica del juego y la interfaz gráfica.
- Implementar **interfaces, clases internas y clases adaptadoras**.
- Incorporar una **opción de ayuda limitada** que revele letras de la palabra.
- Mostrar visualmente el progreso del **eclipse del sol** según los errores del jugador.
- Documentar el código fuente utilizando **Javadoc**.

---

## 📚 Historias de usuario
- **HU-1:** Ingreso de la palabra secreta y validación de formato (6–12 letras, sin espacios, solo letras del español).
- **HU-2:** Generación de campos de texto para cada letra de la palabra secreta.
- **HU-3:** Implementación de una opción de ayuda limitada a **3 usos**.
- **HU-4:** Visualización del progreso del **eclipse del sol** según los errores del jugador.

---

## 🚀 Cómo ejecutar el proyecto
1. **Clonar** el repositorio:
   ```bash
   git clone https://github.com/Keviin-cell/SolEclipsado_TheGame.git
   ```
2. **Abrir el proyecto** en IntelliJ IDEA (o tu IDE preferido).
3. **Configurar JavaFX** en el IDE (SDK/lib en el module path; si usas Maven, asegúrate de tener las dependencias o plugin de JavaFX).
4. **Ejecutar la clase** `Main`.

> **Nota:** Si usas Maven con el plugin de JavaFX, también puedes correr con `mvn javafx:run`.

---

## 📂 Estructura del proyecto
```
src/main/java/org/example/
  model/ # Clases de lógica del juego 
  controller/ # Controladores FXML (manejo de eventos y comunicación con la vista)
  Main.java # Clase principal, punto de entrada de la aplicación

src/main/resources/
  fonts/ # Fuentes personalizadas (ej. RussoOne-Regular.ttf)
  fxml/ # Interfaces gráficas en FXML (menú, pantallas del juego)
  styles/ # Hojas de estilo CSS
  images/ # Recursos gráficos e imágenes de fondo
```

---

## 🛣️ Roadmap
- [ ] Pantalla inicial para ingresar la palabra secreta.
- [ ] Generación dinámica de campos de letras.
- [ ] Validación de letras ingresadas.
- [ ] Implementación de ayudas limitadas.
- [ ] Visualización del eclipse del sol.
- [ ] Pantalla final de victoria o derrota.
- [ ] Documentación completa con Javadoc.

---

## 👨‍💻 Autores
Proyecto realizado por **dos estudiantes** como parte de la asignatura  
*Fundamentos de Programación Orientada a Eventos*.

Tecnologías utilizadas: **Java, JavaFX, Scene Builder e IntelliJ IDEA**.
