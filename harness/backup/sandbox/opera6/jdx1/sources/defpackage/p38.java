package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class p38 {
    public final zlj a;
    public final Executor b;

    public p38(zlj zljVar, Executor executor) {
        this.a = zljVar;
        this.b = executor;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof p38) && this.a == ((p38) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
