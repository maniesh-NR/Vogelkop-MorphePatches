package defpackage;

import com.opera.api.Callback;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes.dex */
public final /* synthetic */ class uj2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vj2 b;
    public final /* synthetic */ Callback c;
    public final /* synthetic */ byte[] d;
    public final /* synthetic */ Callback e;

    public /* synthetic */ uj2(vj2 vj2Var, Callback callback, byte[] bArr, Callback callback2, byte b) {
        this.a = b;
        this.b = vj2Var;
        this.c = callback;
        this.d = bArr;
        this.e = callback2;
    }

    public /* synthetic */ uj2(vj2 vj2Var, byte[] bArr, Callback callback, Callback callback2) {
        this.a = (byte) 2;
        this.b = vj2Var;
        this.d = bArr;
        this.c = callback;
        this.e = callback2;
    }

    @Override // java.lang.Runnable
    public final void run() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        z26 z26Var;
        byte b = 1;
        switch (this.a) {
            case 0:
                vj2 vj2Var = this.b;
                vj2Var.a.c(new uj2(vj2Var, this.c, this.d, this.e, (byte) 1)).a(null);
                return;
            case 1:
                vj2 vj2Var2 = this.b;
                Callback callback = this.c;
                byte[] bArr = this.d;
                Callback callback2 = this.e;
                ScheduledExecutorService scheduledExecutorService = vml.a;
                dz8 dz8Var = new dz8(callback, b);
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                byte[] bArrC = ((c36) vj2Var2.d.get()).c(bArr, atomicBoolean);
                String str = bArrC != null ? new String(bArrC) : null;
                if (str != null) {
                    dz8Var.run(str);
                    return;
                } else if (atomicBoolean.get()) {
                    callback2.run(fsb.a);
                    return;
                } else {
                    ((djn) vj2Var2.c.get()).a(new ab(dz8Var, (byte) 23), new dz8(callback2, b));
                    return;
                }
            default:
                vj2 vj2Var3 = this.b;
                byte[] bArr2 = this.d;
                Callback callback3 = this.c;
                Callback callback4 = this.e;
                c36 c36Var = (c36) vj2Var3.d.get();
                c36Var.getClass();
                y26 y26VarB = y26.b(bArr2);
                if (y26VarB != null) {
                    byte[] bArr3 = y26VarB.b;
                    if (bArr3.length > 0 && (bArr3[0] & 128) == 128 && (z26Var = (z26) c36Var.b.get()) != null) {
                        synchronized (z26Var.b) {
                            KeyStore keyStore = z26Var.a;
                            try {
                                if (keyStore.containsAlias(y26VarB.a)) {
                                    keyStore.deleteEntry(y26VarB.a);
                                }
                            } catch (KeyStoreException unused) {
                            }
                        }
                    }
                }
                djn djnVar = (djn) vj2Var3.c.get();
                ScheduledExecutorService scheduledExecutorService2 = vml.a;
                djnVar.a(new dz8(callback3, b), new dz8(callback4, b));
                return;
        }
    }
}
