public class Main {

    public static void main(String[] args) {


        MyClass st = new MyClass();

        st.soz ="Hafiz netersen  af";

        String[] strArr = st.soz.split("a ");

        for(int i=0;i<strArr.length;i++){
            System.out.println("Java method arrayi["+i+"]:"+strArr[i]);
        }
        System.out.println("-----------------------------------");



        //System.out.println(st.soz.split("e"));;
        String[] answer = st.mySplit("a ");

    for (int i=0;i<answer.length;i++){
        System.out.println("Cavab:["+i+"]:"+ answer[i]);
    }


        /*

        MyReturnedClass newSt = new MyReturnedClass();

        newSt.soz = "Salam neceesen";



        String[] strArr = newSt.soz.split("");

        for(int i=0;i<strArr.length;i++){
            System.out.println("Java method arrayi["+i+"]: "+strArr[i]);
        }



        String[] deneme = newSt.mySplit("");

        for (int i=0;i<deneme.length;i++){
            System.out.println(deneme[i]);
        }


         */
    }

}
