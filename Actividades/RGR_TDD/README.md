# Actividad Ejemplo de TDD-RGR

Para poder comparar dos equipos, cada uno de ellos debe recordar su número de victorias. Por
simplicidad, diseñemos una clase FootballTeam que tome el número de juegos como parámetro del
constructor.

Lo primero es lo primero: asegurémonos de que este constructor funcione.
Comenzamos creando una nueva clase - FootballTeamTest - en algún lugar del directorio
src/test/java.

![](images/1.png)

Ahora procedemos a crear la clase FootballTeam con su constructor y su metodo getGamesWon()

![](images/2.png)

Una vez hecho esto empezamos con el RGR

---

## <font color='red'>RED</font>

Al correr la prueba se observa que esta falla como se esperaba

![](images/3.png)

## <font color='green'>GREEN</font>

Una vez fallada la prueba empezamos a codear para hacerla pasar

![](images/4.png)

En este caso cambiamos el valor del return de 0 a 3 dado que esa era la causa de que no pase el test. Ahora se observa que las pruebas pasan satisfactoriamente

![](images/5.png)

## <font color='blue'>REFACTOR</font>

Una vez pasada la prueba, refactorizamos el codigo por mas insignificante que sea el cambio. En este caso podemos cambiar el test dado que utiliza una constante (numero magico)

![](images/6.png)

---

Si bien completamos el proceso RGR, el codigo es aun mejorable dado que el valor que esta retornando es estatico (en este caso el 3) podemos usar this. para poder usar diferentes valores (no solo el 3).

***
## RED

Primero cambiamos el test a un test parametizado

![](images/7.png)

Al correr la prueba se observa que esta falla como se esperaba

![](images/8.png)

## GREEN

Una vez fallada la prueba empezamos a codear para hacerla pasar

![](images/9.png)

En este caso cambiamos el constructor asi como tambien creamos una variable de la clase FootballTeam y se observa que la prueba pasa correctamente

![](images/10.png)

## REFACTOR

No es necesario

***
***

## RED

Esta vez nos ocuparemos de valores inválidos. Basándonos en nuestra experiencia anterior, podemos comenzar con una prueba parametrizada

![](images/11.png)

Esta prueba falla por que el constructor de nuestra clase principal actualmente acepta cualquier valor es decir no tiene un tipo de restriccion

![](images/12.png)

## GREEN

Esto se soluciona añadiendo una condicion al ingreso de los datos

![](images/13.png)

Y nos da como resultado todas las pruebas pasadas

![](images/14.png)

## REFACTOR

No es necesario

***

El constructor funciona bien. Ahora podemos pasar al problema principal: es decir, comparar 
equipos de fútbol. En primer lugar, hemos decidido que vamos a usar la interfaz 
java.lang.Comparable. Esta es una decisión importante que influirá no solo en la implementación de esta clase, sino también en su API y comportamiento esperado. Si FootballTeam es comparable, entonces el cliente puede esperar que una vez que haya puesto unos cuantos equipos en una colección, podrá usar el método Collections.sort() para ordenarlos. Si es así, entonces debería haber una prueba para este comportamiento.

***
## RED
Para probar esto añadimos un test que verifique que la un objeto de la clase FootballTeam sea una instancia de una clase comparable

![](images/15.png)

Corremos la prueba y falla 

![](images/16.png)

## GREEN
Implementamos la clase FootballTeam como una instancia de la clase Comparable asi como tambien definimos su metodo compareTo

![](images/17.png)

Una vez hecho esto las pruebas pasan correctamnete

![](images/18.png)

## REFACTOR

No es necesario

***

Ahora escribamos la primera prueba de comparación. La idea es simple: tomar dos equipos con 
diferentes números de victorias y compararlos.

***
## RED

Comparamos 2 equipos mediante sus victorias

![](images/19.png)

Las pruebas fallan como se esperaba

![](images/20.png)


## GREEN

El método compareTo() mostrado a continuación me parece una implementación muy decente que 
hará que la prueba pase

![](images/21.png)

Y las pruebas pasan satisfactoriamente

![](images/22.png)

## REFACTOR

En este caso se podria cambiar los nombres para refactorizar el codigo y hacerlo mas legible

***

Vamos a seguir implementando mas pruebas con sus respectivos codigos

***
## RED

Prueba para comparar 2 equipos, uno con menores juegos ganados la cual va a fallar por que aun no esta implementado

![](images/23.png)

## GREEN

Añadimos un if extra para capturar los casos extra que implementamos en los tests y ahora si pasan las pruebas correctamente

![](images/24.png)

## REFACTOR

Por el momento no es necesario

***

Ahora vamos a pasar a una prueba de igualdad

![](images/25.png)

Esta prueba pasa sin necesidad de codear debido a que previamente retornamos 0 en cualquier caso que no sea mayor o menor por ende cambiamos el 0 por otro numero cualquiera para que pase la prueba a rojo 

















