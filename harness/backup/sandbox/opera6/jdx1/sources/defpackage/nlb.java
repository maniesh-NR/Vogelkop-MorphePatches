package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class nlb {
    public static final nlb a;
    public static final nlb b;
    public static final nlb c;
    public static final /* synthetic */ nlb[] d;

    static {
        nlb nlbVar = new nlb("CATEGORY_TITLE", 0);
        a = nlbVar;
        nlb nlbVar2 = new nlb("PLACEHOLDER_TEXT", 1);
        b = nlbVar2;
        nlb nlbVar3 = new nlb("EMOJI", 2);
        c = nlbVar3;
        d = new nlb[]{nlbVar, nlbVar2, nlbVar3};
    }

    public static nlb valueOf(String str) {
        return (nlb) Enum.valueOf(nlb.class, str);
    }

    public static nlb[] values() {
        return (nlb[]) d.clone();
    }
}
