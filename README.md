# Challenge-Oracle-ONE-Conversor

Conversor de moneda y de medida desarrollado en lenguaje de programación Java

## Solución
Se realizó un proyecto con una arquitectura MVC (Modelo Vista Cotrolador) en donde el modelo es el que contiene 
la lógica como clases que heredan de las principales y la clase convertidor que realiza el procesamiento de los
datos que llegan de la vista. El controlador es el intermediario entre la lógica y la intefaz, de esta manera,
este no cumple con la tarea de llevar procesos lógicos. Por ultimo, en la vista, se encuentran todos los componentes
necesarios para la interacción con el usuario y así poder obtener los datos que ingresan y mostrar los resultados.

### Clases Principales
Para la conversión de las monedas y medidas, se crearon una clase principal de moneda (Currency) y me medida (Measure)
los cuales reciben un valor que es el equivalente en la moneda y medida base (COP y metros), además de contar con los 
métodos para la conversión es decir, pasar del valor base a la medida o moneda requerida y viceversa.

### Clases que Heredan
Para realizar las conversiones correspondientes, se crearon clases por cada una de las medidas y monedas solicitadas que 
extienden de las clases principales en donde se le pasa por parametro el valor base (en COP y metros) y de esta manera
al realizar el proceso de conversión, mediante polimorfismo se pasa un solo tipo de dato y así evitar inconvenientes a 
la hora de realizar la implementación.

### Conversor y Enumerados
El coversor es la clase "Manager" que se encarga de procesar los valores que ingresa el usuario y devolver los resultados
correspondientes. Por otro lado, para obtener el valor en la medida o moneda deseada se hizo uso de enumerados que contienen
el nombre de la moneda o medida a convertir y cuando el usuario selecciones alguna de ellas, mediante un switch se verifica
cuál es el nombre que coincide y así realizar el calculo correspondiente. 

### Controlador
Para el intermediario, se realizó una clase "Controlador" que contiene las instancias de la lógica y de la vista ya que
através de ellas se hará el intercambio de los datos. Adicionalmente, la clase implemeta la interfaz ActionListener y
KeyListener para el manejo de los eventos de los componentes que se encuentran en la vista y realizar la acción del 
componente que corresponda

### Vista
La vista hace uso de las clases de la librería Swing como JFrame, JPanel, etc... y allí mediante el uso de Layouts se
ubican los componentes para finalmente visualizar la interfaz que se le muestra al usuario final.

**Para ejecutar la aplicación desde un IDE, buscar el método main en la clase [Controller](./src/controllers/Controller.java)**
** de lo contrario ejecutar el archivo [JAR](./conversorChallenge.jar) generado para acceder de manera sencilla de a la aplicación.**

