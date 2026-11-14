package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class mnn {
    public final vln a;
    public long b;
    public final ArrayList c = new ArrayList();

    public mnn(vln vlnVar) {
        this.a = vlnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mnn) && this.a == ((mnn) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "";
    }
}
