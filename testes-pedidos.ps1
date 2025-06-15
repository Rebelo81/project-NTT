# Testes automáticos do endpoint de pedidos via API Gateway (PowerShell)

Write-Host "\n1. Listar todos os produtos (GET)"
curl http://localhost:8700/produtos

Write-Host "\n2. Simular pedido (GET)"
curl http://localhost:8700/pedidos/simular 