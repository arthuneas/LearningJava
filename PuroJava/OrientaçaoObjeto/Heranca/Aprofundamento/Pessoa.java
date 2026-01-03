/*

SuperClasse A
A <- Subclasse AA
A <- Subclasse AB
A <- Subclasse AC

AA <- SubClasse AAA, AA se torna mãe de AAA e filha de A
AB <- Subclasse ABA e subclasse ABB, a neta tem tudo o que a mae e a avo possuem.
AC <- Subclasse ACA

ABA <- ABAA e ABAB

ex:
A <- AB <- ABA <- ABAA
quando uma Classe não tem progenitor, ela é a classe raiz
uma classe sem filha, são folhas.
Quando uma SuperClasse tem uma neta, essa neta é Descendente da SuperClasse
Assim, a Superclasse é Ancestral da subclasse neta
descendência e ancestralidade não conta a classe mãe.

ex:
- A é raiz
- ABAA e ABAB, AAA, ABB e ACA são folhas
- A é ancestral de ACA, A e AB são descendentes de ABAA e ABAB
- ACA é descendente de A, ABAA e ABAB são descendentes de A e AB

Quando percorre a árvore de Cima para Baixo, há uma ESPECIALIZAÇÃO
Quando percorre de Baixo para Cima, há uma GENERALIZAÇÃO


---- Tipos de Herança ----
- Herança de Implementação - mais pobre
uma subclasse não possui atributos novos, há simplesmente atributos e metodos da mãe

- Herança para Diferença - melhor
uma subclasse com atributos e metodos novos, além da caracteristicas da mãe.

Classe Abstrata: não pode ser instanciada. não pode gerar objetos. Apenas Projenitor.

Método Abstrato: Declarado, mas não implementado na progenitor.

Classe Final: não pode ser herdada por outra classe. Obrigatóriamente Folha, sem filhos

Método Final: Não pode ser sobrescrito pelas suas subclasses. Obrigatoriamente Herdado.
*/


package OrientaçaoObjeto.Heranca.Aprofundamento;

//quando usa abstract ela não pode ser instanciada, não gera objeto.
public abstract class Pessoa {

    private String nome;
    private String Sexo;
    private int idade;

    public Pessoa(String nome, int idade, String sexo) {

    }

    //quando usa o final, o metodo não pode ser sobrescrito.
    public final void fazerAniv(){
        idade += 1;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
