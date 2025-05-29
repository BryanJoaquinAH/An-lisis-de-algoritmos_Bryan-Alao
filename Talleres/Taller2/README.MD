# Análisis de Complejidad Asintótica

## 1. Comprobaciones de notación Big-O

**Funciones dadas:**

- \( f(n) = n^3 + 9n^2\log(n) \)
- \( g(n) = n^2 \log(n) \)

### Comprobar si \( f(n) \in O(g(n)) \)

Para que \( f(n) \in O(g(n)) \), debe existir una constante \( c > 0 \) y un \( n_0 \) tal que:

$$
f(n) \leq c \cdot g(n) \quad \text{para todo } n \geq n_0
$$

Comparamos asintóticamente:

- \( f(n) = n^3 + 9n^2 \log(n) \)
- \( g(n) = n^2 \log(n) \)

Dividimos:

$$
\frac{f(n)}{g(n)} = \frac{n^3 + 9n^2 \log(n)}{n^2 \log(n)} = \frac{n^3}{n^2 \log(n)} + \frac{9n^2 \log(n)}{n^2 \log(n)} = \frac{n}{\log(n)} + 9
$$

Como:

$$
\lim_{n \to \infty} \left( \frac{n}{\log(n)} + 9 \right) = \infty
$$

Entonces:

> **No se cumple** que \( f(n) \in O(g(n)) \)



### ❌ Comprobar si \( f(n) \notin O(n^2) \)

Supongamos que sí pertenece:

- \( f(n) = n^3 + 9n^2\log(n) \)
- \( h(n) = n^2 \)

Comparamos:

$$
\frac{f(n)}{n^2} = \frac{n^3 + 9n^2\log(n)}{n^2} = n + 9\log(n)
$$

Y:

$$
\lim_{n \to \infty} \left(n + 9\log(n)\right) = \infty
$$

Por lo tanto:

> Se confirma que \( f(n) \notin O(n^2) \)

---

## 2. Relación entre funciones exponenciales

### Funciones:

- \( f(n) = 2^n \)
- \( g(n) = 2^{2n} = (2^n)^2 \)

### Comprobar si \( f(n) \in O(g(n)) \)

Dividimos:

$$
\frac{f(n)}{g(n)} = \frac{2^n}{2^{2n}} = 2^{-n}
$$

Y:

$$
\lim_{n \to \infty} 2^{-n} = 0
$$

Por definición:

> \( f(n) \in O(g(n)) \)

---

### Comprobar si \( g(n) \in O(f(n)) \)

Dividimos:

$$
\frac{g(n)}{f(n)} = \frac{2^{2n}}{2^n} = 2^n
$$

Y:

$$
\lim_{n \to \infty} 2^n = \infty
$$

Por lo tanto:

> **No se cumple** que \( g(n) \in O(f(n)) \)

---

## 📌 Conclusión

- \( f(n) = n^3 + 9n^2 \log(n) \notin O(n^2 \log(n)) \)
- \( f(n) \notin O(n^2) \)
- \( f(n) = 2^n \in O(2^{2n}) \), pero \( 2^{2n} \notin O(2^n) \)
