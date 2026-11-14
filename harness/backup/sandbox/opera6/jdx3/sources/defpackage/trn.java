package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class trn {
    public static final trn a;
    public static final trn b;
    public static final /* synthetic */ trn[] c;

    static {
        trn trnVar = new trn("CREATE_NEW_CHAT", 0);
        a = trnVar;
        trn trnVar2 = new trn("RETAIN_PREVIOUS_CHAT", 1);
        b = trnVar2;
        c = new trn[]{trnVar, trnVar2};
    }

    public static trn valueOf(String str) {
        return (trn) Enum.valueOf(trn.class, str);
    }

    public static trn[] values() {
        return (trn[]) c.clone();
    }
}
