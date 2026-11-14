package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a28 {
    public final MediaCodec a;
    public final int b;
    public final ByteBuffer c;
    public final o94 d;
    public final l94 e;
    public final AtomicBoolean f = new AtomicBoolean(false);
    public long g = 0;
    public boolean h = false;
    public final /* synthetic */ f28 i;

    public a28(f28 f28Var, MediaCodec mediaCodec, int i) {
        this.i = f28Var;
        mediaCodec.getClass();
        this.a = mediaCodec;
        jpo.l(i);
        this.b = i;
        this.c = mediaCodec.getInputBuffer(i);
        AtomicReference atomicReference = new AtomicReference();
        l94 l94Var = new l94();
        l94Var.c = new byh();
        o94 o94Var = new o94(l94Var);
        l94Var.b = o94Var;
        l94Var.a = vep.class;
        try {
            atomicReference.set(l94Var);
            l94Var.a = "Terminate InputBuffer";
        } catch (Exception e) {
            o94Var.a(e);
        }
        this.d = o94Var;
        l94 l94Var2 = (l94) atomicReference.get();
        l94Var2.getClass();
        this.e = l94Var2;
    }
}
