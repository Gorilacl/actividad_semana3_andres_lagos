# Taller de Aplicaciones Móviles — Actividad Formativa Semana 03

**Estudiante:** Andres Lagos  
**Docente:** Ivan Ayala  
**Módulo:** TALLER DE APLICACIONES MÓVILES  
**Semana:** 03  

Este repositorio contiene:  
- Código en Java SE 8 compilado **sin IDE**, usando `javac` y ejecutado con `java`.  
- Documentación del proceso de compilación/ejecución.  
- Requerimientos funcionales y no funcionales.  
- Historias de usuario del caso de estudio.  
- Cronograma inicial.  

---

## 1. Requerimientos del entorno

- Java SE Development Kit (JDK) 8 o superior instalado.  
- Consola/Terminal con acceso a `javac` y `java` en el `PATH`.  
- Sistema operativo Windows, Linux o macOS.  

---

## 2. Estructura del proyecto

```
.
├─ src/
│  └─ App.java
└─ README.md
```

---

## 3. Compilación y ejecución SIN IDE

### Windows (CMD o PowerShell)

```bat
cd src
javac App.java -d ../out
cd ../out
java App
```

### Linux / macOS (bash/zsh)

```bash
cd src
javac App.java -d ../out
cd ../out
java App
```

---

## 4. Funcionalidad del programa

El programa solicita **uno por uno** los siguientes datos y los imprime inmediatamente:  

1. Nombre (usuario)  
2. Edad (entero)  
3. Marca (vehículo)  
4. Modelo (vehículo)  
5. Cilindrada (ej: 1600cc, 1.6L)  
6. Tipo de combustible (ej: Gasolina, Diésel)  
7. Capacidad en pasajeros (entero)  

---

## 5. Requerimientos

### 5.1 Funcionales
- RF-01: Ingresar nombre y edad del usuario.  
- RF-02: Ingresar marca, modelo, cilindrada, combustible y pasajeros.  
- RF-03: Mostrar cada dato ingresado inmediatamente.  
- RF-04: Compilar y ejecutar por línea de comandos sin IDE.  

### 5.2 No funcionales
- RNF-01: Compatible con JDK 8+ en Windows/Linux/macOS.  
- RNF-02: Tiempo de respuesta inmediato.  
- RNF-03: Usabilidad de consola con mensajes claros y en español.  
- RNF-04: Código comentado línea por línea.  

---

## 6. Historias de Usuario

- **HU-01:** *Como cliente* quiero registrarme con mi cuenta Gmail para comprar en la distribuidora, *para* no crear otra contraseña.  
- **HU-02:** *Como cliente* quiero ingresar monto y distancia, *para* calcular el despacho según reglas.  
- **HU-03:** *Como cliente* quiero validar si mi dirección está en 20 km, *para* saber si califico para entrega.  
- **HU-04:** *Como administrador* quiero reportes de pedidos por comuna, *para* optimizar rutas.  

---

## 7. Cronograma inicial

| Fecha      | Actividad realizada                                                                 |
|------------|--------------------------------------------------------------------------------------|
| 29-ago-2025 | Instalación del JDK y verificación (`javac -version`, `java -version`).             |
| 29-ago-2025 | Creación de carpetas `src` y `out`, y desarrollo del programa `App.java`.           |
| 29-ago-2025 | Compilación del programa con `javac App.java -d ../out`.                            |
| 29-ago-2025 | Ejecución del programa en consola con pruebas de entrada y salida.                  |
| 29-ago-2025 | Documentación del proceso, elaboración del informe Word y organización del repositorio. |

---

## 8. Bibliografía

- Oracle. (s. f.). *Java Platform, Standard Edition (Java SE) 8*. Oracle.  
- Oracle. (s. f.). *The Java™ Tutorials*. Oracle.  
- AIEP. (2025). *Actividad Formativa – Semana 03*. Instituto Profesional AIEP.  
