package defpackage;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class pk6 {
    public final WeakReference a;
    public final int b;

    public pk6(yz yzVar) {
        this.b = yzVar.hashCode();
        this.a = new WeakReference(yzVar);
    }

    public final boolean equals(Object obj) {
        yz yzVar = (yz) this.a.get();
        return yzVar != null && (obj instanceof pk6) && ((pk6) obj).a.get() == yzVar;
    }

    public final int hashCode() {
        return this.b;
    }
}
