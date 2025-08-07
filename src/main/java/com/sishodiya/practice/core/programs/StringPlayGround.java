package main.java.com.sishodiya.practice.core.programs;

public class StringPlayGround {
    public static void main(String[] args) {
        String vowelsString1 = "PaAeRiVoEuEN";
//                            "PuAoRVieEaEN"
        String vowelsString = "IceCreAm";
        //"euoiea"

        //method to reverse the vowels in string
        //INPUT - P a r e i v o u n t s
        //OUTPUT - P u r o i v e a n t s
        reverseVowelsOnly(vowelsString);
    }

    static char[] swapVowels(char[] arr, int left, int right){
        char temp = arr[right];
        arr[right] = arr[left];
        arr[left] = temp;
        return arr;
    }

    static int itreration = 0;
    static String reverseVowelsOnly(String str){

        //OUTPUT - 0 1 2 3 4 5 6 7 8 9 10
        //OUTPUT - P a r e i v o u n t s
        //OUTPUT - P u r o i v e a n t s
        //OUTPUT - P u r o v i e a n t s

        char[] chars = str.toCharArray();
        int left = 0; int right = chars.length - 1;
        boolean foundLeft = false;
        boolean foundRight = false;

        while (left < right) {

//            System.out.println("0000000000000000000000000");
//            System.out.println("left = " + left);
//            System.out.println("right = " + right);


            for (int s = left; s < right; s++) {
                if (chars[s] == 'a' || chars[s] == 'e' || chars[s] == 'i' || chars[s] == 'o' || chars[s] == 'u' || chars[s] == 'A' || chars[s] == 'E' || chars[s] == 'I' || chars[s] == 'O' || chars[s] == 'U') {
                    left = s;
                    foundLeft = true;
                    break;
                }
            }

            for (int s = right; s > left; s--) {
                if (chars[s] == 'a' || chars[s] == 'e' || chars[s] == 'i' || chars[s] == 'o' || chars[s] == 'u' || chars[s] == 'A' || chars[s] == 'E' || chars[s] == 'I' || chars[s] == 'O' || chars[s] == 'U') {
                    right = s;
                    foundRight = true;
                    break;
                }
            }

//            System.out.println("**************************");
//            System.out.println("left = " + left);
//            System.out.println("right = " + right);

            if(foundLeft && foundRight){
                chars = swapVowels(chars, left, right);

//                System.out.println(chars);
//                System.out.println("------------------------");
                foundRight = false;
                foundRight = false;
            }
            left++; right--;

//            itreration++;

        }

        return String.valueOf(chars);

//        System.out.println(chars);

    }

}
