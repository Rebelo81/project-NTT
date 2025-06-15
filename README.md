# Desafio Técnico - Microserviços

## Visão Geral
Este projeto é uma solução para o desafio técnico de microserviços proposto pela NTT DATA. O objetivo é desenvolver um sistema simples de catálogo de produtos e simulação de pedidos, utilizando Spring Boot, Spring Cloud, Eureka (Service Discovery) e API Gateway.

## Arquitetura
- **Eureka Server:** Service Discovery
- **API Gateway:** Roteamento e segurança
- **Product Service:** CRUD de produtos com persistência em H2
- **Order Service:** Simulação de pedidos e consumo do Product Service via HTTP

![Arquitetura](backend/images/arquitetura.png)

## Microsserviços
### Product Service
- CRUD de produtos (`/produtos`)
- Persistência em banco H2
- Exemplo de produto: `{ "nome": "Notebook", "descricao": "Ultrafino", "preco": 3500.00 }`

### Order Service
- Simulação de pedidos (`/pedidos/simular`)
- Busca produtos via HTTP no Product Service

## Segurança
- Apenas o API Gateway pode acessar os microsserviços (header especial `X-GATEWAY-KEY`)
- Filtro global no Gateway insere o header automaticamente

## Portas
- **Eureka Server:** 8763
- **API Gateway:** 8700
- **Product Service:** 8100
- **Order Service:** 8200

## Como Executar
1. **Eureka Server**
   ```bash
   cd backend/eureka-server
   mvn spring-boot:run
   ```
2. **API Gateway**
   ```bash
   cd backend/api-gateway
   mvn spring-boot:run
   ```
3. **Product Service**
   ```bash
   cd backend/product-service
   mvn spring-boot:run
   ```
4. **Order Service**
   ```bash
   cd backend/order-service
   mvn spring-boot:run
   ```

Acesse o painel do Eureka em [http://localhost:8763/](http://localhost:8763/)

## Testes
- Utilize a coleção Postman `ProjectNTT.postman_collection.json` para testar os endpoints via Gateway e validar a segurança.
- Exemplos de endpoints:
  - `GET http://localhost:8700/produtos`
  - `GET http://localhost:8700/pedidos/simular`

## Requisitos Atendidos
- Dois microsserviços independentes
- Spring Boot e Spring Cloud
- Eureka como Service Discovery
- API Gateway
- Persistência H2
- APIs RESTful
- Segurança via header
- Todos os endpoints acessíveis apenas via Gateway

## Como contribuir
Pull requests são bem-vindos!

---

> Projeto desenvolvido para fins de aprendizado e demonstração técnica. 