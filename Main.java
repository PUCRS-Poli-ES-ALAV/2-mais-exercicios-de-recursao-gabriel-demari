import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println(fat(5)); // Teste Fatorial

        System.out.println(soma(5)); // Teste Somatório

        System.out.println(fib(5)); // Teste Fibonacci

        System.out.println(somaEntreDoisNumeros(5, 10)); // Teste Somatório entre dois números
        System.out.println(somaEntreDoisNumeros(10, 5)); // Teste Somatório entre dois números

        System.out.println(isPal("arara")); // Teste Palíndromo

        System.out.println(convBase2(10)); // Teste Conversão para base 2

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println(somaArray(arr)); // Teste Soma de um Array

        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        arr2.add(59999995);
        arr2.add(2);
        arr2.add(3);
        arr2.add(4);
        System.out.println(getMaior(arr2)); // Teste Maior elemento de um Array

        
        System.out.println(findSubStr("arara", "rfda")); // Teste Substring

        System.out.println(nroDigit(123456)); // Teste Número de dígitos

        System.out.println(permutations("abc")); // Teste Permutações

    }

    /*
     * Assinatura: int fat(int n)
     * Faz: Recebe int n e retorna o fatorial de n int n -> int
     * 
     * Casos Base:
     * n == 1 retorna 1
     * 
     * Casos de Erro:
     * n <= 0 retorna ERRO
     * 
     * Casos recursivos:
     * n > 1 retorna n * fat(n - 1)
     * 
     */

    public static int fat(int n) {
        if (n == 1) {
            return 1;
        } else if (n <= 0) {
            throw new IllegalArgumentException("ERRO");
        } else {
            return n * fat(n - 1);
        }
    }

    /*
     * Assinatura: int soma(int n)
     * Faz: Recebe int n e retorna o somatorial de n até 0 int n -> int
     * 
     * Casos Base:
     * n == 0 retorna 0
     * 
     * Casos de Erro:
     * n < 0 retorna ERRO
     * 
     * Casos recursivos:
     * n > 0 retorna n + soma(n - 1)
     * 
     */

    public static int soma(int n) {
        if (n == 0) {
            return 0;
        } else if (n < 0) {
            throw new IllegalArgumentException("ERRO");
        } else {
            return n + soma(n - 1);
        }
    }

    /*
     * Assinatura: int fib(int n)
     * Faz: Recebe int n e retorna o n-ésimo número de fibonacci int n -> int
     * 
     * Casos Base:
     * n == 1 retorna 0
     * n == 2 retorna 1
     * 
     * Casos de Erro:
     * n <= 0 retorna ERRO
     * 
     * Casos recursivos:
     * n > 2 retorna fib(n - 2) + fib(n - 1)
     * 
    */

    public static int fib(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else if (n <= 0) {
            throw new IllegalArgumentException("ERRO");
        } else {
            return fib(n - 2) + fib(n - 1);
        }
    }


    /*
     * Assinatura: int somaEntreDoisNumeros(int k, int j)
     * Faz: Recebe int j e int k e retorna o somatório entre k e j int k, int j -> int
     * 
     * Casos Base:
     * k == j return k
     * 
     * Casos de Erro:
     *
     * 
     * Casos recursivos:
     * k > j return somaEntreDoisNumeros(k - 1, j) + k
     * j > k return somaEntreDoisNumeros(k, j - 1) + j
    */

    public static int somaEntreDoisNumeros(int k, int j) {
        if (k == j) {
            return k;
        } else if (k > j) {
            return somaEntreDoisNumeros(k - 1, j) + k;
        } else {
            return somaEntreDoisNumeros(k, j - 1) + j;
        }
    }

    /*
     * Assinatura: boolean isPal(String s)
     * Faz: Recebe String s e retorna se a palavra é um palindromo ou não String s -> boolean
     * 
     * Casos Base:
     * s.length() == 0 return true
     * s.length() == 1 return true
     * 
     * Casos de Erro:
     * s == null return ERRO
     * 
     * Casos recursivos:
     * s.charAt(0) == s.charAt(s.length() - 1) retorna isPal(s.substring(1, s.length() - 1))
     * s.charAt(0) != s.charAt(s.length() - 1) return false
     * 
    */

    public static boolean isPal(String s) {
        if (s == null) {
            throw new IllegalArgumentException("ERRO");
        } else if (s.length() == 1 || s.length() == 0) {
            return true;
        } else if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return isPal(s.substring(1, s.length() - 1));
        } else {
            return false;
        } 
    }


    /*
     * Assinatura: String convBase2(int n)
     * Faz: Recebe int n e retorna a representação binária de n String n -> String
     * 
     * Casos Base:
     * n == 2 return "0"
     * n == 1 return "1"
     * 
     * Casos de Erro:
     * n < 0 return ERRO
     * 
     * Casos recursivos:
     * n % 2 == 1 return convBase2(n / 2) + '1'
     * n % 2 == 0 return convBase2(n / 2) + '0'
     * 
    */

    public static String convBase2(int n) {
        if (n == 0) {
            return "0";
        } else if (n == 1) {
            return "1";
        } else if (n < 0) {
            throw new IllegalArgumentException("ERRO");
        } else if (n % 2 == 1) {
            return convBase2(n / 2) + '1';
        } else {
            return convBase2(n / 2) + '0';
        }
    }


    /*
     * Assinatura: int somaArray(ArrayList<Integer> arr)
     * Faz: Recebe um ArrayList de inteiros e retorna a soma de todos os elementos int arr -> int
     * 
     * Casos Base:
     * arr.size() == 0 return 0
     * 
     * Casos de Erro:
     * arr == null return ERRO
     * 
     * Casos recursivos:
     * arr.size() > 0 return arr.remove(arr.size() - 1) + somaArray(arr)
     * 
    */

    public static int somaArray(ArrayList<Integer> arr) {
        if (arr == null) {
            throw new IllegalArgumentException("ERRO");
        } else if (arr.size() == 0) {
            return 0;
        } else {
            return arr.remove(arr.size() - 1) + somaArray(arr);
        }
    }

    /*
     * Assinatura: int getMaior(ArrayList<Integer> arr)
     * Faz: Recebe um ArrayList de inteiros e retorna o maior elemento int arr -> int
     * 
     * Casos Base:
     * arr.size() == 1 return arr.get(0)
     * 
     * Casos de Erro:
     * arr == null return ERRO
     * 
     * Casos recursivos:
     * return Math.max(arr.get(0), getMaior(arr.remove(0)))
     *
     * 
     * 
    */

    public static int getMaior(ArrayList<Integer> arr) {
        if (arr == null) {
            throw new IllegalArgumentException("ERRO");
        } else if (arr.size() == 1) {
            return arr.get(0);
        } else {
            int n = arr.remove(0);
            return Math.max(n, getMaior(arr));
        }
    }


    /*
     * Assinatura: boolean findSubStr(String str, String match)
     * Faz: Recebe uma String str e uma String match e retorna se a String match está contida em str String str, String match -> boolean
     * 
     * Casos Base:
     * str.length() == 0 || match.length == 0 return true
     * str.length() < match.length() return false
     * 
     * Casos de Erro:
     * 
     * 
     * Casos recursivos:
     * str.charAt(0) != match.charAt(0) retorna findSubStr(str.substring(1), match)
     * str.charAt(0) == match.charAt(0) retorna findSubStr(str.substring(1), match.substring(1))
     * 
    */
    public static boolean findSubStr(String str, String match) {
        if (str.length() == 0 || match.length() == 0) {
            return true;
        } else if (str.length() < match.length()) {
            return false;
        } else if (str.charAt(0) != match.charAt(0)) {
            return findSubStr(str.substring(1), match);
        } else {
            return findSubStr(str.substring(1), match.substring(1));
        }
    }

    /*
     * Assinatura: int nroDigit(int n)
     * Faz: Recebe um número inteiro e retorna a quantidade de dígitos int n -> int
     * 
     * Casos Base:
     * n < 10 return 1
     * 
     * Casos de Erro:
     * 
     * 
     * Casos recursivos:
     * n > 10 return 1 + nroDigit(n / 10)
     * 
    */

    public static int nroDigit(int n) {
        if (n < 10) {
            return 1;
        } else {
            return 1 + nroDigit(n / 10);
        }
    }

    /*
     * Assinatura: ArrayList<String> permutations(String s)
     * Faz: Recebe uma String e retorna todas as permutações possíveis da String String s -> ArrayList<String>
     * 
     * Casos Base:
     * if (s.length() == 1) return s
     * 
     * Casos de Erro:
     * if (s == null) return ERRO
     * 
     * Casos recursivos:
     * ArrayList<String> perms = new ArrayList<String>();
     * for (int i = 0; i < s.length(); i++) {
     *    String c = s.charAt(i);
     *  String rest = s.substring(0, i) + s.substring(i + 1);
     * ArrayList<String> restPerms = permutations(rest);
     * perms.add(c);
     * for (String perm : restPerms) {
     *      perms.add(c + perm);
     *     }
     * }
     * return perms;
     *
     * 
    */

    public static ArrayList<String> permutations(String s) {
        if (s == null) {
            throw new IllegalArgumentException("ERRO");
        } else if (s.length() == 1) {
            ArrayList<String> perms = new ArrayList<String>();
            perms.add(s);
            return perms;
        } else {
            ArrayList<String> perms = new ArrayList<String>();
            for (int i = 0; i < s.length(); i++) {
                String c =  "" + s.charAt(i);
                String rest = s.substring(0, i) + s.substring(i + 1);
                ArrayList<String> restPerms = permutations(rest);
                perms.add(c);
                for (String perm : restPerms) {
                    perms.add(c + perm);
                }
            }
            return perms;
        }
    }



}