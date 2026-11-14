package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class do9 implements AutoCloseable {
    public final Object a = new Object();
    public final i72 b = new i72();
    public boolean c;

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.a) {
            if (this.c) {
                return;
            }
            this.c = true;
            Iterator it = this.b.iterator();
            if (it.hasNext()) {
                throw p3p.g(it);
            }
            this.b.clear();
        }
    }

    public final void h() {
        synchronized (this.a) {
            if (!this.c) {
                Iterator it = this.b.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
        }
    }
}
