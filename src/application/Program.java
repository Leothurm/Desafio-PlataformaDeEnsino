package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Lesson;
import entities.Task;
import entities.Video;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Quantas aulas tem o curso? ");
		int N = sc.nextInt();
		
		List <Lesson> list = new ArrayList<>();
		
		for(int i = 1; i<=N; i++) {
		System.out.printf("Dados da %da aula: %n",i);
		System.out.print("Conteúdo ou tarefa (c/t)? ");
		char ch = sc.next().charAt(0);
		System.out.print("Título: ");
		sc.nextLine();
		String title = sc.nextLine();
		
		if(ch == 'c') {
		System.out.print("URL do vídeo: ");
		String url = sc.nextLine();
		System.out.print("Duração em segundos: ");
		int seconds = sc.nextInt();
		
		Lesson lesson = new Video(title, seconds, url);
		
		list.add(lesson);
		
		
		
		} else {
			System.out.print("Descrição: ");
			String description = sc.nextLine();
			System.out.print("Quantidade de questões: ");
			int questionCount = sc.nextInt();
			
			Lesson lesson = new Task(title, description, questionCount);
			
			list.add(lesson);
			}
		
		}
		
		int totalSeconds = 0;
		
		for(Lesson lesson : list){
			totalSeconds += lesson.duration();		
		}
		
		
		System.out.println();
		System.out.printf("DURAÇÃO TOTAL DO CURSO = %d segundos %n", totalSeconds);
		
		
		sc.close();
	}

}
