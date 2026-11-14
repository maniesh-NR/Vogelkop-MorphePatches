package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class h5j implements i5j {
    public static final f5j a;
    public static final g5j b;
    public static final /* synthetic */ h5j[] c;

    /* JADX INFO: Fake field, exist only in values array */
    h5j EF0;

    static {
        h5j h5jVar = new h5j() { // from class: e5j
        };
        f5j f5jVar = new f5j();
        a = f5jVar;
        g5j g5jVar = new g5j();
        b = g5jVar;
        c = new h5j[]{h5jVar, f5jVar, g5jVar};
    }

    public static h5j valueOf(String str) {
        return (h5j) Enum.valueOf(h5j.class, str);
    }

    public static h5j[] values() {
        return (h5j[]) c.clone();
    }
}
