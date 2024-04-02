package calculadora;

public class calculando {
	

float soma(float namber1, float namber2) {
	float calculo = namber1 + namber2;
	return calculo;	
}	

float multiplca(float namber1, float namber2) {
	Float calculo = namber1 * namber2;
	return calculo;
}

float potencia(float namber1, float namber2) {
	 
	return (float) Math.pow(namber1, namber2);
}

float divisao(float namber1, float namber2) {
	float calculo = namber1 / namber2;
	return calculo;
}

float menos(float namber1, float namber2) {
	float calculo = namber1 - namber2;
	return calculo;
}

float raiz(float ramver1) {
	return (float) Math.sqrt(ramver1);
}
}
