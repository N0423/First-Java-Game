
public class GameA {
    
    static boolean rePeat = true;
    static int minimumAge = 0;
    static int maxAge = 100;
    static int nextGuessedNumber;

    public static void main(String[] args){

       System.out.println("あなたの年齢を当てます");     
            int r = new java.util.Random().nextInt(100);
        while(rePeat){

            System.out.println("あなたは" + r + "歳以上ですか？");
            int YorN = new java.util.Scanner(System.in).nextInt();
            if(YorN == 1){
                //yearsOldOrOlder = r;
                    nextGuessedNumber = new java.util.Random().nextInt(r) + (99-r); 
                    if(r > minimumAge){
                        minimumAge = r;
                        System.out.println(minimumAge + "以上が確定");
                    }
                    if(maxAge < nextGuessedNumber){//max歳以下と確定したのに次の推測された歳がそのmax歳を上回っていたら
                        while(nextGuessedNumber < maxAge && nextGuessedNumber > minimumAge){//r歳を下回るまで次の歳を推測し続ける;(０歳から確定した最大の歳までの乱数)
                                nextGuessedNumber = new java.util.Random().nextInt(maxAge);    
                        }
                    }
                    r = nextGuessedNumber;   
                    
            }else{
                    //underYearsOld = r;
                    nextGuessedNumber = new java.util.Random().nextInt(r-2) + 1; 
                    if(r < maxAge){
                        maxAge = r;
                        System.out.println(maxAge + "以下が確定");
                    }

                    if(minimumAge > nextGuessedNumber){//r歳以下と確定したのに次の推測された歳がそのr歳を上回っていたら
                        while(nextGuessedNumber > minimumAge && nextGuessedNumber < maxAge){//r歳を下回るまで次の歳を推測し続ける;(０歳から確定した最大の歳までの乱数)
                                nextGuessedNumber = new java.util.Random().nextInt(minimumAge);    
                        }
                    }
                    r = nextGuessedNumber;
            }

                    if(maxAge < nextGuessedNumber){//max歳以下と確定したのに次の推測された歳がそのmax歳を上回っていたら
                        while(nextGuessedNumber > maxAge || nextGuessedNumber < minimumAge){//r歳を下回るまで次の歳を推測し続ける;(０歳から確定した最大の歳までの乱数)
                                nextGuessedNumber = new java.util.Random().nextInt(maxAge);    
                        }
                    }
                    r = nextGuessedNumber;
            
            System.out.println("あなたは" + r + "歳ですね？");
            System.out.println("合ってますか？");
            int isRight = new java.util.Scanner(System.in).nextInt();

            if(isRight == 1){
                rePeat = false;
                break;
            }
        }


    }

}
 //r = new java.util.Random().nextInt(r) + (99-r);