package defpackage;

/* loaded from: classes.dex */
public final class hhk implements csl {
    public final String a;

    public hhk(String str) {
        this.a = str;
    }

    @Override // defpackage.csl
    public final String a1() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hhk.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((hhk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
