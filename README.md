<h1 align="center">Optional</h1>
<p>Optional es una clase en Java que se introdujo en Java 8 como parte del paquete java.util. Su propósito principal es proporcionar una manera más segura y expresiva de trabajar con valores que pueden o no estar presentes, evitando así posibles excepciones de tipo NullPointerException.</p>
<p>La idea central detrás de Optional es representar la posibilidad de que un valor sea nulo sin necesidad de manejar directamente el valor nulo. En lugar de devolver un valor nulo, un método puede devolver un Optional que contiene o no un valor.</p>

<h3>Crear un Optional:</h3>

```java
Optional<String> optionalString = Optional.of("Hola, mundo!");

Optional<String> optionalNulo = Optional.ofNullable(null); // Puede contener un valor nulo

Optional<String> optionalVacio = Optional.empty(); // Representa la ausencia de valor
```

-  <b>Optional.of(valor)</b> crea un Optional que contiene un valor no nulo.
-  <b>Optional.ofNullable(valor)</b> crea un Optional que puede contener un valor nulo.
-  <b>Optional.empty()</b> crea un Optional vacío, sin ningún valor presente.

<h3>Métodos Principales:</h3>

-  <b>isPresent():</b> Verifica si el Optional contiene un valor.
```java
if (optionalString.isPresent()) {
    System.out.println("El Optional contiene un valor.");
}
```

-  <b>ifPresent(Consumer<T> consumer):</b> Ejecuta una acción si el Optional contiene un valor.
```java
optionalString.ifPresent(valor -> System.out.println("Valor presente: " + valor));
```

-  <b>orElse(T valorPorDefecto):</b> Devuelve el valor contenido en el Optional, o un valor por defecto si está vacío.
```java
String resultado = optionalNulo.orElse("Valor por defecto");
```

-  <b>orElseGet(Supplier<T> proveedor):</b> Devuelve el valor contenido en el Optional, o el resultado de un proveedor si está vacío.
```java
String resultado = optionalVacio.orElseGet(() -> "Valor generado por el proveedor");
```

-  <b>orElseThrow(Supplier<? extends X> excepcionProveedor):</b> Devuelve el valor contenido en el Optional, o lanza una excepción proporcionada por el proveedor si está vacío.
```java
String resultado = optionalVacio.orElseThrow(() -> new NoSuchElementException("El Optional está vacío"));
```

<h3>Beneficios de Optional:</h3>

-  <b>Evita NullPointerException:</b> Al utilizar Optional, se puede reducir la probabilidad de NullPointerException ya que fuerza al programador a considerar la posibilidad de valores nulos.

-  <b>Expresividad y claridad:</b> Al utilizar métodos como orElse, ifPresent, etc., el código se vuelve más expresivo y claro en comparación con las verificaciones manuales de nulos.

-  <b>Fluidez en el flujo de trabajo:</b> Puede integrarse fácilmente en el flujo de trabajo de programación funcional, como el uso de map, filter, y otros métodos de Stream.

<p>Es importante notar que Optional no debería utilizarse para todos los casos. Es especialmente útil cuando necesitas expresar claramente la posibilidad de un valor nulo en tu API, pero no debe ser utilizado de manera excesiva para envolver todos los valores. Se debe aplicar con discernimiento según el contexto.</p>
