 🗓️ Semana 04 – Profundización en Notación Asintótica y Big O

## 📘 Temas tratados
- [Notación Asintótica](#notación-asintótica)
- [Notación Big O – "El Orden de"](#notación-big-o---el-orden-de)
- [Ejemplos comunes de complejidad](#ejemplos-comunes-de-notación-big-o)

---

## 🔍 Notación Asintótica

La notación asintótica es una herramienta matemática que permite describir el comportamiento de un algoritmo **cuando el tamaño de la entrada tiende a infinito**. Es decir, se enfoca en analizar cómo crece el **tiempo de ejecución** o el **uso de memoria** sin importar detalles específicos del hardware o implementación.

🔧 Su objetivo principal es:
- Comparar algoritmos de forma abstracta.
- Determinar su escalabilidad.
- Establecer un lenguaje común para analizar eficiencia.

---

## 🧮 Notación Big O – "El Orden de"

La notación Big O (`O`) es la más utilizada en algoritmos. Representa una **cota superior** del crecimiento del algoritmo, indicando el **peor caso posible**.

📌 **Se usa para responder a preguntas como:**
- ¿Qué tan rápido crece el tiempo de ejecución?
- ¿Cuánto afecta un aumento en el tamaño de entrada?
- ¿Qué algoritmo es más eficiente para entradas grandes?

> Formalmente, si `f(n) ∈ O(g(n))`, entonces `f(n)` crece como máximo tan rápido como `g(n)`, hasta una constante multiplicativa.

---

## 📊 Ejemplos comunes de notación Big O

A continuación, se muestran ejemplos representativos de complejidad algorítmica:

| Notación      | Nombre             | Descripción                                                                                                                                     | Ejemplo común                          |
|---------------|--------------------|-------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------|
| `O(1)`        | Tiempo constante   | El algoritmo tarda lo mismo, sin importar el tamaño de la entrada.                                                                              | Acceso a un elemento por índice en un array. |
| `O(log n)`    | Tiempo logarítmico | Aumenta lentamente al crecer la entrada. Común en algoritmos que dividen el problema (divide y vencerás).                                       | Búsqueda binaria.                      |
| `O(n)`        | Tiempo lineal      | El tiempo de ejecución crece proporcionalmente al tamaño de la entrada.                                                                         | Recorrer un arreglo completo.         |
| `O(n log n)`  | Tiempo lineal-logarítmico | Muy eficiente. Combina división y procesamiento lineal.                                                                                          | Merge Sort, Quick Sort.               |
| `O(n²)`       | Tiempo cuadrático  | Crece rápidamente, común en bucles anidados.                                                                                                    | Bubble Sort, búsqueda de pares.       |
| `O(2ⁿ)`       | Tiempo exponencial | Crece extremadamente rápido. Utilizado en problemas complejos como combinatoria o recursión sin optimización.                                  | Torres de Hanoi, Problema del viajante.|

---

## 📌 Conclusión

- La notación Big O ayuda a comprender **cómo escalan los algoritmos**.
- Elegir un algoritmo con mejor complejidad puede reducir el tiempo de ejecución **drásticamente**, especialmente con entradas grandes.
- Comprender las **categorías de complejidad** es clave para tomar decisiones de diseño en algoritmos y estructuras de datos.

---

## 🎯 Recomendaciones
- Utiliza `O(n log n)` como objetivo para algoritmos de ordenamiento.
- Evita algoritmos `O(n²)` o `O(2ⁿ)` en producción si existen alternativas más eficientes.
- No olvides que la notación asintótica **no mide casos pequeños**, sino el crecimiento a largo plazo.

---

## 📎 Recursos adicionales
- [Big O Cheat Sheet](https://www.bigocheatsheet.com/)
- [YouTube - Notación Big O explicada](https://www.youtube.com/watch?v=__vX2sjlpXU)
- [CS50 - Notation and Growth](https://cs50.harvard.edu/x/2023/notes/5/)

---

