
# 📘 Análisis de Algoritmos - Notas de Clase
## SEMANA 1:
**ALGORITMICA ELEMENTAL:**
* La algorítmica elemental es el estudio y diseño de algoritmos básicos que resuelven problemas simples o fundamentales. Se centra en cómo construir pasos lógicos y ordenados para alcanzar una solución, usando estructuras y herramientas básicas que forman la base del pensamiento computacional.

### **ELEMENTOS DE LA ALGORITMICA ELEMENTAL**
   1. Tipos de datos básicos: números, caracteres, booleanos.
   2. Operaciones básicas: suma, resta, comparación, asignación.

   3. Estructuras de control:
      * Secuenciales: pasos uno tras otro.
      * Condicionales: if, else, decisiones según condiciones.
      * Repetitivas: bucles como for, while.

   4. Entradas y salidas:
      * Leer datos del usuario o de un archivo.
      * Mostrar resultados.

   5. Diseño de algoritmos:
      * Pseudocódigo.
      * Diagramas de flujo.

### **ALGORITMOS DE MULTIPLICACION**
#### 1. Multiplicación Americana
   * También conocida como la multiplicación estándar o tradicional, es el método más común que se enseña en América Latina y EE.UU. desde la escuela primaria.

```MathJax
    123
  ×  45
  ------
    615     ← 123 × 5
 + 4920     ← 123 × 40
  ------
   5535
```
#### 2. Multiplicación Inglesa
   * Este método también se llama a veces multiplicación por factorización o algoritmo extendido inglés. Es una variante del método tradicional, pero más desglosado, usado para enseñar comprensión del proceso

```LaTex
23 × 14 = (20 + 3) × (10 + 4)

= 20×10 + 20×4 + 3×10 + 3×4
= 200 + 80 + 30 + 12
= 322
```
#### 3. Multiplicación Rusa (a la russe)
   * También llamada método del campesino ruso o multiplicación egipcia. Es un algoritmo curioso e histórico, basado en duplicar y dividir.

```LaTex
        18   25
         9   50     ← impar → se suma
         4  100     ← par → se descarta
         2  200     ← par → se descarta
         1  400     ← impar → se suma
      -----------------
Total = 50 + 400 = 450
```
## Semana 2

## 🧮 Inducción aritmética


1+2+3+4+...n = n(n+1) / 2

Se aplica en numeros naturales

Tres pasos:

### 🔹 Paso 1: Caso base

n=1   =>  1(1+1) / 2 =1

### 🔹 Paso 2: Hipótesis de inducción

Suponer que se cumple n=k

1+2+3+4.....k=k(k+1) / 2

### 🔹 Paso 3: Paso inductivo

n= k+1
1+2+3+4+...k+()k+1=k(k+1)/2 + (k+1)

Ejercicios en clase:

Algoritmo que determina si un número `n` **no es primo** usando un ciclo `while`:

```java
i = 2
while (i <= n / 2) {
    if (n % i == 0) {
        println("No es primo")
        break
    } else {
        i++
    }
}
```
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


