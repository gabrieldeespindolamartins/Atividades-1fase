public class PrimeiroExemploHeranca
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

        //criar um novo usuario do tipo Aluno no sistema
        Aluno aluno = new Aluno( Teclado.leInt("Informe a matricula do aluno: "),
                                  Teclado.leString("Informe o nome do aluno: "),
                                  Teclado.leString("Informe o login do aluno: "),
                                  Teclado.leString("Informe a senha do aluno: ")
                                );

        //apresentar a matricula e o nome de cada usuario criado
        //Usuario
        System.out.println("");
        System.out.println("Matricula do usuario: " + usuario.getMatricula());
        System.out.println("Nome do usuario: " + usuario.getNome());
        //Professor
        System.out.println("");
        System.out.println("Matricula do professor: " + professor.getMatricula());
        System.out.println("Nome do professor: " + professor.getNome());
        //Aluno
        System.out.println("");
        System.out.println("Matricula do aluno: " + aluno.getMatricula());
        System.out.println("Nome do aluno: " + aluno.getNome());
    }
}
