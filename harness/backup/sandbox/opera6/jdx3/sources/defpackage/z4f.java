package defpackage;

import com.leanplum.internal.ResourceQualifiers;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import kotlin.ranges.IntRange;

/* loaded from: classes.dex */
public final class z4f {
    public static final byte[] b;
    public static final byte[] c;
    public final vx a;

    static {
        Charset charset = StandardCharsets.UTF_8;
        b = "v11".getBytes(charset);
        c = "v10".getBytes(charset);
    }

    public z4f(vx vxVar) {
        this.a = vxVar;
    }

    public final byte[] a(byte[] bArr) throws InvalidKeySpecException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        SecretKey secretKeyGenerateSecret;
        byte[] bArr2 = b;
        if (Arrays.equals(e82.z(bArr, new IntRange(0, bArr2.length - 1, 1)), bArr2)) {
            byte[] bArrB = ((c36) this.a.get()).b(e82.z(bArr, djh.j(bArr2.length, bArr.length)));
            if (bArrB == null) {
                return null;
            }
            return bArrB;
        }
        if (bArr.length == 0) {
            return new byte[0];
        }
        byte[] bArr3 = c;
        if (!Arrays.equals(e82.z(bArr, new IntRange(0, bArr3.length - 1, 1)), bArr3)) {
            return bArr;
        }
        byte[] bArrZ = e82.z(bArr, djh.j(bArr3.length, bArr.length));
        SecureRandom secureRandom = q36.a;
        m36[] m36VarArr = m36.a;
        byte[] bytes = "saltysalt".getBytes(StandardCharsets.UTF_8);
        if (q36.a(ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL)) {
            try {
                secretKeyGenerateSecret = SecretKeyFactory.getInstance("PBKDF2withHmacSHA1").generateSecret(new PBEKeySpec(new char[]{'p', 'e', 'a', 'n', 'u', 't', 's'}, bytes, 1, ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL));
            } catch (Exception unused) {
            }
        } else {
            secretKeyGenerateSecret = null;
        }
        if (secretKeyGenerateSecret == null) {
            return null;
        }
        byte[] bArr4 = new byte[16];
        for (int i = 0; i < 16; i++) {
            bArr4[i] = 32;
        }
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        try {
            cipher.init(2, secretKeyGenerateSecret, new IvParameterSpec(bArr4));
            return cipher.doFinal(bArrZ);
        } catch (Exception unused2) {
            return null;
        }
    }
}
