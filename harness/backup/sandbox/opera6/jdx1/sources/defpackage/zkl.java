package defpackage;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zkl implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ all a;

    public zkl(all allVar) {
        this.a = allVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        all allVar = this.a;
        allVar.f = surfaceTexture;
        if (allVar.g == null) {
            allVar.q();
            return;
        }
        allVar.h.getClass();
        Objects.toString(allVar.h);
        allVar.h.m.a();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        all allVar = this.a;
        allVar.f = null;
        o94 o94Var = allVar.g;
        if (o94Var == null) {
            return true;
        }
        wci wciVar = new wci(this, surfaceTexture);
        o94Var.addListener(new wr9(o94Var, wciVar, (byte) 0), allVar.e.getContext().getMainExecutor());
        allVar.j = surfaceTexture;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        l94 l94Var = (l94) this.a.k.getAndSet(null);
        if (l94Var != null) {
            l94Var.b(null);
        }
    }
}
