package level_1.Lecture_7.Task_1;
import java.util.Arrays;
import java.util.Objects;
public class executeDefragmentation171 {
    /*
    Рассмотрим аналог памяти компьютера на примере массива строк.
    Если удалить некоторые элементы, то в массиве появятся так называемые "дыры" -
    то есть элементы равные null. Метод executeDefragmentation(String[]),
    принимающий массив строк, выполняет его "дефрагментацию", то есть перемещает все объекты
     в начало массива в таком же порядке, передвинув все "дыры" (элементы равные null) в
     конец массива. В этой задаче тебе нужно реализовать метод executeDefragmentation(String[]).
     Метод main() можешь использовать для проверки результата работы метода executeDefragmentation(String[]).


    Требования:
    В классе Memory должен быть метод public static void executeDefragmentation(String[]).
    Реализуй метод executeDefragmentation(String[]) согласно условию.
     */
    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }
    public static void executeDefragmentation(String[] array) {
        String temp = "";
        for(int i = 0; i < array.length; i++) {
            for(int j = 1; j < array.length; j++) {
                if(array[i] != null && array[j-1] == null){
                    temp = array[i];
                    array[i] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
    }
}
