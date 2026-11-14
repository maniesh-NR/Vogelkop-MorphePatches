package defpackage;

import androidx.recyclerview.widget.i;
import com.leanplum.core.BuildConfig;

/* loaded from: classes.dex */
public abstract class es8 extends i {
    public static boolean e;
    public final fr8 b;
    public final ds8 c;
    public ns8 d;

    public es8(fr8 fr8Var) {
        super(fr8Var);
        this.c = new ds8(this, (byte) 1);
        this.b = fr8Var;
    }

    public void U(StringBuilder sb) {
        sb.append('/');
        sb.append(this.d != null ? "1" : BuildConfig.BUILD_NUMBER);
    }

    public void V() {
        vml.a(this.c);
        fr8 fr8Var = this.b;
        fr8Var.l = false;
        fr8Var.s();
        fr8Var.invalidate();
    }

    public final void X() {
        vml.a(this.c);
        ns8 ns8Var = this.d;
        if (ns8Var == null || !ns8Var.t) {
            return;
        }
        ns8Var.q.put(this, Boolean.TRUE);
        ns8Var.U();
    }
}
