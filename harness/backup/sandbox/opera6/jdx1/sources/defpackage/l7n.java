package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class l7n {
    public final o7n a = new o7n();

    public final void b(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        o7n o7nVar = this.a;
        if (o7nVar.d) {
            o7n.a(autoCloseable);
            return;
        }
        synchronized (o7nVar.a) {
            autoCloseable2 = (AutoCloseable) o7nVar.b.put(str, autoCloseable);
        }
        o7n.a(autoCloseable2);
    }

    public final void c() {
        o7n o7nVar = this.a;
        if (!o7nVar.d) {
            o7nVar.d = true;
            synchronized (o7nVar.a) {
                Iterator it = o7nVar.b.values().iterator();
                while (it.hasNext()) {
                    o7n.a((AutoCloseable) it.next());
                }
                Iterator it2 = o7nVar.c.iterator();
                while (it2.hasNext()) {
                    o7n.a((AutoCloseable) it2.next());
                }
                o7nVar.c.clear();
            }
        }
        e();
    }

    public final AutoCloseable d(String str) {
        AutoCloseable autoCloseable;
        o7n o7nVar = this.a;
        synchronized (o7nVar.a) {
            autoCloseable = (AutoCloseable) o7nVar.b.get(str);
        }
        return autoCloseable;
    }

    public void e() {
    }
}
