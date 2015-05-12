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
-- Table structure for table `warnings`
--

DROP TABLE IF EXISTS `warnings`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `warnings` (
  `iddoctor` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `kodArrostou` int(11) NOT NULL,
  `therapeia` int(11) NOT NULL,
  `codeConsultation` int(11) NOT NULL,
  PRIMARY KEY (`iddoctor`,`kodArrostou`,`therapeia`,`codeConsultation`),
  KEY `kodArrostou_idx` (`kodArrostou`),
  KEY `therapeia_idx` (`therapeia`),
  KEY `codeConsultation_idx` (`codeConsultation`),
  CONSTRAINT `codeConsultation` FOREIGN KEY (`codeConsultation`) REFERENCES `consultation` (`idConsultation`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `iddoctor` FOREIGN KEY (`iddoctor`) REFERENCES `ipalliloi` (`username`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `kodArrostou` FOREIGN KEY (`kodArrostou`) REFERENCES `astheneis` (`idAstheneis`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `therapeia` FOREIGN KEY (`therapeia`) REFERENCES `therapeia` (`idTherapeia`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `warnings`
--

LOCK TABLES `warnings` WRITE;
/*!40000 ALTER TABLE `warnings` DISABLE KEYS */;
INSERT INTO `warnings` VALUES ('antonis',1,1,5);
/*!40000 ALTER TABLE `warnings` ENABLE KEYS */;
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
