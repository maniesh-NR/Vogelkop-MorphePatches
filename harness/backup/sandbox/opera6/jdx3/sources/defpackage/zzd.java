package defpackage;

/* loaded from: classes.dex */
public final class zzd implements vzd {
    public final b2l a;
    public final int b;
    public final long c;

    public zzd(b2l b2lVar, int i) {
        this.a = b2lVar;
        this.b = i;
        int id = ((d7l) b2lVar).j.getId();
        cgm cgmVar = dgm.b;
        this.c = id & 4294967295L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzd)) {
            return false;
        }
        zzd zzdVar = (zzd) obj;
        return this.a.equals(zzdVar.a) && this.b == zzdVar.b;
    }

    @Override // defpackage.vzd
    public final long getId() {
        return this.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
