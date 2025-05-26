
# 📘 Análisis de Algoritmos - Notas de Clase
# ✅ Análisis Asintótico de Funciones

## 1. Comprobar si f(n) = n^3 + 9n^2 * log(n) pertenece a O(g(n)), donde g(n) = n^2 * log(n)

### Paso 1.1: Analizar los términos dominantes

Observamos los términos de f(n):

f(n) = n^3 + 9n^2 * log(n)

El término dominante es n^3, ya que:

lim (n → ∞) de [9n^2 * log(n)] / n^3 = lim (n → ∞) de [9 * log(n)] / n = 0

Entonces:

f(n) ≈ n^3 cuando n → ∞

### Paso 1.2: Comparar con g(n) = n^2 * log(n)

Calculamos el cociente:

lim (n → ∞) de f(n)/g(n) = (n^3 + 9n^2 * log(n)) / (n^2 * log(n))
= [n / log(n)] + 9 → ∞

### ✅ Conclusión 1:

Como el cociente tiende a infinito:

**f(n) no pertenece a O(g(n))**

---

## 2. Comprobar si f(n) no pertenece a O(n^2)

### Paso 2.1: Comparar f(n) ≈ n^3 con n^2

lim (n → ∞) de f(n) / n^2 = (n^3 + 9n^2 * log(n)) / n^2 = n + 9 * log(n) → ∞

### ✅ Conclusión 2:

**f(n) no pertenece a O(n^2)** porque crece más rápido que n^2.

---

## 3. Comparación entre funciones exponenciales

Dado:

- f(n) = 2^n  
- g(n) = 2^(2n) = (2^n)^2

### Paso 3.1: Comprobar si f(n) pertenece a O(g(n))

lim (n → ∞) de f(n)/g(n) = 2^n / 2^(2n) = 1 / 2^n → 0

### ✅ Conclusión 3.1:

**f(n) pertenece a o(g(n))**, por lo tanto:

**f(n) pertenece a O(g(n))**

---

### Paso 3.2: Comprobar si g(n) pertenece a O(f(n))

lim (n → ∞) de g(n)/f(n) = 2^(2n) / 2^n = 2^n → ∞

### ❌ Conclusión 3.2:

**g(n) no pertenece a O(f(n))**

---


