package defpackage;

import com.leanplum.internal.Constants;
import com.leanplum.internal.ResourceQualifiers;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public abstract class o36 {
    public static final int[] a = {Constants.Crypt.KEY_LENGTH, ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_MASK, ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL};
    public static final ii b = new ii(10);

    public static CipherInputStream a(FileInputStream fileInputStream, SecretKeySpec secretKeySpec) {
        try {
            byte[] bArr = new byte[12];
            na2.L(fileInputStream, bArr);
            return new CipherInputStream(fileInputStream, c(2, secretKeySpec, bArr));
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            t3p.r(e);
            return null;
        }
    }

    public static CipherOutputStream b(FileOutputStream fileOutputStream, SecretKeySpec secretKeySpec) throws IOException {
        try {
            byte[] bArr = new byte[12];
            new SecureRandom().nextBytes(bArr);
            fileOutputStream.write(bArr);
            return new CipherOutputStream(fileOutputStream, c(1, secretKeySpec, bArr));
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            t3p.r(e);
            return null;
        }
    }

    public static Cipher c(int i, SecretKeySpec secretKeySpec, byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipher;
        try {
            cipher = Cipher.getInstance("AES/GCM/NoPadding", (Provider) b.get());
        } catch (Exception unused) {
            cipher = Cipher.getInstance("AES/GCM/NoPadding");
        }
        cipher.init(i, secretKeySpec, new GCMParameterSpec(ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL, bArr));
        return cipher;
    }
}
