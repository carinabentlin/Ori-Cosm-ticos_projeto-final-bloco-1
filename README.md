# 🧴 Ori BioCosméticos - Projeto Final Bloco 01  

**Status:** Em construção ✅  

---

## 1. Descrição  

O **Projeto Orí BioCosméticos** é um sistema de e-commerce em console, desenvolvido em **Java**, como **exercício prático de Programação Orientada a Objetos (POO)** durante o **Bootcamp de Java – Turma 83 da Generation Brasil**, realizado em **30/09**.  

(Curiosidade: 

O projeto simula a gestão de produtos cosméticos, permitindo o **cadastro, consulta, atualização e exclusão de produtos** de forma prática e interativa.  

Atualmente, os produtos estão organizados em duas categorias principais — **Cremes** e **Sabonetes** — mas o sistema foi construído de forma modular, possibilitando **ampliações futuras**, como a inclusão de novas categorias de produtos e atributos específicos.  

Esse projeto foi desenvolvido para aplicar e consolidar conceitos de **POO**, incluindo:  

- Classes e Objetos  
- Atributos e Métodos  
- Modificadores de Acesso  
- Herança e Polimorfismo  
- Classes Abstratas  
- Interfaces  

Além de funcionar como um simulador de e-commerce, este projeto oferece uma base prática para compreender os princípios fundamentais da POO aplicados em um cenário realista.  

---

## 2. Funcionalidades do Projeto  

- **Criar Produto:** cadastra um novo produto (creme ou sabonete) com atributos específicos.  
- **Listar todos os Produtos:** exibe todos os produtos cadastrados no sistema.  
- **Buscar Produto por ID:** localiza rapidamente um produto pelo seu identificador único.  
- **Atualizar Produto:** permite alterar os dados de um produto existente.  
- **Excluir Produto:** remove um produto específico com base no ID.  

---

## 3. Estrutura das Classes  

- **Produto (Classe Abstrata):** define os atributos básicos de qualquer produto.  
- **Creme (Classe Estendida):** herda de Produto e adiciona o atributo *tipo de pele*.  
- **Sabonete (Classe Estendida):** herda de Produto e adiciona o atributo *fragrância*.  
- **ProdutoRepository (Interface):** define os métodos do CRUD.  
- **ProdutoController (Classe Controladora):** implementa as operações CRUD utilizando `ArrayList`.  

### 📌 Diagrama de Classes  

![](C:\Users\Sony\Downloads\diagrama_classes.png)

---

## 4. Tela Inicial do Sistema - Menu  

Ao executar a classe `Menu`, o sistema exibe um menu interativo em console com as seguintes opções:  

1. Criar Produto  
2. Listar todos os Produtos  
3. Buscar Produto por ID  
4. Atualizar Produto  
5. Excluir Produto  
6. Sair  

![image-20250930193128245](C:\Users\Sony\AppData\Roaming\Typora\typora-user-images\image-20250930193128245.png)

---

## 5. Requisitos  

Para executar o projeto localmente, você precisará de:  

- **Java JDK 17+**  
- **Eclipse IDE** ou **Spring Tools Suite (STS)**  

---

## 6. Como Executar o Projeto  

### 6.1. Importando o Projeto  

1. Clone o repositório:  

   ```bash
   git clone https://github.com/carinabentlin/Ori-Cosm-ticos_projeto-final-bloco-1.git
   ```

2. Abra o Eclipse/STS e selecione a pasta do Workspace.  

3. Vá em **File → Import...**  

4. Escolha **General → Existing Projects into Workspace** e clique em **Next**.  

5. Clique em **Browse...** e selecione a pasta clonada.  

6. Finalize clicando em **Finish**.  

---

### 6.2. Executando o Projeto  

1. No **Package Explorer**, abra a classe `Menu`.  
2. Clique em **Run**.  
3. O console exibirá o menu inicial do sistema.  

---

## 7. Contribuição  

Este repositório foi desenvolvido para fins educacionais no **Bootcamp de Java – Turma 83 da Generation Brasil**.  
Contribuições são bem-vindas!  

Você pode ajudar de diferentes formas:  

- Criando uma **issue**  
- Enviando um **pull request**  
- Compartilhando com colegas que também estejam aprendendo Java 🚀  

---

## 8. Próximos Passos  

Para evolução futura, o projeto pode incluir:  

- Novas categorias de cosméticos (ex: maquiagens, shampoos, óleos essenciais).  
- Integração com banco de dados para persistência de informações.  
- Implementação de uma interface gráfica (GUI).  
- Integração com APIs de pagamento.  
- Testes unitários automatizados.  

---

## 9. Referências  

Este projeto utilizou como base de aprendizado os seguintes cookbooks, de propriedade da **Generation Brasil**:  

- [Projeto Conta Bancária - Java](https://github.com/rafaelq80/conta_bancaria_t83)  
- [Projeto Farmácia - Java](https://github.com/rafaelq80/farmacia_java_t83)  

---

## 10. Sobre a Autora  

**Carina Bentlin**  
Jornalista, produtora cultural  e desenvolvedora em formação.  

📧 E-mail: **carinabentlin@gmail.com**  
🌐 GitHub: [carinabentlin](https://github.com/carinabentlin)  



