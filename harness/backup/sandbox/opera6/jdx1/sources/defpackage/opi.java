package defpackage;

/* loaded from: classes.dex */
public final class opi implements toi {
    public final /* synthetic */ spi a;
    public final /* synthetic */ qpi b;

    public opi(spi spiVar, qpi qpiVar) {
        this.a = spiVar;
        this.b = qpiVar;
    }

    @Override // defpackage.toi
    public final float a(float f) {
        float fAbs = Math.abs(f);
        spi spiVar = this.a;
        if (fAbs != 0.0f && !((Boolean) spiVar.h.invoke()).booleanValue()) {
            throw new j89("The fling animation was cancelled", (byte) 0);
        }
        return spiVar.e(spiVar.h(this.b.a(2, spiVar.f(spiVar.i(f)))));
    }
}
