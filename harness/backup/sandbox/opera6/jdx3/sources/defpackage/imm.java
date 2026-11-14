package defpackage;

/* loaded from: classes.dex */
public final class imm extends p58 {
    public final String b;

    public imm(String str) {
        super(false);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof imm) && this.b.equals(((imm) obj).b);
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "";
    }
}
