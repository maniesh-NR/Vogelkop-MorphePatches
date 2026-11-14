package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class qkl {
    public static final /* synthetic */ qkl[] a = {new qkl("Shown", 0), new qkl("Hidden", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    qkl EF5;

    public static qkl valueOf(String str) {
        return (qkl) Enum.valueOf(qkl.class, str);
    }

    public static qkl[] values() {
        return (qkl[]) a.clone();
    }
}
