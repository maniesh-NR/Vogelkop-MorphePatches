package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class muk {
    public static final muk a;
    public static final /* synthetic */ muk[] b;

    /* JADX INFO: Fake field, exist only in values array */
    muk EF0;

    static {
        muk mukVar = new muk("BLOCK_SAVES", 0);
        muk mukVar2 = new muk("DISCARD", 1);
        a = mukVar2;
        b = new muk[]{mukVar, mukVar2};
    }

    public static muk valueOf(String str) {
        return (muk) Enum.valueOf(muk.class, str);
    }

    public static muk[] values() {
        return (muk[]) b.clone();
    }
}
