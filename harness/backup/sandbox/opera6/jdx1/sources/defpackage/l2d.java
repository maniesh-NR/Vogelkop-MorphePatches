package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class l2d {
    public static final l2d a;
    public static final l2d b;
    public static final l2d c;
    public static final l2d d;
    public static final l2d e;
    public static final l2d f;
    public static final /* synthetic */ l2d[] g;

    static {
        l2d l2dVar = new l2d("SET_ANIMATION", 0);
        a = l2dVar;
        l2d l2dVar2 = new l2d("SET_PROGRESS", 1);
        b = l2dVar2;
        l2d l2dVar3 = new l2d("SET_REPEAT_MODE", 2);
        c = l2dVar3;
        l2d l2dVar4 = new l2d("SET_REPEAT_COUNT", 3);
        d = l2dVar4;
        l2d l2dVar5 = new l2d("SET_IMAGE_ASSETS", 4);
        e = l2dVar5;
        l2d l2dVar6 = new l2d("PLAY_OPTION", 5);
        f = l2dVar6;
        g = new l2d[]{l2dVar, l2dVar2, l2dVar3, l2dVar4, l2dVar5, l2dVar6};
    }

    public static l2d valueOf(String str) {
        return (l2d) Enum.valueOf(l2d.class, str);
    }

    public static l2d[] values() {
        return (l2d[]) g.clone();
    }
}
