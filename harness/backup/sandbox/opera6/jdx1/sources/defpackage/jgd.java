package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public interface jgd {
    void a(int i, d36 d36Var, long j, int i2);

    void b(Bundle bundle);

    void c(int i, int i2, int i3, long j);

    MediaFormat d();

    void e();

    ByteBuffer f(int i);

    void flush();

    void g(Surface surface);

    void h(int i);

    void i(int i, long j);

    int j();

    int k(MediaCodec.BufferInfo bufferInfo);

    default boolean l(qfb qfbVar) {
        return false;
    }

    default void m(zr9 zr9Var) {
        zr9Var.run();
    }

    ByteBuffer n(int i);

    void o(ArrayList arrayList);

    void p(bhd bhdVar, Handler handler);

    void q(ArrayList arrayList);

    void release();

    void setVideoScalingMode(int i);
}
