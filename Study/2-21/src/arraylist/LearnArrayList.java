package arraylist;

import java.util.ArrayList;

public class LearnArrayList {

    public static void main(String[] args) {
         // ▼配列
         // 宣言
         int[] number = new int[5];
         // 初期化
         number[0] = 1;
         number[1] = 2;
         number[2] = 3;
         number[3] = 4;
         number[4] = 5;
         
         // 上書き
         number[0] = 5;
         
         // 出力
         for(int i=0; i<number.length; i++) {
             System.out.println("配列：添え字" + i + "の値は" +  number[i]);
         }

         // ▼コレクション・フレームワーク
         // 可変配列 ArrayList
         // 宣言
         // 要素数を指定しない場合　初期要素：10
         ArrayList<Integer> alNumber = new ArrayList<Integer>();
         // 要素数を指定する場合　要素数：5
         ArrayList<Integer> alNumber_5 = new ArrayList<Integer>(5);

         // 初期化&追加
         // 初期化と追加は同じaddメソッドを使用し値を格納していきます。
         alNumber.add(1);
         alNumber.add(2);
         alNumber.add(3);
         alNumber.add(4);
         alNumber.add(5);
         alNumber.add(6);
         alNumber.add(7);
         alNumber.add(8);
         alNumber.add(9);
         alNumber.add(10);
         // 初期要素数は10ですが、要素数を超えてaddメソッドを使用すると
         // 自動的に要素数が増えていきます。
         alNumber.add(11);

         // 上書き 添え字を使用し0番目の要素を変更
         // 1 → 5 に上書き
         alNumber.set(0, 5);

         // 削除 添え字を使用し0番目の要素を削除
         alNumber.remove(0);

         // 出力
         for(int i=0; i<alNumber.size(); i++) {
             System.out.println("ArrayList：添え字" + i + "の値は" +  alNumber.get(i));
         }

    }

}