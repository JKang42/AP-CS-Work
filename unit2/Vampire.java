public class Vampire
{
    public static boolean isVampire(float hour, boolean awake)
    {
        if ((hour < 6 || hour > 22) && awake){
            return true; 
        }else{
            return false;
        }
    }
}