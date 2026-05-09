package enum_in_java;


enum Cricket_Score{
    Six,
    Four,
    One,
    draw,
    Out
}
public class Enum_Using_With_IfStatement_And_Switch{
    public static void main(String[] ar){
        Cricket_Score obj = Cricket_Score.draw;
        if(obj==Cricket_Score.One)
        {
            System.out.println("One run scored");
        }
        else if(obj==Cricket_Score.Four)
        {
            System.out.println("Four runs scored");
        }
        else if(obj==Cricket_Score.Six)
        {
            System.out.println("Six runs scored");
        }
        else if(obj==Cricket_Score.draw)
        {
            System.out.println("Match drawn");
        }
        else if(obj==Cricket_Score.Out)
        {
            System.out.println("Player is out");
        }
    }
}





//using switch statement with enum.

// enum Cricket_Score{
//     Six,
//     Four,
//     One,
//     draw,
//     Out
// }
// public class Enum_Using_With_IfStatement_And_Switch{
//     public static void main(String[] ar){
//         Cricket_Score obj = Cricket_Score.Out;
//         switch(obj)
//         {
//             case One:
//                 System.out.println("One run scored");
//                 break;
//             case Four:
//                 System.out.println("Four runs scored");
//                 break;
//             case Six:
//                 System.out.println("Six runs scored");
//                 break;
//             case draw:
//                 System.out.println("Match drawn");
//                 break;
//             default:
//                 System.out.println("Player is out");
//                 break;
//         }
//     }
// }