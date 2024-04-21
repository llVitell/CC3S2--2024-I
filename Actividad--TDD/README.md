# Actividad Ejemplo de TDD

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

Si bien completamos el proceso RGR, el codigo es aun mejorable dado que el valor que esta retornando es estatico (en este caso el 3) podemos usar this. para poder usar diferentes valores (no solo el 3)
