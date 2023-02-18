package domain;

public class Exercise {
    public static float Calculate(int R){
        double Mass[]={1,1,6,7,3,1,7,6,8}; //Масив елементів (1-9)
        int i=0;
        int l=0;
        int N = 0;
        int K = 0;
        int M = 0;
        int L = 0;
        int A = 0;
        int B = 0;
        int E = 0;
        int C = 0;
        int X = 0;
        for(i=0;i<8;i++){ // перебирає значення масиву починаючи с 0-го елемента, закінчуючи 8-м ; !в даному циклі перераховується кожне число окремо(від 1 до 9)
            if(1 == Mass[i]){
                N = N+1;
            }
            if(2 == Mass[i]){
                K = K+1;
            }
            if(3 == Mass[i]){
                M = M+1;
            }
            if(4 == Mass[i]){
                L = L+1;
            }
            if(5 == Mass[i]){
                A = A+1;
            }
            if(6 == Mass[i]){
                B = B+1;
            }
            if(7 == Mass[i]){
                E = E+1;
            }
            if(8 == Mass[i]){
                C = C+1;
            }
            if(9 == Mass[i]){
                X = X+1;
            }
            System.out.println("|"+(int)Mass[i]+"|"); // Вивід даного масиву
        }
        double Res[]={N, K, L, M, A, B, E, X, C}; // Масив кількостей кожної цифри (1-9)
        int max =(int)Res[0];
        for(i=0;i<8;i++){ // Визначення найбілььної кількості одного з елементів
        if(max<Res[i]){
        max=(int)Res[i];
        } 
        }                           //Вивід найчастіше зустрічаймого числа і скільки раз воно повторюється:
        if(max == Res[0]){
            l = 1;
        System.out.println("Maximalno chislo: "+l+" - "+(int)max+" raz");
        }
        else if(max == Res[1]){
            l = 2;
        System.out.println("Maximalno chislo: "+l+" - "+(int)max+" raz");
        }
        else if(max == Res[2]){
            l = 4;
        System.out.println("Maximalno chislo: "+l+" - "+(int)max+" raz");
        }
        else if(max == Res[3]){
            l = 3;
        System.out.println("Maximalno chislo: "+l+" - "+(int)max+" raz");
        }
        else if(max == Res[4]){
            l = 5;
        System.out.println("Maximalno chislo: "+l+" - "+(int)max+" raz");
        }
        else if(max == Res[5]){
            l = 6;
        System.out.println("Maximalno chislo: "+l+" - "+(int)max+" raz");
        }
        else if(max == Res[6]){
            l = 7;
        System.out.println("Maximalno chislo: "+l+" - "+(int)max+" raz");
        }
        else if(max == Res[7]){
            l = 9;
        System.out.println("Maximalno chislo: "+l+" - "+(int)max+" raz");
        }
        else if(max == Res[8]){
            l = 8;
        System.out.println("Maximalno chislo: "+l+" - "+(int)max+" raz");
        }
        return (float) (2*Math.PI*Math.sqrt(R));
    }
}
