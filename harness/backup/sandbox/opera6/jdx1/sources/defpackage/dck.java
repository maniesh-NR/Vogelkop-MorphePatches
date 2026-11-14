package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class dck {
    public static final dck a;
    public static final dck b;
    public static final dck c;
    public static final /* synthetic */ dck[] d;

    /* JADX INFO: Fake field, exist only in values array */
    dck EF0;

    static {
        dck dckVar = new dck("Unknown", 0);
        dck dckVar2 = new dck("Fixed", 1);
        a = dckVar2;
        dck dckVar3 = new dck("NotApplicable", 2);
        b = dckVar3;
        dck dckVar4 = new dck("NotFixed", 3);
        c = dckVar4;
        d = new dck[]{dckVar, dckVar2, dckVar3, dckVar4};
    }

    public static dck valueOf(String str) {
        return (dck) Enum.valueOf(dck.class, str);
    }

    public static dck[] values() {
        return (dck[]) d.clone();
    }
}
