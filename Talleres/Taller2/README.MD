# Análisis de Complejidad Asintótica

## 1. Comprobaciones de notación Big-O  

### Caso 1  

$$
f(n) \;=\; n^{3}\;+\;9\,n^{2}\log n
$$  

$$
g(n) \;=\; n^{2}\log n
$$  

Cociente:

$$
\frac{f(n)}{g(n)}
= \frac{\,n^{3}+9\,n^{2}\log n\,}{\,n^{2}\log n\,}
= \frac{n}{\log n}+9
$$  

Límite:

$$
\lim_{n\to\infty}\!\left(\frac{n}{\log n}+9\right)=\infty
$$  

Por lo tanto  

$$
f(n)\;\notin\;O\!\bigl(n^{2}\log n\bigr)
$$  


### Caso 2  

$$
h(n)\;=\;n^{2}
$$  

$$
\frac{f(n)}{h(n)}
= \frac{\,n^{3}+9\,n^{2}\log n\,}{\,n^{2}\,}
= n+9\log n
$$  

$$
\lim_{n\to\infty}\!\bigl(n+9\log n\bigr)=\infty
$$  

Así  

$$
f(n)\;\notin\;O\!\bigl(n^{2}\bigr)
$$  


## 2. Funciones exponenciales  

$$
f(n)=2^{\,n},
\qquad
g(n)=2^{\,2n}=4^{\,n}
$$  

Cociente:

$$
\frac{f(n)}{g(n)}
= \frac{2^{\,n}}{2^{\,2n}}
= 2^{-n}
$$  

$$
\lim_{n\to\infty}2^{-n}=0
$$  

Luego  

$$
2^{\,n}\;\in\;O\!\bigl(2^{\,2n}\bigr)
$$  


Para el inverso:

$$
\frac{g(n)}{f(n)}
= \frac{2^{\,2n}}{2^{\,n}}
= 2^{\,n}
$$  

$$
\lim_{n\to\infty}2^{\,n}=\infty
$$  

Por consiguiente  

$$
2^{\,2n}\;\notin\;O\!\bigl(2^{\,n}\bigr)
$$  


## Conclusión  

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
