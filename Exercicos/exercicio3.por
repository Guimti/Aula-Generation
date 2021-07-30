programa
{
	inclua biblioteca Calendario
	inclua biblioteca Matematica
	
	funcao inicio()
	{
	inteiro duraEvento
	real emMinutos, emSegundos

	escreva("\n Duracao evento em horas:")
		leia(duraEvento)  


	
	emMinutos = duraEvento*60
	emSegundos = duraEvento*3600


	escreva("\n  em horas :", duraEvento)
	escreva("\n  em minutos:",emMinutos)
	escreva("\n em segundos :",emSegundos)

	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 268; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */