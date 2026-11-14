package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class sf {
    public static final sf a;
    public static final sf b;
    public static final sf c;
    public static final /* synthetic */ sf[] d;

    static {
        sf sfVar = new sf("NONE", 0);
        a = sfVar;
        sf sfVar2 = new sf("VIABLE_TARGET", 1);
        b = sfVar2;
        sf sfVar3 = new sf("ACTIVE_TARGET", 2);
        c = sfVar3;
        d = new sf[]{sfVar, sfVar2, sfVar3};
    }

    public static sf valueOf(String str) {
        return (sf) Enum.valueOf(sf.class, str);
    }

    public static sf[] values() {
        return (sf[]) d.clone();
    }
}
