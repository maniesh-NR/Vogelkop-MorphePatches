package defpackage;

import android.util.Size;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class euk extends n1f {
    public SurfaceView e;
    public final duk f;

    public euk(FrameLayout frameLayout, ywg ywgVar) {
        super(frameLayout, ywgVar);
        this.f = new duk(this);
    }

    @Override // defpackage.n1f
    public final View c() {
        return this.e;
    }

    @Override // defpackage.n1f
    public final void j(buk bukVar, a32 a32Var) {
        SurfaceView surfaceView = this.e;
        boolean zEquals = Objects.equals((Size) this.b, bukVar.b);
        if (surfaceView == null || !zEquals) {
            Size size = bukVar.b;
            this.b = size;
            FrameLayout frameLayout = (FrameLayout) this.c;
            size.getClass();
            SurfaceView surfaceView2 = new SurfaceView(frameLayout.getContext());
            this.e = surfaceView2;
            surfaceView2.setLayoutParams(new FrameLayout.LayoutParams(((Size) this.b).getWidth(), ((Size) this.b).getHeight()));
            frameLayout.removeAllViews();
            frameLayout.addView(this.e);
            this.e.getHolder().addCallback(this.f);
        }
        Executor mainExecutor = this.e.getContext().getMainExecutor();
        bukVar.l.a(new qlk(a32Var, (byte) 9), mainExecutor);
        this.e.post(new jbd(this, bukVar, a32Var, (byte) 20));
    }
}
