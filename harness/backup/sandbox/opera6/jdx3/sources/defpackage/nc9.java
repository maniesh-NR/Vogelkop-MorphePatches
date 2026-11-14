package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;

/* loaded from: classes.dex */
public final class nc9 extends rvh {
    public final kc9 a;
    public final dc9 b;
    public final pe9 c;
    public final Object d = new Object();
    public mc9 e;

    public nc9(kc9 kc9Var, dc9 dc9Var, pe9 pe9Var) {
        this.a = kc9Var;
        this.b = dc9Var;
        this.c = pe9Var;
    }

    public final long contentLength() {
        return this.a.length() + 16;
    }

    public final void writeTo(u04 u04Var) throws BadPaddingException, IllegalBlockSizeException, IOException, ShortBufferException {
        int iUpdate;
        int outputSize;
        ii iiVar = p36.a;
        byte[] bArr = new byte[12];
        new SecureRandom().nextBytes(bArr);
        Cipher cipher = (Cipher) this.b.apply(bArr);
        ic9 ic9Var = new ic9(u04Var.A1());
        InputStream inputStreamE = this.a.E();
        long length = this.a.length();
        byte[] bArr2 = new byte[65536];
        byte[] bArr3 = new byte[65536];
        long j = 0;
        float f = -1.0f;
        while (true) {
            try {
                int i = inputStreamE.read(bArr2);
                while (true) {
                    int i2 = -1;
                    int i3 = 0;
                    if (i != -1) {
                        iUpdate = cipher.update(bArr2, 0, i, bArr3);
                        break;
                    }
                    try {
                        outputSize = cipher.getOutputSize(0);
                    } catch (ShortBufferException unused) {
                    }
                    try {
                        if (outputSize > bArr3.length) {
                            bArr3 = new byte[outputSize];
                        }
                        iUpdate = cipher.doFinal(bArr3, 0);
                    } catch (ShortBufferException unused2) {
                        i2 = -1;
                        if (i != i2) {
                            i3 = i;
                        }
                        bArr3 = new byte[cipher.getOutputSize(i3)];
                    }
                    bArr3 = new byte[cipher.getOutputSize(i3)];
                }
                ic9Var.write(bArr3, 0, iUpdate);
                if (i == -1) {
                    synchronized (this.d) {
                        this.e = new mc9(bArr, ic9Var.a);
                    }
                    ic9Var.flush();
                    return;
                }
                j += i;
                final float f2 = j / length;
                if (f2 - f >= 0.01f) {
                    vml.c(new Runnable() { // from class: lc9
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.c.run(Float.valueOf(f2));
                        }
                    });
                    f = f2;
                }
            } catch (BadPaddingException | IllegalBlockSizeException e) {
                t3p.r(e);
                return;
            }
        }
    }
}
