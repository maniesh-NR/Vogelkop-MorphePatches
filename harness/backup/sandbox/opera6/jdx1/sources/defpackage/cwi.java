package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class cwi {
    public static final cwi a;
    public static final /* synthetic */ cwi[] b;

    static {
        cwi cwiVar = new cwi("Inherit", 0);
        a = cwiVar;
        b = new cwi[]{cwiVar, new cwi("SecureOn", 1), new cwi("SecureOff", 2)};
    }

    public static cwi valueOf(String str) {
        return (cwi) Enum.valueOf(cwi.class, str);
    }

    public static cwi[] values() {
        return (cwi[]) b.clone();
    }
}
