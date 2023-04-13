# Apuntes git

Cambiar de cuenta github en Windows

`git config --global user.name "your_username"`	

`git config --global user.email "your_email@example.com"`

git config --list
git config --list --show-origin`

**Importante en Windows!**

Modificar o elimar cuenta en el **Credential Manager**  <-------------

Configuración de Git
Antes de empezar a usar git es necesario configurarlo con el nombre de usuario y su correo electrónico.

git config
Establecer el nombre de usuario
git config --global user.name "Your-Full-Name"
Establecer el correo del usuario
git config --global user.email "your-email-address"
Activar el coloreado de la salida
git config --global color.ui auto
Mostrar el estado original en los conflictos
git config --global merge.conflictstyle diff3
Mostrar la configuración
git config --list

________________________________________

Creación de un repositorio nuevo

git init

    git init "nombre-repositorio" crea un repositorio nuevo con el nombre "nombre-repositorio".
    Este comando crea crea una nueva carpeta con el nombre del repositorio, que a su vez contiene otra carpeta oculta llamada 
	.git que contiene la base de datos donde se registran los cambios en el repositorio
            
Copia de repositorios

git clone

	git clone "url-repositorio" crea una copia local del repositorio ubicado en la dirección "url-repositorio".
	A partir de que se hace la copia, los dos repositorios, el original y la copia, son independientes, es decir, 
	cualquier cambio en uno de ellos no se verá reflejado en el otro.
        
Añadir cambios a un repositorio

Con Git, cualquier cambio que hagamos en un proyecto tiene que pasar por tres estados hasta que guarde definitivamente en el repositorio.
________________________________________
•	**Directorio de trabajo** (git add) Es el directorio que contiene una copia de una versión concreta del proyecto en la que se está trabajando. Puede contener ficheros que no pertenecen al repositorio.
________________________________________
•	**Zona temporal de intercambio** (git commit) **staging** area  es una zona donde se guardan los cambios temporalmente desde el directorio de trabajo antes de hacerlos definitivos y registrarlos en el repositorio.
________________________________________
•	**Repositorio** (git push) Es donde finalmente se guardan los cambios confirmados desde la zona temporal de intercambio.
Añadir cambios a la zona de intercambio temporal
________________________________________

`git add`

•	git add <fichero> añade los cambios en el fichero <fichero> del directorio de trabajo a la zona de intercambio temporal.
•	git add <carpeta> añade los cambios en todos los ficheros de la carpeta <carpeta> del directorio de trabajo a la zona de intercambio temporal.
•	git add . añade todos los cambios de todos los ficheros no guardados aún en la zona de intercambio temporal.
Añadir cambios al repositorio local

`git commit`

•	git commit -m "mensaje" confirma todos los cambios de la zona de intercambio temporal añadiéndolos al repositorio y creando una nueva versión del proyecto. "mensaje" es un breve mensaje describiendo los cambios realizados que se asociará a la nueva versión del proyecto.
•	git commit --amend -m "mensaje" cambia el mensaje del último commit por el nuevo mensaje "mensaje".

`git push`

•	Subimos los cambios

`git status`

**Con git status vamos controlando los cambios que tenemos y el estado ** 
________________________________________

Registro de cambios

Para guardar los cambios en un repositorio Git utiliza una estructura de tres niveles:
•	Commit Contiene información sobre el autor, el momento y el mensaje de los cambios.
•	Árbol (tree) Cada commit contiene además un árbol donde se registran los nombres y rutas de los ficheros en el repositorio cuando se hizo el commit.
•	Blob (binary file object) Para cada uno de los ficheros listados en el árbol hay un blob, que contiene una instantánea comprimida del contenido del fichero cuando se hizo el commit.
Si un fichero del repositorio no ha cambiado en el commit, el árbol apunta al blob del fichero del último commit donde el fichero cambió.

Referenciar un commit

Cada commit tiene asociado un código hash de 40 caracteres hexadecimales que lo identifica de manera única. Hay dos formas de referirse a un commit:
•	Nombre absoluto: Se utiliza su código hash (basta indicar los 4 o 5 primeros dígitos).
•	Nombre relativo: Se utiliza la palabra HEAD para referirse siempre al último commit. Para referirse al penúltimo commit se utiliza HEAD~1, al antepenúltimo HEAD~2, etc.
