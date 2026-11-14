package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class omc {
    public static final omc a;
    public static final omc b;
    public static final /* synthetic */ omc[] c;

    static {
        omc omcVar = new omc("ENABLED", 0);
        a = omcVar;
        omc omcVar2 = new omc("DISABLED", 1);
        b = omcVar2;
        c = new omc[]{omcVar, omcVar2};
    }

    public static omc valueOf(String str) {
        return (omc) Enum.valueOf(omc.class, str);
    }

    public static omc[] values() {
        return (omc[]) c.clone();
    }
}
