-- -------------------------------------------------------------
-- TablePlus 5.1.0(468)
--
-- https://tableplus.com/
--
-- Database: movie
-- Generation Time: 2022-12-04 02:36:24.5830
-- -------------------------------------------------------------


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


INSERT INTO `movie` (`id`, `cost_production`, `description`, `director`, `genre`, `image_url`, `leading_actor`, `length`, `rental_price`, `revenue`, `studio`, `title`, `year`) VALUES
(3, '25,000,000', 'It tells the story of banker Andy Dufresne (Tim Robbins), who is sentenced to life in Shawshank State Penitentiary for the murders of his wife and her lover, despite his claims of innocence.', 'Frank Darabont', 'Crime Movie', 'https://upload.wikimedia.org/wikipedia/en/8/81/ShawshankRedemptionMoviePoster.jpg', 'Frank Darabont', '142', '10', '73,300,000', 'Columbia Pictures', 'The Shawshank Redemption', '1994'),
(4, 'Unknown', 'It chronicles the troubled relationships between two Peking opera actors and lifelong friends Cheng Dieyi (Cheung) and Duan Xiaolou (Zhang), and Xiaolou\'s wife Juxian (Gong).', 'Chen Kaige', 'Romance', 'https://upload.wikimedia.org/wikipedia/en/c/c5/Farewell_My_Concubine_poster.jpg', 'Leslie Cheung', '171', '6', '5,200,000', 'Miramax Films ', 'Farewell My Concubine', '1993'),
(5, '1,500,000', 'The story follows the misadventures of Chaplin\'s Tramp as he falls in love with a blind girl (Virginia Cherrill) and develops a turbulent friendship with an alcoholic millionaire (Harry Myers).', 'Charlie Chaplin', 'Comedy', 'https://upload.wikimedia.org/wikipedia/commons/thumb/0/09/City_Lights_%281931_theatrical_poster_-_retouched%29.jpg/440px-City_Lights_%281931_theatrical_poster_-_retouched%29.jpg', 'Charlie Chaplin', '87', '5', '4,250,000', 'United Artists', 'City Lights', '1931');

INSERT INTO `tokens` (`id`, `created_date`, `token`, `user_id`) VALUES
(1, '2022-11-28 20:32:33.721000', 'ae4c14ba-4bad-4ff7-8604-0fb5c1920675', 1);

INSERT INTO `user` (`id`, `email`, `first_name`, `last_name`, `password`) VALUES
(1, 'Liu@email.com', 'YJ', 'Liu', 'E10ADC3949BA59ABBE56E057F20F883E');



/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;