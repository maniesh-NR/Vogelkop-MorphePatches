package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class en7 implements wtk, SurfaceTexture.OnFrameAvailableListener {
    public final an7 a;
    public final HandlerThread b;
    public final g7a c;
    public final Handler d;
    public int e;
    public boolean f;
    public final AtomicBoolean g;
    public final LinkedHashMap h;
    public SurfaceTexture i;
    public SurfaceTexture j;

    public en7(ip7 ip7Var, pad padVar, pad padVar2) {
        Map map = Collections.EMPTY_MAP;
        this.e = 0;
        this.f = false;
        this.g = new AtomicBoolean(false);
        this.h = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.d = handler;
        this.c = new g7a(handler);
        this.a = new an7(padVar, padVar2);
        try {
            f(ip7Var);
        } catch (RuntimeException e) {
            release();
            throw e;
        }
    }

    public final void b(vtk vtkVar) {
        if (this.g.get()) {
            vtkVar.close();
        } else {
            e(new cn7(this, vtkVar, (byte) 1), new bl6(vtkVar, (byte) 10));
        }
    }

    public final void c(buk bukVar) {
        if (this.g.get()) {
            bukVar.c();
        } else {
            e(new cn7(this, bukVar, (byte) 0), new mw6(bukVar, (byte) 0));
        }
    }

    public final void d() {
        if (this.f && this.e == 0) {
            LinkedHashMap linkedHashMap = this.h;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((vtk) it.next()).close();
            }
            linkedHashMap.clear();
            an7 an7Var = this.a;
            if (((AtomicBoolean) an7Var.b).getAndSet(false)) {
                rs9.c((Thread) an7Var.d);
                an7Var.h();
            }
            an7Var.n = -1;
            an7Var.o = -1;
            this.b.quit();
        }
    }

    public final void e(Runnable runnable, Runnable runnable2) {
        try {
            this.c.execute(new gl6(this, runnable2, runnable, (byte) 12));
        } catch (RejectedExecutionException unused) {
            runnable2.run();
        }
    }

    public final void f(ip7 ip7Var) {
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

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (this.g.get() || (surfaceTexture2 = this.i) == null || this.j == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.j.updateTexImage();
        for (Map.Entry entry : this.h.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            vtk vtkVar = (vtk) entry.getKey();
            if (vtkVar.c == 34) {
                try {
                    this.a.m(surfaceTexture.getTimestamp(), surface, vtkVar, this.i, this.j);
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    public final void release() {
        if (this.g.getAndSet(true)) {
            return;
        }
        e(new bn7(this, (byte) 0), new rl((byte) 15));
    }
}
