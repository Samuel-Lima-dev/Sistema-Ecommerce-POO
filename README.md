# 🛒 Sistema E-Commerce em Java (POO)

Sistema de E-Commerce desenvolvido em **Java** com foco na aplicação prática dos pilares da **Programação Orientada a Objetos (POO)**. 

---

Este projeto foi construído como parte de um trabalho acadêmico/prático para exercitar modelagem de domínio, encapsulamento, polimorfismo, herança, interfaces e boas práticas de desenvolvimento de software.

---

## 📌 Requisitos do Sistema

- 🛍️ **Gestão de Produtos e Estoque**: Cadastro de produtos físicos (com peso, dimensões e controlo de estoque) e produtos digitais (com link de download e tamanho em MB).
- 👤 **Gestão de Usuários**: Representação de clientes compradores.
- 🛒 **Carrinho de Compras**: Agrupamento de itens com validação de disponibilidade e cálculo dinâmico do valor total.
- 💳 **Formas de Pagamento**:
  - **PIX**: Pagamento via PIX com 10% de desconto.
  - **Cartão de Crédito**: Pagamento com validação de dados do cartão e opção de parcelamento.

---
 
## 🧠 Conceitos de POO Aplicados

- **Encapsulamento**: Proteção dos atributos de cada classe com visibilidade `private`, disponibilizando *getters*, *setters* e métodos de validação.
- **Abstração e Interfaces**: Uso de `interface Pagamento` para definir o contrato de pagamento desacoplado do pedido.
- **Polimorfismo**: Implementação da interface `Pagamento` através das classes `PagamentoPix` e `PagamentoCartao`, permitindo processamentos distintos para cada método de pagamento.
- **Herança**: A classe abstrata `Produto` serve como superclasse base para `ProdutoFisico` e `ProdutoDigital`, permitindo o reaproveitamento de atributos comuns e a especialização do comportamento de cada tipo de produto.
- **Composição de Objetos**: Associação entre `Pedido`, `Usuario`, `Carrinho` e `Pagamento`.

---

## 👨‍💻 Autor

Desenvolvido como projeto de estudos em Programação Orientada a Objetos.

