# Semana 13: Aplicaciones de Divide y Vencerás

> **Divide y Vencerás** es una técnica fundamental en la ciencia de la computación, que se aplica eficazmente a problemas como la **búsqueda de la mediana** y la **multiplicación de matrices**. En esta semana analizamos sus aplicaciones prácticas.


## Búsqueda de la Mediana

> _"Quickselect"_ es una variación del algoritmo Quicksort que permite encontrar el k-ésimo elemento más pequeño **sin ordenar toda la lista**.

### Estrategia

1. Se elige un **pivote** y se **particiona** el arreglo.
2. Tras la partición, el pivote queda en su **posición final** `p`.
3. Si `p == k`, hemos encontrado el elemento.
4. Si `k < p`, se busca recursivamente **en la sublista izquierda**.
5. Si `k > p`, se busca recursivamente **en la sublista derecha**.

### Eficiencia

> Este método reduce el espacio de búsqueda en cada paso, siendo **más eficiente** que ordenar completamente la lista.

---

## Multiplicación de Matrices

### Algoritmo Clásico

- Utiliza tres bucles anidados para multiplicar dos matrices de `n x n`.
- Su **complejidad** es `Θ(n³)`.

```python
# Ejemplo clásico de multiplicación de matrices
for i in range(n):
    for j in range(n):
        for k in range(n):
            C[i][j] += A[i][k] * B[k][j]
```

## Algoritmo de Strassen

Un enfoque de **Divide y Vencerás** que **reduce el número de multiplicaciones necesarias**.

---

### Estrategia

Divide cada matriz de `n x n` en **cuatro submatrices** de `n/2 x n/2`.

Realiza **7 multiplicaciones recursivas** y varias **sumas/restas** de submatrices.

---

### Complejidad

La complejidad del algoritmo de Strassen es:

```math
Θ(n^{\log_2 7}) ≈ Θ(n^{2.81})
```

Esto lo hace significativamente más rápido que el método clásico para matrices grandes.

🧾 Fórmulas de Strassen
El algoritmo calcula 7 productos intermedios (M₁ a M₇) y luego los combina para obtener la matriz resultante C.

### Cálculos intermedios
```texto
M₁ := (A₁₁ + A₂₂)(B₁₁ + B₂₂)
M₂ := (A₂₁ + A₂₂)(B₁₁)
M₃ := (A₁₁)(B₁₂ - B₂₂)
M₄ := (A₂₂)(B₂₁ - B₁₁)
M₅ := (A₁₁ + A₁₂)(B₂₂)
M₆ := (A₂₁ - A₁₁)(B₁₁ + B₁₂)
M₇ := (A₁₂ - A₂₂)(B₂₁ + B₂₂)
```
### Combinación para formar C
```texto
C₁₁ := M₁ + M₄ - M₅ + M₇  
C₁₂ := M₃ + M₅  
C₂₁ := M₂ + M₄  
C₂₂ := M₁ - M₂ + M₃ + M₆
```
