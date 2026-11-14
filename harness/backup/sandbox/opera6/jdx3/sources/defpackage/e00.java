package defpackage;

import android.content.Context;
import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class e00 {
    public final Context a;
    public final umi b;
    public final b59 c;
    public c00 e;
    public ArrayList g;
    public final AtomicReference d = new AtomicReference();
    public final nrl f = new nrl((byte) 26);

    public e00(Context context, umi umiVar) {
        this.a = context.getApplicationContext();
        this.b = umiVar;
        this.c = w1h.l(context, umiVar, "advertising_pref_store", new bg1[]{new a00(this, (byte) 0)});
    }

    public final void a(Callback callback) {
        c00 c00Var = this.e;
        if (c00Var != null) {
            callback.run(c00Var.a);
            return;
        }
        c00 c00Var2 = (c00) this.d.get();
        if (c00Var2.c) {
            nrl nrlVar = this.f;
            if (!nrlVar.a) {
                nrlVar.d(new xa(this, callback, (byte) 7));
                return;
            }
        }
        callback.run(c00Var2.a);
    }

    public final c00 b() {
        c00 c00Var = this.e;
        return c00Var != null ? c00Var : (c00) this.d.get();
    }

    public final void c() {
        if (this.g != null) {
            return;
        }
        ArrayList arrayList = new ArrayList(1);
        this.g = arrayList;
        nrl nrlVar = this.f;
        Objects.requireNonNull(nrlVar);
        arrayList.add(new mni(nrlVar, (byte) 10));
        d00 d00Var = new d00(this.a, new ab(this, (byte) 3));
        va2 va2Var = new va2(d00Var, (byte) 1);
        ab abVar = new ab(d00Var, (byte) 19);
        umi umiVar = this.b;
        nml nmlVarG = umiVar.g(va2Var);
        nmlVarG.b(umiVar.f(new lw0(abVar, (byte) 1)));
        nmlVarG.a(null);
    }
}
