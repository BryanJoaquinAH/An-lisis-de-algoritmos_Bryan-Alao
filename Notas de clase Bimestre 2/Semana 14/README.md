# Semana 14: Algoritmos Probabilistas y Tiempo Esperado

> Introducimos una nueva clase de algoritmos que **incorporan aleatoriedad** en su lógica para ganar eficiencia o simplicidad.

---

## Conceptos Importantes

### Algoritmos Probabilistas

#### Característica Fundamental

> Un algoritmo probabilista puede comportarse de forma **distinta en diferentes ejecuciones**, incluso con los **mismos datos de entrada**, debido a que **toma decisiones aleatorias**.

### Ejemplo - Fábula del Tesoro

> A veces es mejor tomar una **decisión al azar** (por ejemplo, lanzar una moneda para ir a A o B) que invertir tiempo en determinar la opción óptima.  
> El **beneficio esperado** puede ser **mejor con la aleatoriedad**.


### Contraste con Algoritmos Deterministas

A diferencia de los algoritmos deterministas:

- A los algoritmos **probabilistas** se les **puede permitir fallar** o dar una **respuesta incorrecta**.
- Siempre que la **probabilidad de error sea muy pequeña**, el algoritmo sigue siendo útil.


## ⏱️ Tiempo Esperado vs. Tiempo Promedio

### Tiempo Promedio

> Tiempo medio de un algoritmo **determinista** sobre **todas las posibles entradas** de un mismo tamaño.  
> La **variabilidad está en la entrada**.

### Tiempo Esperado

> Tiempo medio de un algoritmo **probabilista** sobre **una entrada fija**.  
> El **promedio se toma sobre todas las decisiones aleatorias** que el algoritmo puede hacer.  
> La **variabilidad está en el comportamiento interno del algoritmo**.


## Algoritmos Numéricos: Generación de Números Pseudoaleatorios

Los algoritmos probabilistas necesitan una fuente de aleatoriedad.  
En la práctica, se usan **generadores de números pseudoaleatorios**.

### Definición

> Valores generados por **algoritmos deterministas** que simulan tener **propiedades estadísticas** similares a los números aleatorios verdaderos.


### Método del Generador Lineal Congruencial

Uno de los métodos **más comunes** para generar secuencias de números pseudoaleatorios.

#### Fórmula

```math
X_{n+1} = (aX_n + c) \mod m
```

### Parámetros
- Xₙ: Valor actual de la secuencia (o semilla inicial X₀)

- a: Multiplicador
- c: Incremento
- m: Módulo

La elección de estas constantes es crucial para la calidad de los números generados.
