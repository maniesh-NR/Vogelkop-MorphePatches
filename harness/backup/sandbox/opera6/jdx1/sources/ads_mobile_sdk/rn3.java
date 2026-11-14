package ads_mobile_sdk;

import android.os.Build;
import defpackage.bwg;
import defpackage.m3p;
import defpackage.t3p;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class rn3 {
    public static final byte[] a = {61, 122, 18, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, 63, 50, 108, -113, -103, 74};
    public static final byte[] b = {-110, -13, -34, 70, -83, 43, 97, 21, -44, 16, -54, -125, -28, -57, -125, -127, -7, 17, 102, -69, 116, -121, -79, 43, -13, 120, 58, 55, -29, -108, 95, 83};

    public static boolean a(File file) throws GeneralSecurityException {
        try {
            X509Certificate[][] x509CertificateArrK = bwg.k(file.getAbsolutePath());
            if (x509CertificateArrK.length == 1) {
                byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(x509CertificateArrK[0][0].getEncoded());
                return Arrays.equals(a, bArrDigest) || (!"user".equals(Build.TYPE) && Arrays.equals(b, bArrDigest));
            }
            t3p.w("APK has more than one signature.");
            return false;
        } catch (IOException | RuntimeException e) {
            t3p.k("Failed to verify signatures", e);
            return false;
        } catch (m3p e2) {
            t3p.k("Package is not signed", e2);
            return false;
        }
    }
}
