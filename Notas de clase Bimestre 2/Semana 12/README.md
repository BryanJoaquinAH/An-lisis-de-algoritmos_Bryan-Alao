
# Semana 12: Algoritmos de Ordenación con Divide y Vencerás

> _“Ordenar no es solo poner cosas en su lugar, es hacerlo de la manera más inteligente posible.”_  
> — Estrategias de ordenamiento eficientes

---

## Introducción

Esta semana llevamos el paradigma de **Divide y Vencerás** a otro nivel:  
**¡Ordenar grandes cantidades de datos de forma eficiente!**

Aprendimos dos de los algoritmos más conocidos y usados en programación:

-  **Merge Sort** (Ordenación por fusión)
-  **Quicksort** (Ordenación rápida)


## Análisis de Merge Sort (Ordenación por Fusión)

> Merge Sort es como un **organizador metódico y paciente**.

### Estrategia

1. **Dividir:**  
   Divide la lista en dos mitades.  
   Luego divide esas mitades nuevamente.  
   Repite hasta que todas sean listas de un solo elemento.  
    _Una lista de un solo elemento ya está ordenada._

2. **Vencer + Combinar:**  
   Aquí ocurre la magia:  
    Empiezas a **fusionar (merge)** listas pequeñas en listas más grandes:  
   - Toma **dos listas ordenadas**
   - Combínalas en **una nueva lista también ordenada**
   - Repite hasta tener una **única lista perfectamente ordenada**

### Complejidad Temporal

- Siempre tiene un rendimiento constante:
  \[
  \Theta(n \log n)
  \]
- Es **estable y predecible**, sin importar la entrada.



## ⚡ Análisis de Quicksort (Ordenación Rápida)

> Quicksort es como un **líder carismático que organiza a todos rápidamente**, aunque a veces comete errores.

### Estrategia

1. **Dividir (Partición):**  
   - Elige un **pivote** (al azar o por una regla)  
   - Reorganiza la lista:  
     - Elementos **menores** al pivote → izquierda  
     - Elementos **mayores** al pivote → derecha  

2. **Vencer:**  
   - Aplica **Quicksort recursivamente** a cada sublista  
   - "¡Hagan lo mismo!" 

3. **Combinar:**  
   - **No es necesario** combinar.  
   - El ordenamiento ocurre directamente sobre la lista original (es _in-place_).


### Complejidad Temporal

- Caso promedio:
  \[
  \mathcal{O}(n \log n)
  \]
  Extremadamente eficiente en la práctica.

-  Peor caso:
  \[
  \mathcal{O}(n^2)
  \]
  Puede ocurrir si el **pivote se elige mal**, por ejemplo:
  - Siempre el menor o mayor valor
  - Lista ya ordenada

---

## 🔍 Comparación Rápida

| Característica        | Merge Sort              | Quicksort                  |
|-----------------------|--------------------------|-----------------------------|
| Enfoque               | Divide → Vencer + Combinar | Divide → Vencer (in-place) |
| Complejidad promedio  | Θ(n log n)               | O(n log n)                  |
| Peor caso             | Θ(n log n)               | O(n²)                       |
| Estable               |  Sí                      | No                       |
| Uso en práctica       | Muy bueno para listas enlazadas | Más usado en arrays         |
| Espacio adicional     | Sí (usa memoria extra)   | No (in-place)              |



##  Conclusión

El uso de **Divide y Vencerás** en algoritmos de ordenación demuestra cómo una buena estrategia puede mejorar enormemente el rendimiento.  
Tanto **Merge Sort** como **Quicksort** son herramientas esenciales en la caja de herramientas de cualquier programador serio.

