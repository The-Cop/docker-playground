# Docker playground

#### Plan
- nginx
- several instances
- security session
- redis
- teamcity + agent
- rabbitmq
- postgresql
- liquibase
- split logging on host

#### Done

### Steps
1. sudo apt update
1. sudo apt install docker.io

### Notes
Run redis image in docker: 
`docker run --name somename -p 6379:6379 -d redis`

Run postgres image in docker: 
`docker run --name somename -p 5432:5432 -e POSTGRES_DB=dockerpg -d postgres`
