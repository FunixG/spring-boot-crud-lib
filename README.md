<div align="center">
  <h1>🌱 Spring Boot Core & CRUD Utilities</h1>
  <p>Une bibliothèque modulaire pour accélérer le développement de projets Spring Boot, avec de nombreuses fonctionnalités et utilitaires prêts à l'emploi.</p>

  <img src="https://img.shields.io/badge/Spring%20Boot-4.x-brightgreen.svg" alt="Spring Boot">
  <img src="https://img.shields.io/badge/Java-25%2B-blue.svg" alt="Java">
  <img src="https://img.shields.io/badge/Gradle-Kotlin%20DSL-02303A.svg" alt="Gradle">
</div>

---

## 🚀 Introduction

**Spring Boot Core & CRUD Lib** est une bibliothèque personnelle conçue pour éliminer le code redondant (*boilerplate*) lors de la création de nouvelles API REST et d'applications backend. Elle standardise la façon de gérer les requêtes HTTP, la base de données, et les erreurs.

## 📦 Modules Inclus

Le projet est architecturalement découpé en plusieurs sous-modules pour vous permettre d'importer uniquement ce dont vous avez besoin :

- 🛠️ **`crud`** : Classes de base génériques (Controllers, Services, Repositories) permettant de générer automatiquement des points de terminaisons CRUD complets (avec pagination et recherche).
- ⚠️ **`exceptions`** : Gestion centralisée des erreurs de l'application. Traductions automatiques des exceptions standards en réponses HTTP propres (#ControllerAdvice).
- 💾 **`storage`** : Gestionnaire abstrait pour simplifier l'upload, la sécurisation, le téléchargement, et la suppression de fichiers.
- 🧪 **`test-utils`** : Outils, configurations et *fixtures* facilitant l'écriture et l'exécution de tests unitaires/intégrations (Spring Boot Test).
- 🔧 **`tools`** : Boîte à outils contenant des "helpers" (manipulation de dates, chaînes de caractères, validations personnalisées, etc.).
