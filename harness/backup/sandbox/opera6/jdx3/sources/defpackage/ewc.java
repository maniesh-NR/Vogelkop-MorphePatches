package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class ewc extends ja2 {
    public final ate b;
    public hwc c;

    public ewc(ate ateVar) {
        this.b = ateVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (getClass().equals(obj != null ? obj.getClass() : null)) {
            return Intrinsics.a(this.b, ((ewc) obj).b);
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode();
    }
}
