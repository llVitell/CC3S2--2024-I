# Actividad Introduccion a Cucumber

En esta actividad tenemos un código que simula un estomago el cual come pepinos y espera un tiempo necesario (no come pepinos)

![](images/img1.png)

La clase Belly (estomago) tiene 2 variables (eatenCucumbers & timeWaited) para calcular la cantidad de pepinos comidos y tiempo esperado, si el tiempo esperado es mayor igual que 2 y ha comido mas de 10 pepinos el estomago va a gruñir

Para poder realizar las pruebas debemos tomar en cuenta los siguientes casos:

- timeWaited >= 2 && eatenCucumbers > 10 (caso base)
1. timeWaited >= 2 && eatenCucumbers = 10 
2. timeWaited >= 2 && eatenCucumbers < 10
3. timeWaited <= 2 && eatenCucumbers = 10
4. timeWaited <= 2 && eatenCucumbers < 10
5. timeWaited <= 2 && eatenCucumbers > 10

En el siguiente codigo se abordan tanto el caso base como el caso 5

![](images/img2.png)

Entonces debemos escribir los escensarios para los casos 1, 2, 3 y 4

- **Caso 1 - timeWaited >= 2 && eatenCucumbers = 10**

![](images/img3.png)

- **Caso 2 - timeWaited >= 2 && eatenCucumbers < 10**

![](images/img4.png)

- **Caso 3 - timeWaited <= 2 && eatenCucumbers = 10**

![](images/img5.png)

- **Caso 4 - timeWaited <= 2 && eatenCucumbers < 10**

![](images/img6.png)

Por último ejecutamos los escenearios y observamos que todos pasan satisfactoriamente.

![](images/img7.png)



