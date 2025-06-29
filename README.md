# Sistema de Gestión de Alumnos (Java + Swing + MySQL)

Este proyecto es una aplicación de escritorio desarrollada en Java utilizando **Swing** para la interfaz gráfica y **MySQL** como sistema gestor de base de datos. Su objetivo principal es permitir la gestión de registros de alumnos (crear, consultar, actualizar y eliminar) de forma sencilla desde una interfaz visual amigable.

## 🧩 Características

- ✅ Conexión segura a base de datos MySQL usando `PreparedStatement`.
- 📝 Añadir nuevos registros de alumnos.
- 🔍 Consulta por ID o mostrar todos los registros.
- ✏️ Actualización de nombre de alumno mediante su ID.
- 🗑️ Eliminación con validación.
- 🧼 Botón "Limpiar" para resetear campos del formulario.
- 💻 Interfaz hecha con `Swing` en NetBeans.

## 🛠️ Tecnologías

- Java SE 8+
- Swing (GUI)
- MySQL / MariaDB
- JDBC Driver (`mysql-connector-java`)
- NetBeans IDE


## ⚙️ Configuración

1. Crea la base de datos en MySQL:

```sql

CREATE DATABASE alumnosbd;
USE alumnosbd;

CREATE TABLE alumnos (
    ID INT PRIMARY KEY,
    Nombre VARCHAR(100),
    Grupo INT
);
```


> “Nota: Asegurate de que la conexion a tu base de datos sea correcta (User,Pass)”



