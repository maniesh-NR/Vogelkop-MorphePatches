package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class u7b implements l4c, Serializable {
    public final Object a;

    public u7b(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.l4c
    public final Object getValue() {
        return this.a;
    }

    @Override // defpackage.l4c
    public final boolean isInitialized() {
        return true;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
