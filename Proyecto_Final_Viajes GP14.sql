-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 14, 2024 at 08:31 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `proyecto_final`
--
CREATE DATABASE IF NOT EXISTS `proyecto_final` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `proyecto_final`;

-- --------------------------------------------------------

--
-- Table structure for table `alojamiento`
--

CREATE TABLE `alojamiento` (
  `id_alojamiento` int(11) NOT NULL,
  `Fecha_inicio` date NOT NULL,
  `fecha_fin` date NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `servicio` varchar(40) NOT NULL,
  `importe_diario` double NOT NULL,
  `id_ciudadDestino` int(11) NOT NULL,
  `tipo_lojamiento` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `alojamiento`
--

INSERT INTO `alojamiento` (`id_alojamiento`, `Fecha_inicio`, `fecha_fin`, `estado`, `servicio`, `importe_diario`, `id_ciudadDestino`, `tipo_lojamiento`) VALUES
(34, '2024-05-01', '2024-05-06', 1, 'Pensión Completa', 33000, 29, 'Hotel'),
(35, '2024-05-04', '2024-05-08', 1, 'Media Pensión', 21000, 29, 'Departamento'),
(36, '2024-04-05', '2024-04-08', 1, 'Sin Pensión', 45000, 29, 'Cabaña'),
(37, '2025-01-04', '2025-01-11', 1, 'Media Pensión', 63000, 32, 'Hotel'),
(38, '2025-01-04', '2025-01-11', 1, 'Pensión Completa', 60500, 32, 'Departamento'),
(39, '2024-12-20', '2024-12-26', 1, 'Media Pensión', 61425, 30, 'Hotel'),
(40, '2024-12-21', '2024-12-27', 1, 'Pensión Completa', 42900, 30, 'Departamento'),
(41, '2025-07-05', '2025-07-07', 1, 'Desayuno', 58649, 34, 'Hotel'),
(42, '2025-07-18', '2025-07-21', 1, 'Desayuno', 30000, 34, 'Cabaña'),
(43, '2024-11-22', '2024-11-25', 1, 'Pensión Completa', 22000, 31, 'Hotel'),
(44, '2024-11-25', '2024-11-29', 1, 'Media Pensión', 21000, 31, 'Departamento'),
(45, '2025-07-18', '2025-07-21', 1, 'Pensión Completa', 75900, 33, 'Hotel'),
(46, '2025-07-21', '2025-07-27', 1, 'Media Pensión', 54337, 33, 'Cabaña'),
(47, '2025-01-01', '2025-01-08', 1, 'Pensión Completa', 88000, 37, 'Hotel'),
(48, '2025-01-02', '2025-01-09', 1, 'Media Pensión', 73500, 37, 'Departamento'),
(49, '2025-02-10', '2025-02-15', 1, 'Pensión Completa', 85800, 39, 'Hotel'),
(50, '2025-03-01', '2025-03-08', 1, 'Desayuno', 61200, 39, 'Departamento'),
(51, '2024-12-20', '2024-12-27', 1, 'Pensión Completa', 128700, 35, 'Hotel'),
(52, '2024-12-20', '2024-12-27', 1, 'Media Pensión', 102375, 35, 'Departamento'),
(53, '2025-05-01', '2025-05-08', 1, 'Sin Pensión', 80000, 36, 'Hotel'),
(54, '2025-05-19', '2025-05-23', 1, 'Media Pensión', 84000, 36, 'Departamento'),
(55, '2024-12-15', '2024-12-26', 1, 'Media Pensión', 102375, 41, 'Hotel'),
(56, '2024-12-15', '2024-12-26', 1, 'Desayuno', 79560, 41, 'Departamento'),
(57, '2025-01-01', '2025-01-08', 1, 'Pensión Completa', 60500, 41, 'Departamento'),
(58, '2024-12-21', '2024-12-26', 1, 'Pensión Completa', 85800, 45, 'Hotel'),
(59, '2024-12-20', '2024-12-26', 0, 'Media Pensión', 68250, 45, 'Departamento'),
(60, '2024-12-20', '2024-12-26', 1, 'Media Pensión', 68250, 45, 'Departamento'),
(61, '2024-11-30', '2024-12-07', 0, 'Pensión Completa', 55000, 46, 'Hotel'),
(62, '2024-11-30', '2024-12-07', 1, 'Pensión Completa', 55000, 46, 'Hotel'),
(63, '2024-12-20', '2024-12-26', 1, 'Sin Pensión', 35000, 46, 'Departamento'),
(64, '2024-11-12', '2024-11-14', 1, 'Sin Pensión', 98000, 32, 'Hotel'),
(65, '2024-11-14', '2024-11-15', 1, 'Media Pensión', 89250, 29, 'Hostel'),
(66, '2024-11-09', '2024-11-15', 1, 'Sin Pensión', 980000, 43, 'Hostel'),
(67, '2024-11-10', '2024-11-15', 1, 'Desayuno', 561000, 32, 'Cabaña'),
(68, '2024-11-29', '2024-11-30', 1, 'Sin Pensión', 99000, 31, 'Departamento'),
(69, '2024-11-15', '2024-11-17', 1, 'Media Pensión', 472500, 48, 'Hotel'),
(70, '2024-11-11', '2024-11-12', 1, 'Desayuno', 61200, 37, 'Hostel'),
(71, '2024-11-01', '2024-11-12', 1, 'Desayuno', 98000, 32, 'Cabaña'),
(72, '2024-11-12', '2024-11-12', 1, 'Desayuno', 98000, 37, 'Hotel'),
(73, '2024-11-12', '2024-11-13', 1, 'Desayuno', 8000, 44, 'Hostel'),
(74, '2024-11-12', '2024-11-16', 1, 'Desayuno', 800000, 45, 'Hotel'),
(75, '2024-07-15', '2024-07-20', 1, 'Pensión Completa', 59453, 40, 'Departamento'),
(76, '2025-01-03', '2025-01-10', 1, 'Pensión Completa', 108669, 40, 'Cabaña'),
(77, '2025-07-07', '2025-07-14', 1, 'Media Pensión', 20286, 28, 'Hotel'),
(78, '2025-12-16', '2025-12-23', 1, 'Pensión Completa', 28314, 30, 'Cabaña'),
(79, '2024-12-29', '2025-01-06', 1, 'Desayuno', 26506, 52, 'Cabaña'),
(80, '2025-01-05', '2025-01-10', 1, 'Pensión Completa', 30351, 53, 'Cabaña'),
(81, '2025-07-07', '2025-07-14', 1, 'Desayuno', 30496, 54, 'Cabaña'),
(82, '2025-07-14', '2025-07-21', 1, 'Sin Pensión', 37938, 55, 'Hostel'),
(83, '2025-01-15', '2025-01-20', 1, 'Pensión Completa', 50589, 42, 'Hotel'),
(84, '2024-11-30', '2024-12-07', 1, 'Media Pensión', 17745, 50, 'Cabaña'),
(85, '2024-12-13', '2024-12-20', 1, 'Media Pensión', 27286, 49, 'Hotel'),
(86, '2025-02-01', '2025-02-08', 1, 'Pensión Completa', 47175, 47, 'Hotel'),
(87, '2024-12-22', '2024-12-29', 0, 'Desayuno', 31664, 47, 'Cabaña'),
(88, '2025-07-07', '2025-07-14', 1, 'Media Pensión', 28967, 28, 'Departamento'),
(89, '2025-01-08', '2025-01-15', 1, 'Pensión Completa', 50589, 56, 'Hotel'),
(90, '2024-12-27', '2025-01-07', 1, 'Sin Pensión', 59787, 56, 'Cabaña'),
(91, '2024-11-29', '2025-01-06', 1, 'Pensión Completa', 43989, 57, 'Hotel'),
(92, '2024-12-23', '2024-12-30', 1, 'Media Pensión', 77504, 38, 'Hotel'),
(93, '2024-11-14', '2024-11-22', 0, '---Seleccionar---', 200, 32, '---Seleccionar---'),
(94, '2024-12-14', '2024-12-20', 1, 'Media Pensión', 34125, 42, 'Hotel'),
(95, '2024-12-05', '2025-01-01', 1, 'Media Pensión', 40950, 42, 'Hotel'),
(96, '2024-11-20', '2024-11-24', 1, 'Sin Pensión', 15000, 42, 'Departamento'),
(97, '2024-12-15', '2024-12-20', 1, 'Sin Pensión', 26000, 42, 'Cabaña'),
(98, '2024-11-01', '2024-11-03', 1, 'Desayuno', 45900, 42, 'Cabaña'),
(99, '2024-12-20', '2025-01-01', 1, 'Sin Pensión', 19500, 42, 'Cabaña'),
(100, '2024-11-15', '2024-11-18', 1, 'Pensión Completa', 16500, 32, 'Cabaña'),
(101, '2025-01-01', '2024-11-20', 1, 'Sin Pensión', 33000, 32, 'Cabaña'),
(102, '2024-11-15', '2024-11-22', 1, 'Sin Pensión', 15000, 32, 'Cabaña'),
(103, '2024-11-15', '2024-11-21', 1, 'Sin Pensión', 215, 32, 'Cabaña'),
(104, '2024-11-15', '2024-11-22', 1, 'Sin Pensión', 40000, 32, 'Hostel'),
(105, '2024-12-01', '2024-12-05', 1, 'Media Pensión', 27300, 36, 'Hotel'),
(106, '2024-10-01', '2024-10-08', 1, 'Pensión Completa', 33000, 38, 'Hotel'),
(107, '2024-10-09', '2024-10-13', 1, 'Desayuno', 15300, 47, 'Departamento');

-- --------------------------------------------------------

--
-- Table structure for table `ciudad`
--

CREATE TABLE `ciudad` (
  `id_ciudad` int(11) NOT NULL,
  `nombre` varchar(25) NOT NULL,
  `pais` varchar(20) NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `provincia` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `ciudad`
--

INSERT INTO `ciudad` (`id_ciudad`, `nombre`, `pais`, `estado`, `provincia`) VALUES
(28, 'Buenos Aires', 'Argentina', 1, 'Buenos Aires'),
(29, 'Córdoba', 'Argentina', 1, 'Córdoba'),
(30, 'Mendoza', 'Argentina', 1, 'Mendoza'),
(31, 'Rosario', 'Argentina', 1, 'Santa Fe'),
(32, 'Mar del Plata', 'Argentina', 1, 'Buenos Aires'),
(33, 'Ushuaia', 'Argentina', 1, 'Tierra del Fuego'),
(34, 'El Calafate', 'Argentina', 1, 'Santa Cruz'),
(35, 'Rio de Janeiro', 'Brasil', 1, 'Rio de Janeiro'),
(36, 'São Paulo', 'Brasil', 1, 'São Paulo'),
(37, 'Salvador', 'Brasil', 1, 'Bahia'),
(38, 'Florianópolis', 'Brasil', 1, 'Santa Catarina'),
(39, 'Fortaleza', 'Brasil', 1, 'Ceará'),
(40, 'Recife', 'Brasil', 1, 'Pernambuco'),
(41, 'Montevideo', 'Uruguay', 1, 'Montevideo'),
(42, 'Punta del Este', 'Uruguay', 1, 'Maldonado'),
(43, 'Colonia del Sacramento', 'Uruguay', 1, 'Colonia'),
(44, 'Piriápolis', 'Uruguay', 1, 'Maldonado'),
(45, 'Santiago', 'Chile', 1, 'Santiago'),
(46, 'Valparaíso', 'Chile', 1, 'Valparaíso'),
(47, 'Viña del Mar', 'Chile', 1, 'Valparaíso'),
(48, 'San Pedro de Atacama', 'Chile', 1, 'Antofagasta'),
(49, 'Puerto Varas', 'Chile', 1, 'Los Lagos'),
(50, 'Pucón', 'Chile', 1, 'Araucanía'),
(51, 'San Luis', 'Argentina', 1, 'San Luis'),
(52, 'San Rafael', 'Argentina', 1, 'Mendoza'),
(53, 'Potrerillos', 'Argentina', 1, 'Mendoza'),
(54, 'Uspallata', 'Argentina', 1, 'Mendoza'),
(55, 'Las Leñas', 'Argentina', 1, 'Mendoza'),
(56, 'Villa Carlos Paz', 'Argentina', 1, 'Cordoba'),
(57, 'Potrero de los Funes', 'Argentina', 1, 'San Luis');

-- --------------------------------------------------------

--
-- Table structure for table `paquete`
--

CREATE TABLE `paquete` (
  `id_paquete` int(11) NOT NULL,
  `nombre_paquete` varchar(100) NOT NULL,
  `id_ciudadOrigen` int(11) NOT NULL,
  `id_ciudadDestino` int(11) NOT NULL,
  `id_alojamiento` int(11) NOT NULL,
  `id_pasaje` int(11) NOT NULL,
  `estado` tinyint(4) NOT NULL,
  `importePaquete` double NOT NULL,
  `id_turista1` int(11) NOT NULL,
  `id_turista2` int(11) DEFAULT NULL,
  `id_turista3` int(11) DEFAULT NULL,
  `id_turista4` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `paquete`
--

INSERT INTO `paquete` (`id_paquete`, `nombre_paquete`, `id_ciudadOrigen`, `id_ciudadDestino`, `id_alojamiento`, `id_pasaje`, `estado`, `importePaquete`, `id_turista1`, `id_turista2`, `id_turista3`, `id_turista4`) VALUES
(52, 'Paquete Turistico', 51, 40, 75, 52, 1, 628359, 15, 14, 11, NULL),
(53, 'Paquete Turistico', 51, 40, 76, 53, 1, 646672.5, 11, 13, 17, NULL),
(54, 'Paquete Turistico', 51, 43, 66, 54, 1, 2260000, 15, 16, 17, NULL),
(55, 'Paquete Turistico', 51, 44, 73, 55, 1, 395000, 13, 14, 16, NULL),
(58, 'Paquete Turistico', 51, 44, 73, 58, 1, 395000, 13, 14, 17, NULL),
(59, 'Paquete Turistico', 51, 28, 77, 59, 1, 190572, 11, 15, NULL, NULL),
(60, 'Paquete Turistico', 51, 52, 79, 60, 1, 244518, 20, 11, 16, 17),
(61, 'Paquete Turistico', 51, 53, 80, 61, 1, 160168, 11, 20, NULL, NULL),
(62, 'Paquete Turistico', 51, 34, 42, 62, 0, 450000, 15, 20, 16, NULL),
(63, 'Paquete Turistico', 51, 31, 68, 63, 1, 385000, 14, 20, 17, NULL),
(64, 'Paquete Turistico', 51, 37, 48, 64, 1, 558750, 11, 17, 20, NULL),
(65, 'Paquete Turistico', 51, 45, 49, 65, 1, 281600, 15, 20, NULL, NULL),
(66, 'Paquete Turistico', 51, 36, 54, 66, 1, 278000, 11, 13, NULL, NULL),
(67, 'Paquete Turistico', 51, 41, 38, 67, 0, 288750, 11, 20, 17, NULL),
(69, 'Paquete Turistico', 51, 47, 86, 69, 1, 591525, 14, 20, 16, 17),
(70, 'Paquete Turistico', 51, 37, 64, 70, 0, 612000, 14, 15, 13, 11),
(71, 'Paquete Turistico', 51, 34, 41, 71, 1, 417298, 14, 11, NULL, NULL),
(72, 'Paquete Turistico', 51, 43, 66, 72, 1, 2587500, 15, 20, 16, NULL),
(74, 'Paquete Turistico', 51, 35, 52, 74, 1, 472125, 13, 11, 14, NULL),
(76, 'Paquete Turistico', 51, 53, 80, 76, 1, 160168, 15, 20, NULL, NULL),
(77, 'Paquete Turistico', 51, 31, 68, 77, 1, 622500, 11, 20, 16, NULL),
(78, 'Paquete Turistico', 51, 37, 50, 78, 1, 422400, 11, 16, 17, NULL),
(79, 'Paquete Turistico', 51, 47, 86, 79, 1, 153262.5, 14, 17, NULL, NULL),
(80, 'Paquete Turistico', 51, 37, 64, 80, 1, 620000, 11, 13, 16, NULL),
(81, 'Paquete Turistico', 51, 53, 80, 81, 1, 350168, 17, 16, 11, NULL),
(85, 'Paquete Turistico', 51, 42, 97, 85, 1, 352000, 14, 13, NULL, NULL),
(87, 'Paquete Turistico', 51, 42, 99, 87, 1, 189000, 15, 20, NULL, NULL),
(94, 'Paquete Turistico', 51, 32, 103, 94, 1, 150215, 14, NULL, NULL, NULL),
(98, 'Paquete Turistico', 51, 32, 104, 98, 1, 190000, 13, NULL, NULL, NULL),
(99, 'Paquete Turistico', 51, 38, 34, 99, 1, 366000, 13, 11, NULL, NULL),
(100, 'Paquete Turistico', 51, 47, 107, 100, 1, 247950, 15, 16, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `pasaje`
--

CREATE TABLE `pasaje` (
  `id_pasaje` int(11) NOT NULL,
  `tipo_Transporte` varchar(20) NOT NULL,
  `importe` double NOT NULL,
  `id_ciudadOrigen` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `id_ciudadDestino` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pasaje`
--

INSERT INTO `pasaje` (`id_pasaje`, `tipo_Transporte`, `importe`, `id_ciudadOrigen`, `estado`, `id_ciudadDestino`) VALUES
(52, 'Avion', 150000, 51, 1, 40),
(53, 'Avion', 150000, 51, 1, 40),
(54, 'Avion', 150000, 51, 1, 43),
(55, 'Avion', 150000, 51, 1, 44),
(58, 'Avion', 150000, 51, 1, 44),
(59, 'Tren', 75000, 51, 1, 28),
(60, 'Colectivo', 55000, 51, 1, 52),
(61, 'Colectivo', 55000, 51, 1, 53),
(62, 'Avion', 150000, 51, 1, 34),
(63, 'Colectivo', 55000, 51, 1, 31),
(64, 'Avion', 150000, 51, 1, 37),
(65, 'Colectivo', 55000, 51, 1, 45),
(66, 'Colectivo', 55000, 51, 1, 36),
(67, 'Colectivo', 55000, 51, 1, 41),
(69, 'Avion', 150000, 51, 1, 47),
(70, 'Colectivo', 55000, 51, 1, 37),
(71, 'Avion', 150000, 51, 1, 34),
(72, 'Colectivo', 55000, 51, 1, 43),
(74, 'Colectivo', 55000, 51, 1, 35),
(76, 'Colectivo', 55000, 51, 1, 53),
(77, 'Avion', 150000, 51, 1, 31),
(78, 'Avion', 150000, 51, 1, 37),
(79, 'Colectivo', 55000, 51, 1, 47),
(80, 'Avion', 150000, 51, 1, 37),
(81, 'Avion', 150000, 51, 1, 53),
(85, 'Avion', 150000, 51, 1, 42),
(87, 'Tren', 75000, 51, 1, 42),
(94, 'Avion', 150000, 51, 1, 32),
(95, 'Colectivo', 55000, 51, 1, 32),
(98, 'Avion', 150000, 51, 1, 32),
(99, 'Avion', 150000, 51, 1, 38),
(100, 'Avion', 150000, 51, 1, 47);

-- --------------------------------------------------------

--
-- Table structure for table `turista`
--

CREATE TABLE `turista` (
  `id_turista` int(11) NOT NULL,
  `dni` bigint(20) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `edad` int(11) NOT NULL,
  `estado` int(11) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `turista`
--

INSERT INTO `turista` (`id_turista`, `dni`, `nombre`, `edad`, `estado`) VALUES
(11, 44643276, 'Carlos Benenatti', 21, 1),
(13, 42220800, 'Agustin Benenatti', 25, 1),
(14, 44163730, 'Jofre Dylan', 22, 1),
(15, 43072586, 'Flores Emiliano', 24, 1),
(16, 753159852, 'Mateo Rios', 9, 1),
(17, 741258963, 'Oriana Fuentes', 10, 1),
(20, 26898213, 'Daiana Morales', 24, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `alojamiento`
--
ALTER TABLE `alojamiento`
  ADD PRIMARY KEY (`id_alojamiento`),
  ADD KEY `id_cuidadDestino` (`id_ciudadDestino`);

--
-- Indexes for table `ciudad`
--
ALTER TABLE `ciudad`
  ADD PRIMARY KEY (`id_ciudad`),
  ADD UNIQUE KEY `nombre` (`nombre`),
  ADD KEY `provincia` (`provincia`),
  ADD KEY `provincia_2` (`provincia`),
  ADD KEY `provincia_3` (`provincia`);

--
-- Indexes for table `paquete`
--
ALTER TABLE `paquete`
  ADD PRIMARY KEY (`id_paquete`),
  ADD KEY `id_pasaje` (`id_pasaje`),
  ADD KEY `id_alojamiento` (`id_alojamiento`),
  ADD KEY `id_cuidadDestino` (`id_ciudadDestino`),
  ADD KEY `id_cuidadOrigen` (`id_ciudadOrigen`),
  ADD KEY `id_alojamiento_2` (`id_alojamiento`) USING BTREE,
  ADD KEY `id_turista1` (`id_turista1`),
  ADD KEY `id_turista2` (`id_turista2`),
  ADD KEY `id_turista3` (`id_turista3`),
  ADD KEY `id_turista4` (`id_turista4`);

--
-- Indexes for table `pasaje`
--
ALTER TABLE `pasaje`
  ADD PRIMARY KEY (`id_pasaje`),
  ADD KEY `id_ciudadOrigen` (`id_ciudadOrigen`),
  ADD KEY `fk_ciudadDestino` (`id_ciudadDestino`);

--
-- Indexes for table `turista`
--
ALTER TABLE `turista`
  ADD PRIMARY KEY (`id_turista`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `alojamiento`
--
ALTER TABLE `alojamiento`
  MODIFY `id_alojamiento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=108;

--
-- AUTO_INCREMENT for table `ciudad`
--
ALTER TABLE `ciudad`
  MODIFY `id_ciudad` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=59;

--
-- AUTO_INCREMENT for table `paquete`
--
ALTER TABLE `paquete`
  MODIFY `id_paquete` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=101;

--
-- AUTO_INCREMENT for table `pasaje`
--
ALTER TABLE `pasaje`
  MODIFY `id_pasaje` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=101;

--
-- AUTO_INCREMENT for table `turista`
--
ALTER TABLE `turista`
  MODIFY `id_turista` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `alojamiento`
--
ALTER TABLE `alojamiento`
  ADD CONSTRAINT `alojamiento_ibfk_1` FOREIGN KEY (`id_ciudadDestino`) REFERENCES `ciudad` (`id_ciudad`) ON DELETE CASCADE;

--
-- Constraints for table `paquete`
--
ALTER TABLE `paquete`
  ADD CONSTRAINT `paquete_ibfk_1` FOREIGN KEY (`id_ciudadOrigen`) REFERENCES `ciudad` (`id_ciudad`) ON DELETE CASCADE,
  ADD CONSTRAINT `paquete_ibfk_2` FOREIGN KEY (`id_ciudadDestino`) REFERENCES `ciudad` (`id_ciudad`) ON DELETE CASCADE,
  ADD CONSTRAINT `paquete_ibfk_3` FOREIGN KEY (`id_alojamiento`) REFERENCES `alojamiento` (`id_alojamiento`) ON DELETE CASCADE,
  ADD CONSTRAINT `paquete_ibfk_4` FOREIGN KEY (`id_pasaje`) REFERENCES `pasaje` (`id_pasaje`) ON DELETE CASCADE,
  ADD CONSTRAINT `paquete_ibfk_5` FOREIGN KEY (`id_turista1`) REFERENCES `turista` (`id_turista`),
  ADD CONSTRAINT `paquete_ibfk_6` FOREIGN KEY (`id_turista2`) REFERENCES `turista` (`id_turista`),
  ADD CONSTRAINT `paquete_ibfk_7` FOREIGN KEY (`id_turista3`) REFERENCES `turista` (`id_turista`),
  ADD CONSTRAINT `paquete_ibfk_8` FOREIGN KEY (`id_turista4`) REFERENCES `turista` (`id_turista`);

--
-- Constraints for table `pasaje`
--
ALTER TABLE `pasaje`
  ADD CONSTRAINT `fk_ciudadDestino` FOREIGN KEY (`id_ciudadDestino`) REFERENCES `ciudad` (`id_ciudad`) ON DELETE CASCADE,
  ADD CONSTRAINT `pasaje_ibfk_1` FOREIGN KEY (`id_ciudadOrigen`) REFERENCES `ciudad` (`id_ciudad`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
