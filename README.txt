Projet utilisant JUnit Jupiter afin d'exécuter des tests ReadyAPI (SoapUI Pro).

La machine exécutant les tests doit avoir une installation de ReadyAPI, notamment pour les vérifications de licence.

Les tests sont exécutés sur OpenWeather et ne nécessite pas d'autres configurations.

Ce projet comporte deux tests, le principe de chaque test est le même :

1. Ecriture dans un fichier des informations nécessaires pour l'API (ReadyAPI only)
2. Lecture depuis le fichier des informations pour les injecter dans des propriétés
3. Utilisation des propriétés pour accéder au service avec les bons paramètres
4. Assertion sur le retour de l'API

Le premier test weatherByCityTest se termine en succès.

Le second test weatherByCityFailure est en échec avec une erreur sur l'assertion.