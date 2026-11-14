package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class xqj implements Iterator {
    public int a = -1;
    public boolean b;
    public Iterator c;
    public final /* synthetic */ uqj d;

    public xqj(uqj uqjVar) {
        this.d = uqjVar;
    }

    public final Iterator a() {
        Iterator it = this.c;
        if (it != null) {
            return it;
        }
        Iterator it2 = this.d.b.entrySet().iterator();
        this.c = it2;
        return it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a + 1;
        uqj uqjVar = this.d;
        return i < uqjVar.a.size() || (!uqjVar.b.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.b = true;
        int i = this.a + 1;
        this.a = i;
        uqj uqjVar = this.d;
        return i < uqjVar.a.size() ? (Map.Entry) uqjVar.a.get(this.a) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.b) {
            qp2.n("remove() was called before next()");
            return;
        }
        this.b = false;
        int i = uqj.f;
        uqj uqjVar = this.d;
        uqjVar.b();
        if (this.a >= uqjVar.a.size()) {
            a().remove();
            return;
        }
        int i2 = this.a;
        this.a = i2 - 1;
        uqjVar.h(i2);
    }
}
