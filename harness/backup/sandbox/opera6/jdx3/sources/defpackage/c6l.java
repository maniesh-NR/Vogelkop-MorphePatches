package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c6l {
    public static final c6l a;
    public static final c6l b;
    public static final c6l c;
    public static final c6l d;
    public static final /* synthetic */ c6l[] e;

    static {
        c6l c6lVar = new c6l("DRAG", 0);
        a = c6lVar;
        c6l c6lVar2 = new c6l("MOVE_ANIMATION", 1);
        b = c6lVar2;
        c6l c6lVar3 = new c6l("SCROLL", 2);
        c = c6lVar3;
        c6l c6lVar4 = new c6l("SWIPE", 3);
        d = c6lVar4;
        e = new c6l[]{c6lVar, c6lVar2, c6lVar3, c6lVar4};
    }

    public static c6l valueOf(String str) {
        return (c6l) Enum.valueOf(c6l.class, str);
    }

    public static c6l[] values() {
        return (c6l[]) e.clone();
    }
}
