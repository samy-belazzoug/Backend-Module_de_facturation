# Backend-Module_de_facturation


Objectif

Développer un mini-module de facturation permettant :
La création de clients
L’émission de factures avec détails
Le calcul automatique des montants
La génération d’un export de facture au format JSON

Contexte

Tu intègres une plateforme de gestion de projets (type AriMayi). Chaque client peut recevoir des factures liées à ses prestations. Tu dois concevoir un module REST permettant de gérer ce processus.


Fonctionnalités attendues

1. Gestion des clients
Liste des clients
Création d’un client (nom, email, SIRET, date de création)
Détail d’un client

2. Gestion des factures
Liste des factures
Création d’une facture (clientId, date, liste des lignes)
Chaque ligne contient : description, quantité, prix unitaire HT, taux de TVA
Le backend doit calculer automatiquement :

Total HT
Total TVA
Total TTC

3. Export JSON
retourne un JSON structuré représentant la facture complète

4. Règles métier
Une facture doit obligatoirement avoir au moins une ligne
Aucun champ ne doit être vide
Le taux de TVA peut être : 0%, 5.5%, 10% ou 20%

$$ Bonus (facultatif mais valorisé)
Authentification basique (Spring Security en mémoire)
Test unitaire d’au moins un service métier
Endpoint de recherche de factures par client ou date

$$ Contraintes techniques
Java 17+
Spring Boot 3.x
Base de données H2 ou PostgreSQL
Swagger ou Postman collection pour tester les endpoints
Structure MVC claire
Code commenté
