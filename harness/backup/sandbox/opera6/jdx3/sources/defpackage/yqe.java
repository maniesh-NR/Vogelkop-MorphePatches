package defpackage;

/* loaded from: classes.dex */
public final class yqe {
    public static final yqe d = new yqe("topnews", "", true);
    public final String a;
    public final String b;
    public final boolean c;

    public yqe(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean a() {
        return "cur_city_id".equals(this.a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yqe) {
            return this.a.equals(((yqe) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
