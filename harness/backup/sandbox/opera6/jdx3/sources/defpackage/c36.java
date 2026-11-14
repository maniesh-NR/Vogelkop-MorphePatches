package defpackage;

import android.content.Context;
import android.os.ParcelFormatException;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import android.security.keystore.UserNotAuthenticatedException;
import com.leanplum.internal.Constants;
import com.leanplum.internal.ResourceQualifiers;
import java.io.Serializable;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.ProviderException;
import java.security.UnrecoverableEntryException;
import java.security.spec.InvalidParameterSpecException;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* loaded from: classes.dex */
public final class c36 {
    public static final int[] c = {Constants.Crypt.KEY_LENGTH, ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_MASK, ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL};
    public static boolean d;
    public final b59 a;
    public final ii b = new ii(8);

    public c36(Context context, umi umiVar) {
        this.a = w1h.l(context, umiVar, "c", new bg1[0]);
    }

    public static byte[] a(byte[]... bArr) {
        if (bArr.length == 1) {
            return bArr[0];
        }
        int length = 0;
        for (byte[] bArr2 : bArr) {
            length += bArr2.length;
        }
        byte[] bArr3 = new byte[length];
        int length2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
            length2 += bArr4.length;
        }
        return bArr3;
    }

    /* JADX WARN: Type inference failed for: r9v4, types: [byte[], java.io.Serializable] */
    public static b36 f(byte[] bArr, z26 z26Var, AtomicBoolean atomicBoolean) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Key key;
        SecretKey secretKeyL;
        ro9 bpVar;
        y26 y26VarB = bArr != null ? y26.b(bArr) : y26.c;
        if (y26VarB != null) {
            boolean z = bArr != null;
            synchronized (z26Var.b) {
                ge5 ge5Var = new ge5(z26Var, y26VarB, (byte) 8);
                try {
                    try {
                        key = z26Var.a.getKey(y26VarB.a, null);
                    } catch (KeyStoreException | NoSuchAlgorithmException unused) {
                    }
                } catch (ParcelFormatException | NullPointerException | NoSuchAlgorithmException | UnrecoverableEntryException unused2) {
                    key = null;
                }
                secretKeyL = key instanceof SecretKey ? (SecretKey) key : !z ? ge5Var.l() : null;
            }
            if (secretKeyL != null) {
                try {
                    Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                    if (bArr == null) {
                        cipher.init(1, secretKeyL);
                        bpVar = new ro9(cipher, (Serializable) y26VarB.b, ((GCMParameterSpec) cipher.getParameters().getParameterSpec(GCMParameterSpec.class)).getTLen(), (byte) 11);
                    } else {
                        int length = y26VarB.b.length;
                        int i = length + 2;
                        if (i > bArr.length) {
                            return null;
                        }
                        int i2 = length + 1;
                        int i3 = bArr[length] & 255;
                        int i4 = bArr[i2] & 255;
                        int i5 = i + i3;
                        if (i5 > bArr.length) {
                            return null;
                        }
                        cipher.init(2, secretKeyL, new GCMParameterSpec(i4, bArr, i, i3));
                        bpVar = new bp(cipher, i5);
                    }
                    return bpVar;
                } catch (KeyPermanentlyInvalidatedException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | ProviderException | InvalidParameterSpecException | NoSuchPaddingException unused3) {
                    return null;
                } catch (UserNotAuthenticatedException unused4) {
                    atomicBoolean.set(true);
                    return null;
                }
            }
        }
        return null;
    }

    public final byte[] b(byte[] bArr) {
        return c(bArr, new AtomicBoolean());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029 A[PHI: r3
      0x0029: PHI (r3v2 byte[]) = (r3v0 byte[]), (r3v3 byte[]), (r3v6 byte[]), (r3v8 byte[]), (r3v9 byte[]) binds: [B:31:0x00a9, B:28:0x008f, B:25:0x0085, B:26:0x0087, B:13:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Type inference failed for: r15v10, types: [byte[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] c(byte[] r14, java.util.concurrent.atomic.AtomicBoolean r15) throws javax.crypto.NoSuchPaddingException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        /*
            r13 = this;
            int r0 = r14.length
            if (r0 != 0) goto L4
            return r14
        L4:
            r0 = 23
            boolean r0 = defpackage.y26.a(r14, r0)
            r1 = 0
            ii r2 = r13.b
            if (r0 != 0) goto La2
            r0 = 41
            boolean r0 = defpackage.y26.a(r14, r0)
            if (r0 != 0) goto La2
            r15 = 18
            boolean r15 = defpackage.y26.a(r14, r15)
            r0 = 0
            if (r15 == 0) goto L89
            java.lang.Object r15 = r2.get()
            z26 r15 = (defpackage.z26) r15
            if (r15 != 0) goto L2c
            r3 = r14
        L29:
            r13 = r1
            goto Lb1
        L2c:
            java.lang.String r2 = "RSA/ECB/PKCS1Padding"
            y26 r3 = defpackage.y26.b(r14)
            if (r3 == 0) goto L87
            java.security.KeyStore r15 = r15.a     // Catch: java.lang.Throwable -> L87
            java.lang.String r4 = r3.a     // Catch: java.lang.Throwable -> L87
            java.security.KeyStore$Entry r15 = r15.getEntry(r4, r1)     // Catch: java.lang.Throwable -> L87
            boolean r4 = r15 instanceof java.security.KeyStore.PrivateKeyEntry
            if (r4 == 0) goto L87
            java.security.KeyPair r4 = new java.security.KeyPair
            java.security.KeyStore$PrivateKeyEntry r15 = (java.security.KeyStore.PrivateKeyEntry) r15
            java.security.cert.Certificate r5 = r15.getCertificate()
            java.security.PublicKey r5 = r5.getPublicKey()
            java.security.PrivateKey r15 = r15.getPrivateKey()
            r4.<init>(r5, r15)
            javax.crypto.Cipher r15 = javax.crypto.Cipher.getInstance(r2)     // Catch: java.lang.Throwable -> L87
            java.security.PrivateKey r5 = r4.getPrivate()     // Catch: java.lang.Throwable -> L87
            r6 = 2
            r15.init(r6, r5)     // Catch: java.lang.Throwable -> L87
            javax.crypto.Cipher r2 = javax.crypto.Cipher.getInstance(r2)     // Catch: java.lang.Throwable -> L87
            java.security.PublicKey r4 = r4.getPublic()     // Catch: java.lang.Throwable -> L87
            r5 = 1
            r2.init(r5, r4)     // Catch: java.lang.Throwable -> L87
            java.lang.String r9 = "cnssk_jbmr2"
            byte[] r10 = r3.b     // Catch: java.lang.Throwable -> L87
            bp r11 = new bp     // Catch: java.lang.Throwable -> L87
            r11.<init>(r15, r6)     // Catch: java.lang.Throwable -> L87
            ro9 r12 = new ro9     // Catch: java.lang.Throwable -> L87
            byte[] r15 = new byte[r0]     // Catch: java.lang.Throwable -> L87
            r3 = 11
            r12.<init>(r2, r15, r0, r3)     // Catch: java.lang.Throwable -> L87
            r7 = r13
            r8 = r14
            b36 r13 = r7.e(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L85
            r3 = r8
            goto Lb1
        L85:
            r3 = r8
            goto Lab
        L87:
            r3 = r14
            goto Lab
        L89:
            r2 = r13
            r3 = r14
            boolean r13 = defpackage.y26.a(r3, r0)
            if (r13 == 0) goto L29
            a36 r6 = new a36
            r6.<init>()
            y26 r13 = defpackage.y26.f
            java.lang.String r4 = "cnssk"
            byte[] r5 = r13.b
            r7 = r6
            b36 r13 = r2.e(r3, r4, r5, r6, r7)
            goto Lb1
        La2:
            r3 = r14
            java.lang.Object r13 = r2.get()
            z26 r13 = (defpackage.z26) r13
            if (r13 != 0) goto Lad
        Lab:
            goto L29
        Lad:
            b36 r13 = f(r3, r13, r15)
        Lb1:
            if (r13 != 0) goto Lb4
            return r1
        Lb4:
            byte[] r13 = r13.r(r3)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c36.c(byte[], java.util.concurrent.atomic.AtomicBoolean):byte[]");
    }

    public final byte[] d(byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        if (bArr.length == 0) {
            return bArr;
        }
        z26 z26Var = (z26) this.b.get();
        b36 b36VarF = z26Var != null ? f(null, z26Var, atomicBoolean) : null;
        if (b36VarF == null) {
            a36 a36Var = new a36();
            b36VarF = e(null, "cnssk", y26.f.b, a36Var, a36Var);
        }
        if (b36VarF == null) {
            return null;
        }
        return b36VarF.r(bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006d A[Catch: InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00b0, TryCatch #2 {InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00b0, blocks: (B:27:0x0065, B:29:0x006d, B:31:0x008a, B:33:0x0090, B:35:0x009c, B:37:0x00a1), top: B:45:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a A[Catch: InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00b0, TryCatch #2 {InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x00b0, blocks: (B:27:0x0065, B:29:0x006d, B:31:0x008a, B:33:0x0090, B:35:0x009c, B:37:0x00a1), top: B:45:0x0065 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.b36 e(byte[] r6, java.lang.String r7, byte[] r8, defpackage.b36 r9, defpackage.b36 r10) throws javax.crypto.NoSuchPaddingException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        /*
            r5 = this;
            boolean r0 = defpackage.c36.d
            r1 = 0
            if (r0 != 0) goto Lb0
            b59 r5 = r5.a
            java.lang.Object r0 = r5.get()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            java.lang.String r0 = r0.getString(r7, r1)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r3 = "AES"
            r4 = 0
            if (r2 == 0) goto L56
            if (r6 == 0) goto L1d
            return r1
        L1d:
            javax.crypto.KeyGenerator r9 = javax.crypto.KeyGenerator.getInstance(r3)     // Catch: java.security.NoSuchAlgorithmException -> L55
            r0 = r4
        L22:
            r2 = 3
            if (r0 >= r2) goto L34
            int[] r2 = defpackage.c36.c
            r2 = r2[r0]
            r9.init(r2)     // Catch: java.security.InvalidParameterException -> L31
            javax.crypto.SecretKey r9 = r9.generateKey()     // Catch: java.security.InvalidParameterException -> L31
            goto L35
        L31:
            int r0 = r0 + 1
            goto L22
        L34:
            r9 = r1
        L35:
            if (r9 == 0) goto Lb0
            byte[] r0 = r9.getEncoded()
            byte[] r10 = r10.r(r0)
            if (r10 == 0) goto Lb0
            java.lang.String r10 = android.util.Base64.encodeToString(r10, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto Lb0
            java.lang.Object r5 = r5.get()
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5
            com.appsflyer.internal.j.c(r5, r7, r10)
            goto L65
        L55:
            return r1
        L56:
            byte[] r5 = android.util.Base64.decode(r0, r4)
            byte[] r5 = r9.r(r5)
            if (r5 == 0) goto Lb0
            javax.crypto.spec.SecretKeySpec r9 = new javax.crypto.spec.SecretKeySpec
            r9.<init>(r5, r3)
        L65:
            java.lang.String r5 = "AES/CBC/PKCS5Padding"
            javax.crypto.Cipher r5 = javax.crypto.Cipher.getInstance(r5)     // Catch: java.lang.Throwable -> Lb0
            if (r6 != 0) goto L8a
            r6 = 16
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> Lb0
            java.security.SecureRandom r7 = new java.security.SecureRandom     // Catch: java.lang.Throwable -> Lb0
            r7.<init>()     // Catch: java.lang.Throwable -> Lb0
            r7.nextBytes(r6)     // Catch: java.lang.Throwable -> Lb0
            javax.crypto.spec.IvParameterSpec r7 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Throwable -> Lb0
            r7.<init>(r6)     // Catch: java.lang.Throwable -> Lb0
            r6 = 1
            r5.init(r6, r9, r7)     // Catch: java.lang.Throwable -> Lb0
            ro9 r6 = new ro9     // Catch: java.lang.Throwable -> Lb0
            r7 = 11
            r6.<init>(r5, r8, r4, r7)     // Catch: java.lang.Throwable -> Lb0
            return r6
        L8a:
            int r7 = r8.length     // Catch: java.lang.Throwable -> Lb0
            int r8 = r7 + 2
            int r10 = r6.length     // Catch: java.lang.Throwable -> Lb0
            if (r8 > r10) goto Lb0
            int r10 = r7 + 1
            r7 = r6[r7]     // Catch: java.lang.Throwable -> Lb0
            r7 = r7 & 255(0xff, float:3.57E-43)
            r10 = r6[r10]     // Catch: java.lang.Throwable -> Lb0
            r10 = r10 & 255(0xff, float:3.57E-43)
            if (r10 != 0) goto Lb0
            int r10 = r8 + r7
            int r0 = r6.length     // Catch: java.lang.Throwable -> Lb0
            if (r10 > r0) goto Lb0
            javax.crypto.spec.IvParameterSpec r0 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Throwable -> Lb0
            r0.<init>(r6, r8, r7)     // Catch: java.lang.Throwable -> Lb0
            r6 = 2
            r5.init(r6, r9, r0)     // Catch: java.lang.Throwable -> Lb0
            bp r6 = new bp     // Catch: java.lang.Throwable -> Lb0
            r6.<init>(r5, r10)     // Catch: java.lang.Throwable -> Lb0
            return r6
        Lb0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c36.e(byte[], java.lang.String, byte[], b36, b36):b36");
    }
}
