package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.auth.blockstore.Blockstore;
import com.google.android.gms.auth.blockstore.BlockstoreClient;
import com.opera.android.BrowserActivity;
import com.opera.android.settings.SettingsManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class s28 implements p5j {
    public final /* synthetic */ byte a;
    public final b59 b;
    public final SettingsManager c;
    public boolean d;
    public final Object e;
    public final Object f;
    public Object g;
    public final Object h;

    /* JADX WARN: Multi-variable type inference failed */
    public s28(BrowserActivity browserActivity, umi umiVar, k6l k6lVar, SettingsManager settingsManager) {
        this.a = (byte) 1;
        this.e = new l76(5);
        this.g = new qz(this, (byte) 23);
        this.b = w1h.l(browserActivity, umiVar, "recent_searches", new bg1[0]);
        this.c = settingsManager;
        settingsManager.F(this);
        this.f = k6lVar;
        this.h = new ko7(this, umiVar);
        M("enable_recent_searches");
    }

    public s28(t28 t28Var, umi umiVar, SettingsManager settingsManager, t1 t1Var) {
        this.a = (byte) 0;
        this.h = t28Var;
        this.e = umiVar;
        this.c = settingsManager;
        this.f = t1Var;
        this.b = w1h.l(t28Var.a, umiVar, "enc_bkgmgr", new bg1[0]);
        umiVar.c(new r28(this, (byte) 0)).a(null);
    }

    @Override // defpackage.p5j
    public final void M(String str) {
        byte b = this.a;
        SettingsManager settingsManager = this.c;
        switch (b) {
            case 0:
                if (str.equals("eula_accepted.gdpr")) {
                    settingsManager.H(this);
                    e();
                    break;
                }
                break;
            default:
                if (TextUtils.equals(str, "enable_recent_searches")) {
                    boolean zI = settingsManager.i(str);
                    qz qzVar = (qz) this.g;
                    if (this.d != zI) {
                        this.d = zI;
                        k6l k6lVar = (k6l) this.f;
                        if (!zI) {
                            k6lVar.v(qzVar);
                            b(new rl((byte) 4));
                            break;
                        } else {
                            k6lVar.b(qzVar);
                            ((ko7) this.h).h();
                            break;
                        }
                    }
                }
                break;
        }
    }

    public final void a() {
        File file = (File) this.g;
        if (file == null || !this.d) {
            return;
        }
        file.delete();
    }

    public final void b(Runnable runnable) {
        ko7 ko7Var = (ko7) this.h;
        if (!this.d) {
            ko7Var.h();
        }
        ko7Var.f(new wr9((byte) 16, this, runnable, false));
    }

    public final void c(File file, SecretKeySpec secretKeySpec) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(file);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException unused) {
        }
        try {
            ((t28) this.h).b(o36.a(fileInputStream, secretKeySpec), (umi) this.e);
            file.delete();
            SharedPreferences sharedPreferences = (SharedPreferences) this.b.get();
            byte[] bArrD = ((c36) ((t1) this.f).get()).d(secretKeySpec.getEncoded());
            if (bArrD != null) {
                sharedPreferences.edit().putString("k2", Base64.encodeToString(bArrD, 2)).apply();
            }
            xvg.l(fileInputStream);
        } catch (IOException unused2) {
            fileInputStream2 = fileInputStream;
            file.delete();
            xvg.l(fileInputStream2);
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            xvg.l(fileInputStream2);
            throw th;
        }
    }

    public final void d() {
        ((ko7) this.h).g(new ArrayList((l76) this.e));
    }

    public final void e() {
        SettingsManager settingsManager = this.c;
        if (!settingsManager.i("eula_accepted.gdpr")) {
            settingsManager.F(this);
            return;
        }
        ck3 ck3Var = ((t28) this.h).c;
        kw3 kw3Var = new kw3((byte) 7);
        dg7 dg7Var = new dg7(this, (byte) 8);
        rl rlVar = new rl((byte) 4);
        BlockstoreClient client = Blockstore.getClient(ck3Var.a);
        client.isEndToEndEncryptionAvailable().addOnSuccessListener(new ws1(kw3Var, rlVar, client, dg7Var, (byte) 3));
    }
}
