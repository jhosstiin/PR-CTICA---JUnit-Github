## Introducción

Esta práctica tiene como objetivo llevar a cabo pruebas unitarias de Java utilizando las librerías JUnit.
A continución adjunto la URL a mi repositorio donde se puede comprobar las pruebas realizadas: [Repositorio jhostin](https://github.com/jhosstiin/PR-CTICA---JUnit-Github.git)


## Estructura de carpetas

El proyecto `es.tiernoparla.productos` se estructura en varias subcarpetas y archivos, de los cuales destacamos: 

- `src`: En esta carpeta se localiza el paquete de `tienda` donde tenemos las clases de `Producto, Inventario e inventarioTest`
    
- `lib`: Aquí se encuentra la librería que nos ayudará a realizar las pruebas unitarias (JUnit).

- `.gitignore`: En  este documento de texto se encuentran todos los elementos del proyecto que queremos que no sean rastreados por Git. En esta práctica se excluye el archivo `README.md`que se crea junto al proyecto.

## Ejecución de pruebas

El proyecto clonado poseía dos clase: Inventario y Producto. Dentro de la clase Inventario, se encuentran cinco métodos que ejecutará nuestro programa. A estos últimos son los que hay que realizarles el control de errores para que así, de verdad, comprobemos que los métodos cumplen con la lógica que tendrían que jecutar.

- `testActualizarStock`: en este método de prueba comprobaremos que al introducir la cantidad deseada de un X producto, este se actualiza y nos devuelve la nueva cantidad. Para controlar este método se ha utilizado el método assertEquals que nos ofece la librería de JUnit.

- `testAñadirProducto`: en este método de prueba comprobaremos que se añade correctamente un nuevo producto al inventario y que cuando lo buscamos en este mismo, no devuelve el código del producto nuevo añadido. Así mismo, se ha utilizado el método assertEquals para controlar esta parte del código.

- `testBuscarProductoPorCodigo`: en este método se prueba que al buscar un producto X por número de código, nos devuelva el valor de ese producto y que no esté vacío. Para controlar esto, se ha utilizado el método assertNotNull.

- `testEliminarProducto`: en este método de prueba comprobaremos que un elemento de producto se ha eliminado correctamente. Para ello, se ha utilizado el método assertNull que devuelve un mensaje de "no hay objeto" si se busca el código del elemento eliminado.

- `testListarProductos`: en este método se prueba que al solicitar una lista de productos que hay guardados en el inventario, nos devuelva el código del producto. Para controlar esto se ha utilizado el método assertNoyNull.


## Subida del proyecto.
- Para realizar la subida del proyecto a GitHub, primero me he tenido que crear una cuenta en la plataforma. Una vez hecho esto, me he creado un nuevo repositorio en el cuál he subido la práctica. Una vez creado el reposritorio en GitHub, la plataforma ofrece una URL la cual he utilizado para vincular mi repositorio local con el repositorio remoto. 
- El segundo paso que he realizado es descargarme Git para poder inicializar mi repositorio local. Los comandos que me han ayudado para la práctica son: 
- `git clone`: para clonar el repositorio del profesor.
- `git init`: para inicializr la carpeta donde he guardado el proyecto en cuestión y tener un seguiemiento del mismo.
- `git remote add origin (URL de mi repositorio)`: para vincular mi repositorio remoto con el repositorio local.
- `git add.`: para añadir todos los archivos modificados a la "stagin area" (o área de espera).
- `git commit -m "Comentario para explicar el cambio realizado"`: para confirmar todos los cambios realizados.
- `git push -u origin main`: para subirlo al repositorio remoto en la rama principal del proyecto.  


