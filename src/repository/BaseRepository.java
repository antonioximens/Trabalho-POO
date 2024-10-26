package repository;

import java.util.ArrayList;

// classe abstrata que se refere de TDominio
public abstract class BaseRepository<TDominio>{
        // criando um atributo para classe pai onde vai ficar os dados
        protected ArrayList<TDominio> fonteDeDados;

        // criando os metodos abstracts exe5to o readAll() onde é implementado
        
        // utilizando o CRUD
        // Criar algo, precisar saber o que vai ser criado, logo uma instacia de um objt
        // tipo: TDominio / oque é: instancia
        public abstract TDominio Create(TDominio instancia);
        
        // Ler todos, logo é um método real onde retorna uma lista
        public ArrayList<TDominio> ReadAll(){
            return this.fonteDeDados;
        }
        
        // Ler algo especifico, logo precisa de um identificador
        public abstract TDominio Read(int codigo);

        // atualizar algo, logo precisa achar o objeto a ser atualizado
        public abstract TDominio Update(TDominio instancia);
        
        // Apagar algo, logo precisa de um identificador
        public abstract TDominio Delete(int codigo);
}
