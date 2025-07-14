# Gestión de Registro
## Descripción

Aplicación de escritorio desarrollada en Java utilizando **Swing** para la interfaz gráfica y **MySQL** como sistema gestor de BD. Permitir la gestión de registros atraves de una conexión a la base de datos de forma sencilla desde una interfaz visual, esta nos permite:

- 📝 Añadir nuevos registros.
- 🔍 Consulta por ID o mostrar todos los registros en la BD.
- ✏️ Actualización de nombre de alumno mediante su ID.
- 🗑️ Eliminación alumno mediante su ID.

## Configuración de la BD

1. Crea la base de datos en XAMPP o simplemete descarga alumnosbd.sql:

```sql

CREATE DATABASE alumnosbd;
USE alumnosbd;

CREATE TABLE alumnos (
    ID INT PRIMARY KEY,
    Nombre VARCHAR(100),
    Grupo INT
);
```

> “Nota: Asegurate de que la conexion a tu base de datos sea correcta (user,pass)”



