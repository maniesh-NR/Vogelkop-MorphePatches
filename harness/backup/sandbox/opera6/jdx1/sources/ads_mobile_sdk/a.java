package ads_mobile_sdk;

import androidx.core.app.NotificationCompat;
import defpackage.d9p;
import defpackage.iao;
import defpackage.p37;
import defpackage.z1m;
import defpackage.z4o;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a {
    public MessageDigest a;
    public final th3 b;
    public final Object c = new Object();
    public boolean d = false;
    public SecureRandom e;

    public a(th3 th3Var) {
        this.b = th3Var;
    }

    public final d9p a(String str, byte[] bArr) {
        d9p d9pVarO = le.o();
        byte[] bArrA = a(bArr);
        fr frVarA = hr.a(0, bArrA.length, bArrA);
        d9pVarO.b$1();
        ((le) d9pVarO.b).b(frVarA);
        int iD = z1m.d(bArr.length, 1, 255, 1);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < iD; i++) {
            int i2 = i * 255;
            int length = i2 + 255;
            if (bArr.length <= length) {
                length = bArr.length;
            }
            arrayList.add(Arrays.copyOfRange(bArr, i2, length));
        }
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            fr frVarA2 = hr.a(0, NotificationCompat.FLAG_LOCAL_ONLY, a((byte[]) obj, str, false));
            d9pVarO.b$1();
            ((le) d9pVarO.b).a(frVarA2);
        }
        return d9pVarO;
    }

    public final void a() {
        boolean z;
        synchronized (this) {
            z = this.d;
        }
        if (z) {
            return;
        }
        SecureRandom secureRandom = new SecureRandom();
        synchronized (this) {
            th3 th3Var = this.b;
            iao iaoVar = new iao(fl0.EVENT_ID_FALLBACK_INIT_OBFUSCATOR, th3Var.b, th3Var.a);
            try {
                try {
                    try {
                        iaoVar.b();
                        this.e = secureRandom;
                        this.a = MessageDigest.getInstance("MD5");
                        this.d = true;
                    } catch (Throwable th) {
                        iaoVar.a(th);
                        throw th;
                    }
                } catch (NoSuchAlgorithmException e) {
                    iaoVar.a(e);
                }
                iaoVar.a();
            } catch (Throwable th2) {
                iaoVar.a();
                throw th2;
            }
        }
    }

    public final byte[] a(byte[] bArr) {
        byte[] bArrDigest;
        synchronized (this.c) {
            this.a.reset();
            this.a.update(bArr);
            bArrDigest = this.a.digest();
        }
        return bArrDigest;
    }

    public final byte[] a(byte[] bArr, String str, boolean z) {
        int i = z ? 239 : 255;
        z4o.w(bArr.length <= i);
        ByteBuffer byteBufferPut = ByteBuffer.allocate(i + 1).put((byte) bArr.length);
        if (bArr.length < i) {
            int length = i - bArr.length;
            byte[] bArr2 = new byte[length];
            this.e.nextBytes(bArr2);
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length + length);
            System.arraycopy(bArr2, 0, bArrCopyOf, bArr.length, length);
            bArr = bArrCopyOf;
        }
        byte[] bArrArray = byteBufferPut.put(bArr).array();
        if (z) {
            bArrArray = ByteBuffer.allocate(NotificationCompat.FLAG_LOCAL_ONLY).put(a(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[NotificationCompat.FLAG_LOCAL_ONLY];
        for (bk0 bk0Var : new nk0().K2) {
            bk0Var.a(bArrArray, bArr3);
        }
        if (!p37.y0(str)) {
            c cVar = new c(str.length() > 32 ? str.substring(0, 32).getBytes(StandardCharsets.UTF_8) : str.getBytes(StandardCharsets.UTF_8), (byte) 0);
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < 256; i4++) {
                i2 = (i2 + 1) & 255;
                byte[] bArr4 = cVar.a;
                byte b = bArr4[i2];
                i3 = (i3 + b) & 255;
                bArr4[i2] = bArr4[i3];
                bArr4[i3] = b;
                bArr3[i4] = (byte) (bArr3[i4] ^ bArr4[(bArr4[i2] + b) & 255]);
            }
        }
        return bArr3;
    }
}
