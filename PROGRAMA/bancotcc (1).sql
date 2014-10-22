-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 21-Out-2014 às 15:04
-- Versão do servidor: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `bancotcc`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `apartamentos`
--

CREATE TABLE IF NOT EXISTS `apartamentos` (
  `codApartamento` int(11) NOT NULL AUTO_INCREMENT,
  `cnpj` varchar(30) NOT NULL,
  `numeroApartamento` varchar(10) DEFAULT NULL,
  `blocoApartamento` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`codApartamento`),
  KEY `cnpj` (`cnpj`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `condominio`
--

CREATE TABLE IF NOT EXISTS `condominio` (
  `cnpj` varchar(30) NOT NULL,
  `nomeCondominio` varchar(100) DEFAULT NULL,
  `enderecoCondominio` varchar(100) DEFAULT NULL,
  `numeroCondominio` varchar(10) DEFAULT NULL,
  `bairroCondominio` varchar(30) DEFAULT NULL,
  `cepCondominio` varchar(20) DEFAULT NULL,
  `cidadeCondominio` varchar(30) DEFAULT NULL,
  `ufCondominio` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`cnpj`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `dependentes`
--

CREATE TABLE IF NOT EXISTS `dependentes` (
  `codDependente` int(11) NOT NULL AUTO_INCREMENT,
  `codMorador` int(11) NOT NULL,
  `rgDependente` varchar(20) DEFAULT NULL,
  `cpfDependete` varchar(20) DEFAULT NULL,
  `nomeDependente` varchar(30) DEFAULT NULL,
  `dataNacDep` varchar(15) DEFAULT NULL,
  `nacionDependente` varchar(15) DEFAULT NULL,
  `naturDependente` varchar(35) DEFAULT NULL,
  PRIMARY KEY (`codDependente`),
  KEY `codMorador` (`codMorador`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionarios`
--

CREATE TABLE IF NOT EXISTS `funcionarios` (
  `codFuncionario` int(11) NOT NULL AUTO_INCREMENT,
  `cnpj` varchar(30) NOT NULL,
  `cpfFuncionario` varchar(20) NOT NULL,
  `cargoFuncionario` varchar(30) DEFAULT NULL,
  `nascionalidadeFunc` varchar(30) DEFAULT NULL,
  `dataNascFunc` varchar(20) DEFAULT NULL,
  `naturalidadeFunc` varchar(20) DEFAULT NULL,
  `rgFuncionario` varchar(20) DEFAULT NULL,
  `nomeFunc` varchar(30) DEFAULT NULL,
  `loginFunc` varchar(20) DEFAULT NULL,
  `senhaFunc` varchar(20) DEFAULT NULL,
  `cnh` varchar(30) DEFAULT NULL,
  `estadoFunc` varchar(30) DEFAULT NULL,
  `cidadeFunc` varchar(30) DEFAULT NULL,
  `bairroFunc` varchar(30) DEFAULT NULL,
  `emailFunc` varchar(30) DEFAULT NULL,
  `enderecoFunc` varchar(50) DEFAULT NULL,
  `telefone1` varchar(30) DEFAULT NULL,
  `telefone2` varchar(30) DEFAULT NULL,
  `cepFunc` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`codFuncionario`),
  KEY `cnpj` (`cnpj`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `morador`
--

CREATE TABLE IF NOT EXISTS `morador` (
  `codMorador` int(11) NOT NULL AUTO_INCREMENT,
  `codFuncionario` int(11) NOT NULL,
  `codApartamento` int(11) NOT NULL,
  `cpfMorador` varchar(20) DEFAULT NULL,
  `nomeMorador` varchar(20) DEFAULT NULL,
  `nacionalidadeMorador` varchar(20) DEFAULT NULL,
  `naturalidadeMorador` varchar(20) DEFAULT NULL,
  `dataNascMorador` varchar(20) DEFAULT NULL,
  `loginMorador` varchar(20) DEFAULT NULL,
  `senhaMorador` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`codMorador`),
  KEY `codFuncionario` (`codFuncionario`),
  KEY `codApartamento` (`codApartamento`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `registrochamado`
--

CREATE TABLE IF NOT EXISTS `registrochamado` (
  `codChamado` int(11) NOT NULL AUTO_INCREMENT,
  `codMorador` int(11) NOT NULL,
  `codFuncionario` int(11) NOT NULL,
  `dataChamado` varchar(20) DEFAULT NULL,
  `horaChamado` varchar(20) DEFAULT NULL,
  `descChamado` text,
  `destinoChamado` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`codChamado`),
  KEY `codFuncionario` (`codFuncionario`),
  KEY `codMorador` (`codMorador`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `regvisitas`
--

CREATE TABLE IF NOT EXISTS `regvisitas` (
  `codVisita` int(11) NOT NULL AUTO_INCREMENT,
  `codVisitante` int(11) NOT NULL,
  `codApartamento` int(11) NOT NULL,
  `dataVisita` varchar(20) DEFAULT NULL,
  `horaEntrada` varchar(20) DEFAULT NULL,
  `dataSaida` varchar(20) DEFAULT NULL,
  `horaSaida` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`codVisita`),
  KEY `codVisitante` (`codVisitante`),
  KEY `codApartamento` (`codApartamento`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `veiculo`
--

CREATE TABLE IF NOT EXISTS `veiculo` (
  `codVeiculo` int(11) NOT NULL AUTO_INCREMENT,
  `placaVeiculo` varchar(15) NOT NULL,
  `codVisitante` int(11) NOT NULL,
  `codMorador` int(11) NOT NULL,
  `codDependente` int(11) NOT NULL,
  `codFuncionario` int(11) NOT NULL,
  `marcaVeiculo` varchar(15) DEFAULT NULL,
  `modeloVeiculo` varchar(15) DEFAULT NULL,
  `corVeiculo` varchar(15) DEFAULT NULL,
  `anoVeiculo` int(11) DEFAULT NULL,
  PRIMARY KEY (`codVeiculo`,`placaVeiculo`),
  KEY `codMorador` (`codMorador`),
  KEY `codDependente` (`codDependente`),
  KEY `codFuncionario` (`codFuncionario`),
  KEY `codVisitante` (`codVisitante`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `visitante`
--

CREATE TABLE IF NOT EXISTS `visitante` (
  `codVisitante` int(11) NOT NULL AUTO_INCREMENT,
  `rgVisitante` varchar(20) DEFAULT NULL,
  `nomeVisitante` varchar(35) DEFAULT NULL,
  PRIMARY KEY (`codVisitante`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `apartamentos`
--
ALTER TABLE `apartamentos`
  ADD CONSTRAINT `apartamentos_ibfk_1` FOREIGN KEY (`cnpj`) REFERENCES `condominio` (`cnpj`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `dependentes`
--
ALTER TABLE `dependentes`
  ADD CONSTRAINT `dependentes_ibfk_1` FOREIGN KEY (`codMorador`) REFERENCES `morador` (`codMorador`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `funcionarios`
--
ALTER TABLE `funcionarios`
  ADD CONSTRAINT `funcionarios_ibfk_1` FOREIGN KEY (`cnpj`) REFERENCES `condominio` (`cnpj`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `morador`
--
ALTER TABLE `morador`
  ADD CONSTRAINT `morador_ibfk_1` FOREIGN KEY (`codFuncionario`) REFERENCES `funcionarios` (`codFuncionario`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `morador_ibfk_2` FOREIGN KEY (`codApartamento`) REFERENCES `apartamentos` (`codApartamento`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `registrochamado`
--
ALTER TABLE `registrochamado`
  ADD CONSTRAINT `registrochamado_ibfk_1` FOREIGN KEY (`codFuncionario`) REFERENCES `funcionarios` (`codFuncionario`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `registrochamado_ibfk_2` FOREIGN KEY (`codMorador`) REFERENCES `morador` (`codMorador`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `regvisitas`
--
ALTER TABLE `regvisitas`
  ADD CONSTRAINT `regvisitas_ibfk_1` FOREIGN KEY (`codVisitante`) REFERENCES `visitante` (`codVisitante`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `regvisitas_ibfk_2` FOREIGN KEY (`codApartamento`) REFERENCES `apartamentos` (`codApartamento`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `veiculo`
--
ALTER TABLE `veiculo`
  ADD CONSTRAINT `veiculo_ibfk_1` FOREIGN KEY (`codMorador`) REFERENCES `morador` (`codMorador`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `veiculo_ibfk_2` FOREIGN KEY (`codDependente`) REFERENCES `dependentes` (`codDependente`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `veiculo_ibfk_3` FOREIGN KEY (`codFuncionario`) REFERENCES `funcionarios` (`codFuncionario`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `veiculo_ibfk_4` FOREIGN KEY (`codVisitante`) REFERENCES `visitante` (`codVisitante`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
