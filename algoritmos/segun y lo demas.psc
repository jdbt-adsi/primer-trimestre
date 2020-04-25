Algoritmo alquiler_de_maquinaria
	retro=100000
	aplan=80000
	grua=200000
	trac=120000
	bull=300000
	gen=""
	des=0
	canh=0
	tm=0
	vh=0
	Escribir "ingrese tipo de maqunaria: 1 para retroexcavadora; 2 para aplanadora; 3 para la grua; 4 para tractor; 5 para bulldozer"
	leer tm
	Escribir "ingresar genero"
	leer gen
	escribir "cantidad de horas requeridas"
	leer canh
	Segun tm Hacer
		1:
			vh= retro
			si(gen=="m"o gen=="M")Entonces
				vh= (retro*canh)
				des= vh*0.05
				t= vh-des
			
			SiNo
				si(gen=="f" o gen=="F")Entonces
					vh=(retro*canh)
					des=vh*0.03
					t=vh-des
				SiNo
					escribir"genero no valido"
				FinSi
			FinSi
		2:
			vh=aplan
			si(gen=="m" o gen=="M")Entonces
				vh=(aplan*canh)
				des=vh*0.05
				t=vh-des
			SiNo
				si(gen=="f" o gen="F")Entonces
					vh=(aplan*canh)
					des=vh*0.03
					t=vh-des
				SiNo
					escribir"genero no valido"
				FinSi
			FinSi
		3:
			vh=grua
			si(gen=="m" o gen=="M") entonces
				vh=(grua*canh)
				des=vh*0.05
				t=vh-des
			SiNo
				si(gen=="f" o gen=="F")Entonces
					vh=(grua*canh)
					des=vh*0.03
					t=vh-des
				SiNo
					escribir "genero no valido"
				FinSi
			FinSi
		4:
			vh=trac
			si (gen=="m" o gen=="M") entonces
				vh=(trac*canh)
				des=vh*0
				t=vh-des
			SiNo
				si(gen=="f" o gen=="F")Entonces
					vh=(trac*canh)
					des=vh*0.2
					t=vh-des
				SiNo
					Escribir "género no valido "
				FinSi
				
			FinSi
		5:
			vh=bull
			si(gen=="m" o gen=="M")entonces
				vh=(bull*canh)
				des=vh*0.1
				t=vh-des
			SiNo
				t=bull*canh
			FinSi
			
		De Otro Modo:
		escribir "opcion no valida"
		Fin Segun
	escribir "tiene un descuento de:  ", des
	escribir "total a pagar es:  ", t
	FinAlgoritmo
