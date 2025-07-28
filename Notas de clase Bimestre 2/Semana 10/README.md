
# Semana 10: Algoritmos Voraces y Grafos Dirigidos

> _“A veces, avanzar significa elegir el camino más corto, incluso si no lo conoces aún.”_  
> — Aplicando Dijkstra en grafos dirigidos

---

## Conceptos Clave

### Grafos Dirigidos (Dígrafos)

**¿Qué los hace diferentes?**  
A diferencia de los **grafos no dirigidos**, aquí las conexiones (llamadas **arcos**) son como calles de **un solo sentido**.  

 Cada arco se representa como un par ordenado **(v, w)**, donde:
- `v`: vértice de **origen** (cola)
- `w`: vértice de **destino** (cabeza)

>  No se puede ir de `w` a `v` a menos que exista otro arco que lo permita.

---

### Grafos Ponderados

Al igual que antes, cada arco puede tener un **peso o costo**, que representa:
- 🛣️ Distancia
- ⏱️ Tiempo
- 💰 Costo, etc.

---

## El Problema del Camino Mínimo

**Objetivo:**  
Dado un vértice de **origen**, encontrar la **ruta más barata o corta** para llegar a todos los demás vértices del grafo.

Esta es una tarea común en:
- Sistemas GPS
- Ruteo de redes
- Juegos de laberintos o mapas

---

## Análisis del Algoritmo de Dijkstra

El algoritmo de **Dijkstra** es una estrategia **voraz** para resolver el problema del **camino más corto**, siempre que **no haya arcos con peso negativo**.

### Estrategia de Dijkstra

1. Comienzas en el vértice de origen.  
2. Inicializas la **distancia a 0** para el origen y a **infinito (∞)** para los demás vértices.
3. En cada paso, eliges vorazmente el **vértice no visitado con menor distancia conocida**.
4. Luego, **actualizas ("relajas") las distancias** a sus vecinos si es posible llegar más rápido a través de él.
5. Repites hasta visitar **todos los vértices**.

---

## Pseudocódigo de Dijkstra

```pseudo
función Dijkstra(Grafo L, origen):
{
    // D[i] guardará la distancia más corta desde el origen hasta i
    // C es el conjunto de nodos que aún no hemos visitado
    C ← {todos los nodos excepto el origen} 

    para cada nodo i:
        D[i] ← L[origen, i] // Distancia directa inicial

    repetir n - 2 veces:
        // Decisión voraz: elige el nodo no visitado más cercano
        v ← el nodo en C que minimiza D[v] 
        C ← C \ {v} // Lo marcamos como visitado

        // Relajación: actualizamos las distancias de sus vecinos
        para cada vecino w de v que esté en C:
            D[w] ← min(D[w], D[v] + L[v, w]) 

    devolver D
}
