# Testes automáticos do catálogo de produtos via API Gateway (PowerShell)

Write-Host "\n1. Listar todos os produtos (GET)"
curl http://localhost:8700/produtos

Write-Host "\n2. Consultar produto por ID (GET)"
curl http://localhost:8700/produtos/1

Write-Host "\n3. Criar novo produto (POST)"
curl -Method POST http://localhost:8700/produtos -Headers @{"Content-Type"="application/json"} -Body '{"nome":"Headset","descricao":"Headset gamer com microfone","preco":299.90}'

Write-Host "\n4. Atualizar produto (PUT)"
curl -Method PUT http://localhost:8700/produtos/1 -Headers @{"Content-Type"="application/json"} -Body '{"nome":"Notebook Pro","descricao":"Ultrafino, 32GB RAM, SSD 1TB","preco":7500.00}'

Write-Host "\n5. Deletar produto (DELETE)"
curl -Method DELETE http://localhost:8700/produtos/1 