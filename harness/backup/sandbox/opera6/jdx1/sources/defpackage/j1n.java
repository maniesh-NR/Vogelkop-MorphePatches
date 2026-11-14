package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j1n {
    public static final j1n a;
    public static final j1n b;
    public static final /* synthetic */ j1n[] c;

    static {
        j1n j1nVar = new j1n("Lsq2", 0);
        a = j1nVar;
        j1n j1nVar2 = new j1n("Impulse", 1);
        b = j1nVar2;
        c = new j1n[]{j1nVar, j1nVar2};
    }

    public static j1n valueOf(String str) {
        return (j1n) Enum.valueOf(j1n.class, str);
    }

    public static j1n[] values() {
        return (j1n[]) c.clone();
    }
}
