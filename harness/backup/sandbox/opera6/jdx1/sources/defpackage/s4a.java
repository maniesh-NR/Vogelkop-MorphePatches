package defpackage;

/* loaded from: classes.dex */
public final class s4a {
    public final int a;
    public final int b;

    public s4a(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.b - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s4a.class != obj.getClass()) {
            return false;
        }
        s4a s4aVar = (s4a) obj;
        return this.b == s4aVar.b && this.a == s4aVar.a;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.a);
        sb.append(", ");
        return p3p.k(this.b, "]", sb);
    }
}
