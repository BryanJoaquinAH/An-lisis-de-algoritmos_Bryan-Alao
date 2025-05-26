# 🗓️ Semana 06 – Notación Theta, Análisis Condicional y Estructuras de Control

## 📘 Temas tratados
- Notación Theta (Θ)
- Ejemplos de Notación Theta
- Notación Asintótica Condicional
- Análisis de las estructuras de control
  - Secuencias
  - Bucles Para
  - Bucles Mientras
  - Bucles Repetir

---

## 🔁 Notación Theta (Θ)

La Notación Theta (Θ) se utiliza para describir un **límite ajustado (tight bound)** en el crecimiento del tiempo de ejecución o del uso de recursos de un algoritmo.

A diferencia de:
- `O`: que proporciona solo una **cota superior**,
- `Ω`: que da una **cota inferior**,

La notación `Θ` **combina ambas**. Esto significa que el crecimiento del algoritmo es **exactamente proporcional** a una función dada.

Es la notación más precisa para describir la eficiencia asintótica de un algoritmo, ya que define tanto su comportamiento mínimo como máximo.

---

## 📊 Ejemplos de Notación Theta

| Notación     | Descripción                                                                 | Ejemplo                                           |
|--------------|------------------------------------------------------------------------------|---------------------------------------------------|
| Θ(1)         | Tiempo constante. El tiempo no depende del tamaño de la entrada.            | Acceso a un elemento por índice en un arreglo.    |
| Θ(n)         | Tiempo lineal. El tiempo crece proporcional al tamaño de entrada.           | Recorrer una lista completa.                      |
| Θ(n log n)   | Tiempo lineal-logarítmico. Muy eficiente para algoritmos de ordenamiento.   | Merge Sort, Heap Sort.                            |
| Θ(n²)        | Tiempo cuadrático. Crece mucho más rápido con entradas grandes.             | Bubble Sort en el peor caso.                      |

---

## ⚠️ Notación Asintótica Condicional

La **notación asintótica condicional** analiza el comportamiento de un algoritmo **bajo ciertas condiciones o restricciones en la entrada**.

A diferencia de las notaciones generales (`O`, `Ω`, `Θ`) que se aplican al comportamiento global, este análisis se enfoca en **casos particulares** que afectan la complejidad temporal o espacial.

**Ejemplo:**
Un algoritmo con comportamiento `O(n²)` en el caso general puede comportarse como `O(n)` si:
- La entrada ya está casi ordenada.
- Los valores no se repiten.

Este tipo de análisis permite una evaluación **más específica y realista** del rendimiento del algoritmo.

---

## 🔍 Análisis de las Estructuras de Control

El análisis de algoritmos se lleva a cabo evaluando el tiempo de ejecución de:
1. Instrucciones individuales (generalmente con tiempo constante).
2. Combinaciones de instrucciones, de acuerdo con las **estructuras de control** del programa.

Algunas estructuras son **fáciles de analizar**, como las secuencias. Otras, como los bucles o condicionales, requieren un análisis más detallado.

---

### 🔗 Secuencias

Cuando las instrucciones se ejecutan una después de otra (en secuencia), el tiempo total se **suma**.

**Fórmula:**

> Si una instrucción toma tiempo `T₁` y la siguiente `T₂`, entonces:  
> **Tiempo total = T₁ + T₂**

---

### 🔁 Bucles Para (For)

El tiempo de ejecución de un bucle `para` depende de:
- El número de iteraciones.
- El tiempo que toma cada iteración.

**Ejemplo:**

```pseudo
para i ← 1 hasta m hacer
    p(i)
```

Si p(i) tarda C, entonces:

Tiempo total = m × C
Complejidad: Θ(m)
🔁 Bucles Mientras (While)
Los bucles mientras ejecutan un bloque de código mientras una condición sea verdadera. La condición se evalúa antes de cada iteración.

Ejemplo:
```pseudo
i ← 1
mientras i ≤ m hacer
    p(i)
    i ← i + 1
```

Si la condición es falsa desde el inicio, el bloque no se ejecuta.
Complejidad: depende del número de veces que se cumpla la condición.
## 🔁 Bucles Repetir (Repeat-Until)
Los bucles repetir (o repeat-until) garantizan al menos una ejecución del bloque. La condición se evalúa después de cada iteración.

Ejemplo:
```
i ← 0
repetir
    escribir("Iteración ", i)
    i ← i + 1
hasta que (i ≥ 5)
```
Ejecuta el bloque exactamente 5 veces (para i = 0, 1, 2, 3, 4).
Complejidad: Θ(n) donde n es la cantidad de iteraciones.
## ✅ Conclusión

La notación Θ permite describir el crecimiento exacto de un algoritmo.
El análisis condicional mejora nuestra comprensión del rendimiento en contextos reales o particulares.
Las estructuras de control como secuencias y bucles afectan directamente la eficiencia de los algoritmos, y su análisis permite estimar la complejidad total del programa.
## 📎 Recursos adicionales

Big O Notation Explained Visually
Notación Asintótica – GeeksforGeeks
CS50 Notes – Week 5
