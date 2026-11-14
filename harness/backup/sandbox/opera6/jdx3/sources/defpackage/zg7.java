package defpackage;

import com.opera.android.autofill.PasswordDataMonitor;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class zg7 extends zsi {
    public final /* synthetic */ byte l = 0;
    public final ati m;
    public final orm n;

    public zg7(ah7 ah7Var, orm ormVar) {
        super(ah7Var, yg7.e, Locale.getDefault());
        this.m = ah7Var;
        this.n = ormVar;
    }

    public zg7(ghf ghfVar, orm ormVar) {
        super(ghfVar, new shf(), Locale.getDefault());
        this.m = ghfVar;
        this.n = ormVar;
    }

    public zg7(v8f v8fVar, x5f x5fVar) {
        super(v8fVar, u8f.e, Locale.getDefault());
        this.m = v8fVar;
        this.n = x5fVar;
    }

    @Override // defpackage.oy
    public final List d(Object obj) {
        switch (this.l) {
            case 0:
                return Collections.singletonList(((re7) obj).f());
            case 1:
                ilh ilhVar = (ilh) obj;
                return Arrays.asList(ilhVar.c, ilhVar.b);
            default:
                w3g w3gVar = (w3g) obj;
                return Arrays.asList(w3gVar.c, w3gVar.f);
        }
    }

    @Override // defpackage.oy
    public final void h() {
        switch (this.l) {
            case 0:
                ((x5f) this.n).S(6);
                break;
            case 1:
                ((x5f) this.n).S(4);
                break;
            default:
                ((x5f) this.n).S(5);
                break;
        }
    }

    public final void m() {
        ghf ghfVar = (ghf) this.m;
        x5g x5gVar = (x5g) ghfVar.b;
        x5gVar.b.c((z5g) ghfVar.d);
        a4g a4gVar = x5gVar.e;
        if (a4gVar != null) {
            a4gVar.a();
        }
        x5gVar.e = null;
        a4g a4gVar2 = x5gVar.f;
        if (a4gVar2 != null) {
            a4gVar2.a();
        }
        x5gVar.f = null;
        PasswordDataMonitor passwordDataMonitor = x5gVar.c;
        if (passwordDataMonitor != null) {
            passwordDataMonitor.a();
        }
        x5gVar.c = null;
    }
}
