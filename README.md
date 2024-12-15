# backendone prototype

This is a microservice prototype generated using WeDAA, you can find documentation and help at [WeDAA Docs](https://www.wedaa.tech/docs/introduction/what-is-wedaa/)

## Prerequisites

- jdk version >= 17
- For Keycloak to work with Service Discovery in local(docker) environment, following line must be added to your hosts file `/etc/hosts`
  ```
  127.0.0.1	keycloak
  ```

## Project Structure

```
├── src/
    ├── main/
        ├── docker (contains docker compose files for external components based on architecture design)
        ├── java/backendone/
        └──  resources  (configuration properties)
    └── test/ (testcases for prototype)
        ├── java/backendone/
        └──  resources
├── target/
├── checkstyle.xml
├── comm.yo-rc.json (generator configuration file for communications)
├── COMMUNICATION.md (Communication documentation)
├── mvnw
├── mvnw.cmd
├── package.json
├── pom.xml
├── README.md (Project documentation)
└── sonar-project.properties
```

## Dependencies

This application is configured to work with external component(s).

Docker compose files are provided for the same to get started quickly.

Component details:

- Keycloak as Identity Management: `npm run docker:keycloak:up`
- Eureka Service Discovery: `npm run docker:jhipster-registry:up`
- Database: `npm run docker:db:up`

On launch, backendone will refuse to start if it is not able to connect to any of the above component(s).

## Get Started

The below cmd will install the required dependencies and run the prototype in local machine.

Run the prototype locally: `./mvnw`

Open [http://ec2-13-233-91-132.ap-south-1.compute.amazonaws.com:9020/management/health/readiness](http://ec2-13-233-91-132.ap-south-1.compute.amazonaws.com:9020/management/health/readiness) to view it in your browser.

You could see the below response in your browser:

```
{
  "status": "UP"
}
```

## Containerization

Docker image will be built with the prototype name.

- Build the docker image: `npm run java:docker`

Start the container: `docker run -d -p 9020:9020 backendone:latest`
