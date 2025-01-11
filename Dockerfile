FROM ubuntu:latest AS build

# Atualizando e instalando dependências
RUN apt-get update && apt-get install -y \
    openjdk-17-jdk \
    maven

# Definindo o diretório de trabalho
WORKDIR /app

# Copiando o projeto para dentro do contêiner
COPY . .

# Compilando o projeto
RUN mvn clean install

# Segunda etapa: criação da imagem final
FROM openjdk:17-jdk-slim
WORKDIR /app

# Expondo a porta 8080
EXPOSE 8080

# Copiando o arquivo JAR do estágio de build
COPY --from=build /app/target/gestao_vagas-0.0.1-SNAPSHOT.jar app.jar

# Comando para iniciar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
