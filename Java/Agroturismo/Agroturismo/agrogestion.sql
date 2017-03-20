-- phpMyAdmin SQL Dump
-- version 2.7.0-pl2
-- http://www.phpmyadmin.net
-- 
-- Servidor: localhost
-- Tiempo de generación: 23-01-2008 a las 12:46:29
-- Versión del servidor: 5.0.18
-- Versión de PHP: 5.1.2
-- 
-- Base de datos: `agrogestion`
-- 
CREATE DATABASE `agrogestion` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE agrogestion;

-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `administradores`
-- 

CREATE TABLE `administradores` (
  `idadm` int(3) NOT NULL auto_increment,
  `usuario` varchar(20) NOT NULL,
  `pass` varchar(20) NOT NULL,
  PRIMARY KEY  (`idadm`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

-- 
-- Volcar la base de datos para la tabla `administradores`
-- 

INSERT INTO `administradores` VALUES (1, 'Andres', 'andres');
INSERT INTO `administradores` VALUES (2, 'Cristobal', 'cristobal');

-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `consultas`
-- 

CREATE TABLE `consultas` (
  `id` int(4) NOT NULL auto_increment,
  `email` varchar(50) NOT NULL,
  `telefono_contacto` varchar(15) NOT NULL,
  `mensaje` mediumtext NOT NULL,
  `fecha_mensaje` timestamp NOT NULL default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  `resuelto` tinyint(1) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- 
-- Volcar la base de datos para la tabla `consultas`
-- 


-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `tactividades`
-- 

CREATE TABLE `tactividades` (
  `idact` int(3) NOT NULL auto_increment,
  `nombre` varchar(80) character set latin1 collate latin1_spanish_ci NOT NULL,
  `descripcion` mediumtext character set latin1 collate latin1_spanish_ci NOT NULL,
  `foto` varchar(255) character set latin1 collate latin1_spanish_ci NOT NULL,
  `precio` decimal(5,2) NOT NULL,
  PRIMARY KEY  (`idact`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

-- 
-- Volcar la base de datos para la tabla `tactividades`
-- 

INSERT INTO `tactividades` VALUES (1, 'curso esquilador de ovejas', 'con este increible curso sera capaz de dejar a una oveja mas pelada q el chocho de una barbie', 'c:\\ya veremos', '50.00');
INSERT INTO `tactividades` VALUES (2, 'Ordeñar gorrinos', 'con esta fantastica actividad usted podra disfrutar de los placeres de un buen vaso de leche de gorrino ordeñada por sus propias manos', 'c:\\aun no lo se', '80.00');
INSERT INTO `tactividades` VALUES (3, 'curso avanzado de cortar jamon', 'este curso le da la oportunidad de convertirse en un maestro jamonero y vacilar en navidad delante de su cuñado', 'c:\\jamon jamon', '60.00');
INSERT INTO `tactividades` VALUES (4, 'excursion a la cueva del jeti', 'viaje con su pareja a la cueva del jeti, lugar q no le dejara indiferente', 'c:\\la cueva del jeti', '50.00');

-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `tactividadespropuestas`
-- 

CREATE TABLE `tactividadespropuestas` (
  `idactpro` int(5) NOT NULL auto_increment,
  `idact` int(4) NOT NULL,
  `plazas` int(3) NOT NULL,
  `fecha` date NOT NULL,
  `hora` varchar(5) character set latin1 collate latin1_spanish_ci NOT NULL,
  PRIMARY KEY  (`idactpro`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- 
-- Volcar la base de datos para la tabla `tactividadespropuestas`
-- 


-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `tcliente`
-- 

CREATE TABLE `tcliente` (
  `idcli` int(5) NOT NULL auto_increment,
  `nombre` varchar(20) NOT NULL,
  `apellido1` varchar(25) NOT NULL,
  `apellido2` varchar(25) NOT NULL,
  `telefono` varchar(15) NOT NULL,
  `email` varchar(70) NOT NULL,
  `identific` varchar(20) NOT NULL,
  `infoact` tinyint(1) NOT NULL,
  `infoofer` tinyint(1) NOT NULL,
  `usuario` varchar(20) NOT NULL,
  `pass` varchar(20) NOT NULL,
  PRIMARY KEY  (`idcli`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

-- 
-- Volcar la base de datos para la tabla `tcliente`
-- 

INSERT INTO `tcliente` VALUES (1, 'Pepe', 'Lopez', 'Sanchez', '65987412', 'pepe@lopez.com', '43085769-F', 1, 0, 'pep', 'pep');

-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `thabitaciones`
-- 

CREATE TABLE `thabitaciones` (
  `idhab` int(3) NOT NULL auto_increment,
  `nombre` varchar(40) character set latin1 collate latin1_spanish_ci NOT NULL,
  `ocumax` int(2) NOT NULL,
  `detalles` mediumtext character set latin1 collate latin1_spanish_ci NOT NULL,
  `foto` varchar(255) NOT NULL,
  `precio` decimal(5,2) NOT NULL,
  PRIMARY KEY  (`idhab`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- 
-- Volcar la base de datos para la tabla `thabitaciones`
-- 


-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `tregimen`
-- 

CREATE TABLE `tregimen` (
  `tipo` varchar(2) character set latin1 collate latin1_spanish_ci NOT NULL,
  `descripcion` mediumtext character set latin1 collate latin1_spanish_ci NOT NULL,
  `precio` decimal(5,2) NOT NULL,
  `activo` tinyint(1) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- 
-- Volcar la base de datos para la tabla `tregimen`
-- 

INSERT INTO `tregimen` VALUES ('SA', 'Sólo Alojamiento', '1.50', 1);
INSERT INTO `tregimen` VALUES ('AD', 'Alojamiento y Desayuno', '6.12', 1);
INSERT INTO `tregimen` VALUES ('MP', 'Media Pensión', '14.25', 1);
INSERT INTO `tregimen` VALUES ('PC', 'Pensión Completa', '22.40', 1);
INSERT INTO `tregimen` VALUES ('TI', 'Todo Incluido', '30.58', 0);

-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `treservaactividad`
-- 

CREATE TABLE `treservaactividad` (
  `idresact` int(5) NOT NULL auto_increment,
  `actividad` int(5) NOT NULL,
  `cliente` int(5) NOT NULL,
  `plazas` int(2) NOT NULL,
  `precio` float(5,2) NOT NULL,
  PRIMARY KEY  (`idresact`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- 
-- Volcar la base de datos para la tabla `treservaactividad`
-- 


-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `treservas`
-- 

CREATE TABLE `treservas` (
  `idres` int(5) NOT NULL auto_increment,
  `checkin` date NOT NULL,
  `checkout` date NOT NULL,
  `numhab` int(3) NOT NULL,
  `regimen` varchar(2) character set latin1 collate latin1_spanish_ci NOT NULL,
  `cliente` int(5) NOT NULL,
  `estadopago` tinyint(1) NOT NULL,
  `precioaloj` float(5,2) NOT NULL,
  `preciohab` float(5,2) NOT NULL,
  `observaciones` mediumtext character set latin1 collate latin1_spanish_ci NOT NULL,
  PRIMARY KEY  (`idres`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- 
-- Volcar la base de datos para la tabla `treservas`
-- 

