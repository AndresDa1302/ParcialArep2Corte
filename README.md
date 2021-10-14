# AREP-ParcialSegundoTercio-CalculatorApi

Parcial 2 de AREP

## Autor

- Andres Felipe Davila Gutierrez

Operaciones Asignadas:

- Arcocoseno acos(x)
- Logaritmo Natural ln(x)

## Instrucciones para despliegue

1. Acceda a la máquina virtual por medio de la llave privada que hay en este repositorio y luego instale git a la maquina con el siguiente comando

- sudo yum install git 

2. Instale java  con este comando

- sudo yum install java-1.8.0

3. ingrese a la ruta  ec2-user y clone el repositorio 

- cd "/home/Ec2-user/"
- git clone UrlRepositorio

4. Ejecute las instancias con el siguiente comando 

- java -cp "target/classes:target/dependency/*" "[Nombre de la clase main]"

5. Abra el puerto 4567 del security group de la máquinas virtuales para acceder a los servicios
7. Finalmente ingrese al url que le da su maquina virtual de AWS y añada a la url :4567/ln?value=3.1416 para probar la operacion logaritmo natural o :4567/acos?value=0.7 para el arcocoseno

## Links

- Video instancias https://youtu.be/upto4IzMFYo
 


## Evidencia de funcionamiento





- Corriendo Servicio
![](https://github.com/AndresDa1302/ParcialArep2Corte/blob/master/images/App.java%20-%20parcialproxy%20-%20Visual%20Studio%20Code%2014_10_2021%2012_45_22%20p.%20m..png)

- Corriendo Proxy 

![](https://github.com/AndresDa1302/ParcialArep2Corte/blob/master/images/Parcialarep%20–%20App.java%2014_10_2021%2012_44_44%20p.%20m..png)



- Instancia EC2 creada en AWS

![](https://github.com/AndresDa1302/ParcialArep2Corte/blob/master/images/Instancias%20_%20EC2%20Management%20Console%20-%20Opera%2014_10_2021%2012_46_09%20p.%20m..png)
![](https://github.com/AndresDa1302/ParcialArep2Corte/blob/master/images/Instancias%20_%20EC2%20Management%20Console%20-%20Opera%2014_10_2021%2012_46_21%20p.%20m..png)
![](https://github.com/AndresDa1302/ParcialArep2Corte/blob/master/images/Instancias%20_%20EC2%20Management%20Console%20-%20Opera%2014_10_2021%2012_46_50%20p.%20m..png)
![](https://github.com/AndresDa1302/ParcialArep2Corte/blob/master/images/Instancias%20_%20EC2%20Management%20Console%20-%20Opera%2014_10_2021%2012_47_18%20p.%20m..png)

- Puertos en AWS
![](https://github.com/AndresDa1302/ParcialArep2Corte/blob/master/images/Instancias%20_%20EC2%20Management%20Console%20-%20Opera%2014_10_2021%2012_48_08%20p.%20m..png)


- Prueba final desplegada en AWS

![](https://github.com/AndresDa1302/ParcialArep2Corte/blob/master/images/Instancias%20_%20EC2%20Management%20Console%20-%20Opera%2014_10_2021%2012_48_35%20p.%20m..png)
![](https://github.com/AndresDa1302/ParcialArep2Corte/blob/master/images/Instancias%20_%20EC2%20Management%20Console%20-%20Opera%2014_10_2021%2012_48_39%20p.%20m..png)
![](https://github.com/AndresDa1302/ParcialArep2Corte/blob/master/images/Instancias%20_%20EC2%20Management%20Console%20-%20Opera%2014_10_2021%2012_48_54%20p.%20m..png)
## Contrucción 

- IntelliJ
- Visual Code
- Maven-gestor de dependencias 
- Git BASH
- Spark-Micro Framework para crear APIs
- EC2 AWS 







