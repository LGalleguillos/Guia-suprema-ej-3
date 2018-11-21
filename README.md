# Guia-suprema-ej-3
Este programa permite calcular el numero indentificador de algun run solo dando los numeros antes del "-"
para calcular este digito se suiguen una serie de pasos:
se toma cada digito por separado y se multiplica (de derecha a izquierda) por una secuencia de numeros (estos son 2,3,4,5,6,7), al llegar al ultimo parde desde el comienzo, por ejemplo si el run es 12.345.678 se separa en 1-2-3-4-5-6-7-8 y cada uno se multiplica por la secuencia:
  8x2=16
  7x3=21
  6x4=24
  5x5=25
  4x6=24
  3x7=21
  2x2=4
  1x3=3
  sumatoria=138
Los resultados se suman y se dividen por 11, ignorando los decimales:
138/11=12
Luego se multiplica por 11: 
12x11=132
y se resta a la sumatoria:
138-132=6
este numero resultante se le resta a 11: 
11-6=5
y TARAN! el resultado es el numero verificador
