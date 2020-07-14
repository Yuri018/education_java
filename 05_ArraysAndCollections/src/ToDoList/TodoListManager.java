package ToDoList;

import java.util.ArrayList;

public class TodoListManager {

    public static void printArrayList(ArrayList<String> todoList){
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println((i + 1) + " " + todoList.get(i));
        }
    }
    public static void addToArrayList(ArrayList<String> todoList, String todoText){
        todoList.add(todoText);
        System.out.println("Ваш список дел сейчас такой");
        TodoListManager.printArrayList(todoList);
    }
    public static void addToArrayList(ArrayList<String> todoList, Integer eventNumber, String todoText){
        if (eventNumber <= todoList.size()){
            todoList.add(eventNumber - 1, todoText);
            printTodoList(todoList);
        }if (eventNumber > todoList.size()){
            todoList.add(todoText);
            printTodoList(todoList);
        }
    }
    public static void editArrayList(ArrayList<String> todoList, Integer eventNumber,String todoText){
        todoList.set(eventNumber - 1, todoText);
        printTodoList(todoList);
    }

    public static void delEvent(ArrayList<String> todoList, Integer eventNumber){
        todoList.remove(eventNumber - 1);
        printTodoList(todoList);
    }
    public static void exitTodoList(ArrayList<String> todoList){
        System.out.println("Пока");
        printTodoList(todoList);

    }
    public static void printTodoList(ArrayList<String> todoList){
        System.out.println("Ваш список дел сейчас такой");
        TodoListManager.printArrayList(todoList);
    }


}
