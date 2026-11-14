package defpackage;

/* loaded from: classes.dex */
public abstract class xxc extends ja2 {
    public final rcd b;
    public final rcd c;

    public xxc(rcd rcdVar, rcd rcdVar2) {
        this.b = rcdVar;
        this.c = rcdVar2;
    }

    public abstract String e();

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return f().equals(((xxc) obj).f());
    }

    public abstract fdn f();

    public final int hashCode() {
        return f().hashCode();
    }
}
