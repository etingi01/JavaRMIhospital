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
-- Table structure for table `siggenisastheni`
--

DROP TABLE IF EXISTS `siggenisastheni`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `siggenisastheni` (
  `codeSIGGENI` int(11) NOT NULL AUTO_INCREMENT,
  `kodikosArrostou` int(11) NOT NULL,
  `onomaSiggeni` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `tiliefonoSiggeni` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`codeSIGGENI`),
  KEY `kodikosArrostou_idx` (`kodikosArrostou`),
  CONSTRAINT `kodikosArrostou` FOREIGN KEY (`kodikosArrostou`) REFERENCES `astheneis` (`idAstheneis`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `siggenisastheni`
--

LOCK TABLES `siggenisastheni` WRITE;
/*!40000 ALTER TABLE `siggenisastheni` DISABLE KEYS */;
INSERT INTO `siggenisastheni` VALUES (1,1,'eleni','99856325'),(2,2,'marios','99874563'),(3,3,'kiriaki','99785412'),(4,4,'andreas','99874621'),(5,5,'marina','99654123');
/*!40000 ALTER TABLE `siggenisastheni` ENABLE KEYS */;
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
