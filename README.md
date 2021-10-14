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


- Corriendo Proxy 




- Browser




- Instancia EC2 creada en AWS



- Puertos en AWS



- Prueba final desplegada en AWS



## Contrucción 

- IntelliJ
- Visual Code
- Maven-gestor de dependencias 
- Git BASH
- Spark-Micro Framework para crear APIs
- EC2 AWS 







