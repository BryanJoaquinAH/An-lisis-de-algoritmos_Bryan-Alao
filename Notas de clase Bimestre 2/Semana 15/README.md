# Semana 15: Algoritmos de Monte Carlo

> Para terminar, nos centramos en una de las dos grandes familias de algoritmos probabilistas: los de **Monte Carlo**.  
> Piensa en ellos como los algoritmos "**rápidos, pero que a veces se equivocan**".

---

## Conceptos Clave

### Monte Carlo vs. Las Vegas

Es fundamental distinguir estas dos clases:

- **Monte Carlo**:  
  - Tienen un **tiempo de ejecución fijo o acotado**.  
  - Existe una **pequeña probabilidad de error** (pueden dar una respuesta incorrecta).

- **Las Vegas**:  
  - Siempre dan la **respuesta correcta**.  
  - Pero su **tiempo de ejecución es aleatorio** y no predecible.

## Características de los Algoritmos de Monte Carlo

### ⚡ Velocidad a cambio de certeza

> Su gran ventaja es que son **predeciblemente rápidos**.  
> El trato es que **sacrificas la garantía de obtener una respuesta 100% correcta**.


### Error controlable

> La probabilidad de que se equivoquen es **conocida y controlable**.


### 🔁 La repetición hace la fuerza

> Si no estás seguro de la respuesta...  
> ¡Simplemente ejecuta el algoritmo **varias veces**!

- Si obtienes la **misma respuesta repetidamente**,  
  tu **confianza en que es correcta aumenta enormemente**.


## ⏱️ El Tiempo de Ejecución en Monte Carlo

### ¿Cuánto tardan?

> Esta es la parte fácil.

- El **tiempo de ejecución de un algoritmo Monte Carlo no es aleatorio**.
- Suele ser un **tiempo fijo** o tener un **límite superior bien definido**.
### El verdadero análisis

> Al analizar un algoritmo Monte Carlo, la pregunta clave **no es**:

```text
 ¿Cuánto va a tardar?
```
Sino más bien:
```text
¿Cuál es la probabilidad de que la respuesta sea correcta?
```
