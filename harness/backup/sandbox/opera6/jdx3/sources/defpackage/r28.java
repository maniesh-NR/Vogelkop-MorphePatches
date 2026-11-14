package defpackage;

import android.content.SharedPreferences;
import android.util.Base64;
import java.io.File;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final /* synthetic */ class r28 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s28 b;

    public /* synthetic */ r28(s28 s28Var, byte b) {
        this.a = b;
        this.b = s28Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        s28 s28Var = this.b;
        switch (b) {
            case 0:
                umi umiVar = (umi) s28Var.e;
                t28 t28Var = (t28) s28Var.h;
                t28Var.getClass();
                File file = new File(t28Var.a.getFilesDir(), ".prot.pending.tmp");
                boolean zExists = file.exists();
                b59 b59Var = s28Var.b;
                SecretKeySpec secretKeySpec = null;
                if (!zExists) {
                    if (!((SharedPreferences) b59Var.get()).contains("k2")) {
                        umiVar.d(new r28(s28Var, (byte) 1)).a(null);
                        break;
                    }
                } else {
                    SharedPreferences sharedPreferences = (SharedPreferences) b59Var.get();
                    t1 t1Var = (t1) s28Var.f;
                    String string = sharedPreferences.getString("k2", null);
                    if (string != null) {
                        try {
                            byte[] bArrB = ((c36) t1Var.get()).b(Base64.decode(string, 0));
                            if (bArrB != null) {
                                int[] iArr = o36.a;
                                secretKeySpec = new SecretKeySpec(bArrB, "AES");
                            }
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    if (secretKeySpec == null) {
                        umiVar.f(new uk6(s28Var, (byte) 23)).a(file);
                        break;
                    } else {
                        s28Var.c(file, secretKeySpec);
                        break;
                    }
                }
                break;
            default:
                s28Var.e();
                break;
        }
    }
}
