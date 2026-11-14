package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class q2l {
    public static final q2l a;
    public static final q2l b;
    public static final /* synthetic */ q2l[] c;

    static {
        q2l q2lVar = new q2l("BEFORE_FIRST_ITEM", 0);
        a = q2lVar;
        q2l q2lVar2 = new q2l("AFTER_LAST_ITEM", 1);
        b = q2lVar2;
        c = new q2l[]{q2lVar, q2lVar2};
    }

    public static q2l valueOf(String str) {
        return (q2l) Enum.valueOf(q2l.class, str);
    }

    public static q2l[] values() {
        return (q2l[]) c.clone();
    }
}
