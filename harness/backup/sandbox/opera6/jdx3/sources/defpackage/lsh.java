package defpackage;

/* loaded from: classes.dex */
public enum lsh {
    NONE(null),
    LIKE("like"),
    LAUGH("laugh"),
    SURPRISE("surprise"),
    SAD("sad"),
    ANGRY("angry"),
    DISLIKE(null),
    IGNORE(null);

    public final String a;

    lsh(String str) {
        this.a = str;
    }

    public static lsh d(String str) {
        for (lsh lshVar : msh.C) {
            if (str.equals(lshVar.a)) {
                return lshVar;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public final String toString() {
        String[] strArr = aik.a;
        String str = this.a;
        return str == null ? "" : str;
    }
}
