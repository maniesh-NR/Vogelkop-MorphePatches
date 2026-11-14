package defpackage;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;

/* loaded from: classes.dex */
public final class qz9 extends i17 implements lk7 {
    public final /* synthetic */ byte q = 1;
    public final v51 r;
    public final ps7 s;
    public Object t;

    public qz9(vuk vukVar, v51 v51Var, ps7 ps7Var) throws pxb {
        this.r = v51Var;
        this.s = ps7Var;
        T0(vukVar);
    }

    public qz9(vuk vukVar, v51 v51Var, ps7 ps7Var, zvf zvfVar) throws pxb {
        this.r = v51Var;
        this.s = ps7Var;
        this.t = zvfVar;
        T0(vukVar);
    }

    public static boolean W0(float f, EdgeEffect edgeEffect, RecordingCanvas recordingCanvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(recordingCanvas);
        }
        int iSave = recordingCanvas.save();
        recordingCanvas.rotate(f);
        boolean zDraw = edgeEffect.draw(recordingCanvas);
        recordingCanvas.restoreToCount(iSave);
        return zDraw;
    }

    public static boolean X0(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public final RenderNode Y0() {
        RenderNode renderNode = (RenderNode) this.t;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNode2 = new RenderNode("AndroidEdgeEffectOverscrollEffect");
        this.t = renderNode2;
        return renderNode2;
    }

    @Override // defpackage.lk7
    public final void v0(o3c o3cVar) {
        boolean zX0;
        char c;
        float f;
        boolean zW0;
        float f2;
        float f3;
        byte b = this.q;
        v51 v51Var = this.r;
        ps7 ps7Var = this.s;
        switch (b) {
            case 0:
                zvf zvfVar = (zvf) this.t;
                uh4 uh4Var = o3cVar.a;
                v51Var.j(uh4Var.e());
                if (bpj.e(uh4Var.e())) {
                    o3cVar.a();
                    return;
                }
                o3cVar.a();
                v51Var.d.getValue();
                sh4 sh4VarA = uh4Var.b.A();
                Canvas canvas = b31.a;
                Canvas canvas2 = ((a31) sh4VarA).a;
                if (ps7.f(ps7Var.f)) {
                    zX0 = X0(270.0f, (Float.floatToRawIntBits(-Float.intBitsToFloat((int) (uh4Var.e() & 4294967295L))) << 32) | (Float.floatToRawIntBits(o3cVar.o0(zvfVar.b(o3cVar.getLayoutDirection()))) & 4294967295L), ps7Var.c(), canvas2);
                } else {
                    zX0 = false;
                }
                if (ps7.f(ps7Var.d)) {
                    zX0 = X0(0.0f, ((long) Float.floatToRawIntBits(o3cVar.o0(zvfVar.b))) & 4294967295L, ps7Var.e(), canvas2) || zX0;
                }
                if (ps7.f(ps7Var.g)) {
                    zX0 = X0(90.0f, ((long) Float.floatToRawIntBits(o3cVar.o0(zvfVar.c(o3cVar.getLayoutDirection())) + (-((float) zed.b(Float.intBitsToFloat((int) (uh4Var.e() >> 32))))))) & 4294967295L, ps7Var.d(), canvas2) || zX0;
                }
                if (ps7.f(ps7Var.e)) {
                    EdgeEffect edgeEffectB = ps7Var.b();
                    zX0 = X0(180.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (uh4Var.e() >> 32)))) << 32) | (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (uh4Var.e() & 4294967295L))) + o3cVar.o0(zvfVar.d))) & 4294967295L), edgeEffectB, canvas2) || zX0;
                }
                if (zX0) {
                    v51Var.d();
                    return;
                }
                return;
            default:
                uh4 uh4Var2 = o3cVar.a;
                v51Var.j(uh4Var2.e());
                sh4 sh4VarA2 = uh4Var2.b.A();
                Canvas canvas3 = b31.a;
                Canvas canvas4 = ((a31) sh4VarA2).a;
                v51Var.d.getValue();
                if (bpj.e(uh4Var2.e())) {
                    o3cVar.a();
                    return;
                }
                if (!canvas4.isHardwareAccelerated()) {
                    EdgeEffect edgeEffect = ps7Var.d;
                    if (edgeEffect != null) {
                        edgeEffect.finish();
                    }
                    EdgeEffect edgeEffect2 = ps7Var.e;
                    if (edgeEffect2 != null) {
                        edgeEffect2.finish();
                    }
                    EdgeEffect edgeEffect3 = ps7Var.f;
                    if (edgeEffect3 != null) {
                        edgeEffect3.finish();
                    }
                    EdgeEffect edgeEffect4 = ps7Var.g;
                    if (edgeEffect4 != null) {
                        edgeEffect4.finish();
                    }
                    EdgeEffect edgeEffect5 = ps7Var.h;
                    if (edgeEffect5 != null) {
                        edgeEffect5.finish();
                    }
                    EdgeEffect edgeEffect6 = ps7Var.i;
                    if (edgeEffect6 != null) {
                        edgeEffect6.finish();
                    }
                    EdgeEffect edgeEffect7 = ps7Var.j;
                    if (edgeEffect7 != null) {
                        edgeEffect7.finish();
                    }
                    EdgeEffect edgeEffect8 = ps7Var.k;
                    if (edgeEffect8 != null) {
                        edgeEffect8.finish();
                    }
                    o3cVar.a();
                    return;
                }
                float fO0 = o3cVar.o0(30.0f);
                boolean z = true;
                boolean z2 = ps7.f(ps7Var.d) || ps7.g(ps7Var.h) || ps7.f(ps7Var.e) || ps7.g(ps7Var.i);
                boolean z3 = ps7.f(ps7Var.f) || ps7.g(ps7Var.j) || ps7.f(ps7Var.g) || ps7.g(ps7Var.k);
                if (!z2) {
                    c = ' ';
                    if (!z3) {
                        o3cVar.a();
                        return;
                    }
                    Y0().setPosition(0, 0, canvas4.getWidth(), canvas4.getHeight() + (zed.b(fO0) << 1));
                } else if (z3) {
                    c = ' ';
                    Y0().setPosition(0, 0, canvas4.getWidth(), canvas4.getHeight());
                } else {
                    c = ' ';
                    Y0().setPosition(0, 0, canvas4.getWidth() + (zed.b(fO0) << 1), canvas4.getHeight());
                }
                RecordingCanvas recordingCanvasBeginRecording = Y0().beginRecording();
                if (ps7.g(ps7Var.j)) {
                    EdgeEffect edgeEffectA = ps7Var.j;
                    if (edgeEffectA == null) {
                        edgeEffectA = ps7Var.a(fsf.b);
                        ps7Var.j = edgeEffectA;
                    }
                    W0(90.0f, edgeEffectA, recordingCanvasBeginRecording);
                    edgeEffectA.finish();
                }
                if (ps7.f(ps7Var.f)) {
                    EdgeEffect edgeEffectC = ps7Var.c();
                    zW0 = W0(270.0f, edgeEffectC, recordingCanvasBeginRecording);
                    f = 1.0f;
                    if (ps7.g(ps7Var.f)) {
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (v51Var.c() & 4294967295L));
                        EdgeEffect edgeEffectA2 = ps7Var.j;
                        if (edgeEffectA2 == null) {
                            edgeEffectA2 = ps7Var.a(fsf.b);
                            ps7Var.j = edgeEffectA2;
                        }
                        int i = Build.VERSION.SDK_INT;
                        float fO = i >= 31 ? m41.o(edgeEffectC) : 0.0f;
                        float f4 = 1.0f - fIntBitsToFloat;
                        if (i >= 31) {
                            m41.C(edgeEffectA2, fO, f4);
                        } else {
                            edgeEffectA2.onPull(fO, f4);
                        }
                    }
                } else {
                    f = 1.0f;
                    zW0 = false;
                }
                if (ps7.g(ps7Var.h)) {
                    EdgeEffect edgeEffectA3 = ps7Var.h;
                    if (edgeEffectA3 == null) {
                        edgeEffectA3 = ps7Var.a(fsf.a);
                        ps7Var.h = edgeEffectA3;
                    }
                    W0(180.0f, edgeEffectA3, recordingCanvasBeginRecording);
                    edgeEffectA3.finish();
                }
                if (ps7.f(ps7Var.d)) {
                    EdgeEffect edgeEffectE = ps7Var.e();
                    zW0 = W0(0.0f, edgeEffectE, recordingCanvasBeginRecording) || zW0;
                    if (ps7.g(ps7Var.d)) {
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (v51Var.c() >> c));
                        EdgeEffect edgeEffectA4 = ps7Var.h;
                        if (edgeEffectA4 == null) {
                            edgeEffectA4 = ps7Var.a(fsf.a);
                            ps7Var.h = edgeEffectA4;
                        }
                        int i2 = Build.VERSION.SDK_INT;
                        float fO2 = i2 >= 31 ? m41.o(edgeEffectE) : 0.0f;
                        if (i2 >= 31) {
                            m41.C(edgeEffectA4, fO2, fIntBitsToFloat2);
                        } else {
                            edgeEffectA4.onPull(fO2, fIntBitsToFloat2);
                        }
                    }
                }
                if (ps7.g(ps7Var.k)) {
                    EdgeEffect edgeEffectA5 = ps7Var.k;
                    if (edgeEffectA5 == null) {
                        edgeEffectA5 = ps7Var.a(fsf.b);
                        ps7Var.k = edgeEffectA5;
                    }
                    W0(270.0f, edgeEffectA5, recordingCanvasBeginRecording);
                    edgeEffectA5.finish();
                }
                if (ps7.f(ps7Var.g)) {
                    EdgeEffect edgeEffectD = ps7Var.d();
                    zW0 = W0(90.0f, edgeEffectD, recordingCanvasBeginRecording) || zW0;
                    if (ps7.g(ps7Var.g)) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (v51Var.c() & 4294967295L));
                        EdgeEffect edgeEffectA6 = ps7Var.k;
                        if (edgeEffectA6 == null) {
                            edgeEffectA6 = ps7Var.a(fsf.b);
                            ps7Var.k = edgeEffectA6;
                        }
                        int i3 = Build.VERSION.SDK_INT;
                        float fO3 = i3 >= 31 ? m41.o(edgeEffectD) : 0.0f;
                        if (i3 >= 31) {
                            m41.C(edgeEffectA6, fO3, fIntBitsToFloat3);
                        } else {
                            edgeEffectA6.onPull(fO3, fIntBitsToFloat3);
                        }
                    }
                }
                if (ps7.g(ps7Var.i)) {
                    EdgeEffect edgeEffectA7 = ps7Var.i;
                    if (edgeEffectA7 == null) {
                        edgeEffectA7 = ps7Var.a(fsf.a);
                        ps7Var.i = edgeEffectA7;
                    }
                    W0(0.0f, edgeEffectA7, recordingCanvasBeginRecording);
                    edgeEffectA7.finish();
                }
                if (ps7.f(ps7Var.e)) {
                    EdgeEffect edgeEffectB2 = ps7Var.b();
                    if (!W0(180.0f, edgeEffectB2, recordingCanvasBeginRecording) && !zW0) {
                        z = false;
                    }
                    if (ps7.g(ps7Var.e)) {
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (v51Var.c() >> c));
                        EdgeEffect edgeEffectA8 = ps7Var.i;
                        if (edgeEffectA8 == null) {
                            edgeEffectA8 = ps7Var.a(fsf.a);
                            ps7Var.i = edgeEffectA8;
                        }
                        int i4 = Build.VERSION.SDK_INT;
                        float fO4 = i4 >= 31 ? m41.o(edgeEffectB2) : 0.0f;
                        float f5 = f - fIntBitsToFloat4;
                        if (i4 >= 31) {
                            m41.C(edgeEffectA8, fO4, f5);
                        } else {
                            edgeEffectA8.onPull(fO4, f5);
                        }
                    }
                    zW0 = z;
                }
                if (zW0) {
                    v51Var.d();
                }
                float f6 = z3 ? 0.0f : fO0;
                if (z2) {
                    fO0 = 0.0f;
                }
                d2c layoutDirection = o3cVar.getLayoutDirection();
                a31 a31Var = new a31();
                a31Var.a = recordingCanvasBeginRecording;
                long jE = uh4Var2.e();
                d5o d5oVar = uh4Var2.b;
                th4 th4Var = ((uh4) d5oVar.c).a;
                n27 n27Var = th4Var.a;
                d2c d2cVar = th4Var.b;
                sh4 sh4VarA3 = d5oVar.A();
                long jD = uh4Var2.b.D();
                d5o d5oVar2 = uh4Var2.b;
                q3a q3aVar = (q3a) d5oVar2.b;
                d5oVar2.I(o3cVar);
                d5oVar2.J(layoutDirection);
                d5oVar2.H(a31Var);
                d5oVar2.K(jE);
                d5oVar2.b = null;
                a31Var.j();
                try {
                    ((wth) uh4Var2.b.a).P(f6, fO0);
                    try {
                        o3cVar.a();
                        a31Var.f();
                        d5o d5oVar3 = uh4Var2.b;
                        d5oVar3.I(n27Var);
                        d5oVar3.J(d2cVar);
                        d5oVar3.H(sh4VarA3);
                        d5oVar3.K(jD);
                        d5oVar3.b = q3aVar;
                        Y0().endRecording();
                        int iSave = canvas4.save();
                        canvas4.translate(f2, f3);
                        canvas4.drawRenderNode(Y0());
                        canvas4.restoreToCount(iSave);
                        return;
                    } finally {
                        ((wth) uh4Var2.b.a).P(-f6, -fO0);
                    }
                } catch (Throwable th) {
                    a31Var.f();
                    d5o d5oVar4 = uh4Var2.b;
                    d5oVar4.I(n27Var);
                    d5oVar4.J(d2cVar);
                    d5oVar4.H(sh4VarA3);
                    d5oVar4.K(jD);
                    d5oVar4.b = q3aVar;
                    throw th;
                }
        }
    }
}
