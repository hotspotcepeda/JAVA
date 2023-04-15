# Apuntes git

**Cambiar de cuenta github en Windows**

`git config --global user.name "your_username"`	

`git config --global user.email "your_email@example.com"`

`git config --list`

`git config --list --show-origin`

**Importante en Windows!**

Modificar o elimar cuenta en el **Credential Manager**  <-------------

________________________________________

**Configuración de Git**

Antes de empezar a usar git de 0 es necesario configurarlo con el nombre de usuario y su correo electrónico.

**Muestra de los comandos:**

`git config`

```
usage: git config [<options>]

Config file location
    --global              use global config file
    --system              use system config file
    --local               use repository config file
    --worktree            use per-worktree config file
    -f, --file <file>     use given config file
    --blob <blob-id>      read config from given blob object

Action
    --get                 get value: name [value-pattern]
    --get-all             get all values: key [value-pattern]
    --get-regexp          get values for regexp: name-regex [value-pattern]
    --get-urlmatch        get value specific for the URL: section[.var] URL
    --replace-all         replace all matching variables: name value [value-pattern]
    --add                 add a new variable: name value
    --unset               remove a variable: name [value-pattern]
    --unset-all           remove all matches: name [value-pattern]
    --rename-section      rename section: old-name new-name
    --remove-section      remove a section: name
    -l, --list            list all
    --fixed-value         use string equality when comparing values to 'value-pattern'
    -e, --edit            open an editor
    --get-color           find the color configured: slot [default]
    --get-colorbool       find the color setting: slot [stdout-is-tty]

Type
    -t, --type <>         value is given this type
    --bool                value is "true" or "false"
    --int                 value is decimal number
    --bool-or-int         value is --bool or --int
    --bool-or-str         value is --bool or string
    --path                value is a path (file or directory name)
    --expiry-date         value is an expiry date

Other
    -z, --null            terminate values with NUL byte
    --name-only           show variable names only
    --includes            respect include directives on lookup
    --show-origin         show origin of config (file, standard input, blob, command line)
    --show-scope          show scope of config (worktree, local, global, system, command)
    --default <value>     with --get, use default value when missing entry
```
________________________________________

Establecer el nombre de usuario

`git config --global user.name "Your-Full-Name"`

Establecer el correo del usuario

`git config --global user.email "your-email-address"`

Activar el coloreado de la salida

`git config --global color.ui auto`

Mostrar el estado original en los conflictos

`git config --global merge.conflictstyle diff3`

Mostrar la configuración

`git config --list`

________________________________________

**Creación de un repositorio nuevo.**

`git init`

    git init "nombre-repositorio" crea un repositorio nuevo con el nombre "nombre-repositorio".
    Este comando crea crea una nueva carpeta con el nombre del repositorio, que a su vez contiene otra carpeta oculta llamada 
	.git que contiene la base de datos donde se registran los cambios en el repositorio
    No podemos inicializar el repositorio en una carpeta o subcarpeta que ya tenga inicializo git y que ya tenga el .git
    Ojo podemos inicializar el repo en la maquina local pero para crear el repo en github desde la máquina local por consola hay que tirar de API.
    Configura tu token de autenticación en la consola utilizando el comando git config --global github.token <tu-token>.

Crea un nuevo repositorio en GitHub utilizando la API de GitHub utilizando el siguiente comando:
`curl -H "Authorization: token <tu-token>" https://api.github.com/user/repos -d '{"name":"nombre-del-repositorio"}'`
    
    Para crear el repo en github lo más facil es ir a la web u crear nuevo repo, despues clonarlo en la maquina local modificar y subir.

**Copia de repositorios, descarga.**

`git clone`

	git clone "url-repositorio" crea una copia local del repositorio ubicado en la dirección "url-repositorio".
	A partir de que se hace la copia, los dos repositorios, el original y la copia, son independientes, es decir, 
	cualquier cambio en uno de ellos no se verá reflejado en el otro.
        
**Añadir cambios a un repositorio.**

**Con Git, cualquier cambio que hagamos en un proyecto tiene que pasar por tres estados hasta que guarde definitivamente en el repositorio.**

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

Para guardar los cambios en un repositorio Git utiliza la extructura de los tres niveles:

•	Commit Contiene información sobre el autor, el momento y el mensaje de los cambios.
•	Árbol (tree) Cada commit contiene además un árbol donde se registran los nombres y rutas de los ficheros en el repositorio cuando se hizo el commit.
•	Blob (binary file object) Para cada uno de los ficheros listados en el árbol hay un blob, que contiene una instantánea comprimida del contenido del fichero cuando se hizo el commit.
Si un fichero del repositorio no ha cambiado en el commit, el árbol apunta al blob del fichero del último commit donde el fichero cambió.

Referenciar un commit

Cada commit tiene asociado un código hash de 40 caracteres hexadecimales que lo identifica de manera única. Hay dos formas de referirse a un commit:
•	Nombre absoluto: Se utiliza su código hash (basta indicar los 4 o 5 primeros dígitos).
•	Nombre relativo: Se utiliza la palabra HEAD para referirse siempre al último commit. Para referirse al penúltimo commit se utiliza HEAD~1, al antepenúltimo HEAD~2, etc.
