# 🗓️ Semana 03 - Notación Asintótica y Análisis del Caso Promedio

## 📘 Temas tratados
- [Crecimiento de funciones y notación asintótica](#crecimiento-de-funciones-y-notación-asintótica)
- [Notación O (Cota Superior)](#notación-asintótica-o---cota-superior)
- [Notación Ω (Cota Inferior)](#notación-asintótica-Ω---cota-inferior)
- [Notación Θ (Cota Ajustada)](#notación-asintótica-Θ---cota-ajustada)
- [Análisis del caso promedio](#análisis-del-caso-promedio)
- [Código: Merge Sort](#código---ejemplo-de-análisis)

---

## 🧠 Crecimiento de Funciones y Notación Asintótica

Cuando analizamos algoritmos, no solo nos interesa si funcionan, sino **qué tan bien lo hacen**. La eficiencia teórica de un algoritmo se mide observando cómo crece su tiempo de ejecución o consumo de memoria a medida que crece el tamaño de entrada `n`.

Para esto usamos **notación asintótica**, que describe el comportamiento de una función cuando `n` tiende a infinito.

---

## 📈 Notación Asintótica O – Cota Superior

- Se usa para describir **el peor escenario posible**.
- Si un algoritmo es `O(g(n))`, entonces su tiempo de ejecución **nunca será peor** que `g(n)` multiplicado por una constante, para valores grandes de `n`.

**Definición formal**:
> f(n) ∈ O(g(n)) si existen constantes `c > 0` y `n₀` tales que:
> 
> `0 ≤ f(n) ≤ c · g(n)` para todo `n ≥ n₀`

**Ejemplo**:  
Para `T(n) = 3n² + 2n + 5`, diremos que `T(n) ∈ O(n²)`.

---

## 📉 Notación Asintótica Ω – Cota Inferior

- Se usa para describir **el mejor caso posible**.
- Si `f(n) ∈ Ω(g(n))`, entonces el algoritmo **al menos** tomará tanto tiempo como `g(n)` para entradas grandes.

**Definición formal**:
> f(n) ∈ Ω(g(n)) si existen constantes `c > 0` y `n₀` tales que:
>
> `0 ≤ c · g(n) ≤ f(n)` para todo `n ≥ n₀`

**Ejemplo**:
Para `T(n) = 3n² + 2n + 5`, también diremos que `T(n) ∈ Ω(n²)`.

---

## ⚖️ Notación Asintótica Θ – Cota Ajustada

- Se usa para describir **el crecimiento exacto** de un algoritmo.
- Un algoritmo está en Θ(g(n)) si su crecimiento está **limitado superior e inferiormente** por `g(n)`.

**Definición formal**:
> f(n) ∈ Θ(g(n)) si existen constantes `c₁`, `c₂`, `n₀` tales que:
>
> `0 ≤ c₁·g(n) ≤ f(n) ≤ c₂·g(n)` para todo `n ≥ n₀`

**Ejemplo**:  
`T(n) = 3n² + 2n + 5` está en `Θ(n²)`, ya que se ajusta por arriba y por abajo a `n²`.

---

## 📊 Análisis del Caso Promedio

El **análisis del caso promedio** calcula el rendimiento esperado de un algoritmo sobre todas las posibles entradas, tomando en cuenta su **probabilidad de ocurrencia**.

Aunque este análisis da una visión más realista que el caso peor, requiere suposiciones estadísticas y puede ser más complejo.

---

## 🧪 Código - Ejemplo de Análisis

A continuación, un ejemplo de implementación en Java del algoritmo **Merge Sort**, utilizado comúnmente en análisis de eficiencia y casos promedio.

<details>
<summary>Ver código completo</summary>

```java
package mergesort;

public class MergeSort {

    public static void main(String[] args) {
        int[] A = {10, 9, 8, 5, 4, 3, 1, 7, 2, 6};

        System.out.println("Array original:");
        imprimirArray(A);

        mergeSort(A, 0, A.length - 1);

        System.out.println("---");
        System.out.println("Array ordenado:");
        imprimirArray(A);
    }

    public static void mergeSort(int[] arr, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(arr, p, q);
            mergeSort(arr, q + 1, r);
            merge(arr, p, q, r);
        }
    }

    private static void merge(int[] arr, int p, int q, int r) {
        int nL = q - p + 1;
        int nR = r - q;
        int[] L = new int[nL];
        int[] R = new int[nR];

        for (int i = 0; i < nL; i++) L[i] = arr[p + i];
        for (int j = 0; j < nR; j++) R[j] = arr[q + 1 + j];

        int i = 0, j = 0, k = p;
        while (i < nL && j < nR) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < nL) arr[k++] = L[i++];
        while (j < nR) arr[k++] = R[j++];
    }

    public static void imprimirArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

```
## ✅ Conclusiones

La notación asintótica permite clasificar y comparar algoritmos en función de su eficiencia.
El caso promedio es útil, pero requiere conocimiento estadístico de las entradas.
Herramientas como Merge Sort ayudan a ver la eficiencia teórica reflejada en la práctica.
## 📎 Recursos útiles

- [Big O Cheat Sheet](https://www.bigocheatsheet.com/)


