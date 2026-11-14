package defpackage;

import java.util.Locale;

/* loaded from: classes.dex */
public final class nj6 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public int l;

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.e;
        int i6 = this.f;
        int i7 = this.g;
        int i8 = this.h;
        int i9 = this.i;
        int i10 = this.j;
        long j = this.k;
        int i11 = this.l;
        String str = tym.a;
        Locale locale = Locale.US;
        StringBuilder sbO = sko.o(i, i2, "DecoderCounters {\n decoderInits=", ",\n decoderReleases=", "\n queuedInputBuffers=");
        sko.r(i3, i4, "\n skippedInputBuffers=", "\n renderedOutputBuffers=", sbO);
        sko.r(i5, i6, "\n skippedOutputBuffers=", "\n droppedBuffers=", sbO);
        sko.r(i7, i8, "\n droppedInputBuffers=", "\n maxConsecutiveDroppedBuffers=", sbO);
        sko.r(i9, i10, "\n droppedToKeyframeEvents=", "\n totalVideoFrameProcessingOffsetUs=", sbO);
        sbO.append(j);
        sbO.append("\n videoFrameProcessingOffsetCount=");
        sbO.append(i11);
        sbO.append("\n}");
        return sbO.toString();
    }
}
