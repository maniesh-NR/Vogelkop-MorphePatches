package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* loaded from: classes.dex */
public final class mi8 implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final /* synthetic */ qi8 a;

    public mi8(qi8 qi8Var) {
        this.a = qi8Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = new Surface(surfaceTexture);
        qi8 qi8Var = this.a;
        qi8Var.R0(surface);
        qi8Var.V = surface;
        qi8Var.L0(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        qi8 qi8Var = this.a;
        qi8Var.R0(null);
        qi8Var.L0(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.a.L0(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.a.L0(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        qi8 qi8Var = this.a;
        if (qi8Var.Y) {
            qi8Var.R0(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        qi8 qi8Var = this.a;
        if (qi8Var.Y) {
            qi8Var.R0(null);
        }
        qi8Var.L0(0, 0);
    }
}
