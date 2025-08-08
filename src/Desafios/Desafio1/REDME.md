# 💥 Promoção Relâmpago - SuperCompras

Na loja de departamentos **"SuperCompras"**, o gerente decidiu fazer uma **promoção especial**.  
Dependendo do valor da compra, os clientes receberão **diferentes descontos**.

Sua missão é implementar um programa que **determine o desconto aplicado com base no valor gasto**!

---

## 🧾 Entrada

A entrada deve receber uma **string** representando o valor da compra em **reais**,  
utilizando **duas casas decimais**.

- O valor será **sempre positivo**
- Não conterá **caracteres especiais**

---

## 📤 Saída

A saída deve retornar uma **string** informando o **desconto aplicado**.

As regras são:

- 🟠 Se o valor for **menor que 50**, o desconto é de **0%**
- 🔵 Se estiver entre **50 e 100** (inclusive), o desconto é de **10%**
- 🟢 Se for **acima de 100**, o desconto é de **20%**

---

## ✅ Exemplos

| Entrada | Saída             |
|--------:|-------------------|
| 49.99   | Desconto de 0%    |
| 75.00   | Desconto de 10%   |
| 150.00  | Desconto de 20%   |

---

## 💡 Dica

Considere utilizar `BigDecimal` para representar o valor da compra,  
garantindo **precisão nos cálculos com casas decimais**.

---