Projet Microservices de Gestion de Clients et Voitures: Ce projet innovant repose sur une architecture de microservices pour rationaliser la gestion des clients et des voitures.
L'utilisation d'une passerelle facilite la coordination des requêtes entre ces microservices spécialisés. Le microservice Client, développé avec Spring Boot et utilisant MySQL comme base de données, se 
concentre sur la gestion des clients, offrant des opérations complètes telles que la création, la mise à jour et la suppression de clients. De plus, il permet la récupération rapide des informations 
spécifiques à un client. De même, le microservice Voiture, également construit avec Spring Boot et MySQL, est dédié à la gestion des informations relatives aux voitures. Il propose des fonctionnalités 
complètes, notamment la création, la mise à jour et la suppression de voitures, ainsi que la possibilité de récupérer la liste des voitures associées à un client particulier.

Pour exécuter le projet, cloner le référentiel depuis GitHub, configurer les bases de données dans les fichiers application.yml de chaque microservice, puis exécuter les microservices et la passerelle 
à l'aide de votre IDE ou de la ligne de commande. Assurez-vous que les bases de données sont correctement configurées avant de lancer les microservices.
