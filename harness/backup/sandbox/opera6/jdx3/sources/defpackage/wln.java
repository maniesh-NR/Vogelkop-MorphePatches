package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class wln {
    public static final wln a;
    public static final wln b;
    public static final wln c;
    public static final wln d;
    public static final wln e;
    public static final wln f;
    public static final wln g;
    public static final wln h;
    public static final /* synthetic */ wln[] i;

    static {
        wln wlnVar = new wln("WALLPAPER_GALLERY", 0);
        a = wlnVar;
        wln wlnVar2 = new wln("CUSTOMIZE_HOME_PAGE", 1);
        b = wlnVar2;
        wln wlnVar3 = new wln("WALLPAPER_LONGPRESS", 2);
        c = wlnVar3;
        wln wlnVar4 = new wln("IMAGE_MENU_SHEET", 3);
        d = wlnVar4;
        wln wlnVar5 = new wln("FAVORITES_GALLERY", 4);
        e = wlnVar5;
        wln wlnVar6 = new wln("MY_PHOTOS_GALLERY", 5);
        f = wlnVar6;
        wln wlnVar7 = new wln("STORE", 6);
        g = wlnVar7;
        wln wlnVar8 = new wln("ARIA_IMAGE_MENU_SHEET", 7);
        h = wlnVar8;
        i = new wln[]{wlnVar, wlnVar2, wlnVar3, wlnVar4, wlnVar5, wlnVar6, wlnVar7, wlnVar8};
    }

    public static wln valueOf(String str) {
        return (wln) Enum.valueOf(wln.class, str);
    }

    public static wln[] values() {
        return (wln[]) i.clone();
    }
}
