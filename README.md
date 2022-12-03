# movie-rental
Comp413 Enterprise System and Application Development

### Instruction 

configure the database:

```
cd movie-rental/src/main/resources/application.properties 
change spring.datasource.url=jdbc:mysql://localhost:3306/movie
input spring.datasource.username=
input spring.datasource.password=
```

Create the database fitting the url and name mentioned above (for example, host: 127.0.0.1, port: 3306, database name: movie)

Copy Data Definition Language Script

```sql
CREATE TABLE `movie` (
  `id` int NOT NULL AUTO_INCREMENT,
  `cost_production` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `director` varchar(255) DEFAULT NULL,
  `genre` varchar(255) DEFAULT NULL,
  `image_url` varchar(255) DEFAULT NULL,
  `leading_actor` varchar(255) DEFAULT NULL,
  `length` varchar(255) DEFAULT NULL,
  `rental_price` varchar(255) DEFAULT NULL,
  `revenue` varchar(255) DEFAULT NULL,
  `studio` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `year` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `tokens` (
  `id` int NOT NULL AUTO_INCREMENT,
  `created_date` datetime(6) DEFAULT NULL,
  `token` varchar(255) DEFAULT NULL,
  `user_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKgh73xiagbl0no2bm4i7q29isu` (`user_id`),
  CONSTRAINT `FKgh73xiagbl0no2bm4i7q29isu` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
```

Copy Data Manipulation Language Script

```sql

INSERT INTO `movie` (`id`, `cost_production`, `description`, `director`, `genre`, `image_url`, `leading_actor`, `length`, `rental_price`, `revenue`, `studio`, `title`, `year`) VALUES
(3, '25,000,000', 'It tells the story of banker Andy Dufresne (Tim Robbins), who is sentenced to life in Shawshank State Penitentiary for the murders of his wife and her lover, despite his claims of innocence.', 'Frank Darabont', 'Crime Movie', 'https://upload.wikimedia.org/wikipedia/en/8/81/ShawshankRedemptionMoviePoster.jpg', 'Frank Darabont', '142', '10', '73,300,000', 'Columbia Pictures', 'The Shawshank Redemption', '1994'),
(4, 'Unknown', 'It chronicles the troubled relationships between two Peking opera actors and lifelong friends Cheng Dieyi (Cheung) and Duan Xiaolou (Zhang), and Xiaolou\'s wife Juxian (Gong).', 'Chen Kaige', 'Romance', 'https://upload.wikimedia.org/wikipedia/en/c/c5/Farewell_My_Concubine_poster.jpg', 'Leslie Cheung', '171', '6', '5,200,000', 'Miramax Films ', 'Farewell My Concubine', '1993'),
(5, '1,500,000', 'The story follows the misadventures of Chaplin\'s Tramp as he falls in love with a blind girl (Virginia Cherrill) and develops a turbulent friendship with an alcoholic millionaire (Harry Myers).', 'Charlie Chaplin', 'Comedy', 'https://upload.wikimedia.org/wikipedia/commons/thumb/0/09/City_Lights_%281931_theatrical_poster_-_retouched%29.jpg/440px-City_Lights_%281931_theatrical_poster_-_retouched%29.jpg', 'Charlie Chaplin', '87', '5', '4,250,000', 'United Artists', 'City Lights', '1931');

INSERT INTO `tokens` (`id`, `created_date`, `token`, `user_id`) VALUES
(1, '2022-11-28 20:32:33.721000', 'ae4c14ba-4bad-4ff7-8604-0fb5c1920675', 1);

INSERT INTO `user` (`id`, `email`, `first_name`, `last_name`, `password`) VALUES
(1, 'Liu@email.com', 'YJ', 'Liu', 'E10ADC3949BA59ABBE56E057F20F883E');

```

open backend:

```
cd movie-rental
 ./mvnw spring-boot:run
```

open frontend:

```
cd movie-rental/src/frontend
npm install
npm run serve
```

