package defpackage;

import android.graphics.RectF;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import java.io.Closeable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class vtk implements Closeable {
    public final Surface b;
    public final short c;
    public final Size d;
    public final float[] e;
    public final float[] f;
    public qp5 g;
    public g7a h;
    public final o94 k;
    public final l94 l;
    public final Object a = new Object();
    public boolean i = false;
    public boolean j = false;

    /* JADX WARN: Multi-variable type inference failed */
    public vtk(Surface surface, int i, Size size, uo2 uo2Var, uo2 uo2Var2) {
        float[] fArr = new float[16];
        this.e = fArr;
        float[] fArr2 = new float[16];
        this.f = fArr2;
        this.b = surface;
        this.c = i;
        this.d = size;
        h(fArr, new float[16], uo2Var);
        h(fArr2, new float[16], uo2Var2);
        l94 l94Var = new l94();
        l94Var.c = new byh();
        o94 o94Var = new o94(l94Var);
        l94Var.b = o94Var;
        try {
            this.l = l94Var;
            l94Var.a = "SurfaceOutputImpl close future complete";
        } catch (Exception e) {
            o94Var.a(e);
        }
        this.k = o94Var;
    }

    public static void h(float[] fArr, float[] fArr2, uo2 uo2Var) {
        Matrix.setIdentityM(fArr, 0);
        if (uo2Var == null) {
            return;
        }
        Size size = uo2Var.a;
        boolean z = uo2Var.e;
        int i = uo2Var.d;
        ui6.W(fArr);
        ui6.V(fArr, i);
        if (z) {
            Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        android.graphics.Matrix matrixA = d2m.a(d2m.i(size), d2m.i(d2m.h(i, size)), i, z);
        RectF rectF = new RectF(uo2Var.b);
        matrixA.mapRect(rectF);
        float width = rectF.left / r7.getWidth();
        float height = ((r7.getHeight() - rectF.height()) - rectF.top) / r7.getHeight();
        float fWidth = rectF.width() / r7.getWidth();
        float fHeight = rectF.height() / r7.getHeight();
        Matrix.translateM(fArr, 0, width, height, 0.0f);
        Matrix.scaleM(fArr, 0, fWidth, fHeight, 1.0f);
        zd4 zd4Var = uo2Var.c;
        Matrix.setIdentityM(fArr2, 0);
        ui6.W(fArr2);
        if (zd4Var != null) {
            jpo.n("Camera has no transform.", zd4Var.p());
            ui6.V(fArr2, zd4Var.a().c());
            if (zd4Var.h()) {
                Matrix.translateM(fArr2, 0, 1.0f, 0.0f, 0.0f);
                Matrix.scaleM(fArr2, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        Matrix.invertM(fArr2, 0, fArr2, 0);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.a) {
            if (!this.j) {
                this.j = true;
            }
        }
        this.l.b(null);
    }

    public final Surface k(g7a g7aVar, qp5 qp5Var) {
        boolean z;
        synchronized (this.a) {
            this.h = g7aVar;
            this.g = qp5Var;
            z = this.i;
        }
        if (z) {
            l();
        }
        return this.b;
    }

    public final void l() {
        g7a g7aVar;
        qp5 qp5Var;
        AtomicReference atomicReference = new AtomicReference();
        synchronized (this.a) {
            if (this.h == null || (qp5Var = this.g) == null) {
                this.i = true;
            } else if (!this.j) {
                atomicReference.set(qp5Var);
                g7aVar = this.h;
                this.i = false;
            }
            g7aVar = null;
        }
        if (g7aVar != null) {
            try {
                g7aVar.execute(new jri(this, atomicReference, (byte) 19));
            } catch (RejectedExecutionException unused) {
            }
        }
    }
}
