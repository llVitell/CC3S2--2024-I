# Actividad TDD
Vamos a comenzar con una clase que contendrá la parte central de la lógica de la aplicación, una que  represente una palabra para adivinar y que pueda calcular el puntaje de una suposición.
Comenzamos creando una clase de prueba unitaria y esto nos pone inmediatamente en modo de
diseño de software

Para empezar, escribamos una prueba que arroje la puntuación de una sola letra que sea incorrecta:

1. Escribimos el siguiente código para comenzar nuestra prueba

![](images/image.png)

2. Decidimos usar una clase llamada Word para representar nuestra palabra. También decidimos proporcionar la palabra a adivinar como un parámetro de construcción para nuestra instancia de objeto de la clase Word que queremos crea

![](images/image-1.png)

3. Ahora, renombramos el parámetro del constructor de Word

![](images/image-2.png)

4. A continuación, volvemos a la prueba. Capturamos el nuevo objeto como una variable local para
que podamos probarlo:

![](images/image-3.png)

5. Pasar la adivinación es una decisión fácil: usaremos un método que llamaremos guess(images/). Podemos
codificar estas decisiones en la prueba:

![](images/image-4.png)

6. Use autocompletar para agregar el método guess(images/) a la clase de Word:

![](images/image-5.png)

7. Haz clic en Enter para agregar el método, luego cambie el nombre del parámetro a un nombre
descriptivo:

![](images/image-6.png)

8. A continuación, agreguemos una forma de obtener la puntuación resultante de esa suposición.
Comienza con la prueba:

![](images/image-7.png)


Después de reflexionar sobre qué hacer, estas son las tres decisiones de diseño que usaremos en este código:

- Admitir un número variable de letras en una palabra
- Representar la puntuación mediante una enumeración simple INCORRECT, PART_CORRECT,
o CORRECT
- Acceder a cada puntaje por su posición en la palabra, basado en cero

Estas decisiones respaldan el principio KISS es decir Keep It Simple


9. Capturamos estas decisiones en las pruebas

![](images/image-8.png)

10. Se observa claramente que estas pruebas fallan pero en eso consiste el TDD, con las pruebas hechas ya podemos ir empezando a implementar el codigo fuente

11. Hagamos que la prueba pase agregando código a la clase Word:

![](images/image-9.png)

12. A continuación, creamos la clase score:

![](images/image-10.png)

Si bien las pruebas pasan, el codigo tiene mejoras por hacer.

La clase Letter la cambiamos por una clase enum

![](images/image-11.png)

Agregamos el metodo assess en la clase Score para la logica del juego (images/adivinar letras)

![](images/image-12.png)

Una vez hecho esto implementamos el constructor de la clase Score y su metodo guess

![](images/image-13.png)

Y se observa que las pruebas pasan correctamente

![](images/image-14.png)