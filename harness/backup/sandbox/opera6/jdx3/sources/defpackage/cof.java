package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class cof {
    public static final /* synthetic */ cof[] d;
    public static final /* synthetic */ h58 e;
    public final int a;
    public final int b;
    public final String c;

    static {
        cof[] cofVarArr = {new cof("FACEBOOK", 0, 2131231880, 2132019003, "https://www.facebook.com/Opera/"), new cof("TWITTER", 1, 2131232564, 2132019782, "https://twitter.com/opera"), new cof("INSTAGRAM", 2, 2131231908, 2132019780, "https://www.instagram.com/opera/")};
        d = cofVarArr;
        e = new h58(cofVarArr);
    }

    public cof(String str, int i, int i2, int i3, String str2) {
        this.a = i2;
        this.b = i3;
        this.c = str2;
    }

    public static cof valueOf(String str) {
        return (cof) Enum.valueOf(cof.class, str);
    }

    public static cof[] values() {
        return (cof[]) d.clone();
    }
}
