package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b4l {
    public static final b4l a;
    public static final b4l b;
    public static final b4l c;
    public static final /* synthetic */ b4l[] d;

    static {
        b4l b4lVar = new b4l("UPGRADE_DIALOG", 0);
        a = b4lVar;
        b4l b4lVar2 = new b4l("TOUR_BUBBLES", 1);
        b = b4lVar2;
        b4l b4lVar3 = new b4l("NONE", 2);
        c = b4lVar3;
        d = new b4l[]{b4lVar, b4lVar2, b4lVar3};
    }

    public static b4l valueOf(String str) {
        return (b4l) Enum.valueOf(b4l.class, str);
    }

    public static b4l[] values() {
        return (b4l[]) d.clone();
    }
}
