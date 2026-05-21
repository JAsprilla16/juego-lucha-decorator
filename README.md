# Juego de Lucha - Patrones de Diseño en Java

[![Java CI with Maven](https://github.com/JAsprilla16/juego-lucha-decorator/actions/workflows/maven.yml/badge.svg)](https://github.com/JAsprilla16/juego-lucha-decorator/actions/workflows/maven.yml)

##  Descripción
Este proyecto implementa un juego de lucha en Java aplicando múltiples patrones de diseño y buenas prácticas de desarrollo de software.

El sistema permite crear distintos tipos de personajes y añadir habilidades especiales dinámicamente durante el combate.

Además, el proyecto incluye:
- Pruebas unitarias con JUnit
- Cobertura de código con JaCoCo
- Integración continua con GitHub Actions

---

##  Funcionalidades
- Sistema de combate entre personajes
- Ataques básicos
- Decoradores con habilidades especiales:
  -  Espada → daño extra probabilístico
  -  Escudo → reducción de daño probabilística
  -  Superpoder → curación, daño extra o stun
- Creación de personajes mediante Factory
- Estrategias de ataque dinámicas
- Construcción flexible de personajes con Builder

---

##  Patrones de Diseño Utilizados

###  Factory Method
Permite crear distintos tipos de personajes:
- Guerrero
- Ninja
- Mago

###  Builder
Facilita la construcción de personajes personalizados.

###  Strategy
Permite cambiar dinámicamente la estrategia de ataque:
- Agresivo
- Defensivo
- Crítico

###  Decorator
Añade habilidades especiales a los personajes sin modificar sus clases originales.

---

##  Pruebas y Calidad
- ✅ Pruebas unitarias con JUnit 5
- ✅ Cobertura de código con JaCoCo
- ✅ Reportes automáticos de cobertura
- ✅ Integración continua con GitHub Actions

---

##  Cobertura de Código
El proyecto cuenta con generación automática de reportes JaCoCo mediante GitHub Actions.

Para generar el reporte localmente:

```bash
mvn clean verify
mvn jacoco:report

## Autor
Juan Jose Arcos Asprilla
Yeraldi Betancourth Hurtado
Juan Andres Burgos Diaz