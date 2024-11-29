// Función de integración
def integracion(f: Double => Double, a: Double, b: Double): Double =
  (b-a) * ((f(a) + (4 * f((a+b)/2)) + f(b))/6)
// Integracion es una funcion que revibe una funcion y 2 parametros , limites y retorna un double
// Integral 1
val integral1: Double => Double = (x: Double) => -math.pow(x,2) + 8*x - 12
val valorEs1: Double = 7.33
val valorOb1: Double = integracion (integral1, 3, 5)


// Integral 2
val integral2: Double => Double = (x: Double) => (3 * math.pow(x,2))
val valorEs2: Double = 8
val valorOb2: Double = integracion(integral2,0,2)


// Integral 3
val integral3: Double => Double = (x: Double) =>  x + 2 * math.pow(x, 2) - math.pow(x, 3) + 5 * math.pow(x, 4)
val valorEs3: Double = 3.333
val valorOb3: Double = integracion(integral3,-1,1)


// Integral 4
val integral4: Double => Double = (x: Double) => (2 * x + 1) / (math.pow(x, 2) + x)
val valorEs4: Double = 1.09861
val valorOb4: Double = integracion(integral4,1,2)


// Integral 5
val integral5: Double => Double = (x: Double) => math.exp(x)
val valorEs5: Double = 1.71828
val valorOb5: Double = integracion(integral5,0,1)

// Integral 6
val integral6: Double => Double = (x: Double) => 1 / (math.sqrt(x) - 1)
// math.sqrt funciona de una manera similar a math.pow, con la diferencia que esta
// calcula la rais cuadrada
val valorEs6: Double = 0.828427
val valorOb6: Double = integracion(integral6,2,3)


// Integral 7
val integral7: Double => Double = (x: Double) => 1 / (1 + math.pow(x, 2))
val valorEs7: Double = 0.785398
val valorOb7: Double = integracion(integral7,0,1)


//Funcion calculo de error
def calculoError (valorEsperado: Double, valorObtenido:Double): Double =
  math.abs(valorEsperado - valorObtenido)

// CALCULO DEL ERROR DE APROXIMACION EN CADA INTEGRAL
// integral 1
val error1: Double = calculoError (valorEs1,valorOb1)
//integral 2
val error2: Double = calculoError (valorEs2,valorOb2)
// integral 3
val error3: Double = calculoError (valorEs3,valorOb3)
// integral 4
val error4: Double = calculoError (valorEs4,valorOb4)
// integral 5
val error5: Double = calculoError (valorEs5,valorOb5)
// integral 6
val error6: Double = calculoError (valorEs6,valorOb6)
// integral 7
val error7: Double = calculoError (valorEs7,valorOb7)
