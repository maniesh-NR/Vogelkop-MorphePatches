package defpackage;

import android.content.Context;
import android.opengl.GLSurfaceView;

/* loaded from: classes.dex */
public final class r3n extends GLSurfaceView {
    public static final /* synthetic */ int a = 0;

    public r3n(Context context) {
        super(context, null);
        q3n q3nVar = new q3n(this);
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(q3nVar);
        setRenderMode(0);
    }
}
