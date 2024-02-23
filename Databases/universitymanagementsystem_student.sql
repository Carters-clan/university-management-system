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
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student` (
  `name` varchar(40) DEFAULT NULL,
  `fname` varchar(40) DEFAULT NULL,
  `rollno` varchar(20) DEFAULT NULL,
  `dob` varchar(25) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `phone` varchar(25) DEFAULT NULL,
  `email` varchar(40) DEFAULT NULL,
  `class_x` varchar(20) DEFAULT NULL,
  `class_xii` varchar(20) DEFAULT NULL,
  `aadhar` varchar(20) DEFAULT NULL,
  `course` varchar(40) DEFAULT NULL,
  `branch` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES ('Amit Gusain','Senior. Gusain','Ammiens_3303','16-Dec-2000','Chanakyapuri Delhi','7289095248','amit89339t@gmail.com','82','78','123456789000','BCA','Computer Science'),('Nikita Gusain','Senior Gusain Jee','STU_7452','16-Jan-2004','Chanakyapuri Delhi','9717530961','nikita@gmail.com','80','88','008646004969','BA','Art & Culture'),('Geetika Mittal','Senior Mittal','STU_3381','14-Feb-2004','Khanpur Village','9876543211','geet@gmail.com','80','84','123456789987','BA','Art & Culture'),('Aarti Singh','Senior Singh','STU_376','23-Nov-2001','Smilepur','9871426887','aarti@gmail.com','86','92','332211665544','MA','Art & Culture');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-02-23 18:27:51
