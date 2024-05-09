# Nombre del Proyecto: Aventuras con Animales Fantasticos

## Descripción: 
Desarrollar un juego de aventuras donde el jugador controle un Personaje Principal acompañado de una Mascota, enfrentándose a Enemigos y capturando nuevas Mascotas para entrenarlas y mejorar sus habilidades. El juego incluirá la gestión de Piedras mágicas que potencian las estadísticas de las Mascotas y se activan durante los combates.

## Características del Juego:
1. **Personaje Principal:**
   - El jugador controlará un Personaje Principal con el que explorará el mundo del juego y enfrentará desafíos.
   - El Personaje tendrá como atributos vida, daño, estamina, velocidad, LvL, si tiene Mascota y un listado de las mascotas.
   - Tendrá métodos de sonidos al recibir y realizar daño, un sonido de perder, otro de ver estadísticas y de entrenar.

2. **Enemigo:**
   - Habrá un Enemigo con atributos de Vida, Daño y Velocidad.
   - El Enemigo tendrá métodos para emitir sonidos al recibir y realizar daño.

3. **Mascota:**
   - Se incluirá una Clase Abstracta llamada Mascotas con clases Volador, Terrestre y Acuático.
   - La clase Mascota tendrá como atributos Ataque1, Ataque2, Nombre, Vida, Daño, Estamina, Velocidad, LvL.
   - Tendrá 4 métodos de sonido: pegar, recibir daño, pelea y sonido.
   - La clase Acuática tendrá un booleano de si tiene piedras Acuáticas, un atributo TienePiedrasAcuaticas y tendrá 2 métodos que serán AñadirPiedras y subirLvL.
   - La clase Terrestre tendrá un booleano de si tiene piedras Voladoras y Terrestres y tendrá 3 métodos que serán AñadirPiedras y subirLvL.
   - La clase Volador tendrá un booleano de si tiene piedras Voladoras, un atributo TienePiedrasVolador y tendrá 2 métodos que serán AñadirPiedras y subirLvL.

4. **Interfaz Piedras:**
   - Se incluirá una interfaz llamada Piedras con clases PiedraAcuatica, PiedraTerrestre y PiedraVolador.
   - Habrá métodos para aumentar la vida y el daño de las Mascotas con cada tipo de Piedra.
   - La PiedraVolador tendrá un atributo de Uso y métodos adicionales para gestionar sus usos.
   - La PiedraTerrestre incluirá un método para multiplicar las estadísticas importantes de la Mascota.
   - La PiedraAcuatica tendrá métodos para aumentar la vida y el daño según su poder.

5. **Captura y Entrenamiento de Mascotas:**
   - El Personaje podrá capturar Mascotas derrotándolos en combate cuerpo a cuerpo.
   - Cada Mascota capturada podrá ser entrenada y mejorada por el Personaje.
   - Al entrenar a una Mascota, se le otorgará una Piedra del tipo que corresponda.
   - La captura de Mascotas estará limitada según el nivel del Personaje y el tipo de Mascota a capturar.
   - El Personaje solo Puede tener una Mascota por cada tipo.
   - El tipo de Mascota que se puede capturar y el nivel requerido será el siguiente:
     - Volador: Nivel del Personaje < 10
     - Terrestre: Nivel del Personaje ≥ 10 y < 25
     - Acuático: Nivel del Personaje ≥ 25

6. **Combate:**
   - El Personaje podrá enfrentarse a Enemigos utilizando sus Mascotas y se activarán las Piedras correspondientes.
   - Solo se podrá atacar a un Enemigo si se tiene una Mascota disponible y siempre que tenga una piedra se activará automáticamente.
   - Una Mascota solo se podrá capturar enfrentándola en combate cuerpo a cuerpo con el Personaje Principal.

![Diagrama.png](src%2FDiagrama.png)
## Nota:
Este proyecto requerirá una planificación cuidadosa y una implementación modular para gestionar adecuadamente las relaciones entre Personajes, Mascotas, Piedras y Combates. ¡Buena suerte!
