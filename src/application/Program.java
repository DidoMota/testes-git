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
		System.out.println("KIT DE PRIMEIROS SOCORROS:");
		

	}

}
