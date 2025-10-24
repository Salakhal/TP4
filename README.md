 # TP 4 : Classes et Objets


## Exercice 1 : Gestion d’un étudiant avec tableau de notes


## 1. Objectif
Mettre en pratique :  
- Création d’une **classe Java** (`Etudiant`)  
- Utilisation d’un **tableau dynamique** (agrandissement automatique)  
- Calcul d’une **moyenne** à partir d’un tableau  
- Affichage des informations d’un objet  

---

## 2. Structure du projet

```
TP4/
└─ src/
   └─ com.example.tp/
      ├ Etudiant.java
      └ MainEX1.java

```

## Résultat attendu

``` bash
Notes de Dupont Alice : 14.5, 12.0, 16.0
Etudiant[id=1, nom=Dupont, prenom=Alice, moyenne=14.17]
Notes de Martin Bob : 10.0, 13.5
Etudiant[id=2, nom=Martin, prenom=Bob, moyenne=11.75]

```

# Exercice 2 : Association Étudiant ↔ Filière (avec tableaux)

## 1. Objectif
Mettre en œuvre deux classes, Étudiant et Filière, liées par une association un-à-plusieurs (une filière regroupe plusieurs étudiants), sans utiliser de collections avancées mais en gérant un tableau dynamique.


## 2. Structure du projet
```
TP4/
└─ src/
   └─ com.example.tp/
      ├ Étudiant.java
      ├ Filiere.java
      └ MainEX2.java
```


## Résultat attendu

```bash

Filiere[id=1, nom=Informatique, nbEtudiants=6]
Filière Informatique (id=1) → 6 étudiants :
  • El Idrissi Mohamed (id=1)
  • Bentaleb Fatima   (id=2)
  • Chouaib Youssef   (id=3)
  • Lahlou Salma      (id=4)
  • Roussafi Hassan   (id=5)
  • Amrani Aïcha      (id=6)

Filiere[id=2, nom=Génie Civil, nbEtudiants=2]
Filière Génie Civil (id=2) → 2 étudiants :
  • Belkahia Khadija  (id=7)
  • Laaroussi Walid   (id=8)

Détail de e3 : Étudiant[id=3, nom=Chouaib, prénom=Youssef, filière=Informatique]

```


# Exercice 3 : Gestion des articles


## 1. Objectif
Mettre en pratique :  
- La création de **classes métier** (`Categorie`, `Article`)  
- L’utilisation de **tableaux et boucles** pour stocker et afficher les objets  
- La gestion d’un **identifiant auto-incrémenté** pour chaque classe  
- L’affichage des objets dans un format précis  

---

## 3. Structure du projet

```
TP4/
└─ src/
└─ ma/projet/
├─ bean/
│ ├ Categorie.java
│ └ Article.java
└─ test/
  └ TestApp.java

```

## Exemple de sortie attendue


``` bash
Ordinateur Portable :
  - 1 14 DELL INSPIRON
  - 2 4 SONY VAIO

Ordinateur Poste :
  - 3 74 TERRA
  - 4 785 HP Compaq

```



# Exercice 4 : Gestion d’Auteurs, Livres et Bibliothèques

## 1. Contexte et objectifs
Ce TP a pour but de mettre en œuvre :  
- La création de **classes Java**  
- L’instanciation d’**objets**  
- La gestion d’associations **un-à-plusieurs** (Auteur → Livres) et **plusieurs-à-plusieurs** (Bibliothèque ↔ Livres)  
- L’ajout d’un **champ id auto-incrémenté** garantissant l’unicité de chaque objet  

À l’issue du TP, la maîtrise de la modélisation orientée objet et la solidité des associations seront vérifiées.

---

 ``` bash

TP4/
└─ src/
   └─ com/example/tp/
       ├ Auteur.java        
       ├ Livre.java          
       ├ Bibliotheque.java  
       └ MainEX4.java           

```


## Résultat attendu

``` bash

Auteur[id=1, nom=Victor Hugo, nbLivres=2]
  • Livre[id=1, titre=Les Misérables, auteur=Victor Hugo]
  • Livre[id=2, titre=Notre-Dame de Paris, auteur=Victor Hugo]
Auteur[id=2, nom=George Orwell, nbLivres=1]
  • Livre[id=3, titre=1984, auteur=George Orwell]
Bibliotheque[id=1, nom=Centrale, taille=2]
  – Les Misérables (id=1)
  – 1984 (id=3)
Bibliotheque[id=2, nom=Quartier, taille=2]
  – Les Misérables (id=1)
  – Notre-Dame de Paris (id=2)

```

