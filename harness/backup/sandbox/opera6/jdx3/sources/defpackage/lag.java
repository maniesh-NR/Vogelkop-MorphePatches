package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class lag {
    public static final lag a;
    public static final lag b;
    public static final lag c;
    public static final lag d;
    public static final lag e;
    public static final lag f;
    public static final lag g;
    public static final lag h;
    public static final lag i;
    public static final /* synthetic */ lag[] j;

    static {
        lag lagVar = new lag("INVALID", 0);
        a = lagVar;
        lag lagVar2 = new lag("NOTIFICATIONS", 1);
        b = lagVar2;
        lag lagVar3 = new lag("GEOLOCATION", 2);
        c = lagVar3;
        lag lagVar4 = new lag("PROTECTED_MEDIA_IDENTIFIER", 3);
        d = lagVar4;
        lag lagVar5 = new lag("AUDIO_CAPTURE", 4);
        e = lagVar5;
        lag lagVar6 = new lag("VIDEO_CAPTURE", 5);
        f = lagVar6;
        lag lagVar7 = new lag("EXTERNAL_APPS", 6);
        g = lagVar7;
        lag lagVar8 = new lag("AUTOMATIC_DOWNLOADS", 7);
        h = lagVar8;
        lag lagVar9 = new lag("LOCAL_NETWORK", 8);
        i = lagVar9;
        j = new lag[]{lagVar, lagVar2, lagVar3, lagVar4, lagVar5, lagVar6, lagVar7, lagVar8, lagVar9};
    }

    public static lag d(int i2) {
        return i2 != 3 ? i2 != 4 ? i2 != 5 ? i2 != 8 ? i2 != 9 ? i2 != 44 ? i2 != 47 ? i2 != 48 ? a : h : g : i : f : e : d : c : b;
    }

    public static lag valueOf(String str) {
        return (lag) Enum.valueOf(lag.class, str);
    }

    public static lag[] values() {
        return (lag[]) j.clone();
    }
}
