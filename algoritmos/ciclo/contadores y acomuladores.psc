Algoritmo sin_titulo
	c=0
	s=0
	cn=0
	n=0
	p=0
	in=0
	suma=0
	escribir "ingrese la cantidad de numeros a digitar"
	leer cn
	Para i<-1 Hasta cn
		escribir "ingrese numero  ",i
		leer n
		Si (n==0) Entonces
			c=c+1
		SiNo
			si(n%2==0)entonces
				p=p+1
			SiNo
				in=in+1
			FinSi
			
	   FinSi  
		
		suma=suma+n
	Fin Para
	escribir "la cantidad de ceros son: ",c
   escribir "la suma es:  ",suma
   escribir "la cantidad de numeros pares son:  ", p
   escribir "la cantidad de numeros impares son:  ", in
   
FinAlgoritmo
