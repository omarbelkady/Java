public class FunctionsEx {
    /* Derivations
    a^2 = b^2+c^2-2*b*c*cos(A)
    b^2 = a^2+c^2-2*a*c*cos(B)
    c^2 = a^2+b^2-2*a*b*cos(C)

    ((a^2-b^2-c^2)/(-2*b*c))=cos(A)


    */


    //radians output not DEGREES

    //SSS
    public static float AngleAlpha(float alpha, float beta, float chi)
    {
        //Arc Cosine To Find the 1st Angle Given All Side Lengths
        return (float) Math.acos((Math.pow(alpha,2) - Math.pow(beta, 2) - Math.pow(chi,2)) / (-2*beta*chi));
    }

    public static float AngleBeta(float alpha, float beta, float chi)
    {
        //Arc Cosine To Find The 2nd Angle Given All Side Lengths
        return (float) Math.acos((Math.pow(beta,2) - Math.pow(alpha, 2) - Math.pow(chi,2)) / (-2*alpha*chi));
    }

    public static float AngleChi(float alpha, float beta, float chi)
    {
        //Arc Cosine To Find The 3nd Angle Given All Side Lengths
        return (float) Math.acos((Math.pow(chi,2) - Math.pow(alpha, 2) - Math.pow(beta,2)) / (-2*alpha*beta));
    }

    public static float SideLengthAlpha(float alpha, float beta, float chi)
    {
        //Arc Cosine To Find The 3nd Angle Given All Side Lengths
        return (float) Math.sqrt(Math.pow(beta,2) + Math.pow(chi, 2) - 2*beta*chi*Math.cos(alpha));
    }
    public static float SideLengthBeta(float alpha, float beta, float chi)
    {
        //Arc Cosine To Find The 3nd Angle Given All Side Lengths
        return (float) Math.sqrt(Math.pow(alpha,2) + Math.pow(chi, 2) - 2*alpha*chi*Math.cos(beta));
    }

    public static float SideLengthChi(float alpha, float beta, float chi)
    {
        //Arc Cosine To Find The 3nd Angle Given All Side Lengths
        return (float) Math.sqrt(Math.pow(alpha,2) + Math.pow(beta, 2) - 2*alpha*beta*Math.cos(chi));
    }
}