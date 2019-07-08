# Cardio Challenge

Cardio Challenge API server

## Prerequisites

- Java 8
- MYSQL Server v5.7

## Usage

1. Go to directory name 'assessment'
2. Import these sql files using command 
`mysql -u username -p cardio_challenge < cardio_challenge.sql`
`mysql -u username -p cardio_challenge < cardio_challenge_category.sql`
`mysql -u username -p cardio_challenge < cardio_challenge_challenge.sql`
3. Run this command `java -jar swagger-spring-1.0.0.jar`

4. You can view the api documentation in swagger-ui by pointing to  
http://localhost:8080/nhisyamj/cardio_challenge/1.0.0