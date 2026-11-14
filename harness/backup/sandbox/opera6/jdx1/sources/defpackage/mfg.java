package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Locale;

/* loaded from: classes.dex */
public final class mfg extends HandlerThread implements Handler.Callback {
    public rq7 a;
    public Handler b;
    public Error c;
    public RuntimeException d;
    public nfg e;

    public final void a(int i) throws qy9 {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        this.a.getClass();
        rq7 rq7Var = this.a;
        int[] iArr = rq7Var.b;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        fr3.q("eglGetDisplay failed", eGLDisplayEglGetDisplay != null);
        int[] iArr2 = new int[2];
        fr3.q("eglInitialize failed", EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr2, 0, iArr2, 1));
        rq7Var.c = eGLDisplayEglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr3 = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, rq7.g, 0, eGLConfigArr, 0, 1, iArr3, 0);
        boolean z = zEglChooseConfig && iArr3[0] > 0 && eGLConfigArr[0] != null;
        Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]};
        String str = tym.a;
        fr3.q(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(rq7Var.c, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        fr3.q("eglCreateContext failed", eGLContextEglCreateContext != null);
        rq7Var.d = eGLContextEglCreateContext;
        EGLDisplay eGLDisplay = rq7Var.c;
        if (i == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            fr3.q("eglCreatePbufferSurface failed", eGLSurfaceEglCreatePbufferSurface != null);
        }
        fr3.q("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext));
        rq7Var.e = eGLSurfaceEglCreatePbufferSurface;
        GLES20.glGenTextures(1, iArr, 0);
        fr3.p();
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
        rq7Var.f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(rq7Var);
        SurfaceTexture surfaceTexture2 = this.a.f;
        surfaceTexture2.getClass();
        this.e = new nfg(this, surfaceTexture2, i != 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        this.a.getClass();
        rq7 rq7Var = this.a;
        rq7Var.a.removeCallbacks(rq7Var);
        try {
            SurfaceTexture surfaceTexture = rq7Var.f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, rq7Var.b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = rq7Var.c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = rq7Var.c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = rq7Var.e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(rq7Var.c, rq7Var.e);
            }
            EGLContext eGLContext = rq7Var.d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(rq7Var.c, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = rq7Var.c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(rq7Var.c);
            }
            rq7Var.c = null;
            rq7Var.d = null;
            rq7Var.e = null;
            rq7Var.f = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i == 1) {
                try {
                    try {
                        try {
                            a(message.arg1);
                            synchronized (this) {
                                notify();
                            }
                            return true;
                        } catch (Error e) {
                            w7d.r("Failed to initialize placeholder surface", e);
                            this.c = e;
                            synchronized (this) {
                                notify();
                            }
                        }
                    } catch (RuntimeException e2) {
                        w7d.r("Failed to initialize placeholder surface", e2);
                        this.d = e2;
                        synchronized (this) {
                            notify();
                        }
                    }
                } catch (qy9 e3) {
                    w7d.r("Failed to initialize placeholder surface", e3);
                    this.d = new IllegalStateException((Throwable) e3);
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i == 2) {
                try {
                    b();
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                return true;
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }
}
