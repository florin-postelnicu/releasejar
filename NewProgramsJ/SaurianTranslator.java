//package IntroJavaSwing01.animationJ;
//import java.util.Scanner;
//
//public class SaurianTranslator {
//    private String englishSt;
//    private String saurianSt;
//    Scanner console = new Scanner(System.in);
//
//    public SaurianTranslator(){
//        String s;
//        boolean b;
//        s = englishSt ;
//        b = true;
//    }
//
//    public SaurianTranslator( String s, boolean b){
//        if( b == true){s = englishSt;}
//         else {s= saurianSt;}
//        System.out.println(s);
//
//    }
//
//    String getEnglishSt() {
//
//        return englishSt;
//    }
//    String getSaurianSt() {
//
//        return saurianSt;
//    }
//    void setEnglishSt( String englishSt) {
//        englishSt =  console.nextLine();
//    }
//    void setSaurianSt (String saurianSt){
//        saurianSt =  console.nextLine();
//    }
//    char[] ENGLISHARR = {'a', 'b', 'c', 'd', 'e', 'f', 'g','h','i', 'j', 'k', 'l', 'm', 'n','o', 'p','q','r','s','t',
//            'u','v','w','x','y','z',' '};
//    char[] SAURIANARR = {' ','z', 'y','x','w','v','u','t','s','r','q','p','o','n','m','l','k','j','i','h','g','f','e','d','c'
//    ,'b','a'};
//
//    public String TranslatEString(String s, boolean bl){
//        SaurianTranslator ST = new SaurianTranslator(s,bl);
//        for(int i = 0; i<= s.length; i++){
//
//        }
//
//
//        TranslateSt = s;
//        return TranslateSt;
//    }
//
//    public String Translate( String s){
//      boolean bul = true;
//
//
//
//      if (bul == true) {
//          System.out.println("You chose to enter a text in English");
//          setEnglishSt(s);
//
//          convert(s);
//
//
//      } else {
//          System.out.println("You hose to enter a text in Saurian");
//          setSaurianSt(s);
//          convert(s);
//
//
//      }
//
//
//
//
//
//
//
//
//
//        return s;
//
//
//
//
//    }
//
//    public static void main(String[] args) {
//
//        SaurianTranslator St = new SaurianTranslator();
//        St.setSaurianSt("SAUT");
//
//    }
//
//}
