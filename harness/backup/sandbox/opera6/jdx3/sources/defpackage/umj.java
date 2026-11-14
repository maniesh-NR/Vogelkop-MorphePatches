package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class umj {
    public static final umj a;
    public static final umj b;
    public static final umj c;
    public static final umj d;
    public static final /* synthetic */ umj[] e;

    static {
        umj umjVar = new umj("NONE", 0);
        a = umjVar;
        umj umjVar2 = new umj("FAVORITE", 1);
        b = umjVar2;
        umj umjVar3 = new umj("CIRCLE", 2);
        c = umjVar3;
        umj umjVar4 = new umj("SQUIRCLE", 3);
        d = umjVar4;
        e = new umj[]{umjVar, umjVar2, umjVar3, umjVar4};
    }

    public static umj valueOf(String str) {
        return (umj) Enum.valueOf(umj.class, str);
    }

    public static umj[] values() {
        return (umj[]) e.clone();
    }
}
