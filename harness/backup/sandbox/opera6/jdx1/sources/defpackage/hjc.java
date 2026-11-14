package defpackage;

/* loaded from: classes.dex */
public final class hjc {
    public final Object a;
    public nrl b = new nrl((byte) 11);
    public boolean c;
    public boolean d;

    public hjc(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hjc.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((hjc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
