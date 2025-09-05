# 🧠 Módulo E – Interfaces

Este módulo reúne exercícios sobre **Interfaces, herança, polimorfismo e encapsulamento**, aplicados em cenários reais como **envio de mensagens, cálculo de tributos e geometria**.

## 📂 Exercícios

1. **Ex01 – Envio de Mensagens**
   - Cria uma interface comum para diferentes serviços de envio: `SMS`, `E-mail`, `Redes Sociais` e `WhatsApp`.
   - Cada serviço implementa um método para **receber uma mensagem como parâmetro** e processá-la.
   - Utiliza **polimorfismo** para permitir o envio da mesma mensagem para múltiplos serviços de forma unificada.

2. **Ex02 – Cálculo de Tributos**
   - Define uma superclasse `Produto` (nome, preço).
   - Cria subclasses específicas: `Alimentacao`, `SaudeEBemEstar`, `Vestuario`, `Cultura`.
   - Cada tipo possui um método para **calcular seu imposto**, com base em alíquotas
   - Aplica **polimorfismo** para calcular os tributos de forma genérica e reutilizável.

3. **Ex03 – Figuras Geométricas**
   - Cria uma interface `FiguraGeometrica` com método para **calcular a área**.
   - Implementa classes: `Quadrado` (lado), `Retângulo` (base e altura) e `Círculo` (raio).
   - Cada forma implementa seu próprio cálculo de área.
   - Permite **calcular áreas em lote** usando **polimorfismo**.

---

> Os enunciados completos dos exercícios estão disponíveis no arquivo:

- [05 – Polimorfismo na Prática](05-Interfaces-Lambda.md)

---

> Cada exercício pode ser executado diretamente **via terminal ou IntelliJ**.
