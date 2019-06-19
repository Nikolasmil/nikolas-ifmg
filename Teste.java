import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
/**
 * Escreva a descrição da classe Teste aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Teste
{
    public static void corrigirBits(String resposta[], int r, int n, int i){
        if(r<n){
            while(r!=n){
                resposta[i]="0"+resposta[i];
                r++;
            }
        }
    }
    
    public static int registradores(String w){
            if(w.equals("$s0"))
            {
                return 16;
            }
            else if(w.equals("$s1"))
            {
                return 17;
            }
            else if (w.equals("$s2"))
            {
                return 18;
            }
            else if (w.equals("$s3"))
            {
                return 19;
            }
            else if (w.equals("$s4"))
            {
                return 20;
            }
            else if (w.equals("$s5"))
            {
                return 21;
            }
            else if (w.equals("$s6"))
            {
               return 22;
            }
            else if (w.equals("$s7"))
            {
                return 23;
            }
            else if(w.equals("$szero"))
            {
                return 0;
            }
            else if(w.equals("$t0"))
            {
               return 8;
            }
            else if(w.equals("$t1"))
            {
                return 9;
            }
            else if(w.equals("$t2"))
            {
                return 10;
            }
            else if(w.equals("$t3"))
            {
                return 11;
            }
            else if(w.equals("$t4"))
            {
                return 12;
            }
            else if(w.equals("$t5"))
            {
                return 13;
            }
            else if(w.equals("$t6"))
            {
               return 14;
            }
            else if(w.equals("$t7"))
            {
                return 15;
            }
            else
            {
                System.out.println("NÃO CADASTRADO");
                return 0;
            }
    }
}
