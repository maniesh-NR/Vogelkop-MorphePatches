package defpackage;

import android.media.MediaCodecInfo;
import android.util.Range;

/* loaded from: classes.dex */
public final class w3n extends n1 implements u3n {
    public static final v3n d = new v3n();
    public final MediaCodecInfo.VideoCapabilities c;

    public w3n(MediaCodecInfo mediaCodecInfo, String str) {
        super(mediaCodecInfo, str);
        this.c = ((MediaCodecInfo.CodecCapabilities) ((n1) this).b).getVideoCapabilities();
    }

    @Override // defpackage.u3n
    public final Range C() {
        return this.c.getSupportedWidths();
    }

    @Override // defpackage.u3n
    public final Range E() {
        return this.c.getSupportedHeights();
    }

    @Override // defpackage.u3n
    public final boolean f() {
        return true;
    }

    @Override // defpackage.u3n
    public final Range g(int i) {
        try {
            return this.c.getSupportedWidthsFor(i);
        } finally {
        }
    }

    @Override // defpackage.u3n
    public final int h() {
        return this.c.getHeightAlignment();
    }

    @Override // defpackage.u3n
    public final boolean i(int i, int i2) {
        return this.c.isSizeSupported(i, i2);
    }

    @Override // defpackage.u3n
    public final int q() {
        return this.c.getWidthAlignment();
    }

    @Override // defpackage.u3n
    public final Range r() {
        return this.c.getBitrateRange();
    }

    @Override // defpackage.u3n
    public final Range z(int i) {
        try {
            return this.c.getSupportedHeightsFor(i);
        } finally {
        }
    }
}
