package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c6j implements q8j {
    public final t7j a;
    public Object b;
    public final HashSet c = new HashSet();
    public final boolean d;

    public c6j(t7j t7jVar, boolean z) {
        this.a = t7jVar;
        this.d = z;
        t7jVar.b(this);
    }

    @Override // defpackage.q8j
    public final void a() {
        if (this.d) {
            this.b = null;
        }
        this.a.b(this);
    }

    @Override // defpackage.q8j
    public final void c(Object obj) {
        if (obj == null || this.b == obj) {
            return;
        }
        this.b = obj;
        Iterator it = new HashSet(this.c).iterator();
        while (it.hasNext()) {
            ((b6j) it.next()).b();
        }
    }
}
