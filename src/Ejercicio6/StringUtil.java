package Ejercicio6;

public class StringUtil
{
    // Retorna una cadena compuesta por n caracteres c
    // Ejemplo: replicate('x',5) ==> 'xxxxx'
    public static String replicate(char c,int n)
    {
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++)
            sb.append(c);

        return sb.toString();
    }

    // Retorna una cadena de longitud n, compuesta por s
    // y precedida de tantos caracteres c como sea necesario
    // para completar la longitud mencionada
    // Ejemplo lpad("5",3,'0') ==> "005"
    public static String lpad(String s, int n, char c)
    {
        StringBuilder sb = new StringBuilder();

        //Concateno primero el caracter C a la izquierda
        for(int i=0; i<n-s.length();i++){
            sb.append(c);
        }

        //Concateno la cadena original la derecha
        sb.append(s);

        return sb.toString();
    }

    // Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static String[] toStringArray(int[] arr)
    {
		/*StringBuilder sb = new StringBuilder();

		for(int i=0; i< arr.length; i++){
			sb.append(arr[i]);
		}

		return sb.toString();*/

        String[] arrRet = new String[arr.length];

        for(int i=0; i<arr.length; i++){
            arrRet[i] = String.valueOf(arr[i]);
        }

        return arrRet;
    }

    // Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static int[] toIntArray(String arr[])
    {
        int numero[] = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            numero[i] = Integer.parseInt(arr[i]);
        }

        return numero;
    }

    // Retorna la longitud del elemento con mayor cantidad
    // de caracteres del array arr
    public static int maxLength(String arr[])
    {
        int maxLength = -1;

        for(int i=0; i< arr.length; i++){
            if(arr[i].length() > maxLength)
                maxLength = arr[i].length();
        }

        return maxLength;
    }

    // Completa los elemento del arr agregando caracteres c
    // a la izquierda, dejando a todos con la longitud del mayor
    public static void lNormalize(String arr[], char c)
    {
        int longNormalizada = maxLength(arr);

        for(int i=0; i < arr.length; i++){
            arr[i] = lpad(arr[i], longNormalizada, c);
        }
    }


    //  Retorna una cadena idéntica a s pero sin espacios a la izquierda.
    public static String ltrim(String s){
        int i = 0;
        while (i < s.length() && Character.isWhitespace(s.charAt(i))) {
            i++;
        }
        String res = s.substring(i);

        return res;
    }

    //  idem ltrim, pero sin espacios a la derecha.
    public static String rtrim(String s){
        int i = s.length()-1;
        while (i >= 0 && Character.isWhitespace(s.charAt(i))) {
            i--;
        }
        String res = s.substring(0,i+1);

        return res;
    }

    // idem ltrim, pero sin espacios a derecha ni izquierda.
    public static String trim(String s){
        String res = rtrim(s);
        res = ltrim(res);

        return res;
    }

    // Retorna la posición de la n-ésima ocurrencia del carácter c dentro de s, o -1 si s no contiene a c.
    // Por ejemplo, si s = “John|Paul|George|Ringo”, c = ‘|’ y n=2, la función debe retornar la posicióon
    // de la segunda ocurrencia del carácter ‘|’ (pipe) dentro de la cadena s. Que, en este caso, es: 9.
    public static int indexOfN(String s,char c,int n){
        int indexRes = -1, contadorExistencias = 0;

        for(int i=0; i < s.length() || contadorExistencias < n; i++){
            if(s.charAt(i) == c)
                contadorExistencias++;
            if(contadorExistencias == n)
                indexRes = i;
        }

        return indexRes;
    }




}
