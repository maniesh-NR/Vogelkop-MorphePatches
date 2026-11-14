package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class a7c implements l7h {
    public volatile Set a;
    public volatile Set b;

    public final Object get() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = Collections.newSetFromMap(new ConcurrentHashMap());
                    synchronized (this) {
                        try {
                            Iterator it = this.a.iterator();
                            while (it.hasNext()) {
                                this.b.add(((l7h) it.next()).get());
                            }
                            this.a = null;
                        } finally {
                        }
                    }
                }
            }
        }
        return Collections.unmodifiableSet(this.b);
    }
}
