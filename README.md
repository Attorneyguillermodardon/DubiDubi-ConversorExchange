# 🐻💼 DubiDubi-ConversorExchange

_Challenge del curso Oracle one G8 con Alura Latam: conversor de monedas con java_

_Este mini programa es un conversor de monedas que toma en tiempo real la información de ExchangeRate-Api en https://app.exchangerate-api.com_

_El proyecto Dubidubi-ConversorExchange fué elaborado con esfuerzo y constancia por un 🐻 programador para entregar resultados confiables y adorables al público en general y para que su osita pastelita esté orgullOSA de el 🐼 🐾_

![Imagen uno Dudu](imagenes%20bubududu/Imagen%20uno%20dudu.PNG)

## 🐻 Cómo Visualizar y/o modificar el conversor

###  🧸 Descargar los archivos

Descarga los archivos y guardalos en una carpeta. Después abrelo con IntelliJ IDEA o con el IDE de tu preferencia para usar el conversor o editar el programa a tu gusto.

![Imagen dos Dudu](imagenes%20bubududu/imagen%20dos%20dudu.PNG)

### Algunas funcionalidades interesantes que se utilizaron a parte de las que vimos en el curso de Alura 🐼

#### 🧪 Manejo de excepciones personalizadas

Para asegurar la robustez del programa y evitar que se caiga por entradas inválidas, se implementaron varias **excepciones** cuidadosamente ubicadas:

- `InputMismatchException` — Captura cuando el usuario ingresa algo que **no es un número** (como texto) al pedir la cantidad de dinero a convertir.  

- `IllegalArgumentException` — Se lanza cuando la **moneda ingresada no existe** en los tipos de cambio disponibles.  

- `IOException` — Maneja errores al **consultar la API externa**, como pérdida de conexión o fallo al leer la respuesta.  

- `JsonSyntaxException` — Detecta cuando el **JSON recibido está mal formado** y no puede convertirse a objeto Java con Gson.

### 🧪 Técnicas utilizadas

🔹 **Regex**: Se usó la expresión regular `^[a-zA-Z]{3}$` para asegurar que el código de moneda contenga **exactamente 3 letras**, tal como lo requieren los códigos ISO de divisas (por ejemplo: USD, EUR, JPY).

```java
// Validación con Regex
if (!codigoMoneda.matches("^[a-zA-Z]{3}$")) {
    System.out.println("Código de moneda inválido. Ingrese solo letras (Ej: USD, EUR, JPY, etc.)");
    continue;
}
```
🔹 **DecimalFormat**: Se utilizó `DecimalFormat` para mostrar los valores numéricos en un formato legible, con separadores de miles y decimales.

```java
import java.text.DecimalFormat;

public class EjemploFormato {
    public static void main(String[] args) {
        DecimalFormat formato = new DecimalFormat("#,###.##");

        double cantidad = 1500.75;
        double tasaCambio = 18.5;
        double resultado = cantidad * tasaCambio;

        System.out.println(formato.format(cantidad) + " USD equivalen a " + formato.format(resultado) + " MXN");
    }
}

Salida: 1,500.75 USD equivalen a 27,762.88 MXN
```

![Imagen dudu 3](imagenes%20bubududu/imagen%20dudu%203.PNG)

## Construido con 🐻👷🛠️

- ☕ **Java** — Lenguaje principal de desarrollo  
- 🧠 **IntelliJ IDEA** — Entorno de desarrollo (IDE)  
- 🔧 **Microsoft Edge** — Navegador para pruebas de API/documentación  
- 📁 **Gson** — Librería para convertir JSON ↔️ objetos Java  
- 📦 **JSON** — Formato de intercambio de datos de la API
- 🐻❤️🐼 Mucho amor y ternura para que funcione bonito

  ## Autor ✒️

* **El Dudu** - *Challenge conversor de monedas con java - Full production* - [Attorneyguillermodardon] (https://github.com/Attorneyguillermodardon)

![Mi Foto de Perfil](https://avatars.githubusercontent.com/u/196573116?s=400&u=ddd3ae9a0263d494b7ecb6b0db3dfed8ce292dee&v=4)

## Este proyecto se lo dedico a mi novia la osita pastelita. Gracias por acompañarme Bubucita 🐼

Con mucho ❤️ y ternura 🐻🐼 por el Lic. Dudulino [Attorneyguillermodardon](https://github.com/Attorneyguillermodardon)🐻
