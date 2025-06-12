Sistema Electrónico de Cobro de Pasajes
Contexto General
Una empresa de transporte desea digitalizar su sistema de cobro de pasajes a través de un
sistema electrónico que registre viajes, calcule tarifas y gestione a los pasajeros y vehículos.
El sistema debe permitir gestionar los diferentes tipos de vehículos de transporte (colectivo,
tren, subte) y sus respectivos viajes. Cada viaje incluye información sobre el vehículo, el
pasajero, el tipo de pasaje (común, estudiante, jubilado), y el costo final.
Requisitos del Sistema
1. Diseño orientado a objetos:
● Crear una clase abstracta llamada VehiculoTransporte con atributos comunes como
patente, capacidad, empresa, y un método abstracto calcularCostoBase().
● Implementar las subclases Colectivo, Tren y Subte, cada una con una implementación
específica del método calcularCostoBase().
2. Gestión de pasajes:
● Crear una interfaz Pasaje con el método calcularCostoFinal().
● Implementar esta interfaz en las clases PasajeComun, PasajeEstudiante y
PasajeJubilado.
● PasajeComun: paga el costo base.
● PasajeEstudiante: paga el 50% del costo base.
● PasajeJubilado: paga el 25% del costo base.

3. Modelo de herencia y polimorfismo:
● Todos los pasajes deben poder ser tratados de forma polimórfica.
● Debe poder calcular el costo total de todos los pasajes emitidos sin conocer su tipo
concreto.

4. Entrada/Salida por consola (menú):
● Crear un menú que permita:
● Registrar un nuevo viaje (solicitando datos por consola)
● Mostrar todos los viajes realizados
● Ordenar los viajes por costo (Comparable)
● Ordenar los viajes por nombre de pasajero (Comparator)
● Mostrar el total recaudado

6. Encapsulación y validación:
● Todos los atributos deben estar encapsulados (privados o protegidos) y accederse
mediante getters y setters.
● Validar que los datos de entrada no sean vacíos o inválidos (capacidad > 0, costo base >
0, etc.).

7. Sobrescritura de métodos:
● Sobrescribir el método toString() en todas las clases relevantes para mostrar los datos
de forma legible.


Evaluación esperada
● Uso correcto de clases abstractas e interfaces
● Diagrama de clases UML
● Aplicación de herencia y polimorfismo
● Encapsulación con validaciones simples
● Sobrescritura de métodos (toString, equals, etc.)
● Implementación de Comparable (por costo)
● Implementación de Comparator (por nombre)
● Interacción a través de consola con menú claro y funcional






