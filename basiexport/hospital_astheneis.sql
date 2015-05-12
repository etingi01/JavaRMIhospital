-- MySQL dump 10.13  Distrib 5.6.23, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: hospital
-- ------------------------------------------------------
-- Server version	5.7.7-rc-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `astheneis`
--

DROP TABLE IF EXISTS `astheneis`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `astheneis` (
  `idAstheneis` int(11) NOT NULL AUTO_INCREMENT,
  `onoma` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `epwnimo` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `tilefwno` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `diefthinsi` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `flag` int(1) NOT NULL,
  `dead` int(1) NOT NULL,
  PRIMARY KEY (`idAstheneis`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `astheneis`
--

LOCK TABLES `astheneis` WRITE;
/*!40000 ALTER TABLE `astheneis` DISABLE KEYS */;
INSERT INTO `astheneis` VALUES (1,'Evanthia','Tingiri','99756303','markou drakou 12','evtingiri@gmail.com',0,0),(2,'Rafaela','Louka','99394781','lithrodontas','rafa02@windowslive.com',0,0),(3,'Xristina','Antoniou','99003265','aglantzia','xristina@gmail.com',0,0),(4,'Chris','Panayiotou','99123456','latsia','chris@cs.ucy.ac.cy',0,0),(5,'Eleni','Panteli','99874563','larnaka','helen@gmail.com',0,1);
/*!40000 ALTER TABLE `astheneis` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-05-12 20:07:43
