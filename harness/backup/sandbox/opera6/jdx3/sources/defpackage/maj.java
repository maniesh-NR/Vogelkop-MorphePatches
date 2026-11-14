package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class maj {
    public static final maj a;
    public static final maj b;
    public static final maj c;
    public static final /* synthetic */ maj[] d;

    static {
        maj majVar = new maj("BOTTOM_BORDER", 0);
        a = majVar;
        maj majVar2 = new maj("ELEVATION_01", 1);
        b = majVar2;
        maj majVar3 = new maj("ELEVATION_02", 2);
        c = majVar3;
        d = new maj[]{majVar, majVar2, majVar3};
    }

    public static maj valueOf(String str) {
        return (maj) Enum.valueOf(maj.class, str);
    }

    public static maj[] values() {
        return (maj[]) d.clone();
    }
}
