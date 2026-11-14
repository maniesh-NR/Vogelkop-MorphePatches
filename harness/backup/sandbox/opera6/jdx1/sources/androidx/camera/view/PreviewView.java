package androidx.camera.view;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Rational;
import android.view.Display;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.axg;
import defpackage.buk;
import defpackage.bxg;
import defpackage.c77;
import defpackage.ewa;
import defpackage.gyd;
import defpackage.hb7;
import defpackage.hdo;
import defpackage.lr;
import defpackage.mc4;
import defpackage.n5n;
import defpackage.n97;
import defpackage.nc;
import defpackage.nhh;
import defpackage.nni;
import defpackage.ode;
import defpackage.oni;
import defpackage.pni;
import defpackage.r5n;
import defpackage.xd4;
import defpackage.ycc;
import defpackage.ywg;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class PreviewView extends FrameLayout {
    public static final /* synthetic */ int p = 0;
    public final int a;
    public n1f b;
    public final nc c;
    public final ywg d;
    public boolean e;
    public final ode f;
    public final AtomicReference g;
    public ycc h;
    public final bxg i;
    public final hdo j;
    public xd4 k;
    public MotionEvent l;
    public final hb7 m;
    public final z22 n;
    public final yhe o;

    public PreviewView(Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet, 0, 0);
        this.a = 1;
        ywg ywgVar = new ywg();
        ywgVar.h = 2;
        this.d = ywgVar;
        this.e = true;
        this.f = new ode(axg.a);
        this.g = new AtomicReference();
        this.i = new bxg(ywgVar);
        this.m = new hb7(this, (byte) 2);
        this.n = new z22(this, (byte) 14);
        this.o = new yhe(this, (byte) 11);
        xug.i();
        Resources.Theme theme = context.getTheme();
        int[] iArr = nhh.a;
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        WeakHashMap weakHashMap = r5n.a;
        n5n.b(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        try {
            int integer = typedArrayObtainStyledAttributes.getInteger(1, v0g.c(ywgVar.h));
            for (int i2 : vep.B(6)) {
                if (v0g.c(i2) == integer) {
                    xug.i();
                    this.d.h = i2;
                    b();
                    a(false);
                    int integer2 = typedArrayObtainStyledAttributes.getInteger(0, 0);
                    for (int i3 : vep.B(2)) {
                        if (i3 == 1) {
                            i = 0;
                        } else {
                            if (i3 != 2) {
                                throw null;
                            }
                            i = 1;
                        }
                        if (i == integer2) {
                            xug.i();
                            this.a = i3;
                            typedArrayObtainStyledAttributes.recycle();
                            this.j = new hdo(context, new r9g(this, (byte) 9));
                            if (getBackground() == null) {
                                setBackgroundColor(getContext().getColor(R.color.black));
                            }
                            nc ncVar = new nc(context, null, 0, 0);
                            ncVar.setBackgroundColor(-1);
                            ncVar.setAlpha(0.0f);
                            ncVar.setElevation(Float.MAX_VALUE);
                            this.c = ncVar;
                            ncVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                            return;
                        }
                    }
                    throw new IllegalArgumentException("Unknown implementation mode id " + integer2);
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + integer);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static boolean d(buk bukVar, int i) {
        boolean zEquals = bukVar.e.g().B().equals("androidx.camera.camera2.legacy");
        boolean z = (c77.a.b(SurfaceViewStretchedQuirk.class) == null && c77.a.b(SurfaceViewNotCroppedByParentQuirk.class) == null) ? false : true;
        if (!zEquals && !z) {
            int iA = vep.A(i);
            if (iA == 0) {
                return false;
            }
            if (iA != 1) {
                qp2.o("Invalid implementation mode: ".concat(i != 1 ? i != 2 ? "null" : "COMPATIBLE" : "PERFORMANCE"));
                return false;
            }
        }
        return true;
    }

    public final void a(boolean z) {
        byte b;
        String str;
        xug.i();
        xug.i();
        Display defaultDisplay = getDefaultDisplay();
        k8n k8nVar = null;
        if (defaultDisplay != null) {
            int rotation = defaultDisplay.getRotation();
            xug.i();
            if (getWidth() != 0 && getHeight() != 0) {
                Rational rational = new Rational(getWidth(), getHeight());
                xug.i();
                ywg ywgVar = this.d;
                int iA = vep.A(ywgVar.h);
                if (iA != 0) {
                    b = 1;
                    if (iA != 1) {
                        b = 2;
                        if (iA != 2) {
                            b = 3;
                            if (iA != 3 && iA != 4 && iA != 5) {
                                xug.i();
                                switch (ywgVar.h) {
                                    case 1:
                                        str = "FILL_START";
                                        break;
                                    case 2:
                                        str = "FILL_CENTER";
                                        break;
                                    case 3:
                                        str = "FILL_END";
                                        break;
                                    case 4:
                                        str = "FIT_START";
                                        break;
                                    case 5:
                                        str = "FIT_CENTER";
                                        break;
                                    case 6:
                                        str = "FIT_END";
                                        break;
                                    default:
                                        str = "null";
                                        break;
                                }
                                qp2.n("Unexpected scale type: ".concat(str));
                                return;
                            }
                        }
                    }
                } else {
                    b = 0;
                }
                int layoutDirection = getLayoutDirection();
                k8n k8nVar2 = new k8n();
                k8nVar2.b = b;
                k8nVar2.d = rational;
                k8nVar2.a = rotation;
                k8nVar2.c = layoutDirection;
                k8nVar = k8nVar2;
            }
        }
        if (this.h == null || k8nVar == null || !isAttachedToWindow()) {
            return;
        }
        try {
            ycc yccVar = this.h;
            xug.i();
            yccVar.a(this.o, k8nVar);
        } catch (IllegalStateException e) {
            if (!z) {
                throw e;
            }
            e.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r6 = this;
            xug.i()
            n1f r0 = r6.b
            if (r0 == 0) goto L30
            boolean r0 = r6.e
            if (r0 == 0) goto L2b
            android.view.Display r0 = r6.getDefaultDisplay()
            if (r0 == 0) goto L2b
            xd4 r1 = r6.k
            if (r1 == 0) goto L2b
            ywg r2 = r6.d
            int r3 = r0.getRotation()
            int r1 = r1.C(r3)
            int r0 = r0.getRotation()
            boolean r3 = r2.g
            if (r3 == 0) goto L2b
            r2.c = r1
            r2.e = r0
        L2b:
            n1f r0 = r6.b
            r0.k()
        L30:
            bxg r0 = r6.i
            android.util.Size r1 = new android.util.Size
            int r2 = r6.getWidth()
            int r3 = r6.getHeight()
            r1.<init>(r2, r3)
            int r2 = r6.getLayoutDirection()
            r0.getClass()
            xug.i()
            monitor-enter(r0)
            int r3 = r1.getWidth()     // Catch: java.lang.Throwable -> Lbd
            r4 = 0
            if (r3 == 0) goto L65
            int r3 = r1.getHeight()     // Catch: java.lang.Throwable -> Lbd
            if (r3 == 0) goto L65
            android.graphics.Rect r3 = r0.c     // Catch: java.lang.Throwable -> Lbd
            if (r3 == 0) goto L65
            ywg r5 = r0.b     // Catch: java.lang.Throwable -> Lbd
            android.graphics.Matrix r1 = r5.a(r1, r2, r3)     // Catch: java.lang.Throwable -> Lbd
            r0.d = r1     // Catch: java.lang.Throwable -> Lbd
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbd
            goto L68
        L65:
            r0.d = r4     // Catch: java.lang.Throwable -> Lbd
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbd
        L68:
            ycc r0 = r6.h
            if (r0 == 0) goto Lba
            xug.i()
            int r1 = r6.getWidth()
            if (r1 == 0) goto La3
            int r1 = r6.getHeight()
            if (r1 == 0) goto La3
            ywg r1 = r6.d
            android.util.Size r2 = new android.util.Size
            int r3 = r6.getWidth()
            int r5 = r6.getHeight()
            r2.<init>(r3, r5)
            int r6 = r6.getLayoutDirection()
            boolean r3 = r1.d()
            if (r3 == 0) goto La3
            android.graphics.Matrix r3 = new android.graphics.Matrix
            android.graphics.Matrix r5 = r1.d
            r3.<init>(r5)
            android.graphics.Matrix r6 = r1.c(r6, r2)
            r3.postConcat(r6)
            goto La4
        La3:
            r3 = r4
        La4:
            xug.i()
            j3e r6 = r0.f
            if (r6 == 0) goto Lba
            if (r3 != 0) goto Lb0
            r6.d = r4
            return
        Lb0:
            r6.getClass()
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>(r3)
            r6.d = r0
        Lba:
            return
        Lbb:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbd
            throw r6
        Lbd:
            r6 = move-exception
            goto Lbb
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.view.PreviewView.b():void");
    }

    public final void c() {
        ycc yccVar = this.h;
        if (yccVar != null) {
            oni oniVar = new oni();
            oni oniVarH = yccVar.h();
            yccVar.E.put(nni.a, oniVar);
            oni oniVarH2 = yccVar.h();
            if (oniVarH2 == null || oniVarH2.equals(oniVarH)) {
                return;
            }
            oni oniVarH3 = yccVar.h();
            ewa ewaVar = yccVar.d;
            if (oniVarH3 == null) {
                ewaVar.getClass();
                pni pniVar = new pni(ycc.H);
                ewaVar.x = pniVar;
                ewaVar.f().h(pniVar);
                return;
            }
            ewaVar.getClass();
            pni pniVar2 = new pni(null);
            ewaVar.x = pniVar2;
            ewaVar.f().h(pniVar2);
        }
    }

    public final Display getDefaultDisplay() {
        if (getDisplay() == null) {
            return null;
        }
        Context context = getContext();
        Display display = (context != null ? (DisplayManager) context.getSystemService("display") : null).getDisplay(0);
        return display != null ? display : getDisplay();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode()) {
            Context context = getContext();
            DisplayManager displayManager = context == null ? null : (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                displayManager.registerDisplayListener(this.m, new Handler(Looper.getMainLooper()));
            }
        }
        addOnLayoutChangeListener(this.n);
        n1f n1fVar = this.b;
        if (n1fVar != null) {
            n1fVar.g();
        }
        a(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.n);
        n1f n1fVar = this.b;
        if (n1fVar != null) {
            n1fVar.h();
        }
        ycc yccVar = this.h;
        if (yccVar != null) {
            yccVar.b();
        }
        if (isInEditMode()) {
            return;
        }
        Context context = getContext();
        DisplayManager displayManager = context == null ? null : (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            displayManager.unregisterDisplayListener(this.m);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00a3  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.view.PreviewView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.h != null) {
            MotionEvent motionEvent = this.l;
            float x = motionEvent != null ? motionEvent.getX() : getWidth() / 2.0f;
            MotionEvent motionEvent2 = this.l;
            float y = motionEvent2 != null ? motionEvent2.getY() : getHeight() / 2.0f;
            ycc yccVar = this.h;
            bxg bxgVar = this.i;
            ode odeVar = yccVar.y;
            long j = yccVar.F;
            if (yccVar.j() && yccVar.u) {
                PointF pointF = new PointF(x, y);
                gyd gydVarA = bxgVar.a(pointF.x, pointF.y, 0.16666667f);
                gyd gydVarA2 = bxgVar.a(pointF.x, pointF.y, 0.25f);
                bx7 bx7Var = new bx7(gydVarA);
                bx7Var.b(gydVarA2, 2);
                if (j > 0) {
                    jpo.i("autoCancelDuration must be at least 1", j >= 1);
                    bx7Var.a = j / 1000000;
                } else {
                    bx7Var.a = 0L;
                }
                bx7 bx7Var2 = new bx7(bx7Var);
                rn9 rn9Var = yccVar.v;
                if (rn9Var != null) {
                    synchronized (rn9Var.d) {
                        rn9Var.b = true;
                    }
                }
                odeVar.n(new ybl(1));
                rn9 rn9Var2 = new rn9(pointF, odeVar);
                yccVar.v = rn9Var2;
                ListenableFuture listenableFutureI = ((mc4) ((lr) yccVar.m.j()).d).i(bx7Var2);
                listenableFutureI.addListener(new wr9(listenableFutureI, rn9Var2, (byte) 0), n97.a());
                long j2 = j / 1000000;
                if (j2 > 0) {
                    new Handler(Looper.getMainLooper()).postDelayed(new lb4(rn9Var2, (byte) 1), j2);
                }
            }
        }
        this.l = null;
        return super.performClick();
    }
}
