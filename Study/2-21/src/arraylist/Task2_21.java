package arraylist;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 本課題では、代表的なコレクション・フレームワークのArrayList及びHashMapを使い
 * くだものとその値段を管理するコードを記述します。
 * 
 * 問①～問④まであります。
 * 
 */
public class Task2_21 {
    
    public static final String orange = "オレンジ";
    public static final String grape = "ぶどう";
    public static final String apple = "りんご";
    public static final String pear = "梨";

    public static void main(String[] args) {
        // ① 変数名furuitsArrayListのデータ型StringでArrayListを宣言し、
        // 変数orange、grape、apple、pearの値を順に格納して下さい。
        ArrayList<String> fruitsArrayList = new ArrayList<String>(); //解答例
        fruitsArrayList.add(orange); //解答例
        fruitsArrayList.add(grape); //解答例
        fruitsArrayList.add(apple); //解答例
        fruitsArrayList.add(pear); //解答例

        // ② 変数名fruitsHashMapのHashMapを宣言（データ型　キーはString、値はInteger）し、
        // キーにはfruitsArrayListに格納した値を格納し、
        // 値にはオレンジは150円、ぶどうは120円、りんごは180円、梨は140円を格納して下さい。
        // 値は数値のみで単位の円は入れないでください。
        HashMap<String, Integer> fruitsHashMap = new HashMap<String, Integer>();
        fruitsHashMap.put(fruitsArrayList.get(0), 150); //解答例
        fruitsHashMap.put(fruitsArrayList.get(1), 120); //解答例
        fruitsHashMap.put(fruitsArrayList.get(2), 180); //解答例
        fruitsHashMap.put(fruitsArrayList.get(3), 140); //解答例

        // ③ オレンジの値段を200円に上書きしてください。
        fruitsHashMap.replace(fruitsArrayList.get(0), 200); //解答例
        
        // ④ レッスン内容を参考に拡張for文を使い、
        // 課題の画像と同じように表示されるよう出力して下さい。
        for(String fruit: fruitsHashMap.keySet()) { //解答例
            System.out.println(fruit + "の値段は" + fruitsHashMap.get(fruit) + "です。"); //解答例
        } //解答例
    }

}