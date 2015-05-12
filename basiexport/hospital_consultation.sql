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
-- Table structure for table `consultation`
--

DROP TABLE IF EXISTS `consultation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `consultation` (
  `idConsultation` int(11) NOT NULL AUTO_INCREMENT,
  `kodPatient` int(11) NOT NULL,
  `doctorusername` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `imerominiaConsultation` date NOT NULL,
  `ora` time(5) DEFAULT NULL,
  `emfanistike` int(1) DEFAULT NULL,
  PRIMARY KEY (`idConsultation`,`kodPatient`,`doctorusername`,`imerominiaConsultation`),
  KEY `doctorusername_idx` (`doctorusername`),
  KEY `kodPatient_idx` (`kodPatient`),
  CONSTRAINT `doctorusername` FOREIGN KEY (`doctorusername`) REFERENCES `ipalliloi` (`username`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `kodPatient` FOREIGN KEY (`kodPatient`) REFERENCES `astheneis` (`idAstheneis`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `consultation`
--

LOCK TABLES `consultation` WRITE;
/*!40000 ALTER TABLE `consultation` DISABLE KEYS */;
INSERT INTO `consultation` VALUES (5,1,'antonis','2015-04-24','15:30:00.00000',1),(6,2,'antonis','2015-04-25','14:31:00.00000',0),(7,3,'kiriakos','2015-04-27','14:50:00.00000',NULL),(8,4,'maria','2015-04-30','18:00:00.00000',NULL),(9,5,'kiriakos','2015-04-29','17:00:00.00000',NULL);
/*!40000 ALTER TABLE `consultation` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-05-12 20:07:44
