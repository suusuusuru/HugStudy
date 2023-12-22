package study;

import java.util.ArrayList;

import constants.Constants;
import language.Student;
import person.Person;
        
        
public class Task2_23 {

    public static void main(String[] args) {
        //Personクラスのインスタンスを格納するArrayListクラス型の変数personsを用意
        ArrayList<Person> persons = new ArrayList<Person>(); // 解答例
        
        //①Personクラスの変数名「yamada」というインスタンスを作成して下さい。
        //引数には1:山田太郎 2:Java を入れて下さい。
        //また「Java」は、Constants.javaのものを扱って下さい。
        Person yamada = new Student("山田太郎", Constants.LANGUAGE_JAVA); // 解答例
        persons.add(yamada); // 解答例

        //②作成した変数「yamada」を利用し名前を表示して下さい。
        System.out.println(yamada.getName()); // 解答例
        
        //③Personクラスの変数名「ishitani」というインスタンスを作成して下さい。
        //引数には1:石谷花子 2:HTML を入れて下さい。
        //また「HTML」は、Constants.javaのものを扱って下さい。
        Person ishitani = new Student("石谷花子", Constants.LANGUAGE_HTML); // 解答例
        persons.add(ishitani); // 解答例
        
        //④作成した変数「ishitani」を利用し学んでいる言語を表示して下さい。
        System.out.println(ishitani.getLanguage()); // 解答例
        
        //⑤「〇〇が△△を学んでいます」という表示で山田さん、石谷さんが何を学んでいるか出力して下さい。
        for(Person person: persons) { // 解答例
            person.studyLanguage(); // 解答例
        } // 解答例
    }

}