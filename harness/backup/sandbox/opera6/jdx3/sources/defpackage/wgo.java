package defpackage;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class wgo {
    public final WeakReference a;
    public final int b;

    public wgo(bzo bzoVar) {
        this.a = new WeakReference(bzoVar);
        this.b = bzoVar.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wgo.class != obj.getClass()) {
            return false;
        }
        wgo wgoVar = (wgo) obj;
        bzo bzoVar = (bzo) this.a.get();
        return bzoVar != null && bzoVar.equals(wgoVar.a.get());
    }

    public final int hashCode() {
        return this.b;
    }
}
