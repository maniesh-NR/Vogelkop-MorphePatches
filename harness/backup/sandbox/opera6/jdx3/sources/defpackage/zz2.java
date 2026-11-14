package defpackage;

import com.opera.android.oauth2.OperaAccessToken;
import com.opera.api.Callback;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class zz2 implements ih4 {
    public boolean a;
    public Object b;
    public Object c;

    public zz2(myk mykVar, Callback callback) {
        this.b = callback;
    }

    public zz2(umi umiVar, int i, ro9 ro9Var) {
        this.b = ro9Var;
        oml omlVar = new oml(umiVar.d(new fv2(this, (byte) 4)));
        this.c = omlVar;
        omlVar.b(null, i, TimeUnit.MILLISECONDS, null);
    }

    public abstract void a(boolean z);

    public abstract void b();

    public final void c(Boolean bool) {
        if (this.a) {
            return;
        }
        this.c = null;
        this.a = true;
        Callback callback = (Callback) this.b;
        if (callback != null) {
            callback.run(bool);
            this.b = null;
        }
    }

    @Override // defpackage.ih4
    public final void cancel() {
        if (this.a) {
            return;
        }
        this.a = true;
        this.b = null;
        ih4 ih4Var = (ih4) this.c;
        if (ih4Var != null) {
            ih4Var.cancel();
            this.c = null;
        }
    }

    public abstract ih4 d(OperaAccessToken operaAccessToken);
}
