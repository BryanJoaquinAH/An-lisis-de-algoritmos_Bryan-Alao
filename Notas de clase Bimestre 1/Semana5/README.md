
# 🗓️ Semana 05 – Notación Theta (Θ) y Asintótica Condicional

## 📘 Temas tratados
- [Notación Theta (Θ)](#notación-theta-θ)
- [Ejemplos de notación Θ](#ejemplos-de-notación-theta)
- [Notación Asintótica Condicional](#notación-asintótica-condicional)

---

## 🔁 Notación Theta (Θ)

La **notación Θ (Theta)** se utiliza para describir la eficiencia asintótica **exacta** de un algoritmo. A diferencia de Big O (`O`), que solo indica un **límite superior**, o de Big Omega (`Ω`), que marca un **límite inferior**, la notación Θ establece **ambos límites simultáneamente**.

📌 Es decir, si un algoritmo está en `Θ(g(n))`, entonces:
- No crece **más rápido** que `g(n)`.
- Tampoco crece **más lento** que `g(n)`.

> Esto significa que su tiempo de ejecución es **proporcional** a `g(n)` en el peor y mejor caso.

---

## 📊 Ejemplos de Notación Theta

| Notación       | Descripción                        | Ejemplo común |
|----------------|------------------------------------|---------------|
| `Θ(1)`         | Tiempo constante                   | Acceder a un valor en un array por índice. |
| `Θ(n)`         | Tiempo lineal                      | Recorrer una lista completa. |
| `Θ(n log n)`   | Tiempo lineal-logarítmico          | Merge Sort, Heap Sort. |
| `Θ(n²)`        | Tiempo cuadrático                  | Bubble Sort (peor caso). |

Estas notaciones representan situaciones donde la función de complejidad **se ajusta perfectamente** a la realidad del algoritmo.

---

## 🎯 Notación Asintótica Condicional

La **notación asintótica condicional** analiza cómo se comporta un algoritmo **bajo ciertas condiciones especiales** sobre la entrada. Este enfoque es útil para entender el rendimiento **en contextos del mundo real**, donde los datos no siempre siguen los patrones del caso peor.

📌 **Ejemplo:**
- Un algoritmo de ordenamiento puede tener `O(n²)` en el peor caso general...
- Pero si la entrada está **casi ordenada**, su comportamiento puede reducirse a `O(n)`.

### ✨ Beneficios del análisis condicional:
- Refleja mejor la realidad práctica.
- Permite adaptar algoritmos a contextos específicos.
- Informa decisiones cuando el caso promedio es más relevante que el peor.

### 🔍 ¿Cuándo usarlo?
- Cuando conoces **características particulares** de la entrada (como no repetición, orden parcial, tamaño limitado).
- Cuando los algoritmos son **sensibles al patrón de entrada** (como Quick Sort).

---

## ✅ Conclusiones

- La notación `Θ(g(n))` da una **medida exacta** del crecimiento de un algoritmo.
- Es la **más precisa** de las tres notaciones (O, Ω, Θ).
- La notación asintótica condicional nos permite analizar algoritmos **más allá de lo teórico**, bajo condiciones reales de uso.

---

## 🧠 Reflexión

> Comprender Θ y su relación con O y Ω te permite evaluar la **eficiencia total** de un algoritmo.
> La notación condicional es clave para diseñar software **más eficiente en la práctica**, no solo en teoría.

---

## 📎 Recursos útiles
- [Visualización de notación Big O y Θ](https://www.bigocheatsheet.com/)
- [CS50 - Notaciones asintóticas](https://cs50.harvard.edu/x/2023/notes/5/)
- [Artículo: "Understanding Theta Notation"](https://www.geeksforgeeks.org/theta-notation-asymptotic-notation/)

---

