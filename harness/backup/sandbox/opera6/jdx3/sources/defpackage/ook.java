package defpackage;

/* loaded from: classes.dex */
public final class ook {
    public final String a;
    public final String b;
    public final String c;
    public final byte d;
    public final byte e;
    public final int f;
    public final String g;
    public final String h;
    public final String i;

    public ook(int i, int i2, String str, String str2, String str3) {
        this("", str, str2, str2, i, i, i2, str3, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ook(String str, String str2, String str3, String str4, int i, int i2, int i3, String str5, String str6) {
        this.h = str;
        this.a = str2;
        this.b = str3;
        this.c = str4;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = str5;
        this.i = str6;
    }

    public final boolean a() {
        return this.e == 9 || this.d == 10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ook)) {
            return false;
        }
        ook ookVar = (ook) obj;
        if (this.d == ookVar.d && this.a.equals(ookVar.a)) {
            return this.b.equals(ookVar.b);
        }
        return false;
    }

    public final int hashCode() {
        return z1m.f(this.a.hashCode() * 31, 31, this.b) + this.d;
    }
}
