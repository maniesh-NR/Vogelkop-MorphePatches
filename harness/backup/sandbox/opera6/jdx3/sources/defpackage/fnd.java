package defpackage;

/* loaded from: classes.dex */
public final class fnd {
    public final Object a;
    public final byte b;

    public fnd(Object obj) {
        this.a = obj;
        if (obj instanceof String) {
            this.b = (byte) 1;
        } else if (obj instanceof cod) {
            this.b = (byte) 2;
        } else {
            hai.d();
            throw null;
        }
    }
}
