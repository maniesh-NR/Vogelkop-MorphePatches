package defpackage;

/* loaded from: classes.dex */
public final class j3n implements qsm, hya, cml {
    public static final an2 b = new an2("camerax.video.VideoCapture.videoOutput", k4n.class, null);
    public static final an2 c = new an2("camerax.video.VideoCapture.videoEncoderInfoFinder", v3n.class, null);
    public static final an2 d = new an2("camerax.video.VideoCapture.forceEnableSurfaceProcessing", Boolean.class, null);
    public final wrf a;

    public j3n(wrf wrfVar) {
        jpo.j(wrfVar.a.containsKey(b));
        this.a = wrfVar;
    }

    @Override // defpackage.skh
    public final tj5 a() {
        return this.a;
    }

    @Override // defpackage.txa
    public final int m() {
        return 34;
    }
}
