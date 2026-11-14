package defpackage;

/* loaded from: classes.dex */
public final class bre {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;

    public bre(int i, String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bre) {
            return this.a.equals(((bre) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
