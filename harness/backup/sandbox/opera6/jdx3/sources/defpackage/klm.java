package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class klm {
    public static final klm a;
    public static final klm b;
    public static final klm c;
    public static final klm d;
    public static final klm e;
    public static final /* synthetic */ klm[] f;

    static {
        klm klmVar = new klm("WHY_UNINSTALL", 0);
        a = klmVar;
        klm klmVar2 = new klm("FOLLOW_UP_NOT_WORKING", 1);
        b = klmVar2;
        klm klmVar3 = new klm("FOLLOW_UP_AD_ISSUES", 2);
        c = klmVar3;
        klm klmVar4 = new klm("FOLLOW_UP_UPDATE_ISSUES", 3);
        d = klmVar4;
        klm klmVar5 = new klm("FOLLOW_UP_MISSING_FEATURES", 4);
        e = klmVar5;
        f = new klm[]{klmVar, klmVar2, klmVar3, klmVar4, klmVar5};
    }

    public static klm valueOf(String str) {
        return (klm) Enum.valueOf(klm.class, str);
    }

    public static klm[] values() {
        return (klm[]) f.clone();
    }
}
