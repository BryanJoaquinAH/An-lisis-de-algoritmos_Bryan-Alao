
# 🗓️ Semana 07

### Temas tratados
- Recurrencias
- Suposiciones Inteligentes (Método de Sustitución)

---

### Recurrencias

Una **recurrencia** (o relación de recurrencia) es una expresión que define una función en términos de sí misma, pero evaluada en valores de entrada más pequeños. Este concepto es fundamental para analizar el tiempo de ejecución de algoritmos recursivos, ya que la complejidad de dichos algoritmos depende de la suma de los costos de las llamadas recursivas sobre subproblemas más pequeños.

En esencia, el tiempo de ejecución de un algoritmo recursivo se modela mediante una ecuación de recurrencia, que expresa el tiempo total como una combinación del tiempo invertido en llamadas recursivas y el trabajo adicional realizado fuera de ellas.

Por ejemplo, el cálculo del factorial de un número `n` se puede definir mediante la recurrencia:

\[
T(n) = 
\begin{cases}
1 & \text{si } n = 0 \\
n \times T(n - 1) & \text{si } n > 0
\end{cases}
\]

Las ecuaciones de recurrencia son esenciales para determinar las cotas asintóticas (`O`, `Ω`, `Θ`) de algoritmos recursivos, permitiendo así estimar con precisión su eficiencia.

---

### Solución de Recurrencias

Resolver una recurrencia significa encontrar una expresión **no recursiva** equivalente que permita conocer la complejidad asintótica del algoritmo sin necesidad de expandir indefinidamente las llamadas.

Algunas técnicas comunes para resolver recurrencias incluyen:

#### Suposiciones Inteligentes (Método de Sustitución)
1. Calcular los primeros valores de la recurrencia para entradas pequeñas, obteniendo resultados concretos.  
2. Observar y buscar patrones o regularidades en esos valores.  
3. Proponer una forma general o **solución candidata** basada en el patrón identificado.  
4. Verificar la validez de esta forma para todos los valores posibles, normalmente mediante **inducción matemática** u otro método formal.

#### Ecuación Característica  
Se aplica a recurrencias lineales homogéneas con coeficientes constantes, transformando la recurrencia en una ecuación polinómica. Las raíces de esta ecuación permiten deducir la forma explícita de la solución.

#### Método del Árbol de Recursión  
Consiste en representar visualmente las llamadas recursivas como un árbol, donde cada nivel indica el costo en ese paso. Sumando el costo de todos los niveles, se obtiene el costo total del algoritmo.

#### Teorema Maestro  
Un método muy eficaz para resolver recurrencias de la forma:

\[
T(n) = a \cdot T\left(\frac{n}{b}\right) + f(n)
\]

común en algoritmos de "divide y vencerás". Este teorema establece condiciones para determinar la complejidad asintótica basada en la comparación entre la función \( f(n) \) y \( n^{\log_b a} \).

---
