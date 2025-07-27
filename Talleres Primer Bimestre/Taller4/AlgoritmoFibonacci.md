
# TALLER 4

## 1. Codificar el algoritmo de Fibonacci

El algoritmo clásico de Fibonacci se define recursivamente como:

```Java
public class FibonacciRecursivo {

    // Método recursivo de Fibonacci
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10; // Calcular los primeros 10 términos
        System.out.println("Serie de Fibonacci hasta F(" + n + "):");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}

```

## 2. Identificar las recurrencias

La función recursiva anterior genera la siguiente relación de recurrencia:

$$
F(n)=F(n−1)+F(n−2),con F(0)=0,F(1)=1
$$

donde $T(n)$ representa el tiempo de ejecución para calcular el $n$-ésimo número de Fibonacci y $c$ es una constante.

## 📐 3. Ecuación general (Fórmula cerrada)

Para resolver la recurrencia:

$$
F(n) = F(n - 1) + F(n - 2)
$$

usamos el método de ecuaciones características. Suponemos una solución de la forma

$$
F(n) = r^n
$$

y sustituimos en la recurrencia:

$$
r^n = r^{\,n-1} + r^{\,n-2}
$$

Dividiendo entre \(r^{\,n-2}\):

$$
r^2 = r + 1
$$

Resolviendo la ecuación característica:

$$
r = \frac{1 \pm \sqrt{5}}{2}
$$

Por lo tanto, la solución general es:

$$
F(n) = A\left(\frac{1 + \sqrt{5}}{2}\right)^{\!n} \;+\; B\left(\frac{1 - \sqrt{5}}{2}\right)^{\!n}
$$


## 4. Demostración (por inducción matemática)

### Paso base:

Comprobamos para \( n = 0 \) y \( n = 1 \):

$$
F(0) = \frac{\phi^0 - \psi^0}{\sqrt{5}} = \frac{1 - 1}{\sqrt{5}} = 0
$$

$$
F(1) = \frac{\phi^1 - \psi^1}{\sqrt{5}} = \frac{\phi - \psi}{\sqrt{5}} = \frac{\sqrt{5}}{\sqrt{5}} = 1
$$

Se cumple para los casos base.


### Paso inductivo:

Supongamos que se cumple para \( n = k \) y \( n = k - 1 \):

$$
F(k) = \frac{\phi^k - \psi^k}{\sqrt{5}}, \quad F(k-1) = \frac{\phi^{k-1} - \psi^{k-1}}{\sqrt{5}}
$$

Queremos demostrar que:

$$
F(k+1) = F(k) + F(k-1)
$$

Desarrollamos:

$$
F(k+1) = \frac{\phi^k + \phi^{k-1} - (\psi^k + \psi^{k-1})}{\sqrt{5}}
$$

Factorizando:

$$
F(k+1) = \frac{\phi^{k-1}(\phi + 1) - \psi^{k-1}(\psi + 1)}{\sqrt{5}}
$$

Sabemos que:

$$
\phi + 1 = \phi^2 \quad \text{y} \quad \psi + 1 = \psi^2
$$

Entonces:

$$
F(k+1) = \frac{\phi^{k+1} - \psi^{k+1}}{\sqrt{5}}
$$

Demostrado por inducción

