# Installer le projet

Pour installer toute la stack de déploiement, exécutez les commandes suivantes :
```
docker-compose build
docker-compose up -d
```

# Configurer Jenkins

Connectez vous à cette adresse : localhost:8080. Renseignez le mot de passe, suivez les instructions indiquées.
Installez le plugin 'Job DSL'.

# Lancer un build

Pour lancer un build, vous devez configurer un premier job à la main. Mettez l'adresse de mon repository Git, la branche souhaitée (je conseille la v3 qui crée 3 jobs pour les 3 versions).
Remplacez le mot de passe "fixme" pour Docker hub par votre mot de passe dans le script groovy.

Vous pouvez ensuite lancer un build de ce job qui vous créera 3 jobs.

Lancez ensuite les différents jobs. 

Les jobs poussent les images générées sur le docker hub à chaque build.

La ligne qui exécute les tests avec PHPUnit est commentée car impossible de les faire fonctionner dans le container Jenkins.
