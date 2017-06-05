import com.zjft.mvtm.AuthVarify;

/**
 * Created by Chance on 17/03/31.
 */
public class AuthVarifyTest {

    public static void main(String[] args) {
        String authVersion = "V1.0";
        String authData = "0cd1688a821ca01cac0c5c825f4566230c2726ea";
        boolean verify = AuthVarify.mVTMAuthVerifyData(authData, authVersion);
        System.out.println(verify);
    }
}
