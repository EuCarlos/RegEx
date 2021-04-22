### Expressões de Validação
###### Validar URL com ou sem http:// (ou https://)

    /^(http:\/\/www\.|https:\/\/www\.|http:\/\/|https:\/\/)?[a-z0-9]+([\-\.]{1}[a-z0-9]+)*\.[a-z]{2,5}(:[0-9]{1,5})?(\/.*)?$/gm

Exemplos de uso:

    www.site-qualquer.com
    http://site-qualquer.com/
    https://www.site-qualquer.com/
    https://www.site-qualquer.com/
<hr>
###### Validar CPF

    ^\d{3}\.\d{3}\.\d{3}-\d{2}$

Exemplos de uso:

    814.115.237-84
<hr>
###### Validar RG(Registro Geral)

    [0-9]{2}\.?[0-9]{3}\.?[0-9]{3}\-?[0-9]{1}

Exemplos de uso:

    87.564.321-0
    87564321-0
    875643210
<hr>
###### Validar Telefone

    ^\(\d{2}\)\d{4}-\d{4}$

Exemplos de uso:

    (11)1234-5678
<hr>
###### Validar CEP

    ^\d{5}-\d{3}$

Exemplos de uso:

    08012-345
<hr>
###### Validar Data

    (\d{1,2}\/\d{1,2}\/\d{4})
<hr>
Exemplos de uso:

    01/03/1978
    1/3/1978
<hr>
###### Validar E-mail

    (\w+@[a-zA-Z_]+?\.[a-zA-Z]{2,6}\.?\w{0,2})

Exemplos de uso:

    Email@contato.com
    SeuEmail@contato.com.br
    Seu_Email@contato.com
<hr>
###### Validar Usuario

    @?[a-zA-Z]\w[a-zA-Z0-9_+-]{3,10}

Exemplos de uso:

    @nome_usuario
    nome_usuario
    @usuario123
    @usuario-123_
<hr>
###### Validar Cor Hexadecimal

    #?(([0-9a-f]{2})([0-9a-f]{2})([0-9a-f]{2})|([0-9a-f])([0-9a-f])([0-9a-f]))

Exemplos de uso:

    #fca311
    fca311
    #FCA311
    FCA311
<hr>
###### Validar Endereço IPv4

    ^\d{1,3}[.]\d{1,3}[.]\d{1,3}[.]\d{1,3}$

Exemplos de uso:

    217.114.22.1
<hr>
###### Validar Cartão de Credito MasterCard

    (^5[1-5][0-9]{2}\s?[0-9]{4}\s?[0-9]{4}\s?[0-9]{4})

Exemplos de uso:

    5545789871235764
    5545 7898 7123 5764
<hr>
###### Validar  Cartão de Credito VISA

    (^4[0-9]{3}\s?[0-9]{4}\s?[0-9]{4}\s?[0-9]{4})

Exemplos de uso:

    4551 8300 1234 5678
    4551830012345678
<hr>
###### Validar Cartão Amex(American Express)

    ^3[47][0-9]{2}\s?[0-9]{6}\s?[0-9]{5}

Exemplos de uso:

    3759 876543 21001
    375987654321001
<hr>
###### Validar Caminho de Arquivo

    ^(?:[a-zA-Z]\:|\\\\[\w\.]+\\[\w.$]+)\\(?:[\w]+\\)*\w([\w.])+$

Exemplos de uso:

    \\test\test$\arquivo.xls
    \\server\share\folder\meuArquivo.txt
    \\server\share\meuArquivo.txt
    \\217.114.22.1\share\folder\meuArquivo.txt
    c:\folder\meuArquivo.txt
    c:\folder\meuArquivoSemExtensao
<hr>
###### Validar Arquivos

    \w{3,}\.[a-z]{2,4}

Exemplos de uso:

    programa.exe
    index.html
    image.jpg
    main.java
<hr>
###### Validar Real(Moeda)

    [R|r]\$\s?[0-9]{1,}\,[0,9]{2}

Exemplos de uso:

    R$ 10,00
    r$ 1,00
    R$199,99
<hr>

<p align="center">
Criado com 💜 por <a href="https://github.com/eucarlos/">Carlos Alves</a>
</p>