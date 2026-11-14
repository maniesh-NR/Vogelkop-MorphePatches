package defpackage;

/* loaded from: classes.dex */
public final class zaa {
    public final int a;
    public final float b;

    public zaa(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zaa)) {
            return false;
        }
        zaa zaaVar = (zaa) obj;
        return this.a == zaaVar.a && Float.compare(this.b, zaaVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
