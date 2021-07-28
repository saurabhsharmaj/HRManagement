CREATE DATABASE  IF NOT EXISTS `payrollmanagement` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `payrollmanagement`;
-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: payrollmanagement
-- ------------------------------------------------------
-- Server version	5.5.68-MariaDB

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
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `department` (
  `dpet_id` int(11) NOT NULL AUTO_INCREMENT,
  `dept_name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`dpet_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='	';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `department`
--

LOCK TABLES `department` WRITE;
/*!40000 ALTER TABLE `department` DISABLE KEYS */;
/*!40000 ALTER TABLE `department` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `emp_detail`
--

DROP TABLE IF EXISTS `emp_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `emp_detail` (
  `emp_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `emp_title` varchar(45) DEFAULT NULL,
  `emp_name` varchar(255) DEFAULT NULL,
  `emp_dob` date DEFAULT NULL,
  `emp_doj` date DEFAULT NULL,
  `emp_address` varchar(255) DEFAULT NULL,
  `emp_city` varchar(100) DEFAULT NULL,
  `emp_pincode` varchar(45) DEFAULT NULL,
  `emp_mobile_no` varchar(15) DEFAULT NULL,
  `emp_state` varchar(45) DEFAULT NULL,
  `emp_mail_id` varchar(45) DEFAULT NULL,
  `emp_pan_no` varchar(45) DEFAULT NULL,
  `emp_pancard` blob,
  PRIMARY KEY (`emp_id`),
  KEY `USER_EMP_FK_idx` (`user_id`),
  CONSTRAINT `USER_EMP_FK` FOREIGN KEY (`user_id`) REFERENCES `user_info` (`USER_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='	';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `emp_detail`
--

LOCK TABLES `emp_detail` WRITE;
/*!40000 ALTER TABLE `emp_detail` DISABLE KEYS */;
/*!40000 ALTER TABLE `emp_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `emp_grade`
--

DROP TABLE IF EXISTS `emp_grade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `emp_grade` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `emp_id` int(11) DEFAULT NULL,
  `dept_id` int(11) DEFAULT NULL,
  `grade_id` int(11) DEFAULT NULL,
  `emp_from_date` date DEFAULT NULL,
  `emp_to_date` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `GRADE_DEPT_FK_idx` (`dept_id`),
  KEY `GRADE_TRAN_FK_idx` (`grade_id`),
  KEY `GRADE_EMP_FK_idx` (`emp_id`),
  CONSTRAINT `GRADE_EMP_FK` FOREIGN KEY (`emp_id`) REFERENCES `emp_detail` (`emp_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `GRADE_DEPT_FK` FOREIGN KEY (`dept_id`) REFERENCES `department` (`dpet_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `GRADE_TRAN_FK` FOREIGN KEY (`grade_id`) REFERENCES `grade_pay` (`grade_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `emp_grade`
--

LOCK TABLES `emp_grade` WRITE;
/*!40000 ALTER TABLE `emp_grade` DISABLE KEYS */;
/*!40000 ALTER TABLE `emp_grade` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `emp_salary`
--

DROP TABLE IF EXISTS `emp_salary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `emp_salary` (
  `salary_id` int(11) NOT NULL AUTO_INCREMENT,
  `emp_id` int(11) DEFAULT NULL,
  `emp_salary_month` varchar(15) DEFAULT NULL,
  `emp_salary_year` varchar(6) DEFAULT NULL,
  `emp_salary_eimbursment_date` date DEFAULT NULL,
  `dept_id` int(11) DEFAULT NULL,
  `grade_id` int(11) DEFAULT NULL,
  `emp_basic` double DEFAULT NULL,
  `emp_da` double DEFAULT NULL,
  `emp_ta` double DEFAULT NULL,
  `emp_hra` double DEFAULT NULL,
  `emp_ma` double DEFAULT NULL,
  `emp_bonus` double DEFAULT NULL,
  `emp_pf` double DEFAULT NULL,
  `emp_pt` double DEFAULT NULL,
  `emp_gross` double DEFAULT NULL,
  `emp_total_salary` double DEFAULT NULL,
  PRIMARY KEY (`salary_id`),
  KEY `SALARY_EMP_FK_idx` (`emp_id`),
  KEY `SALARY_DEPT_FK_idx` (`dept_id`),
  KEY `SALARY_GRADE_FK_idx` (`grade_id`),
  CONSTRAINT `SALARY_DEPT_FK` FOREIGN KEY (`dept_id`) REFERENCES `department` (`dpet_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `SALARY_EMP_FK` FOREIGN KEY (`emp_id`) REFERENCES `emp_detail` (`emp_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `SALARY_GRADE_FK` FOREIGN KEY (`grade_id`) REFERENCES `emp_grade` (`grade_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `emp_salary`
--

LOCK TABLES `emp_salary` WRITE;
/*!40000 ALTER TABLE `emp_salary` DISABLE KEYS */;
/*!40000 ALTER TABLE `emp_salary` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grade_pay`
--

DROP TABLE IF EXISTS `grade_pay`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `grade_pay` (
  `grade_id` int(11) NOT NULL AUTO_INCREMENT,
  `grade_name` varchar(100) DEFAULT NULL,
  `grade_short_name` varchar(45) DEFAULT NULL,
  `grade_basic` double DEFAULT NULL,
  `grade_ta` double DEFAULT NULL,
  `grade_da` double DEFAULT NULL,
  `grade_hra` double DEFAULT NULL,
  `grade_ma` double DEFAULT NULL,
  `grade_bonus` double DEFAULT NULL,
  `grade_pf` double DEFAULT NULL,
  `grade_pt` double DEFAULT NULL,
  PRIMARY KEY (`grade_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grade_pay`
--

LOCK TABLES `grade_pay` WRITE;
/*!40000 ALTER TABLE `grade_pay` DISABLE KEYS */;
/*!40000 ALTER TABLE `grade_pay` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_info`
--

DROP TABLE IF EXISTS `user_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_info` (
  `USER_ID` int(11) NOT NULL AUTO_INCREMENT,
  `USER_NAME` varchar(255) DEFAULT NULL,
  `PASSWORD` varchar(45) DEFAULT NULL,
  `EMAIL_ID` varchar(100) DEFAULT NULL,
  `USER_TYPE` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`USER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='		';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_info`
--

LOCK TABLES `user_info` WRITE;
/*!40000 ALTER TABLE `user_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_info` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-07-28 20:27:39
