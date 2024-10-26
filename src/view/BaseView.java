package view;

import java.util.Scanner;

public abstract class BaseView {
    protected Scanner scanner;

    public BaseView(){
        this.scanner = new Scanner(System.in);
    }

    public abstract void ExibirMenu();
    public abstract void Listar();
    public abstract void Localizar();
    public abstract void Adicionar();
    public abstract void Atualizar();
    public abstract void Remover();
}
