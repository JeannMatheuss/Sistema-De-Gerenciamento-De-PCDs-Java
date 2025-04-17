# Cadastro e Acompanhamento de Pessoas com Necessidades Especiais 🧑‍🦯🦽

## **Objetivo 🎯**
Desenvolver um sistema para cadastrar e acompanhar pessoas com deficiência, suas necessidades e atendimentos realizados.

## **Requisitos Funcionais 📝**
- **Cadastro de Pessoas**: O sistema deve permitir o cadastro de pessoas com deficiência. Cada pessoa terá as seguintes informações:
  - Nome
  - Idade
  - Tipo de deficiência (ex: auditiva, motora, visual, etc.)
  - Grau de deficiência (leve, moderado, severo)
  - Endereço
  
- **Cadastro de Atendimentos**: O sistema deve permitir o cadastro de atendimentos realizados, com:
  - Data 📅
  - Tipo de atendimento (ex: fisioterapia, psicologia, terapia ocupacional)
  - Profissional responsável 👩‍⚕️👨‍⚕️

- **Filtragem de Pessoas**: O sistema deve permitir filtrar as pessoas cadastradas por:
  - Tipo de deficiência
  - Grau de deficiência
  
- **Relatório de Atendimentos**: O sistema deve gerar um relatório detalhado com todos os atendimentos realizados por cada pessoa 📊.

## **Requisitos Técnicos ⚙️**
- **Java** como linguagem de programação.
- **JUnit 5** para testes unitários.
- **Maven** como ferramenta de build e gerenciamento de dependências.

## **Estrutura do Projeto 🏗️**
O projeto possui as seguintes classes principais:
1. **Pessoa**: Representa as pessoas com deficiência, com atributos como nome, idade, tipo de deficiência, grau e endereço.
2. **Atendimento**: Representa os atendimentos realizados, com atributos como data, tipo de atendimento e profissional responsável.
3. **CadastroPessoas**: Classe para gerenciar o cadastro e a filtragem das pessoas.
4. **RelatorioAtendimentos**: Classe para gerar os relatórios de atendimentos por pessoa.

