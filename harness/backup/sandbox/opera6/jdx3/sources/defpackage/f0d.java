package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f0d {
    public static final f0d a;
    public static final f0d b;
    public static final f0d c;
    public static final /* synthetic */ f0d[] d;

    static {
        f0d f0dVar = new f0d("NONE", 0);
        a = f0dVar;
        f0d f0dVar2 = new f0d("NO_REMOVED_RECORDS", 1);
        b = f0dVar2;
        f0d f0dVar3 = new f0d("DB_ERROR", 2);
        c = f0dVar3;
        d = new f0d[]{f0dVar, f0dVar2, f0dVar3};
    }

    public static f0d valueOf(String str) {
        return (f0d) Enum.valueOf(f0d.class, str);
    }

    public static f0d[] values() {
        return (f0d[]) d.clone();
    }
}
