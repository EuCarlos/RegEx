# RegEx :ok_hand:

<p align="center">
<img src="images/RegEx.png" width="300px"><br>
<img alt="GitHub language count" src="https://img.shields.io/github/languages/count/EuCarlos/RegEx">
<img alt="repo size" src="https://img.shields.io/github/repo-size/eucarlos/RegEx?color=yellow">
<img alt="license" src="https://img.shields.io/github/license/eucarlos/RegEx"><br>
<a href="https://github.com/EuCarlos/RegEx/blob/main/README.md">Português (Brasil)</a> • English (Em Breve)
</p>

## Sumario
 - [O que é o RegEx? E para que serve?](#o-que-é-o-regex-e-para-que-serve)
 - [Recursos](#recursos)
 - [Flags](#flags)
 - [Meta-Caracteres](#meta-caracteres)
    - [Grupos e Intervalos](#grupos-e-intervalos)
    - [Quantificadores](#quantificadores)
    - [Âncora](#âncoras)
    - [Outros Meta-Caracteres](#outros-meta-caracteres)
 - [CheatSheet RegEx](#cheatsheet-regex)
    - [Caracteres](#caracteres)
    - [Âncoras](#âncoras)
    - [Caracteres Escapados](#caracteres-escapados)
    - [Grupos](#grupos)
    - [Quantificadores e Alternação](#quantificadores-e-alternação)
- [Expressões de Validação](#expressões-de-validação)
- [Aplicação na Programação](#aplicação-na-programação)
- [Continue estudando...](#continue-estudando)
- [Como contribuir com este projeto?](#como-contribuir-com-este-projeto)
- [Como reportar um erro ou solicitar recurso?](#como-reportar-um-erro-ou-solicitar-recurso)
- [Referencias](#referencias)


### O que é o RegEx? E para que serve?
De Acordo com o **Wikipedia** RegEx é:

> Em ciência da computação, uma expressão regular ou  "Regex" provê uma forma concisa e flexível de identificar cadeias de caracteres de interesse, como caracteres particulares, palavras ou padrões de caracteres.
    
RegEx ou Expressões Regulares é um recurso que possibilita trabalhar com padrões em um textos, serve para fazer busca e validar textos. Pode ser utilizado em documentos de texto e também com linguagens de programação.

### Recursos
- [RegEx Pal](https://www.regexpal.com/): Ferramenta para testar as expressões regulares online.
- [RegEx 101](https://regex101.com/): Outra ferramenta para testar as Expressões regulares online.
- [Code Runner](https://marketplace.visualstudio.com/items?itemName=formulahendry.code-runner): Plugin para testes no VSCode, multiplas linguagens.
- [Unicode Table](https://symbl.cc/pt/): Tabela de caracteres Unicode

### Flags
OBS.: Descrição do que são Flags
| Flag | Descrição |
| :---: | :--- |
| g | global - Todos os matchs (não retorna no primeiro match).|
| i | ignore case - Correspondência sem distinção entre maiúsculas e minúsculas (ignora maiúsculas e minúsculas). |
| gi | global e ignore case ao mesmo tempo.
| m | multiline - somente leitura de uma instância individual de expressão regular

### Meta-Caracteres
###### Grupos e Intervalos
| Metacaracte | Nome | Significado
|:---: | :--- | :--- |
| . | Ponto | Caracter qualquer|
| [] | Conjunto | Conjunto de carateres permitidos |
| [^] | Conjunto Negado | Conjuntos de caracteres negados |
###### Quantificadores
| Metacaractere | Nome | Significado
|:---: | :--- | :--- |
| ? | Opcional | Zero ou Um|
| * | Asterisco | Zero ou Mais |
| + | Mais | Um ou mais |
| {n, m} | Chaves | De n até m |

###### Âncora
| Metacaractere | Nome | Significado
|:---: | :--- | :--- |
| ^ | Circunflexo | Inicio de linha |
| $ | Cifrão | Fim de linha |
| \b | Borda | Inicio ou fim de palavra|

###### Outros Meta-caracteres
| Metacaractere | Nome | Significado
|:---: | :--- | :--- |
| \ | Escape | Uso de metacaracteres como literal |
| &#124; | Ou | Operação de Ou |
| ( ) | Grupo | Define um Grupo |
| \1...\9 | Retrovisor | Resgata grupos já definidos |

### CheatSheet RegEx
###### Caracteres
| Expressão | Descrição |
| :-----: | :-----|
| . | Qualquer caractere exceto nova linha |
| \w \d \s | Palavra, dígito, espaço em branco |
| \W \D \S |  Não palavra, dígito, espaço em branco |
| [abc] | Qualquer um de a, b ou c |
| [^ abc] | Não a, b ou c |
| [a-g] | Caracteres entre a & g |

###### Âncoras
| Expressão | Descrição |
| :-----: | :-----|
|^abc$ | Início / fim da string |
| \b | Limite da palavra |
######  Caracteres Escapados
| Expressão | Descrição |
| :-----: | :-----|
| \. \* \\ | Caracteres especiais de escape |
| \t \n \r | Guia, avanço de linha, retorno de carro |
| \u00A9 | Unicode com escape © |
###### Grupos
| Expressão | Descrição |
| :-----: | :-----|
| (abc) | grupo de captura |
| \1 | referência anterior ao grupo #1 |
| (?:abc) | grupo sem captura |
| (?=abc) | lookahead positivo |
| (?!abc) | lookahead negativa |
###### Quantificadores e Alternação
| Expressão | Descrição |
| :-----: | :-----|
| a* a+ a? | 0 ou mais, 1 ou mais, 0 ou 1 |
| a{5} a{2,} | exatamente cinco, dois ou mais |
| a{1,3} | entre um e três |
| a+? a{2,}? | match do mínimo possível |
| ab&#124;cd | match ab ou cd |

### Expressões de Validação
###### Validar URL com ou sem http:// (ou https://)

    /^(http:\/\/www\.|https:\/\/www\.|http:\/\/|https:\/\/)?[a-z0-9]+([\-\.]{1}[a-z0-9]+)*\.[a-z]{2,5}(:[0-9]{1,5})?(\/.*)?$/gm

Exemplos de uso:

    www.site-qualquer.com
    http://site-qualquer.com/
    https://www.site-qualquer.com/
    https://www.site-qualquer.com/


###### Validar CPF

    ^\d{3}\.\d{3}\.\d{3}-\d{2}$

Exemplos de uso:

    814.115.237-84
###### Validar RG(Registro Geral)

    [0-9]{2}\.?[0-9]{3}\.?[0-9]{3}\-?[0-9]{1}

Exemplos de uso:

    87.564.321-0
    87564321-0
    875643210

###### Validar Telefone

    ^\(\d{2}\)\d{4}-\d{4}$

Exemplos de uso:

    (11)1234-5678


###### Validar CEP

    ^\d{5}-\d{3}$

Exemplos de uso:

    08012-345

###### Validar Data

    (\d{1,2}\/\d{1,2}\/\d{4})


Exemplos de uso:

    01/03/1978
    1/3/1978

<p align="center"><b><a href="https://github.com/EuCarlos/RegEx/blob/main/ver_mais.md">VER MAIS EXPRESSÕES</a></b></p>

### Aplicação na Programação
 - Exemplo com [JavaScript](/executions/regex.js)
 - Exemplo com [Python](/executions/regex.py)
 - Exemplo com [Golang](/executions/regex.go)
 - Exemplo com [C#](/executions/regex.cs)
 - Exemplo com [Ruby](/executions/regex.rb)
 - Exemplo com [Java](/executions/regex.java)
 - Exemplo com [PHP](/executions/regex.php)
 - Exemplo com [Perl](/executions/regex.pl)

### Continue estudando...
| Conteudo | descrição |
| :---: | :--- |
| <img src="/images/Regex_LivroIntro.jpg" width="150">| **Introdução às Expressões Regulares.** disponivel na [Amazon](https://www.amazon.com.br/Introdu%C3%A7%C3%A3o-%C3%A0s-Express%C3%B5es-Regulares-Desvendando-ebook/dp/B07Y15BHYM/ref=pd_sim_2?pd_rd_w=ARaaV&pf_rd_p=9c0e6083-d3b6-4ef6-8043-4159514413db&pf_rd_r=2EYVNGPTDV22F6FWCEN9&pd_rd_r=f4c42602-cc65-4918-9c8b-40f5d6b32f70&pd_rd_wg=gKjaG&pd_rd_i=B07Y15BHYM&psc=1).|
| <img src="/images/Regex_Livro.jpg" width="150">| **Expressões Regulares - 5ª edição: Uma Abordagem Divertida.** disponivel na [Amazon](https://www.amazon.com.br/dp/B01BPK1W46/).|
|<img src="/images/Regex_AurelioMarinho.jpg" width="150"> | **Expressões Regulares - Guia de Consulta Rápida.** disponivel gratuitamente na [aurelio.net](https://aurelio.net/regex/guia/).|
| <img src="/images/curso_cod3r.jpg" width="150"> | **Fundamentos de Expressões Regulares (Regex).** Curso disponivel na [Udemy](https://www.udemy.com/course/curso-regex/).
| <img src="/images/curso_udemy.jpg" width="150"> | **The Complete Regular Expressions(Regex) Course For Beginners.** Curso disponivel na [Udemy](https://www.udemy.com/course/regular-expressions-mastery/).|
| <img src="/images/Glider.jpg" width="150"> | **Curso de RegEx do Canal Glider.** Curso disponivel gratuitamente no [Youtube](https://www.youtube.com/playlist?list=PL61kTUcYddBMZySkgjHtiwasOAknTDbgs).|
| <img src="/images/dfbastidas.jpg" width="150"> | **Curso de RegEx do Canal dfbastidas.** Curso disponivel gratuitamente no [Youtube](https://www.youtube.com/playlist?list=PLDbrnXa6SAzXryq94EcFiEjfCQAmbmKwd).|

### Como contribuir com este projeto?
Antes de começar verifique e siga as instruções para contribuição do repositório. Caso não possua você pode seguir as instruções abaixo:

1. Faça Fork do projeto
2. Crie uma nova branch: git checkout -b nova-branch
3. Commit suas mudanças: git commit -m 'Adicionei alguma coisa'
3. Push para a branch: git push origin nova-branch
4. Abra um Pull Request

### Como reportar um erro ou solicitar recurso?
Caso deseja reportar um erro ou solicitar um recurso, acesse [Issue](https://github.com/eucarlos/RegEx/issues) no Projeto GitHub e adicione sua requisição.

### Referencias
- [GoLang RegEx](https://golang.org/pkg/regexp/)
- [Python doc - re library — Regular expression operations](https://docs.python.org/3/library/re.html)
- [Class: Regexp (Ruby 3.0.1)](https://ruby-doc.org/core-3.0.1/Regexp.html)
- [Modified ECMAScript regular expression grammar](https://en.cppreference.com/w/cpp/regex/ecmascript)
- [OverApi - Regex](https://overapi.com/regex)
- [Codigo Fonte - Validar Cartão de Crédito com Expressão Regular](https://www.codigofonte.com.br/codigos/validar-cartao-de-credito-com-expressao-regular)
- [Regular Expressions (Regex) Mini Bootcamp](https://www.youtube.com/watch?v=EiRGUNrz9MY)
- [Best of Fluent 2012: /Reg(exp){2}lained/: Demystifying Regular Expressions](https://www.youtube.com/watch?v=EkluES9Rvak)
- [Regular Expressions (RegEx) Tutorial](https://www.youtube.com/playlist?list=PL4cUxeGkcC9g6m_6Sld9Q4jzqdqHd2HiD)

<hr>
<p align="center">
Criado com 💜 por <a href="https://github.com/eucarlos/">Carlos Alves</a>
</p>
