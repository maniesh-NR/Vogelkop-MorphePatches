package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* loaded from: classes.dex */
public final class iwj implements ac6, zb6 {
    public final bj6 a;
    public final cj6 b;
    public int c;
    public kb6 d;
    public Object e;
    public volatile u7e f;
    public lb6 g;

    public iwj(bj6 bj6Var, cj6 cj6Var) {
        this.a = bj6Var;
        this.b = cj6Var;
    }

    @Override // defpackage.zb6
    public final void a(hub hubVar, Object obj, yb6 yb6Var, int i, hub hubVar2) {
        this.b.a(hubVar, obj, yb6Var, this.f.c.f(), hubVar);
    }

    @Override // defpackage.zb6
    public final void b(hub hubVar, Exception exc, yb6 yb6Var, int i) {
        this.b.b(hubVar, exc, yb6Var, this.f.c.f());
    }

    @Override // defpackage.ac6
    public final boolean c() {
        Object obj = this.e;
        boolean z = false;
        if (obj != null) {
            this.e = null;
            SystemClock.elapsedRealtimeNanos();
            try {
                u18 u18VarD = this.a.d(obj);
                l45 l45Var = new l45(false, u18VarD, obj, this.a.i);
                hub hubVar = this.f.a;
                bj6 bj6Var = this.a;
                this.g = new lb6(hubVar, bj6Var.n);
                bj6Var.h.a().j(this.g, l45Var);
                if (Log.isLoggable("SourceGenerator", 2)) {
                    Objects.toString(this.g);
                    obj.toString();
                    u18VarD.toString();
                    SystemClock.elapsedRealtimeNanos();
                }
                this.f.c.c();
                this.d = new kb6(Collections.singletonList(this.f.a), this.a, this);
            } catch (Throwable th) {
                this.f.c.c();
                throw th;
            }
        }
        kb6 kb6Var = this.d;
        if (kb6Var != null && kb6Var.c()) {
            return true;
        }
        this.d = null;
        this.f = null;
        while (!z && this.c < this.a.b().size()) {
            ArrayList arrayListB = this.a.b();
            int i = this.c;
            this.c = i + 1;
            this.f = (u7e) arrayListB.get(i);
            if (this.f != null && (this.a.p.a(this.f.c.f()) || this.a.c(this.f.c.a()) != null)) {
                this.f.c.e(this.a.o, new mgh(this, this.f));
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.ac6
    public final void cancel() {
        u7e u7eVar = this.f;
        if (u7eVar != null) {
            u7eVar.c.cancel();
        }
    }
}
