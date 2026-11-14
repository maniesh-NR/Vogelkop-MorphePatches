package ads_mobile_sdk;

import defpackage.hbp;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class n83 {
    public static final Charset a = StandardCharsets.UTF_8;
    public static Cipher b = null;
    public static final Object c = new Object();
    public static final Object d = new Object();

    public static Cipher a() {
        Cipher cipher;
        synchronized (d) {
            cipher = b;
            if (cipher == null) {
                cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                b = cipher;
            }
        }
        return cipher;
    }

    public static byte[] a(String str, byte[] bArr) throws hbp {
        byte[] bArrDoFinal;
        if (bArr.length != 16) {
            throw new hbp();
        }
        try {
            byte[] bArrC = b8h.c(str, false);
            if (bArrC.length <= 16) {
                throw new hbp();
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrC.length);
            byteBufferAllocate.put(bArrC);
            byteBufferAllocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[bArrC.length - 16];
            byteBufferAllocate.get(bArr2);
            byteBufferAllocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (c) {
                try {
                    a().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                    bArrDoFinal = a().doFinal(bArr3);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return bArrDoFinal;
        } catch (IllegalArgumentException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            throw new hbp(e);
        }
    }
}
