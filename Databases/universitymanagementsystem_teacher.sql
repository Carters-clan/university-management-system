-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: universitymanagementsystem
-- ------------------------------------------------------
-- Server version	8.0.32

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `teacher`
--

DROP TABLE IF EXISTS `teacher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `teacher` (
  `name` varchar(40) DEFAULT NULL,
  `fname` varchar(40) DEFAULT NULL,
  `empId` varchar(20) DEFAULT NULL,
  `dob` varchar(25) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `phone` varchar(25) DEFAULT NULL,
  `email` varchar(40) DEFAULT NULL,
  `class_x` varchar(20) DEFAULT NULL,
  `class_xii` varchar(20) DEFAULT NULL,
  `aadhar` varchar(20) DEFAULT NULL,
  `education` varchar(40) DEFAULT NULL,
  `department` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacher`
--

LOCK TABLES `teacher` WRITE;
/*!40000 ALTER TABLE `teacher` DISABLE KEYS */;
INSERT INTO `teacher` VALUES ('Sam Carter','Senior Carter','Ammiens_7539','16-Dec-1998','Chankyapuri Delhi','9810992972','Sam@gmail.com','90','96','123456789123','BCA','Computer Science'),('Kedar Nath Gupta','Senior Gupta','EMP_7253','15-Aug-1998','Ber Sarai','9876543210','kedar@gmail.com','92','80','123456789123','MCA','Computer Science'),('Sashi Gautam','Senior Gautam','EMP_163','12-Feb-1997','Khanpur','9874561230','sashi@gmail.com','92','98','12345678998','MCA','Computer Science'),('Chirag Bansal','Senior Bansal','EMP_371','15-Mar-1995','Lajpat Nagar','9988776655','chirag@gmail.com','88','91','112233445566','M.Tech','Computer Science'),('NANDINI','SENIOR TEWATIYA','EMP_44','28-Jul-2004','GREEN PARK','987654321','NANDINI@GMAIL.COM','80','73','01234567890','B.Tech','Computer Science');
/*!40000 ALTER TABLE `teacher` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-02-23 18:27:50
