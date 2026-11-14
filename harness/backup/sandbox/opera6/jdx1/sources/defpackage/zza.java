package defpackage;

/* loaded from: classes.dex */
public final class zza {
    public final yza a;
    public final int b;

    public zza(yza yzaVar, int i) {
        this.a = yzaVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zza)) {
            return false;
        }
        zza zzaVar = (zza) obj;
        return this.a.equals(zzaVar.a) && this.b == zzaVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ImageVectorEntry(imageVector=" + this.a + ", configFlags=" + this.b + ")";
    }
}
