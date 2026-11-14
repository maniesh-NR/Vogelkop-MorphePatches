package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c8j {
    public static final c8j a;
    public static final c8j b;
    public static final c8j c;
    public static final c8j d;
    public static final c8j e;
    public static final /* synthetic */ c8j[] f;

    static {
        c8j c8jVar = new c8j("SETTINGS", 0);
        a = c8jVar;
        c8j c8jVar2 = new c8j("SETTINGS_SEARCH", 1);
        b = c8jVar2;
        c8j c8jVar3 = new c8j("CUSTOMIZE_HOME_PAGE", 2);
        c = c8jVar3;
        c8j c8jVar4 = new c8j("WALLPAPER_DIALOG", 3);
        d = c8jVar4;
        c8j c8jVar5 = new c8j("DEEP_LINK", 4);
        e = c8jVar5;
        f = new c8j[]{c8jVar, c8jVar2, c8jVar3, c8jVar4, c8jVar5};
    }

    public static c8j valueOf(String str) {
        return (c8j) Enum.valueOf(c8j.class, str);
    }

    public static c8j[] values() {
        return (c8j[]) f.clone();
    }
}
