package defpackage;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* loaded from: classes.dex */
public final class fid implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final /* synthetic */ gid a;

    public fid(gid gidVar) {
        this.a = gidVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        gid gidVar = this.a;
        TextureView textureView = gidVar.B;
        if (textureView == null || textureView.getSurfaceTexture() != surfaceTexture) {
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        gidVar.z = surface;
        gidVar.N(surface, i, i2);
        gidVar.B(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        gid gidVar = this.a;
        TextureView textureView = gidVar.B;
        if (textureView != null && textureView.getSurfaceTexture() == surfaceTexture) {
            gidVar.z = null;
            gidVar.N(null, 0, 0);
            gidVar.B(0, 0);
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        gid gidVar = this.a;
        TextureView textureView = gidVar.B;
        if (textureView != null && textureView.getSurfaceTexture() == surfaceTexture && gidVar.r()) {
            m4j m4jVar = gidVar.n;
            m4jVar.getClass();
            if (m4jVar.a.c >= 8) {
                gidVar.h(new eid(this, i, i2, (byte) 1));
            }
            gidVar.B(i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        gid gidVar = this.a;
        if (gidVar.A == surfaceHolder && gidVar.r()) {
            m4j m4jVar = gidVar.n;
            m4jVar.getClass();
            if (m4jVar.a.c >= 8) {
                gidVar.h(new eid(this, i2, i3, (byte) 0));
            }
            gidVar.B(i2, i3);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        gid gidVar = this.a;
        if (gidVar.A != surfaceHolder) {
            return;
        }
        gidVar.z = surfaceHolder.getSurface();
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        gidVar.N(gidVar.z, surfaceFrame.width(), surfaceFrame.height());
        gidVar.B(surfaceFrame.width(), surfaceFrame.height());
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        gid gidVar = this.a;
        if (gidVar.A != surfaceHolder) {
            return;
        }
        gidVar.z = null;
        gidVar.N(null, 0, 0);
        gidVar.B(0, 0);
    }
}
