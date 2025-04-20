
# 📘 Análisis de Algoritmos - Notas de Clase
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
