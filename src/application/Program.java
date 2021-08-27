package application;

public class Program {

	public static void main(String[] args) {
		System.out.println("Aprendendo sobre Git e Github");		
		System.out.printf("COMANDOS DE CONSOLE GIT:"
				+ "%n git init --> inicia um repositório local na pasta do seu projeto"
				+ "%n git remote add origin https://github.com/DidoMota/course-teste.git --> associa seu repositório local ao repositório remoto com o apelido de 'origin'"
				+ "%n git pull origin master --> atualiza seu repositório local em relação ao repositório remoto (só é necessário se o .gitignore for criado pelo github)"
				+ "%n git status --> verifica o status do arquivo"
				+ "%n git add . --> adiciona todos os arquivos ao stage"
				+ "%n git commit -m 'descrição do commit (entre aspas) --> salva uma nova versão do projeto"
				+ "%n git log --oneline --> mostra o histórico de commits"
				+ "%n git push -u origin master --> envia o repositório local para o repositório remoto (na próxima vez só usar o 'git push'"
				+ "%n git clone https://github.com/DidoMota/course-teste.git --> clona o repositório remoto para o local, caso não tenha no computador"
				+ "");
		System.out.println();
		System.out.println();
		System.out.printf("KIT DE PRIMEIROS SOCORROS:"
				+ "%n git clean df e git checkout -- . --> desfaz tudo que foi feito desde o último commit"
				+ "%n git reset --soft HEAD~1 --> remove o último commit, porém mantendos arquivos do jeito que estão"
				+ "%n git reset --hard HEAD~1 --> remove o último commit, inclusive todas as modificações feitas nos arquivos"
				+ "%n git checkout <código do commit> --> para voltar ao commit informado de modo a fazer uma consulta como estava o código antes (não pode fazer alterações no código)"
				+ "%n git checkout master --> retorna ao último commit após ter tido um checkout para um outro commit"
				+ "%n git push -f origin HEAD^:master --> apagar o último commit no Github"
				+ "%n git remote set-url origin https://... --> muda o meu repositório remoto 'origin'");
		
	}

}
