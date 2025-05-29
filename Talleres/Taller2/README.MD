# Análisis de Complejidad Asintótica con Comentarios

---

## 1. Comprobaciones de notación Big-O  

### Caso 1: Verificar si \( f(n) \in O(n^2 \log n) \)

Dadas las funciones:

$$
f(n) = n^3 + 9n^2 \log n
\qquad \text{y} \qquad
g(n) = n^2 \log n
$$

Para determinar si \( f(n) \in O(g(n)) \), calculamos el cociente:

$$
\frac{f(n)}{g(n)} = \frac{n^3 + 9n^2 \log n}{n^2 \log n}
$$

**Paso 1: Separar términos del numerador:**

$$
= \frac{n^3}{n^2 \log n} + \frac{9n^2 \log n}{n^2 \log n}
$$

**Paso 2: Simplificar cada parte:**

$$
= \frac{n}{\log n} + 9
$$

**Paso 3: Aplicar el límite para analizar el comportamiento asintótico:**

$$
\lim_{n \to \infty} \left( \frac{n}{\log n} + 9 \right) = \infty
$$

> Como el límite tiende a infinito, **no** existe una constante \( c \) tal que \( f(n) \leq c \cdot g(n) \), por tanto:

$$
f(n) \notin O(n^2 \log n)
$$


### Caso 2: Verificar si \( f(n) \in O(n^2) \)

Usamos:

$$
f(n) = n^3 + 9n^2 \log n
\qquad \text{y} \qquad
h(n) = n^2
$$

**Paso 1: Calcular el cociente:**

$$
\frac{f(n)}{h(n)} = \frac{n^3 + 9n^2 \log n}{n^2}
$$

**Paso 2: Separar términos:**

$$
= \frac{n^3}{n^2} + \frac{9n^2 \log n}{n^2}
$$

**Paso 3: Simplificar:**

$$
= n + 9 \log n
$$

**Paso 4: Analizar el comportamiento asintótico:**

$$
\lim_{n \to \infty} (n + 9 \log n) = \infty
$$

> Nuevamente, el límite tiende a infinito, por lo que:

$$
f(n) \notin O(n^2)
$$


## 2. Comparación de funciones exponenciales  

Dadas:

$$
f(n) = 2^n, \quad g(n) = 2^{2n} = 4^n
$$

### Verificar si \( f(n) \in O(g(n)) \)

**Paso 1: Cociente:**

$$
\frac{f(n)}{g(n)} = \frac{2^n}{2^{2n}} = 2^{-n}
$$

**Paso 2: Aplicar el límite:**

$$
\lim_{n \to \infty} 2^{-n} = 0
$$

> Como el límite tiende a 0, entonces sí existe una constante que acote a \( f(n) \) por \( g(n) \), por tanto:

$$
f(n) \in O(2^{2n})
$$


### Verificar si \( g(n) \in O(f(n)) \)

**Paso 1: Cociente inverso:**

$$
\frac{g(n)}{f(n)} = \frac{2^{2n}}{2^n} = 2^n
$$

**Paso 2: Aplicar el límite:**

$$
\lim_{n \to \infty} 2^n = \infty
$$

> Como el límite tiende a infinito, **no** existe una constante que acote a \( g(n) \) por \( f(n) \), entonces:

$$
2^{2n} \notin O(2^n)
$$


## Conclusiones
$$
f(n)=n^{3}+9\,n^{2}\log n\;\notin\;O\!\bigl(n^{2}\log n\bigr)
$$  

$$
f(n)\;\notin\;O\!\bigl(n^{2}\bigr)
$$  

$$
2^{\,n}\;\in\;O\!\bigl(2^{\,2n}\bigr)
$$  

$$
2^{\,2n}\;\notin\;O\!\bigl(2^{\,n}\bigr)
$$
