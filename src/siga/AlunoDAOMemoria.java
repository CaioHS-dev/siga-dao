package siga;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlunoDAOMemoria implements AlunoDAO {
    
    private final Map<String, Aluno> bancoMemoria = new HashMap<>();

    @Override
    public void inserir(Aluno aluno) {
        bancoMemoria.put(aluno.getMatricula(), aluno);
    }

    @Override
    public Aluno buscarPorMatricula(String matricula) {
        return bancoMemoria.get(matricula);
    }

    @Override
    public List<Aluno> listarTodos() {
        return new ArrayList<>(bancoMemoria.values());
    }

    @Override
    public void atualizar(Aluno aluno) {
        bancoMemoria.put(aluno.getMatricula(), aluno);
    }

    @Override
    public void remover(String matricula) {
        bancoMemoria.remove(matricula);
    }
}