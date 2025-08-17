# 🧬 Módulo D – Herança & Polimorfismo

Este módulo reúne exercícios sobre **herança, polimorfismo e encapsulamento**, modelando regras de negócio reais com **menus interativos** e **validações objetivas**.

## 📂 Exercícios

1. **Ex01 – Ingressos de Cinema**
   - Cria uma hierarquia a partir de `Ingresso` (valor, nome do filme, tipo de áudio: dublado/legendado).
   - Implementa **Meia-Entrada** (`valor_final = valor / 2`) e **Ingresso Família** (`valor_final = valor × pessoas`, com **5% de desconto** quando `pessoas ≥ 4`).
   - Cada tipo expõe um método para **calcular o valor final** e **validar entradas** (ex.: `valor > 0`, `pessoas ≥ 1`).

2. **Ex02 – Usuários do Sistema**
   - Modela perfis por herança a partir de `Usuario`: **Gerente** (`admin = true`), **Vendedor** (`admin = false`, `qtdVendas`), **Atendente** (`admin = false`, `valorEmCaixa`).
   - Métodos por perfil:  
     Gerente → gerar relatório financeiro, consultar vendas, login/logoff, alterar dados/senha.  
     Vendedor → realizar venda (incrementa contador), consultar vendas, login/logoff, alterar dados/senha.  
     Atendente → receber pagamento (soma ao caixa), fechar caixa, login/logoff, alterar dados/senha.
   - Aplica **encapsulamento** com getters/setters **apenas quando fizer sentido** (ex.: **não** expor `setAdmin`).

3. **Ex03 – Relógios Globais**
   - Define uma superclasse `Relogio` com **hora/minuto/segundo**, **validações de faixa** e formatação `HH:MM:SS`.
   - Cria `RelogioBrasileiro` (24h) e `RelogioAmericano` (12h, **1–12** com **AM/PM**; não admite 13–24).
   - Na superclasse, declara um método que as subclasses implementam para **sincronizar** o relógio atual a partir de **qualquer outro relógio** (polimorfismo).

---

> Os enunciados completos dos exercícios estão disponíveis no arquivo:

- [04 – Herança & Polimorfismo](04-heranca-polimorfismo.md)

---


>Cada exercício possui um **menu interativo** e está implementado em seu próprio diretório, podendo ser executado diretamente **via terminal ou IntelliJ**.
