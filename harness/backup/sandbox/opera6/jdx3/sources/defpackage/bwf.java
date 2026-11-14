package defpackage;

/* loaded from: classes.dex */
public abstract class bwf {
    public String a() {
        return "topnews";
    }

    public abstract String b();

    public final boolean equals(Object obj) {
        if (obj instanceof bwf) {
            return a().equals(((bwf) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
