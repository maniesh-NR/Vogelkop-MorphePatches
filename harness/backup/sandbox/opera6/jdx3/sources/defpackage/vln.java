package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class vln {
    public static final vln a;
    public static final vln b;
    public static final vln c;
    public static final vln d;
    public static final vln e;
    public static final vln f;
    public static final /* synthetic */ vln[] g;

    static {
        vln vlnVar = new vln("APPEARANCE_SETTINGS", 0);
        a = vlnVar;
        vln vlnVar2 = new vln("CUSTOMIZE_HOME_PAGE", 1);
        b = vlnVar2;
        vln vlnVar3 = new vln("WALLPAPER_ONBOARDING", 2);
        c = vlnVar3;
        vln vlnVar4 = new vln("IN_APP", 3);
        d = vlnVar4;
        vln vlnVar5 = new vln("DEEP_LINK", 4);
        e = vlnVar5;
        vln vlnVar6 = new vln("WALLPAPER_LONGPRESS", 5);
        f = vlnVar6;
        g = new vln[]{vlnVar, vlnVar2, vlnVar3, vlnVar4, vlnVar5, vlnVar6};
    }

    public static vln valueOf(String str) {
        return (vln) Enum.valueOf(vln.class, str);
    }

    public static vln[] values() {
        return (vln[]) g.clone();
    }
}
