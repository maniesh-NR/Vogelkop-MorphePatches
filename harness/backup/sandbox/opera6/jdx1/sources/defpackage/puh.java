package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class puh {
    public static final puh a;
    public static final puh b;
    public static final /* synthetic */ puh[] c;

    static {
        puh puhVar = new puh("Restart", 0);
        a = puhVar;
        puh puhVar2 = new puh("Reverse", 1);
        b = puhVar2;
        c = new puh[]{puhVar, puhVar2};
    }

    public static puh valueOf(String str) {
        return (puh) Enum.valueOf(puh.class, str);
    }

    public static puh[] values() {
        return (puh[]) c.clone();
    }
}
