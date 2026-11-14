package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ht {
    public static final ht a;
    public static final ht b;
    public static final ht c;
    public static final ht d;
    public static final ht e;
    public static final ht f;
    public static final ht g;
    public static final ht h;
    public static final ht i;
    public static final /* synthetic */ ht[] j;

    static {
        ht htVar = new ht("BOOKMARKS", 0);
        a = htVar;
        ht htVar2 = new ht("CATALOG", 1);
        b = htVar2;
        ht htVar3 = new ht("DEEP_LINKS", 2);
        c = htVar3;
        ht htVar4 = new ht("HISTORY", 3);
        d = htVar4;
        ht htVar5 = new ht("SUGGESTED_SITES", 4);
        e = htVar5;
        ht htVar6 = new ht("SYNCED_SPEED_DIALS", 5);
        f = htVar6;
        ht htVar7 = new ht("SYNCED_TABS", 6);
        g = htVar7;
        ht htVar8 = new ht("TABS", 7);
        h = htVar8;
        ht htVar9 = new ht("UNKNOWN", 8);
        i = htVar9;
        j = new ht[]{htVar, htVar2, htVar3, htVar4, htVar5, htVar6, htVar7, htVar8, htVar9};
    }

    public static ht valueOf(String str) {
        return (ht) Enum.valueOf(ht.class, str);
    }

    public static ht[] values() {
        return (ht[]) j.clone();
    }
}
