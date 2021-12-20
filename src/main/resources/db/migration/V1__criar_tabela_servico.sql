CREATE TABLE `servico` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `horas_banheiro` int(11) NOT NULL,
  `horas_cozinha` int(11) NOT NULL,
  `horas_outros` int(11) NOT NULL,
  `horas_quarto` int(11) NOT NULL,
  `horas_quintal` int(11) NOT NULL,
  `horas_sala` int(11) NOT NULL,
  `icone` varchar(14) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `porcentagem_comissao` decimal(19,2) NOT NULL,
  `posicao` int(11) NOT NULL,
  `qto_horas` int(11) NOT NULL,
  `valor_banheiro` decimal(19,2) NOT NULL,
  `valor_cozinha` decimal(19,2) NOT NULL,
  `valor_minimo` decimal(19,2) NOT NULL,
  `valor_outros` decimal(19,2) NOT NULL,
  `valor_quarto` decimal(19,2) NOT NULL,
  `valor_quintal` decimal(19,2) NOT NULL,
  `valor_sala` decimal(19,2) NOT NULL,
  PRIMARY KEY (`id`)
);