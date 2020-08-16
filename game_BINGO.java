package summer_hackathon;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class game_BINGO {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Scanner sca = new Scanner(System.in);
        int[][] you = new int[5][5];
        int[] ball = new int[50];
        int i, j, k, sum1, sum2, sum3 = 0, sum4 = 0;

        for (i = 1; i <= 50; i++) { /*ボールの値を入れる*/
            list.add(i);
        }
        Collections.shuffle(list);/*ボールをシャッフル*/

        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                you[i][j] = list.get(5 * i + j + 2);
            }
        }


        Collections.shuffle(list);
        for (i = 0; i < 50; i++) {
            ball[i] = list.get(i);

        }

        // Bingo Game 開始
        System.out.println("----------------- 対戦式ビンゴゲーム -----------------");
        System.out.print(" " + "YOU");
        System.out.println();
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print("|" + String.format("%02d", you[i][j]));
            }

            System.out.println();

        }
        System.out.print(" ボールを引いてね (y / n) > ");
        if (sca.nextLine().charAt(0) != 'y') {
            System.out.println("ゲームをやめます");
            return;

        }

        for (k = 0; k < 30; k++) {
            System.out.println((k + 1) + "回目の当たり数字は…… " + ball[k]);

            for (i = 0; i < 5; i++) {
                for (j = 0; j < 5; j++) {
                    if (you[i][j] == ball[k]) {
                        you[i][j] = 0; // [you] bingoシートの当たり数字を[0]に変更
                    }

                }
            }


            //BINGOシートの表示
            System.out.print(" " + "YOU");
            System.out.println();
            for (i = 0; i < 5; i++) {
                for (j = 0; j < 5; j++) {
                    if (you[i][j] == 0) { // すでに当たりのマス目なら「■」を表示
                        System.out.print("|■■");
                    } else { // それ以外は数字を表示
                        System.out.print("|" + String.format("%02d", you[i][j]));
                    }
                }
                System.out.println();
            }
            for (i = 0; i < 5; i++){
                sum3 += you[i][i];
                sum4 += you[i][4-i];
            }

            for (i = 0; i < 5; i++) {
                sum1 = 0;
                sum2 = 0;

                for (j = 0; j < 5; j++) {
                    sum1 += you[i][j]; // [you] 横の足し算
                    sum2 += you[j][i]; // [you] 縦の足し算
                }



                if (sum1 == 0 || sum2 == 0 || sum3 == 0 || sum4 == 0) {
                    System.out.println(" ★☆★ ビンゴ！ おめでとうございます！ ☆★☆ ");
                    return;
                }

                }
                System.out.print(" 次のボールを引いてね (y / n) > ");
                if (sca.nextLine().charAt(0) != 'y') {
                    System.out.println("ゲームをやめます");
                    return;

                }

            }
        System.out.println(" あなたの負けです！　またの挑戦をお待ちしております");

        }

    }















