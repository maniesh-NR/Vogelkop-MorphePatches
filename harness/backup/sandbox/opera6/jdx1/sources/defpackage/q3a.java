package defpackage;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.os.Build;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q3a {
    public boolean A;
    public RectF B;
    public final u3a a;
    public Outline f;
    public float j;
    public w7d k;
    public d91 l;
    public d91 m;
    public boolean n;
    public uh4 o;
    public zg p;
    public int q;
    public boolean s;
    public long t;
    public long u;
    public int v;
    public int w;
    public int x;
    public int y;
    public long z;
    public n27 b = f03.e;
    public d2c c = d2c.a;
    public Function1 d = h50.C;
    public final b11 e = new b11((Object) this, (byte) 11);
    public boolean g = true;
    public long h = 0;
    public long i = 9205357640488583168L;
    public final s14 r = new s14((byte) 3);

    static {
        Intrinsics.a(Build.FINGERPRINT, "robolectric");
    }

    public q3a(u3a u3aVar) {
        this.a = u3aVar;
        u3aVar.w = false;
        u3aVar.a();
        this.t = 0L;
        this.u = 0L;
        this.z = 9205357640488583168L;
    }

    public final void a() {
        u3a u3aVar = this.a;
        RenderNode renderNode = u3aVar.c;
        if (this.g) {
            boolean z = this.A;
            if (z || u3aVar.p > 0.0f) {
                d91 d91Var = this.l;
                if (d91Var != null) {
                    Path path = d91Var.a;
                    RectF rectF = this.B;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.B = rectF;
                    }
                    path.computeBounds(rectF, false);
                    Outline outline = this.f;
                    if (outline == null) {
                        outline = new Outline();
                        this.f = outline;
                    }
                    if (Build.VERSION.SDK_INT >= 30) {
                        r9n.S(outline, d91Var);
                    } else {
                        outline.setConvexPath(path);
                    }
                    outline.offset(this.v, this.w);
                    this.n = !outline.canClip();
                    this.l = d91Var;
                    outline.setAlpha(u3aVar.h);
                    rectF.width();
                    rectF.height();
                    renderNode.setOutline(outline);
                    u3aVar.g = true;
                    u3aVar.a();
                    if (this.n && this.A) {
                        u3aVar.w = false;
                        u3aVar.a();
                        renderNode.discardDisplayList();
                    } else {
                        u3aVar.w = this.A;
                        u3aVar.a();
                    }
                } else {
                    u3aVar.w = z;
                    u3aVar.a();
                    Outline outline2 = this.f;
                    if (outline2 == null) {
                        outline2 = new Outline();
                        this.f = outline2;
                    }
                    Outline outline3 = outline2;
                    long jG0 = fr3.g0(this.u);
                    long j = this.h;
                    long j2 = this.i;
                    if (j2 != 9205357640488583168L) {
                        jG0 = j2;
                    }
                    int i = (int) (j >> 32);
                    int i2 = (int) (j & 4294967295L);
                    outline3.setRoundRect(Math.round(Float.intBitsToFloat(i)), Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat((int) (jG0 >> 32)) + Float.intBitsToFloat(i)), Math.round(Float.intBitsToFloat((int) (jG0 & 4294967295L)) + Float.intBitsToFloat(i2)), this.j);
                    outline3.setAlpha(u3aVar.h);
                    renderNode.setOutline(outline3);
                    u3aVar.g = true;
                    u3aVar.a();
                }
            } else {
                u3aVar.w = false;
                u3aVar.a();
                renderNode.setOutline(null);
                u3aVar.g = false;
                u3aVar.a();
            }
        }
        this.g = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r15 = this;
            boolean r0 = r15.s
            if (r0 == 0) goto L77
            int r0 = r15.q
            if (r0 != 0) goto L77
            s14 r0 = r15.r
            java.lang.Object r1 = r0.c
            q3a r1 = (defpackage.q3a) r1
            if (r1 == 0) goto L1c
            int r2 = r1.q
            int r2 = r2 + (-1)
            r1.q = r2
            r1.b()
            r1 = 0
            r0.c = r1
        L1c:
            java.lang.Object r0 = r0.e
            tee r0 = (defpackage.tee) r0
            if (r0 == 0) goto L70
            java.lang.Object[] r1 = r0.b
            long[] r2 = r0.a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L6d
            r4 = 0
            r5 = r4
        L2d:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L68
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L47:
            if (r10 >= r8) goto L66
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L62
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            q3a r11 = (defpackage.q3a) r11
            int r12 = r11.q
            int r12 = r12 + (-1)
            r11.q = r12
            r11.b()
        L62:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L47
        L66:
            if (r8 != r9) goto L6d
        L68:
            if (r5 == r3) goto L6d
            int r5 = r5 + 1
            goto L2d
        L6d:
            r0.b()
        L70:
            u3a r15 = r15.a
            android.graphics.RenderNode r15 = r15.c
            r15.discardDisplayList()
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q3a.b():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.mk7 r14) {
        /*
            r13 = this;
            s14 r0 = r13.r
            java.lang.Object r1 = r0.c
            q3a r1 = (defpackage.q3a) r1
            r0.d = r1
            java.lang.Object r1 = r0.e
            tee r1 = (defpackage.tee) r1
            if (r1 == 0) goto L29
            boolean r2 = r1.h()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r0.f
            tee r2 = (defpackage.tee) r2
            if (r2 != 0) goto L23
            tee r2 = defpackage.jmi.a
            tee r2 = new tee
            r2.<init>()
            r0.f = r2
        L23:
            r2.j(r1)
            r1.b()
        L29:
            r1 = 1
            r0.b = r1
            kotlin.jvm.functions.Function1 r13 = r13.d
            r13.invoke(r14)
            r13 = 0
            r0.b = r13
            java.lang.Object r14 = r0.d
            q3a r14 = (defpackage.q3a) r14
            if (r14 == 0) goto L43
            int r1 = r14.q
            int r1 = r1 + (-1)
            r14.q = r1
            r14.b()
        L43:
            java.lang.Object r14 = r0.f
            tee r14 = (defpackage.tee) r14
            if (r14 == 0) goto L9c
            boolean r0 = r14.h()
            if (r0 == 0) goto L9c
            java.lang.Object[] r0 = r14.b
            long[] r1 = r14.a
            int r2 = r1.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L99
            r3 = r13
        L59:
            r4 = r1[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L94
            int r6 = r3 - r2
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r13
        L73:
            if (r8 >= r6) goto L92
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L8e
            int r9 = r3 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            q3a r9 = (defpackage.q3a) r9
            int r10 = r9.q
            int r10 = r10 + (-1)
            r9.q = r10
            r9.b()
        L8e:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L73
        L92:
            if (r6 != r7) goto L99
        L94:
            if (r3 == r2) goto L99
            int r3 = r3 + 1
            goto L59
        L99:
            r14.b()
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q3a.c(mk7):void");
    }

    public final w7d d() {
        w7d mtfVar;
        w7d w7dVar = this.k;
        d91 d91Var = this.l;
        if (w7dVar != null) {
            return w7dVar;
        }
        if (d91Var != null) {
            ltf ltfVar = new ltf(d91Var);
            this.k = ltfVar;
            return ltfVar;
        }
        long jG0 = fr3.g0(this.u);
        long j = this.h;
        long j2 = this.i;
        if (j2 != 9205357640488583168L) {
            jG0 = j2;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jG0 >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jG0 & 4294967295L)) + fIntBitsToFloat2;
        if (this.j > 0.0f) {
            mtfVar = new ntf(ioh.b(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (Float.floatToRawIntBits(r0) << 32) | (Float.floatToRawIntBits(r0) & 4294967295L)));
        } else {
            mtfVar = new mtf(new voh(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.k = mtfVar;
        return mtfVar;
    }

    public final void e(n27 n27Var, d2c d2cVar, long j, Function1 function1) {
        if (!gcb.a(this.u, j)) {
            this.u = j;
            h(this.t, j);
            if (this.i == 9205357640488583168L) {
                this.g = true;
                a();
            }
        }
        this.b = n27Var;
        this.c = d2cVar;
        this.d = function1;
        f();
    }

    public final void f() {
        n27 n27Var = this.b;
        d2c d2cVar = this.c;
        u3a u3aVar = this.a;
        uh4 uh4Var = u3aVar.b;
        RenderNode renderNode = u3aVar.c;
        RecordingCanvas recordingCanvasBeginRecording = renderNode.beginRecording();
        float f = u3aVar.x;
        float f2 = u3aVar.y;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
        try {
            pjn pjnVar = u3aVar.a;
            a31 a31Var = (a31) pjnVar.b;
            Canvas canvas = a31Var.a;
            a31Var.a = recordingCanvasBeginRecording;
            d5o d5oVar = uh4Var.b;
            d5oVar.I(n27Var);
            d5oVar.J(d2cVar);
            d5oVar.b = this;
            d5oVar.K(u3aVar.d);
            d5oVar.H(a31Var);
            float f3 = u3aVar.x;
            b11 b11Var = this.e;
            if (f3 > 0.0f || u3aVar.y > 0.0f) {
                int i = (int) (jFloatToRawIntBits >> 32);
                int i2 = (int) (jFloatToRawIntBits & 4294967295L);
                a31Var.e(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
                b11Var.invoke(uh4Var);
                a31Var.e(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
            } else {
                b11Var.invoke(uh4Var);
            }
            ((a31) pjnVar.b).a = canvas;
        } finally {
            renderNode.endRecording();
        }
    }

    public final void g(long j) {
        if (y8f.b(this.z, j)) {
            return;
        }
        this.z = j;
        u3a u3aVar = this.a;
        u3aVar.k = j;
        u3aVar.d();
    }

    public final void h(long j, long j2) {
        u3a u3aVar = this.a;
        RenderNode renderNode = u3aVar.c;
        u3aVar.D = (int) (j >> 32);
        u3aVar.E = (int) (j & 4294967295L);
        boolean zA = bpj.a(u3aVar.d, fr3.g0(j2));
        u3aVar.d = fr3.g0(j2);
        u3aVar.e();
        if (zA || !y8f.b(u3aVar.k, 9205357640488583168L)) {
            return;
        }
        renderNode.setPivotX((((int) (j2 >> 32)) / 2.0f) + u3aVar.x);
        renderNode.setPivotY((((int) (j2 & 4294967295L)) / 2.0f) + u3aVar.y);
    }

    public final void i(long j, long j2, float f) {
        float f2 = this.v;
        float f3 = this.w;
        long jE = y8f.e(j, (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
        if (y8f.b(this.h, jE) && bpj.a(this.i, j2) && this.j == f && this.l == null) {
            return;
        }
        this.k = null;
        this.l = null;
        this.g = true;
        this.n = false;
        this.h = jE;
        this.i = j2;
        this.j = f;
        a();
    }
}
