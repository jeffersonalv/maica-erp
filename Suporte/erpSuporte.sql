/*
SQLyog Enterprise - MySQL GUI v7.12 
MySQL - 5.6.10 : Database - erpsuporte
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`erpsuporte` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `erpsuporte`;

/*Table structure for table `arquivo` */

DROP TABLE IF EXISTS `arquivo`;

CREATE TABLE `arquivo` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `ID_CHAMADO` int(10) unsigned NOT NULL,
  `CAMINHO` text,
  `DATA_ENVIO` date DEFAULT NULL,
  `HORA_ENVIO` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_CHAMADO_ARQUIVO` (`ID_CHAMADO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `arquivo` */

/*Table structure for table `chamado` */

DROP TABLE IF EXISTS `chamado`;

CREATE TABLE `chamado` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `ABERTO_POR` char(1) DEFAULT NULL,
  `DATA_ABERTURA` date DEFAULT NULL,
  `HORA_ABERTURA` varchar(8) DEFAULT NULL,
  `DATA_FECHAMENTO` date DEFAULT NULL,
  `HORA_FECHAMENTO` varchar(8) DEFAULT NULL,
  `ID_EMPRESA` int(10) unsigned DEFAULT NULL,
  `NOME_EMPRESA` varchar(100) DEFAULT NULL,
  `ID_USUARIO` int(10) unsigned DEFAULT NULL,
  `NOME_USUARIO` varchar(100) DEFAULT NULL,
  `ID_TECNICO` int(10) unsigned DEFAULT NULL,
  `NOME_TECNICO` varchar(100) DEFAULT NULL,
  `STATUS_CHAMADO` char(1) DEFAULT NULL,
  `MODULO` varchar(100) DEFAULT NULL,
  `JANELA` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `chamado` */

/*Table structure for table `chat` */

DROP TABLE IF EXISTS `chat`;

CREATE TABLE `chat` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `ID_CHAMADO` int(10) unsigned NOT NULL,
  `MENSAGEM` varchar(150) DEFAULT NULL,
  `DATA_MENSAGEM` date DEFAULT NULL,
  `HORA_MENSAGEM` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_CHAMADO_CHAT` (`ID_CHAMADO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `chat` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
