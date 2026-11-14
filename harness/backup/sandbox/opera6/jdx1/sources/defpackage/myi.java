package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class myi {
    public static final myi a;
    public static final /* synthetic */ myi[] b;

    static {
        myi myiVar = new myi("EditableText", 0);
        a = myiVar;
        b = new myi[]{myiVar, new myi("StaticText", 1)};
    }

    public static myi valueOf(String str) {
        return (myi) Enum.valueOf(myi.class, str);
    }

    public static myi[] values() {
        return (myi[]) b.clone();
    }
}
