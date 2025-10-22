# Parcial practico segundo corte


## Arquitectura

![arq](assets/arquitectura.png)


## Run
Comando para ejecutar el proxy server, ya que se hizo unsa modularizacion en el proyecto donde:

* parcial2Arep = Proyecto padre

* math-services = modulo hijo

* proxy-server = modulo hijo

### Proxy Server

```
mvn clean package
cd proxy-server
cd target
java -jar proxy-server-1.0-SNAPSHOT.jar
```

### Math-services Server

```
mvn clean package
cd math-services
cd target
java -jar math-services-1.0-SNAPSHOT.jar
```

## Problema matematico de math service

![sec](assets/secuenciaLucas.png)

## Cliente 
![img.png](assets/img.png)

## instancias creadas
![img.png](assets/isntr.png)

## instancias corriendo

### math-serice 1

![img.png](assets/ins2.png)

### math-serice 2

![img.png](assets/math1.png)