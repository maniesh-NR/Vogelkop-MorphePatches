package defpackage;

/* loaded from: classes.dex */
public final class oae {
    public final long a;
    public final long b;

    public oae(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final oae a(oae oaeVar) {
        return new oae(y8f.e(this.a, oaeVar.a), Math.max(this.b, oaeVar.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oae)) {
            return false;
        }
        oae oaeVar = (oae) obj;
        return y8f.b(this.a, oaeVar.a) && this.b == oaeVar.b;
    }

    public final int hashCode() {
        return ((Long.hashCode(this.b) + (Long.hashCode(this.a) * 31)) * 31) + 1237;
    }

    public final String toString() {
        return "MouseWheelScrollDelta(value=" + y8f.g(this.a) + ", timeMillis=" + this.b + ", shouldApplyImmediately=false)";
    }
}
