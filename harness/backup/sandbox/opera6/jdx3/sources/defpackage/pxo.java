package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import java.io.File;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public abstract class pxo {
    public final Context a;
    public final r22 b;
    public uuj c;
    public volatile voo d;
    public ViewGroup f;
    public sxo g;
    public ne5 h;
    public p7p i;
    public volatile bap e = new s9p(31, false, false, false, false);
    public final zyk j = z4c.b(xvo.j);

    public pxo(Context context, r22 r22Var) {
        this.a = context;
        this.b = r22Var;
    }

    public void a() {
        this.c = null;
        voo vooVar = this.d;
        if (vooVar != null) {
            File file = vooVar.x;
            if (file == null) {
                file = null;
            }
            if (file != null) {
                na2.B(w2p.b, (CoroutineContext) null, (rx5) null, new hmo((byte) 6, (mt5) null, file), 3);
            }
        }
        ne5 ne5Var = this.h;
        if (ne5Var != null) {
            ne5Var.o();
        }
        this.h = null;
    }

    public abstract void b(voo vooVar);

    public final void c() {
        boolean z = true;
        if (this.e instanceof s9p) {
            ((w9p) ((vdp) this.b.b).a).C();
            this.e = this.e.h();
            r22 r22Var = this.b;
            ivo ivoVar = new ivo(z, this);
            cbp.c(new fmn((Object) r22Var, (Object) ivoVar, (byte) 8), new ttn((Object) ivoVar, (byte) 9));
            return;
        }
        ((vdp) this.b.b).h(104);
        uuj uujVar = this.c;
        if (uujVar != null) {
            uujVar.g(new cm(1, "Repetitive load on one Ad!", (byte) 0));
        }
    }

    public final boolean d() {
        voo vooVar = this.d;
        return (vooVar != null && vooVar.a()) || (this.e instanceof j9p) || (this.e instanceof n9p);
    }

    public final void e() {
        ne5 ne5Var = this.h;
        if (ne5Var == null) {
            ne5Var = new ne5(this.a);
            this.h = ne5Var;
        }
        ne5Var.m(this.f, new cwo(this));
    }
}
