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
-- Table structure for table `therapeiesastheneies`
--

DROP TABLE IF EXISTS `therapeiesastheneies`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `therapeiesastheneies` (
  `codeAstheneias` int(11) NOT NULL,
  `therapeiaCode` int(11) NOT NULL,
  `imerominiaTA` date NOT NULL,
  PRIMARY KEY (`codeAstheneias`,`therapeiaCode`),
  KEY `therapeiaCode_idx` (`therapeiaCode`),
  CONSTRAINT `codeAstheneias` FOREIGN KEY (`codeAstheneias`) REFERENCES `astheneis` (`idAstheneis`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `therapeiaCode` FOREIGN KEY (`therapeiaCode`) REFERENCES `therapeia` (`idTherapeia`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `therapeiesastheneies`
--

LOCK TABLES `therapeiesastheneies` WRITE;
/*!40000 ALTER TABLE `therapeiesastheneies` DISABLE KEYS */;
INSERT INTO `therapeiesastheneies` VALUES (1,3,'2015-04-26'),(2,4,'2015-04-27'),(3,5,'2015-04-28'),(4,1,'2015-05-31'),(4,2,'2015-04-20'),(5,1,'2015-04-29'),(5,5,'2015-04-30');
/*!40000 ALTER TABLE `therapeiesastheneies` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-05-12 20:07:45
