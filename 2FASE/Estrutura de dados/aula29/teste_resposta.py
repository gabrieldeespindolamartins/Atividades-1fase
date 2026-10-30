import time

def busca_binaria(vetor, alvo):
    inicio, fim = 0, len(vetor) -1
    while inicio <= fim:
        meio = inicio + (fim - inicio)
        if vetor[meio] == alvo:
            return meio
        if vetor[meio] < alvo:
            inicio = meio + 1
        else: 
            fim = meio - 1
    return -1

vetor_grande = list(range(100000))
alvo_procurado = 98765

inicio_tempo = time.perf_counter()

resultado = busca_binaria(vetor_grande, alvo_procurado)

fim_tempo = time.perf_counter()

tempo_total = fim_tempo - inicio_tempo

print(f"Elemento encontrado no índice: {resultado}")
print(f"Tempo de resposta: {tempo_total:.8f} segundos")