/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19myschool;

import entity.teacher;
import tools.managers.PersonManager;
import entity.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
class App {
    private Scanner scanner = new Scanner(System.in);
    private List<Person> ListPersons = new ArrayList<>();
    private List<Teacher> ListPersons = new ArrayList<>();
    public void run() {
        System.out.println("----- Моя школа -----");
        boolean repeat = true;
        do {            
            System.out.println("Задачи: ");
            System.out.println("0. Выйти из программы");
            System.out.println("1. Добавить ученика");
            System.out.println("2. Список учеников");
            System.out.println("3. Добавить учителя");
            System.out.println("4. Список учителей");
            System.out.println("5. Добавить предмет");
            System.out.println("6. Список предметов");
            System.out.println("7. Поставить оценку");
            System.out.println("8. Список оценок");
            System.out.println("9. Оценки по предмету");
            System.out.println("10. Изменить оценку");
            System.out.println("Выберите задачу: ");
            String task = scanner.nextLine();
            switch(task) {
                case "0":
                    System.out.println("---- Конец программы ----");
                    repeat = false;                   
                    break;                  
                case "1":
                    System.out.println("----- Добавить ученика -----");
                    PersonManager personManager = new PersonManager();
                    Person student = personManager.createPerson();
                    break;                           
                case "2":
                    System.out.println("----- Список учеников -----");
                    PersonManager.printListPerson();
                    break;                   
                case "3":
                    System.out.println("----- Добавить учителя -----");
                    Person teacher = personManager.createPerson("TEACHER");
                    personManager.addPersonToList(teacher, listPersons);
                    
                    
                    
                    
                    break;
                    
                case "4":
                    
                    break;
                    
                case "5":
                    
                    break;                   
                    
                case "6":
                    
                    break;
                    
                case "7":
                    
                    break;
                    
                case "8":
                    
                    break;
                    
                case "9":
                    
                    break;
                
                case "10":
                    
                    break;
                    
                
            }
                    
    }
        
        
    }


    
}
