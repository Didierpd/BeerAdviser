# Beer Adviser y Servicios de Educación Virtual

Laboratorio de aplicaciones interactivas Android basado en la presentación **Building interactive apps**. El proyecto conserva el ejercicio original *Beer Adviser* y añade la extensión solicitada para consultar servicios de educación virtual por categoría.

## Funcionalidad

### Laboratorio base

1. El usuario selecciona un color de cerveza en un `Spinner`.
2. Presiona **Buscar cervezas**.
3. `FindBeerActivity` consulta a `BeerExpert` y presenta las marcas recomendadas.

### Extensión propuesta

1. El usuario selecciona una categoría de servicio virtual.
2. La lista se actualiza inmediatamente mediante `OnItemSelectedListener`.
3. También puede presionar **Mostrar servicios** para repetir la consulta.
4. `ServiceExpert` devuelve los servicios de la categoría seleccionada:

| Categoría | Servicios |
| --- | --- |
| Foro | Foro técnico, foro social, foro de aclaración de dudas |
| Videoconferencia | Clase en vivo, tutoría virtual, webinar académico |
| Recursos | Biblioteca digital, repositorio multimedia, guías interactivas |
| Evaluación | Cuestionario en línea, entrega de actividades, retroalimentación del docente |

## Conceptos Android aplicados

- Una `Activity` como controlador de interacción.
- Layout XML con `ScrollView`, `LinearLayout`, `Spinner`, `Button` y `TextView`.
- Recursos de cadenas y arreglos en `strings.xml`.
- Eventos declarados con `android:onClick`.
- Evento de selección mediante `OnItemSelectedListener`.
- Separación entre interfaz y lógica usando clases Java independientes.

## Estructura relevante

```text
app/src/main/
├── AndroidManifest.xml
├── java/co/edu/unipiloto/beeradviser/
│   ├── FindBeerActivity.java
│   ├── BeerExpert.java
│   └── ServiceExpert.java
└── res/
    ├── layout/activity_find_beer.xml
    ├── values/strings.xml
    └── drawable/card_background.xml
```

## Abrir y ejecutar

1. Abrir Android Studio.
2. Elegir **Open** y seleccionar la carpeta `BeerAdviser`.
3. Permitir la sincronización de Gradle e instalar Android SDK 35 si se solicita.
4. Ejecutar en un emulador o dispositivo con API 19 o superior.

## Pruebas

Las pruebas unitarias de `BeerExpert` y `ServiceExpert` están en `app/src/test`. En un entorno Android configurado:

```bash
./gradlew test
```

## Tecnologías

- Java
- Android SDK: `minSdk 19`, `targetSdk 35`
- Gradle 8.9 / Android Gradle Plugin 8.7.3
