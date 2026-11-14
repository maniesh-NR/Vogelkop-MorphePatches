package defpackage;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class x15 {
    public final byte a;
    public final Method b;

    /* JADX WARN: Multi-variable type inference failed */
    public x15(int i, Method method) throws SecurityException {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x15)) {
            return false;
        }
        x15 x15Var = (x15) obj;
        return this.a == x15Var.a && this.b.getName().equals(x15Var.b.getName());
    }

    public final int hashCode() {
        return this.b.getName().hashCode() + (this.a * 31);
    }
}
