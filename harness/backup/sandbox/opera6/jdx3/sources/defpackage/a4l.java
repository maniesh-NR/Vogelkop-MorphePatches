package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a4l {
    public static final a4l a;
    public static final a4l b;
    public static final a4l c;
    public static final a4l d;
    public static final /* synthetic */ a4l[] e;

    static {
        a4l a4lVar = new a4l("UPGRADE_DIALOG", 0);
        a = a4lVar;
        a4l a4lVar2 = new a4l("TAB_GALLERY_MENU", 1);
        b = a4lVar2;
        a4l a4lVar3 = new a4l("NONE", 2);
        c = a4lVar3;
        a4l a4lVar4 = new a4l("RESUME_BUBBLE_TOUR", 3);
        d = a4lVar4;
        e = new a4l[]{a4lVar, a4lVar2, a4lVar3, a4lVar4};
    }

    public static a4l valueOf(String str) {
        return (a4l) Enum.valueOf(a4l.class, str);
    }

    public static a4l[] values() {
        return (a4l[]) e.clone();
    }
}
