package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class mla {
    public static final mla a;
    public static final /* synthetic */ mla[] b;

    /* JADX INFO: Fake field, exist only in values array */
    mla EF0;

    static {
        mla mlaVar = new mla("UNDEFINED", 0);
        mla mlaVar2 = new mla("TEXT", 1);
        a = mlaVar2;
        b = new mla[]{mlaVar, mlaVar2, new mla("VOICE", 2)};
    }

    public static mla valueOf(String str) {
        return (mla) Enum.valueOf(mla.class, str);
    }

    public static mla[] values() {
        return (mla[]) b.clone();
    }
}
