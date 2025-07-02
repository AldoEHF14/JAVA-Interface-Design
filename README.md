# Sistema de Gestión de Registro

Aplicación de escritorio desarrollada en Java utilizando **Swing** para la interfaz gráfica y **MySQL** como sistema gestor de BD. Permitir la gestión de registros de alumnos (crear, consultar,visualizar registros , actualizar y eliminar) de forma sencilla desde una interfaz visual.

## Descripcion

- ✅ Conexión a la base de datos.
- 📝 Añadir nuevos registros.
- 🔍 Consulta por ID o mostrar todos los registros.
- ✏️ Actualización de nombre de alumno mediante su ID.
- 🗑️ Eliminación alunmo mediante su ID.

## Configuración

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



