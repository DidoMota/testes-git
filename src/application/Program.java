package application;

public class Program {

	public static void main(String[] args) {
		System.out.println("Aprendendo sobre Git e Github");		
		System.out.printf("COMANDOS DE CONSOLE GIT:"
				+ "%n git init --> inicia um reposit�rio local na pasta do seu projeto"
				+ "%n git remote add origin https://github.com/DidoMota/course-teste.git --> associa seu reposit�rio local ao reposit�rio remoto com o apelido de 'origin'"
				+ "%n git pull origin master --> atualiza seu reposit�rio local em rela��o ao reposit�rio remoto (s� � necess�rio se o .gitignore for criado pelo github)"
				+ "%n git status --> verifica o status do arquivo"
				+ "%n git add . --> adiciona todos os arquivos ao stage"
				+ "%n git commit -m 'descri��o do commit (entre aspas) --> salva uma nova vers�o do projeto"
				+ "%n git log --oneline --> mostra o hist�rico de commits"
				+ "%n git push -u origin master --> envia o reposit�rio local para o reposit�rio remoto (na pr�xima vez s� usar o 'git push'"
				+ "%n git clone https://github.com/DidoMota/course-teste.git --> clona o reposit�rio remoto para o local, caso n�o tenha no computador"
				+ "");
		System.out.println();
		System.out.println();
		System.out.printf("KIT DE PRIMEIROS SOCORROS:"
				+ "%n git clean df e git checkout -- . --> desfaz tudo que foi feito desde o �ltimo commit"
				+ "%n git reset --soft HEAD~1 --> remove o �ltimo commit, por�m mantendos arquivos do jeito que est�o"
				+ "%n git reset --hard HEAD~1 --> remove o �ltimo commit, inclusive todas as modifica��es feitas nos arquivos"
				+ "%n git checkout <c�digo do commit> --> para voltar ao commit informado de modo a fazer uma consulta como estava o c�digo antes (n�o pode fazer altera��es no c�digo)"
				+ "%n git checkout master --> retorna ao �ltimo commit ap�s ter tido um checkout para um outro commit"
				+ "%n git push -f origin HEAD^:master --> apagar o �ltimo commit no Github"
				+ "%n git remote set-url origin https://... --> muda o meu reposit�rio remoto 'origin'");
		
	}

}
