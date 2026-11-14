package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import androidx.camera.core.ImageProcessingUtil;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class rva implements tya {
    public lva a;
    public volatile int b;
    public volatile int c;
    public volatile boolean e;
    public volatile boolean f;
    public Executor g;
    public bl9 h;
    public ImageWriter i;
    public ByteBuffer n;
    public ByteBuffer o;
    public ByteBuffer p;
    public ByteBuffer q;
    public ByteBuffer r;
    public ByteBuffer s;
    public volatile int d = 1;
    public Rect j = new Rect();
    public Rect k = new Rect();
    public Matrix l = new Matrix();
    public Matrix m = new Matrix();
    public final Object t = new Object();
    public boolean u = true;

    public qya a(uya uyaVar) {
        return uyaVar.y();
    }

    public final ListenableFuture b(qya qyaVar) throws Throwable {
        Object obj;
        Executor executor;
        lva lvaVar;
        boolean z;
        bl9 bl9Var;
        ImageWriter imageWriter;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer3;
        ByteBuffer byteBuffer4;
        ByteBuffer byteBuffer5;
        ByteBuffer byteBuffer6;
        vva vvaVarI;
        vva vvaVar;
        int i = this.e ? this.b : 0;
        Object obj2 = this.t;
        synchronized (obj2) {
            try {
                try {
                    executor = this.g;
                    lvaVar = this.a;
                    z = this.e && i != this.c;
                    if (z) {
                        g(qyaVar, i);
                    }
                    if (this.e || this.d == 3) {
                        d(qyaVar);
                    }
                    try {
                        bl9Var = this.h;
                        try {
                            imageWriter = this.i;
                            byteBuffer = this.n;
                            byteBuffer2 = this.o;
                            byteBuffer3 = this.p;
                            byteBuffer4 = this.q;
                            byteBuffer5 = this.r;
                            byteBuffer6 = this.s;
                        } catch (Throwable th) {
                            th = th;
                            obj = obj2;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        obj = obj2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    obj = obj2;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        if (lvaVar == null || executor == null || !this.u) {
            return new q0b(new crf("No analyzer or executor currently set."), (byte) 1);
        }
        int i2 = this.d;
        if (bl9Var != null) {
            if (i2 == 2) {
                vvaVarI = ImageProcessingUtil.d(qyaVar, bl9Var, byteBuffer, i, this.f);
            } else {
                if (this.d == 1) {
                    if (this.f) {
                        ImageProcessingUtil.a(qyaVar);
                    }
                    if (imageWriter != null && byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null) {
                        vvaVarI = ImageProcessingUtil.h(qyaVar, bl9Var, imageWriter, byteBuffer2, byteBuffer3, byteBuffer4, i);
                    }
                }
                vvaVar = null;
            }
            vvaVar = vvaVarI;
        } else {
            if (i2 == 3) {
                if (this.f) {
                    ImageProcessingUtil.a(qyaVar);
                }
                if (byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null && byteBuffer5 != null && byteBuffer6 != null) {
                    vvaVarI = ImageProcessingUtil.i(qyaVar, byteBuffer2, byteBuffer3, byteBuffer4, byteBuffer5, byteBuffer6, i);
                    vvaVar = vvaVarI;
                }
            }
            vvaVar = null;
        }
        boolean z2 = vvaVar == null;
        qya qyaVar2 = z2 ? qyaVar : vvaVar;
        Rect rect = new Rect();
        Matrix matrix = new Matrix();
        synchronized (this.t) {
            if (!z || z2) {
                this.c = i;
                rect.set(this.k);
                matrix.set(this.m);
            } else {
                f(qyaVar.getWidth(), qyaVar.getHeight(), qyaVar2.getWidth(), qyaVar2.getHeight());
                this.c = i;
                rect.set(this.k);
                matrix.set(this.m);
            }
        }
        l94 l94Var = new l94();
        l94Var.c = new byh();
        o94 o94Var = new o94(l94Var);
        l94Var.b = o94Var;
        l94Var.a = vep.class;
        try {
            executor.execute(new tp7(this, qyaVar, matrix, qyaVar2, rect, lvaVar, l94Var, (byte) 1));
            l94Var.a = "analyzeImage";
            return o94Var;
        } catch (Exception e) {
            o94Var.a(e);
            return o94Var;
        }
    }

    public void c() {
    }

    public final void d(qya qyaVar) {
        if (this.d != 1 && this.d != 3) {
            if (this.d == 2 && this.n == null) {
                this.n = ByteBuffer.allocateDirect((qyaVar.getHeight() * qyaVar.getWidth()) << 2);
                return;
            }
            return;
        }
        ByteBuffer byteBufferAllocateDirect = this.o;
        if (byteBufferAllocateDirect == null) {
            byteBufferAllocateDirect = ByteBuffer.allocateDirect(qyaVar.getHeight() * qyaVar.getWidth());
            this.o = byteBufferAllocateDirect;
        }
        byteBufferAllocateDirect.position(0);
        ByteBuffer byteBufferAllocateDirect2 = this.p;
        if (byteBufferAllocateDirect2 == null) {
            byteBufferAllocateDirect2 = ByteBuffer.allocateDirect((qyaVar.getHeight() * qyaVar.getWidth()) / 4);
            this.p = byteBufferAllocateDirect2;
        }
        byteBufferAllocateDirect2.position(0);
        ByteBuffer byteBufferAllocateDirect3 = this.q;
        if (byteBufferAllocateDirect3 == null) {
            byteBufferAllocateDirect3 = ByteBuffer.allocateDirect((qyaVar.getHeight() * qyaVar.getWidth()) / 4);
            this.q = byteBufferAllocateDirect3;
        }
        byteBufferAllocateDirect3.position(0);
        if (this.d == 3) {
            ByteBuffer byteBufferAllocateDirect4 = this.r;
            if (byteBufferAllocateDirect4 == null) {
                byteBufferAllocateDirect4 = ByteBuffer.allocateDirect(qyaVar.getHeight() * qyaVar.getWidth());
                this.r = byteBufferAllocateDirect4;
            }
            byteBufferAllocateDirect4.position(0);
            ByteBuffer byteBufferAllocateDirect5 = this.s;
            if (byteBufferAllocateDirect5 == null) {
                byteBufferAllocateDirect5 = ByteBuffer.allocateDirect((qyaVar.getHeight() * qyaVar.getWidth()) / 2);
                this.s = byteBufferAllocateDirect5;
            }
            byteBufferAllocateDirect5.position(0);
        }
    }

    public void e(qya qyaVar) throws Throwable {
        ListenableFuture listenableFutureB = b(qyaVar);
        ga6 ga6Var = new ga6(qyaVar, (byte) 18);
        listenableFutureB.addListener(new wr9(listenableFutureB, ga6Var, (byte) 0), n97.a());
    }

    public final void f(int i, int i2, int i3, int i4) {
        int i5 = this.b;
        Matrix matrix = new Matrix();
        if (i5 > 0) {
            RectF rectF = new RectF(0.0f, 0.0f, i, i2);
            RectF rectF2 = d2m.a;
            Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
            matrix.postRotate(i5);
            RectF rectF3 = new RectF(0.0f, 0.0f, i3, i4);
            Matrix matrix2 = new Matrix();
            matrix2.setRectToRect(rectF2, rectF3, scaleToFit);
            matrix.postConcat(matrix2);
        }
        RectF rectF4 = new RectF(this.j);
        matrix.mapRect(rectF4);
        Rect rect = new Rect();
        rectF4.round(rect);
        this.k = rect;
        this.m.setConcat(this.l, matrix);
    }

    public final void g(qya qyaVar, int i) {
        bl9 bl9Var = this.h;
        if (bl9Var != null) {
            bl9Var.d();
            int width = qyaVar.getWidth();
            int height = qyaVar.getHeight();
            int i2 = this.h.i();
            int iQ = this.h.q();
            if (i != 90 && i != 270) {
                width = height;
                height = width;
            }
            this.h = new bl9(aib.u(height, width, i2, iQ));
            if (this.d == 1) {
                ImageWriter imageWriter = this.i;
                if (imageWriter != null) {
                    imageWriter.close();
                }
                this.i = ImageWriter.newInstance(this.h.getSurface(), this.h.q());
            }
        }
    }

    public final void h(Executor executor, lva lvaVar) {
        if (lvaVar == null) {
            c();
        }
        synchronized (this.t) {
            this.a = lvaVar;
            this.g = executor;
        }
    }

    public final void i(Matrix matrix) {
        synchronized (this.t) {
            this.l = matrix;
            this.m = new Matrix(this.l);
        }
    }

    public final void j(Rect rect) {
        synchronized (this.t) {
            this.j = rect;
            this.k = new Rect(this.j);
        }
    }

    @Override // defpackage.tya
    public final void o(uya uyaVar) throws Throwable {
        try {
            qya qyaVarA = a(uyaVar);
            if (qyaVarA != null) {
                e(qyaVarA);
            }
        } catch (IllegalStateException unused) {
        }
    }
}
