package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class wea {
    public final String a;
    public final byte b;
    public final double c;
    public final String d;

    public wea(String str, double d) {
        this.a = str;
        this.b = (byte) 2;
        this.c = d;
        this.d = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public wea(String str, String str2, int i) {
        boolean z = true;
        if (i == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z = false;
        }
        z4o.H(z);
        this.a = str;
        this.b = i;
        this.d = str2;
        this.c = 0.0d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wea)) {
            return false;
        }
        wea weaVar = (wea) obj;
        return this.b == weaVar.b && Double.compare(this.c, weaVar.c) == 0 && this.a.equals(weaVar.a) && Objects.equals(this.d, weaVar.d);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), Double.valueOf(this.c), this.d);
    }
}
