<img width="622" height="133" alt="WhatsApp Image 2026-09-28 at 15 52 06" src="https://github.com/user-attachments/assets/29259a04-34be-44d6-8c3a-ebec187b53eb" />

Sistema de Audio y Reproducción Multimedia

Descripción:

Este proyecto consiste en un sistema en Java que permite controlar la reproducción de audio mediante un control remoto. El control remoto envía órdenes al reproductor para reproducir, pausar y cambiar el volumen.

Clases

ReproductorAudio: guarda el volumen actual y el estado del reproductor. Tiene métodos para reproducir, pausar y cambiar el volumen, validando que los valores sean correctos.

ControlRemoto: mantiene una referencia al reproductor de audio y se encarga de enviarle las órdenes.

Funcionamiento:

En el main se crean los objetos ReproductorAudio y ControlRemoto. Luego, se simula una secuencia de acciones para comprobar que el control remoto puede manejar el reproductor y mostrar los cambios por consola.

Recorrido del mensaje:

El programa crea el reproductor de audio.

Se crea el control remoto y se le pasa la referencia al reproductor.

El control remoto llama al método play() para iniciar la reproducción.

Después, envía el mensaje cambiarVolumen(int nuevoVolumen) para modificar el volumen. El reproductor verifica que el valor esté entre 0 y 100.

Finalmente, el control remoto llama al método pause() para pausar la reproducción.

El reproductor actualiza su estado y muestra los cambios por consola.

Validaciones

El reproductor comprueba que el volumen esté entre 0 y 100 para evitar valores inválidos. También controla las acciones de reproducción y pausa según el estado del sistema.

Objetivo:

Practicar la comunicación entre objetos en Java, el uso de referencias entre clases, las llamadas a métodos y la validación de datos.
