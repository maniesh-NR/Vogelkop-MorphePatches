package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f4l {
    public static final f4l a;
    public static final f4l b;
    public static final f4l c;
    public static final /* synthetic */ f4l[] d;

    static {
        f4l f4lVar = new f4l("GENERIC", 0);
        a = f4lVar;
        f4l f4lVar2 = new f4l("TAB_GALLERY_MENU", 1);
        b = f4lVar2;
        f4l f4lVar3 = new f4l("TAB_LIST_MOVEMENT", 2);
        c = f4lVar3;
        d = new f4l[]{f4lVar, f4lVar2, f4lVar3};
    }

    public static f4l valueOf(String str) {
        return (f4l) Enum.valueOf(f4l.class, str);
    }

    public static f4l[] values() {
        return (f4l[]) d.clone();
    }
}
