package defpackage;

/* loaded from: classes.dex */
public final class fwa implements qsm, hya, sjb {
    public static final an2 b;
    public static final an2 c;
    public static final an2 d;
    public static final an2 e;
    public static final an2 f;
    public static final an2 g;
    public static final an2 h;
    public static final an2 i;
    public static final an2 j;
    public static final an2 k;
    public final wrf a;

    static {
        Class cls = Integer.TYPE;
        b = new an2("camerax.core.imageCapture.captureMode", cls, null);
        c = new an2("camerax.core.imageCapture.flashMode", cls, null);
        d = new an2("camerax.core.imageCapture.captureBundle", zh4.class, null);
        e = new an2("camerax.core.imageCapture.bufferFormat", Integer.class, null);
        f = new an2("camerax.core.imageCapture.outputFormat", Integer.class, null);
        g = new an2("camerax.core.imageCapture.imageReaderProxyProvider", vya.class, null);
        h = new an2("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE, null);
        i = new an2("camerax.core.imageCapture.flashType", cls, null);
        new an2("camerax.core.imageCapture.jpegCompressionQuality", cls, null);
        j = new an2("camerax.core.imageCapture.screenFlash", cwa.class, null);
        k = new an2("camerax.core.useCase.isPostviewEnabled", Boolean.class, null);
    }

    public fwa(wrf wrfVar) {
        this.a = wrfVar;
    }

    @Override // defpackage.skh
    public final tj5 a() {
        return this.a;
    }

    @Override // defpackage.txa
    public final int m() {
        return ((Integer) i(txa.gp)).intValue();
    }
}
