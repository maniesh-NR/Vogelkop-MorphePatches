package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import java.nio.Buffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes.dex */
public final class f0k implements GLSurfaceView.Renderer, isf {
    public final mmi a;
    public final float[] d;
    public final float[] e;
    public final float[] f;
    public float g;
    public float h;
    public final /* synthetic */ g0k k;
    public final float[] b = new float[16];
    public final float[] c = new float[16];
    public final float[] i = new float[16];
    public final float[] j = new float[16];

    public f0k(g0k g0kVar, mmi mmiVar) {
        this.k = g0kVar;
        float[] fArr = new float[16];
        this.d = fArr;
        float[] fArr2 = new float[16];
        this.e = fArr2;
        float[] fArr3 = new float[16];
        this.f = fArr3;
        this.a = mmiVar;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.h = 3.1415927f;
    }

    @Override // defpackage.isf
    public final synchronized void a(float[] fArr, float f) {
        float[] fArr2 = this.d;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        float f2 = -f;
        this.h = f2;
        Matrix.setRotateM(this.e, 0, -this.g, (float) Math.cos(f2), (float) Math.sin(this.h), 0.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        Object objM;
        synchronized (this) {
            Matrix.multiplyMM(this.j, 0, this.d, 0, this.f, 0);
            Matrix.multiplyMM(this.i, 0, this.e, 0, this.j, 0);
        }
        Matrix.multiplyMM(this.c, 0, this.b, 0, this.i, 0);
        mmi mmiVar = this.a;
        float[] fArr = this.c;
        GLES20.glClear(16384);
        try {
            fr3.p();
        } catch (qy9 e) {
            w7d.r("Failed to draw a frame", e);
        }
        if (mmiVar.a.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = mmiVar.j;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                fr3.p();
            } catch (qy9 e2) {
                w7d.r("Failed to draw a frame", e2);
            }
            if (mmiVar.b.compareAndSet(true, false)) {
                Matrix.setIdentityM(mmiVar.g, 0);
            }
            long timestamp = mmiVar.j.getTimestamp();
            i1 i1Var = mmiVar.e;
            synchronized (i1Var) {
                objM = i1Var.M(timestamp, false);
            }
            Long l = (Long) objM;
            if (l != null) {
                tn tnVar = mmiVar.d;
                float[] fArr2 = mmiVar.g;
                float[] fArr3 = (float[]) ((i1) tnVar.d).O(l.longValue());
                if (fArr3 != null) {
                    float[] fArr4 = (float[]) tnVar.c;
                    float f = fArr3[0];
                    float f2 = -fArr3[1];
                    float f3 = -fArr3[2];
                    float length = Matrix.length(f, f2, f3);
                    if (length != 0.0f) {
                        Matrix.setRotateM(fArr4, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
                    } else {
                        Matrix.setIdentityM(fArr4, 0);
                    }
                    if (!tnVar.a) {
                        tn.r((float[]) tnVar.b, (float[]) tnVar.c);
                        tnVar.a = true;
                    }
                    Matrix.multiplyMM(fArr2, 0, (float[]) tnVar.b, 0, (float[]) tnVar.c, 0);
                }
            }
            l5h l5hVar = (l5h) mmiVar.f.O(timestamp);
            if (l5hVar != null) {
                n5h n5hVar = mmiVar.c;
                if (n5h.c(l5hVar)) {
                    n5hVar.a = l5hVar.c;
                    i1 i1Var2 = l5hVar.a.a[0];
                    fl5 fl5Var = new fl5();
                    float[] fArr5 = (float[]) i1Var2.d;
                    fl5Var.a = fArr5.length / 3;
                    fl5Var.c = fr3.z(fArr5);
                    fl5Var.d = fr3.z((float[]) i1Var2.e);
                    int i = i1Var2.c;
                    if (i == 1) {
                        fl5Var.b = (byte) 5;
                    } else if (i != 2) {
                        fl5Var.b = (byte) 4;
                    } else {
                        fl5Var.b = (byte) 6;
                    }
                    n5hVar.g = fl5Var;
                    if (!l5hVar.d) {
                        i1 i1Var3 = l5hVar.b.a[0];
                        fr3.z((float[]) i1Var3.d);
                        fr3.z((float[]) i1Var3.e);
                    }
                }
            }
        }
        Matrix.multiplyMM(mmiVar.h, 0, fArr, 0, mmiVar.g, 0);
        n5h n5hVar2 = mmiVar.c;
        int i2 = mmiVar.i;
        float[] fArr6 = mmiVar.h;
        fl5 fl5Var2 = (fl5) n5hVar2.g;
        if (fl5Var2 != null) {
            int i3 = n5hVar2.a;
            GLES20.glUniformMatrix3fv(n5hVar2.c, 1, false, i3 == 1 ? n5h.j : i3 == 2 ? n5h.k : n5h.i, 0);
            GLES20.glUniformMatrix4fv(n5hVar2.b, 1, false, fArr6, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i2);
            GLES20.glUniform1i(n5hVar2.f, 0);
            try {
                fr3.p();
            } catch (qy9 e3) {
                w7d.r("Failed to bind uniforms", e3);
            }
            GLES20.glVertexAttribPointer(n5hVar2.d, 3, 5126, false, 12, (Buffer) fl5Var2.c);
            try {
                fr3.p();
            } catch (qy9 e4) {
                w7d.r("Failed to load position data", e4);
            }
            GLES20.glVertexAttribPointer(n5hVar2.e, 2, 5126, false, 8, (Buffer) fl5Var2.d);
            try {
                fr3.p();
            } catch (qy9 e5) {
                w7d.r("Failed to load texture data", e5);
            }
            GLES20.glDrawArrays(fl5Var2.b, 0, fl5Var2.a);
            try {
                fr3.p();
            } catch (qy9 e6) {
                w7d.r("Failed to render", e6);
            }
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
        float f = i / i2;
        Matrix.perspectiveM(this.b, 0, f > 1.0f ? (float) (Math.toDegrees(Math.atan(0.9999999999999999d / f)) * 2.0d) : 90.0f, f, 0.1f, 100.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        g0k g0kVar = this.k;
        SurfaceTexture surfaceTextureD = this.a.d();
        int i = g0k.l;
        g0kVar.e.post(new jri(g0kVar, surfaceTextureD, (byte) 12));
    }
}
