package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class gt {
    public static final gt a;
    public static final gt b;
    public static final gt c;
    public static final gt d;
    public static final gt e;
    public static final gt f;
    public static final /* synthetic */ gt[] g;

    static {
        gt gtVar = new gt("SUGGESTED_FOR_YOU", 0);
        a = gtVar;
        gt gtVar2 = new gt("CATEGORIES", 1);
        b = gtVar2;
        gt gtVar3 = new gt("FREQUENTLY_VISITED", 2);
        c = gtVar3;
        gt gtVar4 = new gt("TOOLS", 3);
        d = gtVar4;
        gt gtVar5 = new gt("BOOKMARK", 4);
        e = gtVar5;
        gt gtVar6 = new gt("SEARCH", 5);
        f = gtVar6;
        g = new gt[]{gtVar, gtVar2, gtVar3, gtVar4, gtVar5, gtVar6};
    }

    public static gt valueOf(String str) {
        return (gt) Enum.valueOf(gt.class, str);
    }

    public static gt[] values() {
        return (gt[]) g.clone();
    }
}
