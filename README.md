# pass.in API

A API "pass.in" é uma aplicação desenvolvida durante o evento NLW UNITE da Rocketseat para Java, dedicada à gestão eficiente de participantes em eventos presenciais.

## Funcionalidades

- Cadastro de eventos
- Página de inscrição para participantes
- Emissão de credencial
- Check-in com QRCode

## Estrutura da API

- Controllers: responsáveis por lidar com as requisições HTTP.
- Services: operações de negócio e interação com os repositórios de dados.
- DTOs: objetos de transferência de dados.

## Tecnologias Utilizadas

- Java
- Spring Boot
- Spring MVC
- Spring Data JPA
- HSQLDB (em memória)

## Endpoints Principais

### AttendeeController

- GET /attendees/{attendeeId}/badge
- POST /attendees/{attendeeId}/check-in

### EventController

- GET /events/{id}
- POST /events
- POST /events/{eventId}/attendees
- GET /events/attendees/{id}
