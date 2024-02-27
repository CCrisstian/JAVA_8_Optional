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

<h2 align="center">'Optional.empty( )', 'Optional.of( )', y 'Optional.ofNullable( )'</h2>

<p>Los métodos <b>'Optional.empty()'</b>, <b>'Optional.of(T valor)'</b>, y <b>'Optional.ofNullable(T valor)'</b> son formas de crear instancias de la clase Optional en Java, que se utiliza para representar valores opcionales que pueden ser nulos.</p>

<h3>Optional.empty():</h3>

```java
Optional<String> optionalVacio = Optional.empty();
```
<p>Este método estático de la clase Optional se utiliza para crear una instancia de Optional que representa la ausencia de un valor, es decir, un Optional vacío. Puede drt utilizado cuando se desea indicar explícitamente que no hay ningún valor presente.</p>

Ejemplo de uso:

```java
Optional<String> optionalVacio = Optional.empty();

if (optionalVacio.isPresent()) {
    System.out.println("Este mensaje no se imprimirá porque el Optional está vacío.");
}
```

<h3>Optional.of(T valor):</h3>

```java
Optional<String> optionalConValor = Optional.of("Hola, mundo!");
```

<p>Este método estático de la clase Optional se utiliza para crear una instancia de Optional que contiene un valor no nulo. Si el valor proporcionado es nulo, of lanzará una excepción NullPointerException. Por lo tanto, se debe estar seguro de que el valor que se está envolviendo no es nulo.</p>

Ejemplo de uso:

```java
Optional<String> optionalConValor = Optional.of("Hola, mundo!");

if (optionalConValor.isPresent()) {
    System.out.println("El Optional contiene el valor: " + optionalConValor.get());
}
```

<h3>Optional.ofNullable(T valor):</h3>

```java
String cadena = "Hola, mundo!";
Optional<String> optionalPosiblementeNulo = Optional.ofNullable(cadena);
```

<p>Este método estático de la clase Optional se utiliza para crear una instancia de Optional que puede contener un valor nulo. A diferencia de Optional.of, ofNullable no lanzará una excepción si el valor proporcionado es nulo. Si el valor es no nulo, ofNullable devolverá un Optional con el valor; de lo contrario, devolverá un Optional vacío.</p>

Ejemplo de uso:

```java
String cadena = "Hola, mundo!";
Optional<String> optionalPosiblementeNulo = Optional.ofNullable(cadena);

if (optionalPosiblementeNulo.isPresent()) {
    System.out.println("El Optional contiene el valor: " + optionalPosiblementeNulo.get());
} else {
    System.out.println("El Optional está vacío.");
}
```

<p>Estos métodos son útiles para trabajar de manera más segura con valores opcionales y evitar NullPointerException. La elección entre ellos depende de si el valor que se está envolviendo puede o no ser nulo y de la preferencia en el manejo de nulos.</p>

