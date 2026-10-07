# 🛒 Sistema E-Commerce em Java (POO)

Sistema de E-Commerce desenvolvido em **Java** com foco na aplicação prática dos pilares da **Programação Orientada a Objetos (POO)**. 

---

Este projeto foi construído como parte de um trabalho acadêmico/prático para exercitar modelagem de domínio, encapsulamento, polimorfismo, interfaces e boas práticas de desenvolvimento de software.

---

## 🧠 Conceitos de POO Aplicados

- **Encapsulamento**: Proteção dos atributos de cada classe com visibilidade `private`, disponibilizando *getters*, *setters* e métodos de validação.
- **Abstração & Interfaces**: Uso de `interface Pagamento` para definir o contrato de pagamento desacoplado do pedido.
- **Polimorfismo**: Implementação da interface `Pagamento` através das classes `PagamentoPix` e `PagamentoCartao`, permitindo processamentos distintos para cada método de pagamento.
- **Composição de Objetos**: Associação entre `Pedido`, `Usuario`, `Carrinho` e `Pagamento`.

---

