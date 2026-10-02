// Questão 1: Sistema de Cupons Avançado
fun calcularDesconto(valor: Double, cupom: String?): Double {
    return when (cupom) {
        "PROMO10" -> valor - 10.0
        "PROMO20" -> valor - 20.0
        else -> valor
    }
}

// Questão 2: Auditoria de Entregas
fun auditarEntregas(enderecos: List<String?>) {
    for (endereco in enderecos) {
        val enderecoTratado = endereco ?: "Endereço Desconhecido"

        if (enderecoTratado == "Endereço Desconhecido") {
            println("Entrega Pendente: Falta de dados")
        } else {
            println("Rota traçada para: $enderecoTratado")
        }
    }
}

// Questão 3: Validação de Perfil de Streaming
fun validarBioInfantil(biografia: String?) {
    val tamanho = biografia?.length ?: 0

    if (tamanho <= 50) {
        println("Bio aceita")
    } else {
        println("Bio muito longa")
    }
}

// Questão 4: Processamento de Transações Pix
fun processarTransacoesPix() {
    val transferencias: List<Double?> =
        listOf(50.0, null, 120.5, null, 10.0)

    var total = 0.0

    for (valor in transferencias) {
        if (valor != null) {
            total += valor
        } else {
            println("Transação ignorada")
        }
    }

    println("Valor total processado: $total")
}

// Questão 5: Classificação de Feedback de Motoristas
fun avaliarMotorista(nota: Int?) {
    val notaTratada = nota ?: 0

    when (notaTratada) {
        5 -> println("Excelente corrida!")
        4 -> println("Boa corrida.")
        1, 2, 3 -> println("Precisamos melhorar.")
        0 -> println("Nenhuma avaliação fornecida.")
        else -> println("Nota inválida.")
    }
}

// Questão 6: Função Lambda para Cálculo de Gorjeta
val calcularGorjeta: (Double?) -> Double = {
    if (it == null || it < 0.0) {
        0.0
    } else {
        it
    }
}

// Questão 7: Limpeza de Banco de Dados de Usuários
fun limparUsuarios(emails: List<String?>) {
    var contasInvalidas = 0

    for (email in emails) {
        val tamanho = email?.length ?: 0

        if (email == null || tamanho == 0) {
            contasInvalidas++
            println("Aviso de deleção: conta sem e-mail cadastrado.")
        } else {
            println("Conta válida: $email")
        }
    }

    println("Contas que precisam ser apagadas: $contasInvalidas")
}

// Função principal: executa os testes
fun main() {
    println("=== Questão 1: Cupons ===")
    println(calcularDesconto(100.0, "PROMO10"))
    println(calcularDesconto(100.0, "PROMO20"))
    println(calcularDesconto(100.0, null))
    println(calcularDesconto(100.0, "OUTRO"))

    println("\n=== Questão 2: Entregas ===")
    val enderecos: List<String?> = listOf(
        "Rua das Flores, 100",
        null,
        "Avenida Brasil, 250"
    )
    auditarEntregas(enderecos)

    println("\n=== Questão 3: Biografia infantil ===")
    validarBioInfantil("Gosto de desenhos e aventuras!")
    validarBioInfantil(null)
    validarBioInfantil("a".repeat(50))
    validarBioInfantil("a".repeat(51))

    println("\n=== Questão 4: Transações Pix ===")
    processarTransacoesPix()

    println("\n=== Questão 5: Avaliação do motorista ===")
    avaliarMotorista(5)
    avaliarMotorista(4)
    avaliarMotorista(1)
    avaliarMotorista(2)
    avaliarMotorista(3)
    avaliarMotorista(null)
    avaliarMotorista(0)
    avaliarMotorista(6)

    println("\n=== Questão 6: Gorjeta ===")
    println(calcularGorjeta(null))
    println(calcularGorjeta(-5.0))
    println(calcularGorjeta(0.0))
    println(calcularGorjeta(15.0))

    println("\n=== Questão 7: Limpeza de usuários ===")
    val emails: List<String?> = listOf(
        "ana@email.com",
        null,
        "",
        "carlos@email.com",
        null
    )
    limparUsuarios(emails)
}
