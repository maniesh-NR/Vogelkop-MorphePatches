package defpackage;

/* loaded from: classes.dex */
public final class zoj {
    public static final zoj c = new zoj(-1, -1);
    public final int a;
    public final int b;

    static {
        new zoj(0, 0);
        String str = tym.a;
    }

    public zoj(int i, int i2) {
        z4o.w((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof zoj) {
            zoj zojVar = (zoj) obj;
            if (this.a == zojVar.a && this.b == zojVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        return this.b ^ ((i << 16) | (i >>> 16));
    }

    public final String toString() {
        return this.a + "x" + this.b;
    }
}
