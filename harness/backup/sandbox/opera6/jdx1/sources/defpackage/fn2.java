package defpackage;

/* loaded from: classes.dex */
public final class fn2 {
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public fn2(String str, int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        if (str == null) {
            t3p.q("Null mediaType");
            throw null;
        }
        this.b = str;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fn2) {
            fn2 fn2Var = (fn2) obj;
            if (this.a == fn2Var.a && this.b.equals(fn2Var.b) && this.c == fn2Var.c && this.d == fn2Var.d && this.e == fn2Var.e && this.f == fn2Var.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioProfileProxy{codec=");
        sb.append(this.a);
        sb.append(", mediaType=");
        sb.append(this.b);
        sb.append(", bitrate=");
        sb.append(this.c);
        sb.append(", sampleRate=");
        sb.append(this.d);
        sb.append(", channels=");
        sb.append(this.e);
        sb.append(", profile=");
        return p3p.k(this.f, "}", sb);
    }
}
