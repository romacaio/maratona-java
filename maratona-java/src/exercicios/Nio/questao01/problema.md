# 📌 Parte 1 – Estrutura de Pastas

Crie a seguinte estrutura (usando Path e resolve):


````
projetoNIO/
|     ├── docs/    
|        └── arquivo.txt
└── backup/
````

## Regras:

Use `resolve()` para montar os caminhos.

Use `normalize()` em pelo menos um caminho propositalmente “sujo”.

Exemplo de caminho sujo para você normalizar:

`Paths.get("projetoNIO/./docs/../docs/arquivo.txt")`

# 📌 Parte 2 – Caminhos Relativos

Agora:

Gere o caminho relativo de **arquivo.txt** para backup usando `relativize()`.

Imprima o resultado.

Depois use `resolve()` para reconstruir o caminho original a partir do relativo.

Você precisa provar que:

````
base.resolve(relativo).normalize()
````
leva ao caminho correto.

# 📌 Parte 3 – Lendo Atributos

Leia os atributos de **arquivo**.txt usando:`BasicFileAttributes`
Imprima:

- isDirectory
- isRegularFile
- size
- creationTime
- lastModifiedTime
- lastAccessTime

# 📌 Parte 4 – Alterando Atributos (BasicFileAttributeView)

Use: `BasicFileAttributeView view`

Agora:

- Atualize o lastModifiedTime
- Atualize o lastAccessTime

# 📌 Parte 5 – Atributos DOS (Somente se for Windows)

Verifique se o sistema suporta "dos":

Se suportar:

- Leia com DosFileAttributes

- Torne o arquivo: **hiden** e **read only**

Depois desfaça...