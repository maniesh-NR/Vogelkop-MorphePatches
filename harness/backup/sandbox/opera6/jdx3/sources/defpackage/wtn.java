package defpackage;

import com.opera.android.history.g;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class wtn extends vtn {
    public final String a;
    public final int b;
    public boolean e;
    public long c = Long.MIN_VALUE;
    public long d = Long.MAX_VALUE;
    public final ArrayList f = new ArrayList();

    public wtn(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.vtn
    public final String b() {
        return this.a;
    }

    @Override // defpackage.vtn
    public final long c() {
        return (this.a.hashCode() * 31) + this.b + 4611686018427387904L;
    }

    @Override // defpackage.vtn
    public final void e() {
        if (this.e) {
            this.e = false;
        }
    }

    public final void f(vtn vtnVar) {
        g gVar = (g) vtnVar;
        long jB = gVar.b.b();
        if (jB > this.c) {
            this.c = jB;
        }
        if (jB < this.d) {
            this.d = jB;
        }
        gVar.f = this;
        this.f.add(vtnVar);
    }
}
