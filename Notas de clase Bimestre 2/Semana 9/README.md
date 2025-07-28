#  Semana 9: Algoritmos Voraces y Grafos no Dirigidos

> _“Tomar siempre la mejor decisión local, esperando que nos lleve a una solución global óptima.”_  
> — Filosofía de los algoritmos voraces

---

##  Conceptos Clave

### Algoritmos Voraces (Greedy)

**¿Cuál es la filosofía?**  
Son algoritmos que resuelven problemas de optimización **eligiendo siempre la mejor opción disponible en el momento**. Suelen ser:

- Rápidos
- Fáciles de implementar

> ⚠️ **Advertencia:** No siempre garantizan la **mejor solución global**.  
> Una buena decisión local puede no ser la mejor a largo plazo.


### Grafos no Dirigidos

**Definición básica:**  
Un **grafo** es un conjunto de **nodos** (vértices) conectados por **aristas** (líneas).  
En los **grafos no dirigidos**, las conexiones son **bidireccionales**, como calles de doble sentido.

#### Árbol de Recubrimiento Mínimo (MST)

> Imagina que los vértices son **ciudades** y las aristas son **carreteras**.  
> Un MST (Minimum Spanning Tree) conecta todas las ciudades usando **la menor cantidad de asfalto**, evitando ciclos.

Es muy útil en problemas reales como el **diseño de redes eléctricas, de transporte o telecomunicaciones**.


##  Ejemplo Práctico: El Algoritmo de Dar el Cambio

Un clásico ejemplo de algoritmo voraz:  
 Devolver una cantidad de dinero usando el **menor número de monedas** posible.

###  Estrategia Voraz

En cada paso, se toma la **moneda de mayor valor** que aún no exceda la cantidad restante.
---

### Pseudocódigo

```pseudo
función devolver_cambio(n):
{
    // Monedas disponibles, de mayor a menor
    const C = {100, 25, 10, 5, 1}
    S_solucion ← ∅
    suma_actual ← 0
    
    mientras suma_actual ≠ n hacer
        // Decisión voraz: la moneda más grande que quepa
        x ← el mayor elemento de C tal que suma_actual + x ≤ n 
        S_solucion ← S_solucion ∪ {moneda de valor x}
        suma_actual ← suma_actual + x

    devolver S_solucion
}

