package defpackage;

import android.content.ComponentName;
import android.content.Context;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class und {
    public final Context a;
    public final lld b;
    public final ue2 c = new ue2(this, 10);
    public xm5 d;
    public dnd e;
    public boolean f;
    public mi9 g;
    public boolean h;

    public und(Context context, lld lldVar) {
        if (context == null) {
            qp2.o("context must not be null");
            throw null;
        }
        this.a = context;
        if (lldVar == null) {
            this.b = new lld(new ComponentName(context, getClass()), (byte) 1);
        } else {
            this.b = lldVar;
        }
    }

    public rnd a(String str, tnd tndVar) {
        if (str != null) {
            return null;
        }
        qp2.o("initialMemberRouteId cannot be null.");
        return null;
    }

    public snd b(String str) {
        if (str != null) {
            return null;
        }
        qp2.o("routeId cannot be null");
        return null;
    }

    public snd c(String str, tnd tndVar) {
        return b(str);
    }

    public snd d(String str, String str2) {
        if (str == null) {
            qp2.o("routeId cannot be null");
            return null;
        }
        if (str2 != null) {
            return c(str, tnd.b);
        }
        qp2.o("routeGroupId cannot be null");
        return null;
    }

    public abstract void e(dnd dndVar);

    public final void f(mi9 mi9Var) {
        dod.b();
        if (this.g != mi9Var) {
            this.g = mi9Var;
            if (this.h) {
                return;
            }
            this.h = true;
            this.c.sendEmptyMessage(1);
        }
    }

    public final void g(dnd dndVar) {
        dod.b();
        if (Objects.equals(this.e, dndVar)) {
            return;
        }
        this.e = dndVar;
        if (this.f) {
            return;
        }
        this.f = true;
        this.c.sendEmptyMessage(2);
    }
}
