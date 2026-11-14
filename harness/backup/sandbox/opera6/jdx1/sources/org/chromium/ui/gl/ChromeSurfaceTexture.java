package org.chromium.ui.gl;

import android.graphics.SurfaceTexture;

/* loaded from: classes.dex */
public class ChromeSurfaceTexture extends SurfaceTexture {
    public ChromeSurfaceTexture(int i) {
        super(i);
    }

    public final void destroy() {
        release();
    }
}
