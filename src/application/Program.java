package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Comment c1 = new Comment("logo mais to ai em boy");
		Comment c2 = new Comment("vai gerar papai ihuuu");

		System.out.println("faça um novo post: ");
		System.out.println("data do post." + sdf.parse("21/06/2018 13:05:44"));
		System.out.println("Titulo do seu post: ");
		String title = sc.nextLine();

		System.out.println("Conteudo do post: ");
		String content = sc.nextLine();

		System.out.println();

		System.out.println("HMMMM seu post gerou 12 likes, mt bom¹");

		System.out.println();

		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), title, content, 12);

		p1.addComment(c1);
		p1.addComment(c2);

		System.out.println(p1);

	}

}
