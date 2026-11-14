package defpackage;

/* loaded from: classes.dex */
public final class wsn implements Comparable {
    public static final w8l e = new w8l((byte) 11);
    public final String a;
    public final int b;
    public int c = 0;
    public final int d;

    public wsn(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.d = i2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a.compareTo(((wsn) obj).a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wsn)) {
            return false;
        }
        return this.a.equals(((wsn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
