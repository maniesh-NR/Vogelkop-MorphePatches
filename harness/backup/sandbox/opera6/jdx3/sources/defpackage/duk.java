package defpackage;

import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.util.Objects;

/* loaded from: classes.dex */
public final class duk implements SurfaceHolder.Callback {
    public Size a;
    public buk b;
    public buk c;
    public a32 d;
    public Size e;
    public boolean f = false;
    public boolean g = false;
    public final /* synthetic */ euk h;

    public duk(euk eukVar) {
        this.h = eukVar;
    }

    public final boolean a() {
        euk eukVar = this.h;
        Surface surface = eukVar.e.getHolder().getSurface();
        if (this.f || this.b == null || !Objects.equals(this.a, this.e)) {
            return false;
        }
        a32 a32Var = this.d;
        buk bukVar = this.b;
        Objects.requireNonNull(bukVar);
        bukVar.a(surface, eukVar.e.getContext().getMainExecutor(), new ip1(a32Var, (byte) 8));
        this.f = true;
        eukVar.a = true;
        eukVar.k();
        return true;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.e = new Size(i2, i3);
        a();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        buk bukVar;
        if (!this.g || (bukVar = this.c) == null) {
            return;
        }
        bukVar.c();
        bukVar.k.b((Object) null);
        this.c = null;
        this.g = false;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        a32 a32Var;
        boolean z = this.f;
        buk bukVar = this.b;
        if (z) {
            if (bukVar != null) {
                Objects.toString(bukVar);
                this.b.m.a();
            }
        } else if (bukVar != null) {
            Objects.toString(bukVar);
            if (this.b.c() && (a32Var = this.d) != null) {
                a32Var.k();
            }
        }
        this.g = true;
        buk bukVar2 = this.b;
        if (bukVar2 != null) {
            this.c = bukVar2;
        }
        this.f = false;
        this.b = null;
        this.d = null;
        this.e = null;
        this.a = null;
    }
}
