package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import com.leanplum.internal.ResourceQualifiers;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public abstract class p36 {
    public static final ii a = new ii(9);

    public static Cipher a(int i, SecretKeySpec secretKeySpec, byte[] bArr, boolean z) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipher;
        try {
            if (z) {
                try {
                    cipher = Cipher.getInstance("AES/GCM/NoPadding", (Provider) a.get());
                } catch (Exception unused) {
                    return a(i, secretKeySpec, bArr, false);
                }
            } else {
                cipher = Cipher.getInstance("AES/GCM/NoPadding");
            }
            cipher.init(i, secretKeySpec, new GCMParameterSpec(ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL, bArr));
            return cipher;
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException unused2) {
            return null;
        }
    }

    public static byte[] b(int i, byte[] bArr, Key key) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        OAEPParameterSpec oAEPParameterSpec = new OAEPParameterSpec("SHA-1", "MGF1", MGF1ParameterSpec.SHA1, PSource.PSpecified.DEFAULT);
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-1AndMGF1Padding");
            cipher.init(i, key, oAEPParameterSpec);
            return cipher.doFinal(bArr);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException unused) {
            return null;
        }
    }

    public static PublicKey c(byte[] bArr) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArr));
        } catch (NoSuchAlgorithmException | InvalidKeySpecException unused) {
            return null;
        }
    }

    public static byte[] d(PrivateKey privateKey, String str, byte[] bArr) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        try {
            Signature signature = Signature.getInstance(str);
            signature.initSign(privateKey);
            signature.update(bArr);
            return signature.sign();
        } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException unused) {
            if (!str.equals("SHA512withRSA/PSS")) {
                return null;
            }
            try {
                mvf mvfVar = new mvf();
                mvfVar.engineInitSign(privateKey);
                mvfVar.engineUpdate(bArr, 0, bArr.length);
                return mvfVar.engineSign();
            } catch (InvalidKeyException | SignatureException unused2) {
                return null;
            }
        }
    }

    public static String e(PublicKey publicKey) {
        StringBuilder sb = new StringBuilder("-----BEGIN PUBLIC KEY-----\n");
        String strEncodeToString = Base64.encodeToString(publicKey.getEncoded(), 2);
        int length = (strEncodeToString.length() + 63) / 64;
        String[] strArr = new String[length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = length - 1;
            if (i >= i3) {
                strArr[i3] = strEncodeToString.substring(i2);
                return z1m.l(sb, TextUtils.join("\n", strArr), "\n-----END PUBLIC KEY-----");
            }
            int i4 = i2 + 64;
            strArr[i] = strEncodeToString.substring(i2, i4);
            i++;
            i2 = i4;
        }
    }

    public static boolean f(byte[] bArr, byte[] bArr2, PublicKey publicKey, String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        try {
            Signature signature = Signature.getInstance(str);
            signature.initVerify(publicKey);
            signature.update(bArr);
            return signature.verify(bArr2);
        } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException unused) {
            if (str.equals("SHA512withRSA/PSS")) {
                try {
                    mvf mvfVar = new mvf();
                    mvfVar.engineInitVerify(publicKey);
                    mvfVar.engineUpdate(bArr, 0, bArr.length);
                    return mvfVar.engineVerify(bArr2);
                } catch (InvalidKeyException | SignatureException unused2) {
                    return false;
                }
            }
            return false;
        }
    }
}
