package enum_in_java;


enum Cricket_Score{
    Six,
    Four,
    One,
    draw,
    Out
}
public class Enum{
    public static void main(String[] ar){
        Cricket_Score obj = Cricket_Score.Six;
        System.out.println(obj);
    }
}






// enum Cricket_Score{
//     Six,
//     Four,
//     One,
//     draw, 
//     Out
// }
// public class vvv{
//     public static void main(String[] ar){
//         Cricket_Score[] obj = Cricket_Score.values();
//         for(Cricket_Score i : obj){
//             System.out.println(i);
//         }
//     }
// }



// enum Cricket_Score{
//     Six,
//     Four,
//     One,
//     draw,
//     Out
// }
// public class vvv{
//     public static void main(String[] args){
//         Cricket_Score[] obj = Cricket_Score.values();
//         System.out.println(obj[1]);
//     }
// }






// enum Cricket_Score{
//     Six,
//     Four,
//     One,
//     draw,
//     Out
// }
// public class vvv{
//     public static void main(String[] ar){
//         Cricket_Score obj = Cricket_Score.Four;
//         System.out.println(obj.ordinal());
//     }
// }








// enum Cricket_Score{
//     Six,
//     Four,
//     One,
//     draw,
//     Out
// }
// public class vvv{
//     public static void main(String[] ar){
//         Cricket_Score[] obj = Cricket_Score.values();
//         for(Cricket_Score i : obj){
//             System.out.println(i.ordinal());
//         }
//     }
// }



// enum Cricket_Score{
//     Six,
//     Four,
//     One,
//     draw, 
//     Out
// }
// public class vvv{
//     public static void main(String[] ar){
//         Cricket_Score[] obj = Cricket_Score.values();
//         for(Cricket_Score i : obj){
//             System.out.println(i+":"+i.ordinal());
//         }
//     }
// }


