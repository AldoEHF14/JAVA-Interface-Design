# Sistema de Gestión de Alumnos (Java + Swing + MySQL)

Aplicación de escritorio desarrollada en Java utilizando **Swing** para la interfaz gráfica y **MySQL** como sistema gestor de base de datos. Permitir la gestión de registros de alumnos (crear, consultar,visualizar tabla , actualizar y eliminar) de forma sencilla desde una interfaz visual.

## 🧩 Características

- ✅ Conexión a la base de datos.
- 📝 Añadir nuevos registros.
- 🔍 Consulta por ID o mostrar todos los registros.
- ✏️ Actualización de nombre de alumno mediante su ID.
- 🗑️ Eliminación con validación.

## ⚙️ Configuración

1. Crea la base de datos en XAMPP o simplemete bajarla del repositorio (alumnosbd.sql):

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



