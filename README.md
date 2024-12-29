# Conversor de Divisas

Este es un **Conversor de Divisas** desarrollado en Java. La aplicación permite a los usuarios convertir una variedad de monedas (Dólar a Peso Argentino, Peso Argentino a Dólar, etc.) en tiempo real usando tasas de cambio obtenidas de una API externa.

## Funcionalidades

- **Convertir entre varias monedas**: Actualmente, el conversor soporta conversiones entre Dólar, Peso Argentino, Real Brasileño y Peso Colombiano.
- **Interfaz de usuario por consola**: El programa interactúa con el usuario a través de la terminal, solicitando la moneda de origen, la moneda de destino y el monto a convertir.
- **Soporte para múltiples opciones**: El menú de selección incluye 7 opciones de conversión y la posibilidad de salir del programa.

## Monedas soportadas

- **USD → ARS** (Dólar a Peso Argentino)
- **ARS → USD** (Peso Argentino a Dólar)
- **USD → BRL** (Dólar a Real Brasileño)
- **BRL → USD** (Real Brasileño a Dólar)
- **USD → COP** (Dólar a Peso Colombiano)
- **COP → USD** (Peso Colombiano a Dólar)

## Requisitos

Antes de ejecutar este proyecto, asegúrate de tener instalados los siguientes requisitos:

- **Java 11 o superior**.
- **Conexión a Internet** para consultar la API externa de conversión de divisas.

## Instalación

1. Clona este repositorio en tu máquina local:

    ```bash
    git clone https://github.com/tu-usuario/conversor.git
    ```

2. Navega al directorio del proyecto:

    ```bash
    cd conversor
    ```

3. Compila el proyecto:

    ```bash
    javac Principal.java
    ```

4. Ejecuta la aplicación:

    ```bash
    java Principal
    ```

## Uso

Una vez que inicies la aplicación, se mostrará un menú con las opciones disponibles para realizar las conversiones. Sigue las instrucciones y selecciona el número correspondiente a la conversión que deseas realizar. Luego, ingresa el monto que deseas convertir.

Ejemplo de ejecución:

Seleccione una opción a convertir:

Dolar a peso Argentino.
Peso Argentino a Dolar.
Dólar a Real Brasileño.
Real Brasileño a Dólar.
Dolar a Peso Colombiano.
Peso Colombiano a Dólar.
Salir.
Ingrese el monto. 100 

Resultado: 100 USD son 4500 ARS.


