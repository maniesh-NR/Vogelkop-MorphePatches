package defpackage;

/* loaded from: classes.dex */
public final class uo {
    public final bz a;
    public final dl b;

    public uo(bz bzVar, dl dlVar) {
        this.a = bzVar;
        this.b = dlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uo.class != obj.getClass()) {
            return false;
        }
        uo uoVar = (uo) obj;
        return uoVar.a.equals(this.a) && uoVar.b.equals(this.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }
}
