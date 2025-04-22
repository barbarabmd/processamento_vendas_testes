# Projeto Processamento de Vendas em Java - Testes

Este projeto simula o processo de vendas de uma empresa de representação comercial, utilizando **Java** e **JUnit 5** para testes. 
O foco é representar o fluxo de um pedido, desde o recebimento até a entrega ou cancelamento, sem integração real com banco de dados ou APIs externas.

---

## Funcionalidades

- Simulação de pedidos recebidos por vendedores externos
- Avaliação de crédito do cliente
- Emissão de nota fiscal
- Envio da nota para os departamentos de expedição e financeiro
- Separação de mercadoria
- Geração de cobrança bancária
- Cancelamento de pedidos em caso de inadimplência
- Testes automatizados com JUnit 5

---

## Estrutura de Pacotes
── scr/
      └── vendas_testes/ 
                      └── Cliente.java 
                      ├── Pedido.java 
                      ├── AvaliadorCredito.java 
                      ├── NotaFiscal.java 
                      ├── Expedicao.java 
                      ├── Financeiro.java 
                      ├── Banco.java 
                      ├── BancoDeDados.java 
                      ├── ProcessadorPedido.java 
                      └── Main.java 
── tests/
        └── vendas_testes/
                        └── ProcessadorPedidoTest.java
                        
---

## Testes

Foi utilizado o **JUnit 5** para validar o funcionamento do fluxo de pedidos.

### Exemplos de testes implementados:

- O pedido é **finalizado ou cancelado** corretamente
- O cliente do pedido é corretamente atribuído

---

## Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/barbarabmd/processamento_vendas_testes.git

---

## Tecnologias

**Java 17+ (ou versão compatível)**

**IntelliJ IDEA**

**JUnit 5**

---

## Licença
Este projeto é livre para estudos e modificações. Nenhuma licença específica foi atribuída.

## Autor
Bárbara Marques Dantas
