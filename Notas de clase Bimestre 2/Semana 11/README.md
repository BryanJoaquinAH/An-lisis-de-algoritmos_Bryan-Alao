# Semana 11: Divide y Vencerás y Búsqueda Binaria

> _“Cuando el problema parece grande, divídelo hasta que puedas vencerlo.”_  
> — Estrategia clásica de Divide y Vencerás

---

## 🧠 Conceptos Clave

### Divide y Vencerás (Divide and Conquer)

Una de las estrategias más elegantes y poderosas de la informática.

### La Estrategia en Tres Pasos:

1. **Dividir:**  
   Si el problema es grande, **divídelo en subproblemas** más pequeños y manejables.

2. **Vencer:**  
   Resuelve estos subproblemas.  
   Si son suficientemente pequeños (caso base), resuélvelos directamente, generalmente usando **recursividad**.

3. **Combinar:**  
   Une las soluciones de los subproblemas para obtener la solución completa.


### Aplicación

Esta técnica es la base de muchos algoritmos eficientes, como:

- 🧮 Ordenamiento rápido (QuickSort)
- 🧮 Merge Sort
- 🔎 Búsqueda binaria


## 🔍 Análisis de la Búsqueda Binaria

Este es el ejemplo perfecto de **"Divide y Vencerás"** aplicado a la **búsqueda** de un valor en una **lista ordenada**.


### Estrategia de Búsqueda Binaria

> Es como buscar un nombre en una guía telefónica impresa 📖

1. **Dividir:**  
   No empiezas por el principio, sino que miras el **elemento central**.

2. **Vencer:**  
   - Si es el valor buscado → ¡Listo!  
   - Si el valor buscado es **menor** que el del centro → descartas la **segunda mitad**.  
   - Si es **mayor** → descartas la **primera mitad**.

3. **Combinar:**  
   En este caso, **no se requiere combinar**.  
   El proceso de dividir y vencer **reduce el problema hasta encontrar la solución**.


## Complejidad Computacional

- **Tiempo de ejecución:**  
  \[
  \Theta(\log n)
  \]
  Esto significa que **duplicar** el tamaño de la lista **solo agrega una comparación** adicional.

- **Peor caso:**  
  El elemento está en un extremo o no está.  
  Aún así, solo se requieren:
  \[
  \log_2(n) \text{ comparaciones}
  \]

---

## 💻 Código Iterativo en Java

```java
public static int BinIter(int[] T, int x) {
    int i = 0;
    int j = T.length; // Límite superior

    while (i < j) {
        int k = (i + j) / 2; // El punto medio

        // Si x está en la primera mitad (o es el del medio)
        if (x <= T[k]) {
            j = k; // Descartamos la segunda mitad
        } else {
            i = k + 1; // Descartamos la primera mitad
        }
    }

    // Devuelve la posición donde está o debería estar
    return i;
}
