package defpackage;

import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class all extends n1f {
    public TextureView e;
    public SurfaceTexture f;
    public o94 g;
    public buk h;
    public boolean i;
    public SurfaceTexture j;
    public AtomicReference k;
    public a32 l;

    public final View c() {
        return this.e;
    }

    public final void g() {
        if (!this.i || this.j == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.e.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.j;
        if (surfaceTexture != surfaceTexture2) {
            this.e.setSurfaceTexture(surfaceTexture2);
            this.j = null;
            this.i = false;
        }
    }

    public final void h() {
        this.i = true;
    }

    public final void j(buk bukVar, a32 a32Var) {
        a32 a32Var2;
        Size size = bukVar.b;
        ((n1f) this).b = size;
        FrameLayout frameLayout = (FrameLayout) ((n1f) this).c;
        size.getClass();
        TextureView textureView = new TextureView(frameLayout.getContext());
        this.e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(((Size) ((n1f) this).b).getWidth(), ((Size) ((n1f) this).b).getHeight()));
        this.e.setSurfaceTextureListener(new zkl(this));
        frameLayout.removeAllViews();
        frameLayout.addView(this.e);
        buk bukVar2 = this.h;
        if (bukVar2 != null && bukVar2.c() && (a32Var2 = this.l) != null) {
            a32Var2.k();
            this.l = null;
        }
        this.h = bukVar;
        this.l = a32Var;
        bukVar.l.a(new jri(this, bukVar, (byte) 24), this.e.getContext().getMainExecutor());
        q();
    }

    public final ListenableFuture p() {
        l94 l94Var = new l94();
        l94Var.c = new byh();
        o94 o94Var = new o94(l94Var);
        l94Var.b = o94Var;
        l94Var.a = vep.class;
        try {
            this.k.set(l94Var);
            l94Var.a = "textureViewImpl_waitForNextFrame";
            return o94Var;
        } catch (Exception e) {
            o94Var.a(e);
            return o94Var;
        }
    }

    public final void q() {
        SurfaceTexture surfaceTexture;
        Size size = (Size) ((n1f) this).b;
        if (size == null || (surfaceTexture = this.f) == null || this.h == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), ((Size) ((n1f) this).b).getHeight());
        Surface surface = new Surface(this.f);
        buk bukVar = this.h;
        o94 o94VarZ = k1g.z(new roj(this, surface, (byte) 5));
        this.g = o94VarZ;
        o94VarZ.b.addListener(new qn(this, surface, o94VarZ, bukVar, (byte) 21), this.e.getContext().getMainExecutor());
        ((n1f) this).a = true;
        k();
    }
}
