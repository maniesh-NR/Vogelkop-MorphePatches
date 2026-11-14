package defpackage;

/* loaded from: classes.dex */
public final class qlj implements m7h {
    public static final Object c = new Object();
    public volatile lq3 a;
    public volatile Object b;

    public final Object get() {
        Object obj = this.b;
        if (obj != c) {
            return obj;
        }
        lq3 lq3Var = this.a;
        if (lq3Var == null) {
            return this.b;
        }
        Object obj2 = lq3Var.get();
        this.b = obj2;
        this.a = null;
        return obj2;
    }
}
