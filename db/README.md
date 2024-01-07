# Sobre a Base de Dados

Este README fornece informações cruciais sobre a base de dados do projeto. Embora a base de dados tenha sido criada manualmente, a tabela "tasks" foi especificamente criada utilizando migrações, que estão localizadas no diretório `/resources/db/migration/`. Esse método foi escolhido para garantir um processo consistente, controlado e rastreável ao evoluir a estrutura do banco de dados ao longo do tempo.

## Migrações

As migrações oferecem uma abordagem controlada e versionada para gerenciar alterações no esquema do banco de dados. Se houver a necessidade de modificar ou estender a tabela "tasks", é altamente recomendável utilizar migrações para manter a integridade e a rastreabilidade das alterações no banco de dados.

Certifique-se de seguir as melhores práticas ao criar ou modificar migrações, e consulte a documentação específica da ferramenta ou framework de migração que você estiver utilizando.
