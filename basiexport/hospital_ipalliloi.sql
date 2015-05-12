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
-- Table structure for table `ipalliloi`
--

DROP TABLE IF EXISTS `ipalliloi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ipalliloi` (
  `username` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `onoma` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `epwnimo` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `tilefwno` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `codeType` int(11) NOT NULL,
  PRIMARY KEY (`username`),
  KEY `codeType_idx` (`codeType`),
  CONSTRAINT `codeType` FOREIGN KEY (`codeType`) REFERENCES `eidiypallilwn` (`codeEidikotitas`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ipalliloi`
--

LOCK TABLES `ipalliloi` WRITE;
/*!40000 ALTER TABLE `ipalliloi` DISABLE KEYS */;
INSERT INTO `ipalliloi` VALUES ('antonis','1234','Antonakis','Aleksiou','99658742','antonis@hotmail.com',2),('dimitris','1234','Dimitrios','Dimitriou','99546321','dimitris@gmail.com',4),('kiriakos','1234','kiriakos','Kiriakou','99587461','kiri@gmail.vom',2),('koulla','1234','kiriaki','kampouri','99568458','kiriaki@gmail.com',6),('maria','1234','maria','Kaka','99685023','mari@gmail.com',2),('marilena','1234','marilena','papadopoulou','998745214','marilena@host.com',1),('pantelis','1234','Pantelis','Andreou','99862354','pantelis',5),('rlouka01','8282','Rafaellita','Louka','99394781','rafkiola@gmail.com',2),('soula','1234','Athanasia','Athanasiou','99856303','atha@gmail.com',3);
/*!40000 ALTER TABLE `ipalliloi` ENABLE KEYS */;
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
