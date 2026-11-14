package defpackage;

/* loaded from: classes.dex */
public final class pgd extends Exception {
    public final String a;
    public final boolean b;
    public final ogd c;
    public final String d;

    public pgd(String str, Throwable th, String str2, boolean z, ogd ogdVar, String str3) {
        super(str, th);
        this.a = str2;
        this.b = z;
        this.c = ogdVar;
        this.d = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public pgd(oj9 oj9Var, tgd tgdVar, boolean z, int i) {
        String str = "Decoder init failed: [" + i + "], " + oj9Var;
        String str2 = oj9Var.n;
        StringBuilder sbR = p3p.r("androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_", i < 0 ? "neg_" : "");
        sbR.append(Math.abs(i));
        this(str, tgdVar, str2, z, null, sbR.toString());
    }
}
