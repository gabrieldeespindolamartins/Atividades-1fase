public class SegundoExemploPolimorfismo
{
    public static void main(String args[])
    {
        //criar um novo usuario no sistema
        Usuario usuario = new Usuario( Teclado.leInt("Informe a matricula do usuario: "),
                                        Teclado.leString("Informe o nome do usuario: "),
                                        Teclado.leString("Informe o login do usuario: "),
                                        Teclado.leString("Informe a senha do usuario: ")
                                      );

        //criar um novo usuario do tipo Professor no sistema
        Professor professor = new Professor( Teclado.leInt("Informe a matricula do professor: "),
                                              Teclado.leString("Informe o nome do professor: "),
                                              Teclado.leString("Informe o login do professor: "),
                                              Teclado.leString("Informe a senha do professor: ")
                                            );
        professor.setAreaAtuacao("Informática"); // atribuindo valor ao atributo: areaAtuacao por meio do método de configuração

        //criar um novo usuario do tipo Aluno no sistema
        Aluno aluno = new Aluno( Teclado.leInt("Informe a matricula do aluno: "),
                                  Teclado.leString("Informe o nome do aluno: "),
                                  Teclado.leString("Informe o login do aluno: "),
                                  Teclado.leString("Informe a senha do aluno: ")
                                );

        //apresentar os dados de cada usuario criado
        //Usuario
        usuario.exibeDados();
        //Professor
        professor.exibeDados();
        //Aluno
        aluno.exibeDados();
    }
}
