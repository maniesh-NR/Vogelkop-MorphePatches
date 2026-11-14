package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class r8f implements clh {
    public final glh a;
    public final HashMap b = new HashMap();

    public r8f(glh glhVar) {
        this.a = glhVar;
        glhVar.b.b(this);
    }

    @Override // defpackage.clh
    public final void a() {
    }

    @Override // defpackage.clh
    public final void b(long j) {
    }

    @Override // defpackage.clh
    public final void c(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            i7f i7fVar = (i7f) this.b.remove(Long.toString(((Long) it.next()).longValue()));
            if (i7fVar != null) {
                g7f g7fVar = new g7f(i7fVar);
                while (g7fVar.hasNext()) {
                    q8f q8fVar = (q8f) g7fVar.next();
                    q8fVar.b.run(q8fVar.a);
                }
            }
        }
    }

    @Override // defpackage.clh
    public final void d(long j) {
    }

    @Override // defpackage.clh
    public final void e(long j) {
    }
}
