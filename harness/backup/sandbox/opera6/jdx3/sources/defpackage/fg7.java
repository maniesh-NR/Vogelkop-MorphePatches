package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class fg7 {
    public final rf7 a;
    public long d;
    public long e;
    public boolean f;
    public int g;
    public final ArrayList b = new ArrayList();
    public final l76 c = new l76(10);
    public final ig h = new ig((Object) this, (byte) 22);

    public fg7(rf7 rf7Var) {
        this.a = rf7Var;
        rf7Var.b(new ag(this, (byte) 6));
    }

    public static boolean c(re7 re7Var) {
        return re7Var.p() || re7Var.q();
    }

    public final void a(bg bgVar) {
        ArrayList arrayList = this.b;
        arrayList.add(bgVar);
        bgVar.getClass();
        if (arrayList.size() == 1) {
            b();
            if (this.f) {
                this.g = 0;
                ig igVar = this.h;
                vml.a(igVar);
                igVar.run();
            }
        }
        if (this.f) {
            bgVar.b(this.d, this.e);
        }
    }

    public final void b() {
        this.f = false;
        for (re7 re7Var : Collections.unmodifiableList(this.a.c)) {
            if (c(re7Var) && re7Var.m()) {
                this.f = true;
                return;
            }
        }
    }
}
