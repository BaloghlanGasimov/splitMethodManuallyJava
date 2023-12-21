public class MyClass {
    public String soz;

    public String[] mySplit(String character){
        int count=0;
        boolean isTemp=false;
        int timesUsed=0;
        char[] sozArr = soz.toCharArray();
        char[] charArr = character.toCharArray();

        if(character==""){
            String[] mainStr = new String[sozArr.length];
            for (int i=0;i<sozArr.length;i++){

                mainStr[i]= String.valueOf(sozArr[i]);

            }
            return mainStr;

        }

        //Finding how many time character used in word

        if(character!="") {
            for (int i = 0, j = 0; i < sozArr.length; i++) {
                isTemp = false;
                if (sozArr[i] == charArr[j]) {

                    int temp = i;
                    for (; j < charArr.length; j++, temp++) {

                        if (temp >= sozArr.length) {
                            isTemp = false;
                            break;
                        }
                        if (sozArr[temp] == charArr[j]) {
                            isTemp = true;

                            if (temp == sozArr.length - 1) {
                                isTemp = false;
                            }

                            //isTemp= temp != sozArr.length - 1;

                        } else {
                            isTemp = false;
                            break;
                        }

                    }

                    j = 0;

                }
                if (isTemp) {
                    timesUsed++;
                }

            }
        }else{
            timesUsed=sozArr.length-1;
        }

        // -----

        //Declaration String Array

        String[] mainStr =new String[timesUsed+1];

        //Entering all elements=""
        //---------------------------------

        for (int i =0;i<mainStr.length;i++){
            mainStr[i]="";
        }

        //---------------------------------

        if(timesUsed==0){
            mainStr[0]=String.valueOf(sozArr);

        }else{
            for(int i=0,j=0,k=0;i<sozArr.length;i++){
                isTemp=false;

                if(sozArr[i]==charArr[j]){
                    //System.out.println("daxildi i:"+i+"j:"+j);
                    int temp =i;
                    for(;j<charArr.length;j++,temp++){
                        if(temp>=sozArr.length){
                            isTemp=false;
                            break;
                        }
                        if(sozArr[temp]==charArr[j]){
                            isTemp=true;
                        }else {
                            isTemp=false;
                            break;
                        }
                    }
                    j=0;
                }
                if(isTemp){
                    //System.out.println("continue hissesinde j: "+j);
                    i+=charArr.length-1;
                    k++;
                    continue;
                }
                mainStr[k]+=sozArr[i];
            }
        }

        return mainStr;

    }

}
