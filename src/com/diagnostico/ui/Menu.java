package com.diagnostico.ui;

import com.diagnostico.entities.*;
import com.diagnostico.interfaces.*;
import com.diagnostico.repositories.*;
import com.diagnostico.services.*;
import java.util.Scanner;
import java.util.List;

public class Menu {
    private final Scanner scanner;
    private final IPacienteService pacienteService;
    private final ISintomaService sintomaService;
    private final IExameService exameService;
    private final IDoencaService doencaService;
    private final IDiagnosticoService diagnosticoService;

    public Menu() {
        this.scanner = new Scanner(System.in);
        
        // Inicialização dos repositories
        IPacienteRepository pacienteRepo = new PacienteRepository();
        ISintomaRepository sintomaRepo = new SintomaRepository();
        IExameRepository exameRepo = new ExameRepository();
        IDoencaRepository doencaRepo = new DoencaRepository();
        IDiagnosticoRepository diagnosticoRepo = new DiagnosticoRepository();
        
        // Inicialização dos services
        this.pacienteService = new PacienteService(pacienteRepo);
        this.sintomaService = new SintomaService(sintomaRepo);
        this.exameService = new ExameService(exameRepo);
        this.doencaService = new DoencaService(doencaRepo);
        this.diagnosticoService = new DiagnosticoService(diagnosticoRepo);
    }

    public void iniciar() {
        int opcao;
        do {
            exibirMenuPrincipal();
            opcao = lerOpcao();
            
            try {
                processarOpcao(opcao);
            } catch (IllegalArgumentException e) {
                System.out.println("\nErro: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("\nErro inesperado: " + e.getMessage());
            }
            
            if (opcao != 0) {
                System.out.println("\nPressione ENTER para continuar...");
                scanner.nextLine();
            }
        } while (opcao != 0);
        
        scanner.close();
    }

    private void exibirMenuPrincipal() {
        System.out.println("\n=== SISTEMA DE DIAGNÓSTICO MÉDICO ===");
        System.out.println("1. Gerenciar Pacientes");
        System.out.println("2. Gerenciar Sintomas");
        System.out.println("3. Gerenciar Exames");
        System.out.println("4. Gerenciar Doenças");
        System.out.println("5. Gerenciar Diagnósticos");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private void processarOpcao(int opcao) {
        switch (opcao) {
            case 1:
                menuPacientes();
                break;
            case 2:
                menuSintomas();
                break;
            case 3:
                menuExames();
                break;
            case 4:
                menuDoencas();
                break;
            case 5:
                menuDiagnosticos();
                break;
            case 0:
                System.out.println("Encerrando o programa...");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    private void menuPacientes() {
        System.out.println("\n=== GERENCIAR PACIENTES ===");
        System.out.println("1. Cadastrar Paciente");
        System.out.println("2. Listar Pacientes");
        System.out.println("3. Buscar Paciente");
        System.out.println("4. Alterar Paciente");
        System.out.println("5. Remover Paciente");
        System.out.println("0. Voltar");
        
        int opcao = lerOpcao();
        switch (opcao) {
            case 1:
                cadastrarPaciente();
                break;
            case 2:
                listarPacientes();
                break;
            case 3:
                buscarPaciente();
                break;
            case 4:
                alterarPaciente();
                break;
            case 5:
                removerPaciente();
                break;
        }
    }

    private void cadastrarPaciente() {
        System.out.println("\n=== CADASTRAR PACIENTE ===");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Idade: ");
        int idade = Integer.parseInt(scanner.nextLine());
        
        Paciente paciente = new Paciente(null, nome, idade);
        pacienteService.cadastrarPaciente(paciente);
        System.out.println("Paciente cadastrado com sucesso!");
    }

    private void listarPacientes() {
        System.out.println("\n=== LISTA DE PACIENTES ===");
        List<Paciente> pacientes = pacienteService.listarPacientes();
        
        if (pacientes.isEmpty()) {
            System.out.println("Nenhum paciente cadastrado.");
            return;
        }

        for (Paciente p : pacientes) {
            System.out.printf("ID: %d | Nome: %s | Idade: %d\n",
                p.getId(), p.getNome(), p.getIdade());
        }
    }

    private void buscarPaciente() {
        System.out.println("\n=== BUSCAR PACIENTE ===");
        System.out.print("Digite o ID do paciente: ");
        int id = Integer.parseInt(scanner.nextLine());
        
        Paciente paciente = pacienteService.buscarPacientePorId(id);
        System.out.printf("ID: %d | Nome: %s | Idade: %d\n",
            paciente.getId(), paciente.getNome(), paciente.getIdade());
    }

    private void alterarPaciente() {
        System.out.println("\n=== ALTERAR PACIENTE ===");
        System.out.print("Digite o ID do paciente: ");
        int id = Integer.parseInt(scanner.nextLine());
        
        Paciente paciente = pacienteService.buscarPacientePorId(id);
        
        System.out.print("Novo nome (atual: " + paciente.getNome() + "): ");
        String nome = scanner.nextLine();
        if (!nome.trim().isEmpty()) {
            paciente.setNome(nome);
        }
        
        System.out.print("Nova idade (atual: " + paciente.getIdade() + "): ");
        String idadeStr = scanner.nextLine();
        if (!idadeStr.trim().isEmpty()) {
            paciente.setIdade(Integer.parseInt(idadeStr));
        }
        
        pacienteService.alterarPaciente(paciente);
        System.out.println("Paciente alterado com sucesso!");
    }

    private void removerPaciente() {
        System.out.println("\n=== REMOVER PACIENTE ===");
        System.out.print("Digite o ID do paciente: ");
        int id = Integer.parseInt(scanner.nextLine());
        
        pacienteService.removerPaciente(id);
        System.out.println("Paciente removido com sucesso!");
    }

    private int lerOpcao() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private void menuSintomas() {
        System.out.println("\n=== GERENCIAR SINTOMAS ===");
        System.out.println("1. Cadastrar Sintoma");
        System.out.println("2. Listar Sintomas");
        System.out.println("3. Buscar Sintoma");
        System.out.println("4. Alterar Sintoma");
        System.out.println("5. Remover Sintoma");
        System.out.println("0. Voltar");
        
        int opcao = lerOpcao();
        switch (opcao) {
            case 1:
                cadastrarSintoma();
                break;
            case 2:
                listarSintomas();
                break;
            case 3:
                buscarSintoma();
                break;
            case 4:
                alterarSintoma();
                break;
            case 5:
                removerSintoma();
                break;
        }
    }

    private void cadastrarSintoma() {
        System.out.println("\n=== CADASTRAR SINTOMA ===");
        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();
        
        System.out.print("Severidade (1-5): ");
        int severidade = Integer.parseInt(scanner.nextLine());
        
        Sintoma sintoma = new Sintoma(null, descricao, severidade);
        sintomaService.cadastrarSintoma(sintoma);
        System.out.println("Sintoma cadastrado com sucesso!");
    }

    private void listarSintomas() {
        System.out.println("\n=== LISTA DE SINTOMAS ===");
        List<Sintoma> sintomas = sintomaService.listarSintomas();
        
        if (sintomas.isEmpty()) {
            System.out.println("Nenhum sintoma cadastrado.");
            return;
        }

        for (Sintoma s : sintomas) {
            System.out.printf("ID: %d | Descrição: %s | Severidade: %d\n",
                s.getId(), s.getDescricao(), s.getSeveridade());
        }
    }

    private void buscarSintoma() {
        System.out.println("\n=== BUSCAR SINTOMA ===");
        System.out.print("Digite o ID do sintoma: ");
        int id = Integer.parseInt(scanner.nextLine());
        
        Sintoma sintoma = sintomaService.buscarSintomaPorId(id);
        System.out.printf("ID: %d | Descrição: %s | Severidade: %d\n",
            sintoma.getId(), sintoma.getDescricao(), sintoma.getSeveridade());
    }

    private void alterarSintoma() {
        System.out.println("\n=== ALTERAR SINTOMA ===");
        System.out.print("Digite o ID do sintoma: ");
        int id = Integer.parseInt(scanner.nextLine());
        
        Sintoma sintoma = sintomaService.buscarSintomaPorId(id);
        
        System.out.print("Nova descrição (atual: " + sintoma.getDescricao() + "): ");
        String descricao = scanner.nextLine();
        if (!descricao.trim().isEmpty()) {
            sintoma.setDescricao(descricao);
        }
        
        System.out.print("Nova severidade (atual: " + sintoma.getSeveridade() + "): ");
        String severidadeStr = scanner.nextLine();
        if (!severidadeStr.trim().isEmpty()) {
            sintoma.setSeveridade(Integer.parseInt(severidadeStr));
        }
        
        sintomaService.alterarSintoma(sintoma);
        System.out.println("Sintoma alterado com sucesso!");
    }

    private void removerSintoma() {
        System.out.println("\n=== REMOVER SINTOMA ===");
        System.out.print("Digite o ID do sintoma: ");
        int id = Integer.parseInt(scanner.nextLine());
        
        sintomaService.removerSintoma(id);
        System.out.println("Sintoma removido com sucesso!");
    }

    private void menuExames() {
        System.out.println("\n=== GERENCIAR EXAMES ===");
        System.out.println("1. Cadastrar Exame");
        System.out.println("2. Listar Exames");
        System.out.println("3. Buscar Exame");
        System.out.println("4. Alterar Exame");
        System.out.println("5. Remover Exame");
        System.out.println("0. Voltar");
        
        int opcao = lerOpcao();
        switch (opcao) {
            case 1:
                cadastrarExame();
                break;
            case 2:
                listarExames();
                break;
            case 3:
                buscarExame();
                break;
            case 4:
                alterarExame();
                break;
            case 5:
                removerExame();
                break;
        }
    }

    private void cadastrarExame() {
        System.out.println("\n=== CADASTRAR EXAME ===");
        System.out.print("Tipo: ");
        String tipo = scanner.nextLine();
        
        System.out.print("Resultado: ");
        String resultado = scanner.nextLine();
        
        Exame exame = new Exame(null, tipo, resultado);
        exameService.cadastrarExame(exame);
        System.out.println("Exame cadastrado com sucesso!");
    }

    private void listarExames() {
        System.out.println("\n=== LISTA DE EXAMES ===");
        List<Exame> exames = exameService.listarExames();
        
        if (exames.isEmpty()) {
            System.out.println("Nenhum exame cadastrado.");
            return;
        }

        for (Exame e : exames) {
            System.out.printf("ID: %d | Tipo: %s | Resultado: %s\n",
                e.getId(), e.getTipo(), e.getResultado());
        }
    }

    private void buscarExame() {
        System.out.println("\n=== BUSCAR EXAME ===");
        System.out.print("Digite o ID do exame: ");
        int id = Integer.parseInt(scanner.nextLine());
        
        Exame exame = exameService.buscarExamePorId(id);
        System.out.printf("ID: %d | Tipo: %s | Resultado: %s\n",
            exame.getId(), exame.getTipo(), exame.getResultado());
    }

    private void alterarExame() {
        System.out.println("\n=== ALTERAR EXAME ===");
        System.out.print("Digite o ID do exame: ");
        int id = Integer.parseInt(scanner.nextLine());
        
        Exame exame = exameService.buscarExamePorId(id);
        
        System.out.print("Novo tipo (atual: " + exame.getTipo() + "): ");
        String tipo = scanner.nextLine();
        if (!tipo.trim().isEmpty()) {
            exame.setTipo(tipo);
        }
        
        System.out.print("Novo resultado (atual: " + exame.getResultado() + "): ");
        String resultado = scanner.nextLine();
        if (!resultado.trim().isEmpty()) {
            exame.setResultado(resultado);
        }
        
        exameService.alterarExame(exame);
        System.out.println("Exame alterado com sucesso!");
    }

    private void removerExame() {
        System.out.println("\n=== REMOVER EXAME ===");
        System.out.print("Digite o ID do exame: ");
        int id = Integer.parseInt(scanner.nextLine());
        
        exameService.removerExame(id);
        System.out.println("Exame removido com sucesso!");
    }

    private void menuDoencas() {
        System.out.println("\n=== GERENCIAR DOENÇAS ===");
        System.out.println("1. Cadastrar Doença");
        System.out.println("2. Listar Doenças");
        System.out.println("3. Buscar Doença");
        System.out.println("4. Alterar Doença");
        System.out.println("5. Remover Doença");
        System.out.println("6. Adicionar Sintoma à Doença");
        System.out.println("0. Voltar");
        
        int opcao = lerOpcao();
        switch (opcao) {
            case 1:
                cadastrarDoenca();
                break;
            case 2:
                listarDoencas();
                break;
            case 3:
                buscarDoenca();
                break;
            case 4:
                alterarDoenca();
                break;
            case 5:
                removerDoenca();
                break;
            case 6:
                adicionarSintomaDoenca();
                break;
        }
    }

    private void cadastrarDoenca() {
        System.out.println("\n=== CADASTRAR DOENÇA ===");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        
        Doenca doenca = new Doenca(null, nome);
        System.out.println("Deseja adicionar sintomas típicos? (S/N)");
        if (scanner.nextLine().equalsIgnoreCase("S")) {
            adicionarSintomasDoenca(doenca);
        }
        
        doencaService.cadastrarDoenca(doenca);
        System.out.println("Doença cadastrada com sucesso!");
    }

    private void adicionarSintomasDoenca(Doenca doenca) {
        do {
            System.out.print("ID do sintoma (0 para sair): ");
            int sintomaId = Integer.parseInt(scanner.nextLine());
            if (sintomaId == 0) break;
            
            try {
                Sintoma sintoma = sintomaService.buscarSintomaPorId(sintomaId);
                doenca.adicionarSintoma(sintoma);
                System.out.println("Sintoma adicionado!");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } while (true);
    }

    private void listarDoencas() {
        System.out.println("\n=== LISTA DE DOENÇAS ===");
        List<Doenca> doencas = doencaService.listarDoencas();
        
        if (doencas.isEmpty()) {
            System.out.println("Nenhuma doença cadastrada.");
            return;
        }

        for (Doenca d : doencas) {
            System.out.printf("ID: %d | Nome: %s | Qtd. Sintomas: %d\n",
                d.getId(), d.getNome(), d.getSintomasTipicos().size());
        }
    }

    private void buscarDoenca() {
        System.out.println("\n=== BUSCAR DOENÇA ===");
        System.out.print("Digite o ID da doença: ");
        int id = Integer.parseInt(scanner.nextLine());
        
        Doenca doenca = doencaService.buscarDoencaPorId(id);
        System.out.printf("ID: %d | Nome: %s\n", doenca.getId(), doenca.getNome());
        System.out.println("Sintomas típicos:");
        for (Sintoma s : doenca.getSintomasTipicos()) {
            System.out.printf("- %s (Severidade: %d)\n", s.getDescricao(), s.getSeveridade());
        }
    }

    private void alterarDoenca() {
        System.out.println("\n=== ALTERAR DOENÇA ===");
        System.out.print("Digite o ID da doença: ");
        int id = Integer.parseInt(scanner.nextLine());
        
        Doenca doenca = doencaService.buscarDoencaPorId(id);
        
        System.out.print("Novo nome (atual: " + doenca.getNome() + "): ");
        String nome = scanner.nextLine();
        if (!nome.trim().isEmpty()) {
            doenca.setNome(nome);
        }
        
        doencaService.alterarDoenca(doenca);
        System.out.println("Doença alterada com sucesso!");
    }

    private void removerDoenca() {
        System.out.println("\n=== REMOVER DOENÇA ===");
        System.out.print("Digite o ID da doença: ");
        int id = Integer.parseInt(scanner.nextLine());
        
        doencaService.removerDoenca(id);
        System.out.println("Doença removida com sucesso!");
    }

    private void adicionarSintomaDoenca() {
        System.out.println("\n=== ADICIONAR SINTOMA À DOENÇA ===");
        System.out.print("Digite o ID da doença: ");
        int doencaId = Integer.parseInt(scanner.nextLine());
        
        Doenca doenca = doencaService.buscarDoencaPorId(doencaId);
        adicionarSintomasDoenca(doenca);
        doencaService.alterarDoenca(doenca);
    }

    private void menuDiagnosticos() {
        System.out.println("\n=== GERENCIAR DIAGNÓSTICOS ===");
        System.out.println("1. Cadastrar Diagnóstico");
        System.out.println("2. Listar Diagnósticos");
        System.out.println("3. Buscar Diagnóstico");
        System.out.println("4. Alterar Diagnóstico");
        System.out.println("5. Remover Diagnóstico");
        System.out.println("6. Buscar Diagnósticos por Paciente");
        System.out.println("0. Voltar");
        
        int opcao = lerOpcao();
        switch (opcao) {
            case 1:
                cadastrarDiagnostico();
                break;
            case 2:
                listarDiagnosticos();
                break;
            case 3:
                buscarDiagnostico();
                break;
            case 4:
                alterarDiagnostico();
                break;
            case 5:
                removerDiagnostico();
                break;
            case 6:
                buscarDiagnosticosPaciente();
                break;
        }
    }

    private void cadastrarDiagnostico() {
        System.out.println("\n=== CADASTRAR DIAGNÓSTICO ===");
        
        System.out.print("ID do Paciente: ");
        int pacienteId = Integer.parseInt(scanner.nextLine());
        Paciente paciente = pacienteService.buscarPacientePorId(pacienteId);
        
        System.out.print("ID da Doença: ");
        int doencaId = Integer.parseInt(scanner.nextLine());
        Doenca doenca = doencaService.buscarDoencaPorId(doencaId);
        
        Diagnostico diagnostico = new Diagnostico(null, paciente, doenca);
        
        System.out.println("Adicione os sintomas:");
        adicionarSintomasDiagnostico(diagnostico);
        
        System.out.println("Adicionar exames? (S/N)");
        if (scanner.nextLine().equalsIgnoreCase("S")) {
            adicionarExamesDiagnostico(diagnostico);
        }
        
        diagnosticoService.cadastrarDiagnostico(diagnostico);
        System.out.println("Diagnóstico cadastrado com sucesso!");
    }

    private void adicionarSintomasDiagnostico(Diagnostico diagnostico) {
        do {
            System.out.print("ID do sintoma (0 para sair): ");
            int sintomaId = Integer.parseInt(scanner.nextLine());
            if (sintomaId == 0) break;
            
            try {
                Sintoma sintoma = sintomaService.buscarSintomaPorId(sintomaId);
                diagnostico.adicionarSintoma(sintoma);
                System.out.println("Sintoma adicionado!");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } while (true);
    }

    private void adicionarExamesDiagnostico(Diagnostico diagnostico) {
        do {
            System.out.print("ID do exame (0 para sair): ");
            int exameId = Integer.parseInt(scanner.nextLine());
            if (exameId == 0) break;
            
            try {
                Exame exame = exameService.buscarExamePorId(exameId);
                diagnostico.getExames().add(exame);
                System.out.println("Exame adicionado!");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } while (true);
    }

    private void listarDiagnosticos() {
        System.out.println("\n=== LISTA DE DIAGNÓSTICOS ===");
        List<Diagnostico> diagnosticos = diagnosticoService.listarDiagnosticos();
        
        if (diagnosticos.isEmpty()) {
            System.out.println("Nenhum diagnóstico cadastrado.");
            return;
        }

        for (Diagnostico d : diagnosticos) {
            System.out.printf("ID: %d | Paciente: %s | Doença: %s\n",
                d.getId(), d.getPaciente().getNome(), d.getDoencaSugerida().getNome());
        }
    }

    private void buscarDiagnostico() {
        System.out.println("\n=== BUSCAR DIAGNÓSTICO ===");
        System.out.print("Digite o ID do diagnóstico: ");
        int id = Integer.parseInt(scanner.nextLine());
        
        Diagnostico d = diagnosticoService.buscarDiagnosticoPorId(id);
        System.out.printf("ID: %d\nPaciente: %s\nDoença: %s\n",
            d.getId(), d.getPaciente().getNome(), d.getDoencaSugerida().getNome());
        
        System.out.println("\nSintomas:");
        for (Sintoma s : d.getSintomas()) {
            System.out.printf("- %s (Severidade: %d)\n", s.getDescricao(), s.getSeveridade());
        }
        
        System.out.println("\nExames:");
        for (Exame e : d.getExames()) {
            System.out.printf("- %s: %s\n", e.getTipo(), e.getResultado());
        }
    }

    private void alterarDiagnostico() {
        System.out.println("\n=== ALTERAR DIAGNÓSTICO ===");
        System.out.print("Digite o ID do diagnóstico: ");
        int id = Integer.parseInt(scanner.nextLine());
        
        Diagnostico diagnostico = diagnosticoService.buscarDiagnosticoPorId(id);
        
        System.out.println("Alterar doença sugerida? (S/N)");
        if (scanner.nextLine().equalsIgnoreCase("S")) {
            System.out.print("Novo ID da doença: ");
            int doencaId = Integer.parseInt(scanner.nextLine());
            Doenca doenca = doencaService.buscarDoencaPorId(doencaId);
            diagnostico.setDoencaSugerida(doenca);
        }
        
        System.out.println("Adicionar mais sintomas? (S/N)");
        if (scanner.nextLine().equalsIgnoreCase("S")) {
            adicionarSintomasDiagnostico(diagnostico);
        }
        
        System.out.println("Adicionar mais exames? (S/N)");
        if (scanner.nextLine().equalsIgnoreCase("S")) {
            adicionarExamesDiagnostico(diagnostico);
        }
        
        diagnosticoService.alterarDiagnostico(diagnostico);
        System.out.println("Diagnóstico alterado com sucesso!");
    }

    private void removerDiagnostico() {
        System.out.println("\n=== REMOVER DIAGNÓSTICO ===");
        System.out.print("Digite o ID do diagnóstico: ");
        int id = Integer.parseInt(scanner.nextLine());
        
        diagnosticoService.removerDiagnostico(id);
        System.out.println("Diagnóstico removido com sucesso!");
    }

    private void buscarDiagnosticosPaciente() {
        System.out.println("\n=== BUSCAR DIAGNÓSTICOS POR PACIENTE ===");
        System.out.print("Digite o ID do paciente: ");
        int pacienteId = Integer.parseInt(scanner.nextLine());
        
        List<Diagnostico> diagnosticos = diagnosticoService.buscarDiagnosticosPorPaciente(pacienteId);
        
        if (diagnosticos.isEmpty()) {
            System.out.println("Nenhum diagnóstico encontrado para este paciente.");
            return;
        }

        for (Diagnostico d : diagnosticos) {
            System.out.printf("ID: %d | Data: %s | Doença: %s\n",
                d.getId(), d.getDataRegistro(), d.getDoencaSugerida().getNome());
        }
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.iniciar();
    }
} 