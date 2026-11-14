package defpackage;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class ow6 implements wtk, SurfaceTexture.OnFrameAvailableListener {
    public final lgf a;
    public final HandlerThread b;
    public final g7a c;
    public final Handler d;
    public final AtomicBoolean e;
    public final float[] f;
    public final float[] g;
    public final LinkedHashMap h;
    public int i;
    public boolean j;
    public final ArrayList k;

    public ow6(ip7 ip7Var) {
        Map map = Collections.EMPTY_MAP;
        this.e = new AtomicBoolean(false);
        this.f = new float[16];
        this.g = new float[16];
        this.h = new LinkedHashMap();
        this.i = 0;
        this.j = false;
        this.k = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.d = handler;
        this.c = new g7a(handler);
        this.a = new lgf();
        try {
            h(ip7Var);
        } catch (RuntimeException e) {
            release();
            throw e;
        }
    }

    public final ListenableFuture a(int i, int i2) {
        l94 l94Var = new l94();
        l94Var.c = new byh();
        o94 o94Var = new o94(l94Var);
        l94Var.b = o94Var;
        l94Var.a = vep.class;
        try {
            e(new fh4(this, new cn2(i, i2, l94Var), (byte) 24), new bl6(l94Var, (byte) 9));
            l94Var.a = "DefaultSurfaceProcessor#snapshot";
        } catch (Exception e) {
            o94Var.a(e);
        }
        return k1g.O(o94Var);
    }

    public final void b(vtk vtkVar) {
        if (this.e.get()) {
            vtkVar.close();
        } else {
            e(new fh4(this, vtkVar, (byte) 23), new bl6(vtkVar, (byte) 10));
        }
    }

    public final void c(buk bukVar) {
        if (this.e.get()) {
            bukVar.c();
        } else {
            e(new fh4(this, bukVar, (byte) 25), new mw6(bukVar, (byte) 0));
        }
    }

    public final void d() {
        if (this.j && this.i == 0) {
            LinkedHashMap linkedHashMap = this.h;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((vtk) it.next()).close();
            }
            ArrayList arrayList = this.k;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((cn2) obj).c.d(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            linkedHashMap.clear();
            lgf lgfVar = this.a;
            if (((AtomicBoolean) lgfVar.b).getAndSet(false)) {
                rs9.c((Thread) lgfVar.d);
                lgfVar.h();
            }
            this.b.quit();
        }
    }

    public final void e(Runnable runnable, Runnable runnable2) {
        try {
            this.c.execute(new gl6(this, runnable2, runnable, (byte) 6));
        } catch (RejectedExecutionException unused) {
            runnable2.run();
        }
    }

    public final void f(Exception exc) {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((cn2) obj).c.d(exc);
        }
        arrayList.clear();
    }

    public final Bitmap g(Size size, float[] fArr, int i) {
        float[] fArr2 = (float[]) fArr.clone();
        ui6.V(fArr2, i);
        ui6.W(fArr2);
        Size sizeH = d2m.h(i, size);
        lgf lgfVar = this.a;
        lgfVar.getClass();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect((sizeH.getHeight() * sizeH.getWidth()) << 2);
        jpo.i("ByteBuffer capacity is not equal to width * height * 4.", byteBufferAllocateDirect.capacity() == ((sizeH.getHeight() * sizeH.getWidth()) << 2));
        jpo.i("ByteBuffer is not direct.", byteBufferAllocateDirect.isDirect());
        int[] iArr = rs9.a;
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        rs9.b("glGenTextures");
        int i2 = iArr2[0];
        GLES20.glActiveTexture(33985);
        rs9.b("glActiveTexture");
        GLES20.glBindTexture(3553, i2);
        rs9.b("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, sizeH.getWidth(), sizeH.getHeight(), 0, 6407, 5121, null);
        rs9.b("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int[] iArr3 = new int[1];
        GLES20.glGenFramebuffers(1, iArr3, 0);
        rs9.b("glGenFramebuffers");
        int i3 = iArr3[0];
        GLES20.glBindFramebuffer(36160, i3);
        rs9.b("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i2, 0);
        rs9.b("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        rs9.b("glActiveTexture");
        GLES20.glBindTexture(36197, lgfVar.a);
        rs9.b("glBindTexture");
        lgfVar.j = null;
        GLES20.glViewport(0, 0, sizeH.getWidth(), sizeH.getHeight());
        GLES20.glScissor(0, 0, sizeH.getWidth(), sizeH.getHeight());
        ps9 ps9Var = (ps9) lgfVar.l;
        ps9Var.getClass();
        if (ps9Var instanceof qs9) {
            GLES20.glUniformMatrix4fv(((qs9) ps9Var).f, 1, false, fArr2, 0);
            rs9.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        rs9.b("glDrawArrays");
        GLES20.glReadPixels(0, 0, sizeH.getWidth(), sizeH.getHeight(), 6408, 5121, byteBufferAllocateDirect);
        rs9.b("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteTextures(1, new int[]{i2}, 0);
        rs9.b("glDeleteTextures");
        GLES20.glDeleteFramebuffers(1, new int[]{i3}, 0);
        rs9.b("glDeleteFramebuffers");
        int i4 = lgfVar.a;
        GLES20.glActiveTexture(33984);
        rs9.b("glActiveTexture");
        GLES20.glBindTexture(36197, i4);
        rs9.b("glBindTexture");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(sizeH.getWidth(), sizeH.getHeight(), Bitmap.Config.ARGB_8888);
        byteBufferAllocateDirect.rewind();
        ImageProcessingUtil.e(bitmapCreateBitmap, byteBufferAllocateDirect, sizeH.getWidth() << 2);
        return bitmapCreateBitmap;
    }

    public final void h(ip7 ip7Var) {
        Map map = Collections.EMPTY_MAP;
        l94 l94Var = new l94();
        l94Var.c = new byh();
        o94 o94Var = new o94(l94Var);
        l94Var.b = o94Var;
        l94Var.a = vep.class;
        try {
            e(new qn(this, ip7Var, l94Var), new rl((byte) 15));
            l94Var.a = "Init GlRenderer";
        } catch (Exception e) {
            o94Var.a(e);
        }
        try {
            o94Var.get();
        } catch (InterruptedException | ExecutionException e2) {
            e = e2;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            }
            h9o.m("Failed to create DefaultSurfaceProcessor", e);
        }
    }

    public final void i(j7m j7mVar) throws IOException {
        ArrayList arrayList = this.k;
        if (arrayList.isEmpty()) {
            return;
        }
        if (j7mVar == null) {
            f(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Iterator it = arrayList.iterator();
                int i = -1;
                int i2 = -1;
                Bitmap bitmapG = null;
                byte[] byteArray = null;
                while (it.hasNext()) {
                    cn2 cn2Var = (cn2) it.next();
                    int i3 = cn2Var.b;
                    int i4 = cn2Var.a;
                    if (i != i3 || bitmapG == null) {
                        if (bitmapG != null) {
                            bitmapG.recycle();
                        }
                        bitmapG = g((Size) j7mVar.b, (float[]) j7mVar.c, i3);
                        i2 = -1;
                        i = i3;
                    }
                    if (i2 != i4) {
                        byteArrayOutputStream.reset();
                        bitmapG.compress(Bitmap.CompressFormat.JPEG, i4, byteArrayOutputStream);
                        byteArray = byteArrayOutputStream.toByteArray();
                        i2 = i4;
                    }
                    Surface surface = (Surface) j7mVar.a;
                    Objects.requireNonNull(byteArray);
                    ImageProcessingUtil.j(byteArray, surface);
                    cn2Var.c.b(null);
                    it.remove();
                }
                byteArrayOutputStream.close();
            } finally {
            }
        } catch (IOException e) {
            f(e);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) throws IOException {
        if (this.e.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        float[] fArr = this.f;
        surfaceTexture.getTransformMatrix(fArr);
        j7m j7mVar = null;
        for (Map.Entry entry : this.h.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            vtk vtkVar = (vtk) entry.getKey();
            float[] fArr2 = vtkVar.e;
            float[] fArr3 = this.g;
            Matrix.multiplyMM(fArr3, 0, fArr, 0, fArr2, 0);
            short s = vtkVar.c;
            if (s == 34) {
                try {
                    this.a.j(surfaceTexture.getTimestamp(), fArr3, surface);
                } catch (RuntimeException unused) {
                }
            } else {
                jpo.n("Unsupported format: " + ((int) s), s == 256);
                jpo.n("Only one JPEG output is supported.", j7mVar == null);
                j7mVar = new j7m(surface, vtkVar.d, (float[]) fArr3.clone());
            }
        }
        try {
            i(j7mVar);
        } catch (RuntimeException e) {
            f(e);
        }
    }

    public final void release() {
        if (this.e.getAndSet(true)) {
            return;
        }
        e(new bl6(this, (byte) 11), new rl((byte) 15));
    }
}
