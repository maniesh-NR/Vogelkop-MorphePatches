package defpackage;

import android.media.MediaCodec;

/* loaded from: classes.dex */
public final class d36 {
    public byte[] a;
    public byte[] b;
    public byte c;
    public int[] d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    public final MediaCodec.CryptoInfo i;
    public final i16 j;

    public d36() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.i = cryptoInfo;
        this.j = new i16(cryptoInfo);
    }
}
