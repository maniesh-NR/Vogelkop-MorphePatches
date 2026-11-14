package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class an7 extends lgf {
    public int n = -1;
    public int o = -1;
    public final pad p;
    public final pad q;

    public an7(pad padVar, pad padVar2) {
        this.p = padVar;
        this.q = padVar2;
    }

    @Override // defpackage.lgf
    public final pn2 e(ip7 ip7Var) {
        Map map = Collections.EMPTY_MAP;
        pn2 pn2VarE = super.e(ip7Var);
        this.n = rs9.g();
        this.o = rs9.g();
        return pn2VarE;
    }

    public final void m(long j, Surface surface, vtk vtkVar, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
        rs9.d((AtomicBoolean) this.b, true);
        rs9.c((Thread) this.d);
        HashMap map = (HashMap) this.c;
        jpo.n("The surface is not registered.", map.containsKey(surface));
        do2 do2VarB = (do2) map.get(surface);
        Objects.requireNonNull(do2VarB);
        if (do2VarB == rs9.j) {
            do2VarB = b(surface);
            if (do2VarB == null) {
                return;
            } else {
                map.put(surface, do2VarB);
            }
        }
        do2 do2Var = do2VarB;
        EGLSurface eGLSurface = do2Var.a;
        if (surface != ((Surface) this.j)) {
            f(eGLSurface);
            this.j = surface;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        n(do2Var, vtkVar, surfaceTexture, this.p, this.n, true);
        n(do2Var, vtkVar, surfaceTexture2, this.q, this.o, false);
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.e, eGLSurface, j);
        if (EGL14.eglSwapBuffers((EGLDisplay) this.e, eGLSurface)) {
            return;
        }
        EGL14.eglGetError();
        i(surface, false);
    }

    public final void n(do2 do2Var, vtk vtkVar, SurfaceTexture surfaceTexture, pad padVar, int i, boolean z) {
        l(i);
        int i2 = do2Var.b;
        int i3 = do2Var.c;
        GLES20.glViewport(0, 0, i2, i3);
        GLES20.glScissor(0, 0, i2, i3);
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        Matrix.multiplyMM(fArr2, 0, fArr, 0, z ? vtkVar.e : vtkVar.f, 0);
        ps9 ps9Var = (ps9) this.l;
        ps9Var.getClass();
        if (ps9Var instanceof qs9) {
            GLES20.glUniformMatrix4fv(((qs9) ps9Var).f, 1, false, fArr2, 0);
            rs9.b("glUniformMatrix4fv");
        }
        lyf lyfVar = (lyf) padVar.c;
        Size size = new Size((int) (((Float) lyfVar.a).floatValue() * i2), (int) (((Float) lyfVar.b).floatValue() * i3));
        Size size2 = new Size(i2, i3);
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        float[] fArr5 = new float[16];
        Matrix.setIdentityM(fArr5, 0);
        Matrix.scaleM(fArr3, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        lyf lyfVar2 = (lyf) padVar.b;
        if (((Float) lyfVar.a).floatValue() != 0.0f || ((Float) lyfVar.b).floatValue() != 0.0f) {
            Matrix.translateM(fArr4, 0, ((Float) lyfVar2.a).floatValue() / ((Float) lyfVar.a).floatValue(), ((Float) lyfVar2.b).floatValue() / ((Float) lyfVar.b).floatValue(), 0.0f);
        }
        Matrix.multiplyMM(fArr5, 0, fArr3, 0, fArr4, 0);
        GLES20.glUniformMatrix4fv(ps9Var.b, 1, false, fArr5, 0);
        rs9.b("glUniformMatrix4fv");
        GLES20.glUniform1f(ps9Var.c, 1.0f);
        rs9.b("glUniform1f");
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        rs9.b("glDrawArrays");
        GLES20.glDisable(3042);
    }
}
