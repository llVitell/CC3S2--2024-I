# Actividad Metricas de Calidad de Software

# Ejercicio: Analiza el Acoplamiento y realiza el cálculo del factor de acoplamiento (CF)

## Clase UsuarioModulo

### Acoplamiento eferente

Clase UsuarioModulo

- `Usuario` : instancia del objeto Usuario
- `AgregarUsuario` : metodo que utiliza la clase Usuario

Clase Grupo Contacto Modulo

- `Usuario` : Utiliza una lista de objetos de la clase Usuario
- `agregarUsuario` : metodo que tiene como parametro la clase Usuario

Clase Contacto Operaciones Modulo

- `enviarMensaje`: usa un objeto de la clase Usuario como parametro

### Acoplamiento aferente

Modulos que utilizan un modulo propio de la clase UsuarioModulo:



# Ejercicio: 

Para el siguiente diagrama de clases, calcula el valor de Inestabilidad para las clases:

- Stop
- PassengerUnloader

Usa hasta 3 cifras significativas

![](image.png)


## Clase Stop

### Acoplamiento eferente

La clase Stop utiliza:

- `LoadPassengers` : utiliza un puntero a un objeto de tipo `Bus`
- `AddPassengers` : utiliza un puntero a un objeto de tipo `Passenger`

### Acoplamiento aferente

Modulos que utilizan un modulo propio de la clase Stop:

Clase Route

- `destinationStop`: puntero a la clase Stop usado 
- `Route` : metodo que tiene como parametro un puntero de la clase Stop
- `GetDestinationStop` : metodo que retorna un puntero de tipo Stop 

Clase PassengerGenerator

- `_stops` : variable de tipo List con elementos puntero Stop

### Inestabilidad

`I = Ce / (Ca + Ce)`

Donde 

- Acoplamiento eferente (Ce) = 2 
- Acoplamiento aferente (Ca) = 4

Entonces `I = 0.333`

## Clase PassengerUnloader

### Acoplamiento eferente

La clase PassengerUnloader utiliza:

- `UnloadPassenger()` : metodo que utiliza la clase Stop 

### Acoplamiento aferente

Modulos que utilizan un modulo propio de la clase PassengerUnloader:

Clase Bus

- `UnloadPassenger()`: metodo propio de la clase PassengerUnloader 


### Inestabilidad

`I = Ce / (Ca + Ce)`

Donde 

- Acoplamiento eferente (Ce) = 1
- Acoplamiento aferente (Ca) = 1

Entonces `I = 0.5`

***

