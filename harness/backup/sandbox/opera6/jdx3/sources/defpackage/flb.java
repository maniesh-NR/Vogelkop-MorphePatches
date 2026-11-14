package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.R;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.i;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class flb extends iph implements mph {
    public View A;
    public GestureDetector B;
    public final em3 C;
    public Rect D;
    public long E;
    public boolean F;
    public i G;
    public i H;
    public int I;
    public int J;
    public final wkb L;
    public i c;
    public boolean d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public final blb q;
    public int s;
    public int u;
    public RecyclerView v;
    public VelocityTracker x;
    public ArrayList y;
    public ArrayList z;
    public final ArrayList a = new ArrayList();
    public final float[] b = new float[2];
    public int p = -1;
    public byte r = 0;
    public final ArrayList t = new ArrayList();
    public final wkb w = new wkb(this, 0);
    public final Handler K = new Handler(Looper.getMainLooper());
    public final float[] M = new float[2];
    public final int[] N = new int[2];

    public flb(blb blbVar) {
        byte b = 1;
        this.C = new em3(this, b);
        this.L = new wkb(this, b);
        this.q = blbVar;
    }

    public static View n(View view) {
        if (view.canScrollHorizontally(-1) || view.canScrollHorizontally(1) || view.canScrollVertically(-1) || view.canScrollVertically(1)) {
            return view;
        }
        Object parent = view.getParent();
        if (parent instanceof View) {
            return n((View) parent);
        }
        return null;
    }

    public static boolean p(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    public final void a(View view) {
        if (view == this.A) {
            this.A = null;
        }
        i iVarT = this.v.T(view);
        if (iVarT != null) {
            i iVar = this.c;
            if (iVar == null || iVarT != iVar) {
                l(iVarT);
            } else if (iVarT.isRecyclable()) {
                r(null, 0);
                l(iVarT);
            }
        }
    }

    public final void e(RecyclerView recyclerView) {
        u8n u8nVar;
        RecyclerView recyclerView2 = this.v;
        if (recyclerView2 != recyclerView) {
            blb blbVar = this.q;
            em3 em3Var = this.C;
            if (recyclerView2 != null) {
                recyclerView2.q0(this);
                this.v.s0(em3Var);
                ArrayList arrayList = this.v.C;
                if (arrayList != null) {
                    arrayList.remove(this);
                }
                i();
                this.A = null;
                VelocityTracker velocityTracker = this.x;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.x = null;
                }
                RecyclerView recyclerView3 = this.v;
                if (q9n.s(recyclerView3) != null && (u8nVar = (u8n) recyclerView3.getTag(2131365014)) != null) {
                    u8nVar.f.remove(blbVar);
                }
            }
            this.v = recyclerView;
            if (recyclerView != null) {
                Resources resources = recyclerView.getResources();
                this.i = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
                this.j = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
                this.k = TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics());
                this.u = ViewConfiguration.get(this.v.getContext()).getScaledTouchSlop();
                this.v.m(this);
                this.v.n(em3Var);
                RecyclerView recyclerView4 = this.v;
                ArrayList arrayList2 = recyclerView4.C;
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    recyclerView4.C = arrayList2;
                }
                arrayList2.add(this);
                if (this.B == null) {
                    this.B = new GestureDetector(this.v.getContext(), new v35(this, (byte) 3));
                }
                q9n.e(this.v, blbVar);
            }
        }
    }

    public final int f(i iVar, int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.l > 0.0f ? 8 : 4;
        blb blbVar = this.q;
        if (blbVar.n(i2)) {
            return 0;
        }
        VelocityTracker velocityTracker = this.x;
        if (velocityTracker != null && this.p > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.j);
            float xVelocity = this.x.getXVelocity(this.p);
            float yVelocity = this.x.getYVelocity(this.p);
            int i3 = xVelocity > 0.0f ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            float fI = blbVar.i(iVar) * this.v.getWidth();
            if ((i3 & i) != 0 && i2 == i3 && fAbs >= this.i && Math.abs(this.l) > fI && fAbs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float fJ = blbVar.j(iVar) * this.v.getWidth();
        if ((i & i2) == 0 || Math.abs(this.l) <= fJ) {
            return 0;
        }
        return i2;
    }

    public final void g(int i, int i2, MotionEvent motionEvent) {
        View viewM;
        if (this.c == null && i == 2 && this.r != 2) {
            blb blbVar = this.q;
            if (blbVar.l()) {
                RecyclerView recyclerView = this.v;
                if (recyclerView.N != 1) {
                    f fVar = recyclerView.n;
                    int i3 = this.p;
                    i iVarT = null;
                    if (i3 != -1) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(i3);
                        float x = motionEvent.getX(iFindPointerIndex) - this.e;
                        float y = motionEvent.getY(iFindPointerIndex) - this.f;
                        float fAbs = Math.abs(x);
                        float fAbs2 = Math.abs(y);
                        float f = this.u;
                        if ((fAbs >= f || fAbs2 >= f) && ((fAbs <= fAbs2 || !fVar.canScrollHorizontally()) && ((fAbs2 <= fAbs || !fVar.canScrollVertically()) && (viewM = m(motionEvent)) != null))) {
                            iVarT = this.v.T(viewM);
                        }
                    }
                    if (iVarT != null) {
                        RecyclerView recyclerView2 = this.v;
                        int iE = (blb.e(blbVar.h(recyclerView2, iVarT), recyclerView2.getLayoutDirection()) & 65280) >> 8;
                        if (iE != 0) {
                            float x2 = motionEvent.getX(i2);
                            float y2 = motionEvent.getY(i2);
                            float f2 = x2 - this.e;
                            float f3 = y2 - this.f;
                            float fAbs3 = Math.abs(f2);
                            float fAbs4 = Math.abs(f3);
                            float f4 = this.u;
                            if (fAbs3 >= f4 || fAbs4 >= f4) {
                                if (fAbs3 > fAbs4) {
                                    if (f2 < 0.0f && (iE & 4) == 0) {
                                        return;
                                    }
                                    if (f2 > 0.0f && (iE & 8) == 0) {
                                        return;
                                    }
                                } else {
                                    if (f3 < 0.0f && (iE & 1) == 0) {
                                        return;
                                    }
                                    if (f3 > 0.0f && (iE & 2) == 0) {
                                        return;
                                    }
                                }
                                this.m = 0.0f;
                                this.l = 0.0f;
                                this.p = motionEvent.getPointerId(0);
                                r(iVarT, 1);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, vph vphVar) {
        rect.setEmpty();
    }

    public final int h(i iVar, int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.m > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.x;
        blb blbVar = this.q;
        if (velocityTracker != null && this.p > -1) {
            float f = this.j;
            blbVar.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.x.getXVelocity(this.p);
            float yVelocity = this.x.getYVelocity(this.p);
            int i3 = yVelocity > 0.0f ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            float fI = blbVar.i(iVar) * this.v.getHeight();
            if ((i3 & i) != 0 && i3 == i2) {
                float f2 = this.i;
                blbVar.getClass();
                if (fAbs >= f2 && Math.abs(this.m) > fI && fAbs > Math.abs(xVelocity)) {
                    return i3;
                }
            }
        }
        float fJ = blbVar.j(iVar) * this.v.getHeight();
        if ((i & i2) == 0 || Math.abs(this.m) <= fJ) {
            return 0;
        }
        return i2;
    }

    public final void i() {
        while (true) {
            ArrayList arrayList = this.t;
            if (arrayList.isEmpty()) {
                return;
            } else {
                l(((elb) am2.k(1, arrayList)).e);
            }
        }
    }

    public final void j() {
        if (this.F) {
            this.F = false;
            this.K.removeCallbacks(this.L);
        }
    }

    public final int k(i iVar, boolean z) {
        ArrayList arrayList = this.t;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            elb elbVar = (elb) arrayList.get(size);
            if (elbVar.e == iVar) {
                elbVar.q |= z;
                if (!elbVar.r) {
                    elbVar.g.cancel();
                }
                arrayList.remove(size);
                return elbVar.h;
            }
        }
        return 0;
    }

    public final void l(i iVar) {
        k(iVar, false);
        if (this.a.remove(iVar.itemView)) {
            this.q.d(this.v, iVar);
        }
    }

    public final View m(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        i iVar = this.c;
        if (iVar != null) {
            View view = iVar.itemView;
            if (p(view, x, y, this.n + this.l, this.o + this.m)) {
                return view;
            }
        }
        ArrayList arrayList = this.t;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            elb elbVar = (elb) arrayList.get(size);
            View view2 = elbVar.e.itemView;
            if (p(view2, x, y, elbVar.k, elbVar.l)) {
                return view2;
            }
        }
        return this.v.H(x, y);
    }

    public final void o(float[] fArr) {
        if ((this.s & 12) != 0) {
            fArr[0] = (this.n + this.l) - this.c.itemView.getLeft();
        } else {
            fArr[0] = this.c.itemView.getTranslationX();
        }
        if ((this.s & 3) != 0) {
            fArr[1] = (this.o + this.m) - this.c.itemView.getTop();
        } else {
            fArr[1] = this.c.itemView.getTranslationY();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r17, androidx.recyclerview.widget.RecyclerView r18, vph r19) {
        /*
            r16 = this;
            r0 = r16
            androidx.recyclerview.widget.i r1 = r0.c
            r2 = 0
            if (r1 == 0) goto L14
            float[] r1 = r0.b
            r0.o(r1)
            r3 = r1[r2]
            r4 = 1
            r1 = r1[r4]
            r8 = r1
            r9 = r3
            goto L17
        L14:
            r3 = 0
            r8 = r3
            r9 = r8
        L17:
            androidx.recyclerview.widget.i r10 = r0.c
            byte r11 = r0.r
            blb r1 = r0.q
            r1.getClass()
            java.util.ArrayList r12 = r0.t
            int r13 = r12.size()
            r14 = r2
        L27:
            if (r14 >= r13) goto L91
            java.lang.Object r0 = r12.get(r14)
            elb r0 = (defpackage.elb) r0
            androidx.recyclerview.widget.i r2 = r0.e
            boolean r3 = r0.j
            if (r3 != 0) goto L46
            float r3 = r0.a
            float r4 = r0.c
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 == 0) goto L46
            float r5 = r0.t
            float r3 = v0g.g(r4, r3, r5, r3)
            r0.k = r3
            goto L4e
        L46:
            android.view.View r3 = r2.itemView
            float r3 = r3.getTranslationX()
            r0.k = r3
        L4e:
            boolean r3 = r0.j
            if (r3 != 0) goto L63
            float r3 = r0.b
            float r4 = r0.d
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 == 0) goto L63
            float r2 = r0.t
            float r2 = v0g.g(r4, r3, r2, r3)
            r0.l = r2
            goto L6b
        L63:
            android.view.View r2 = r2.itemView
            float r2 = r2.getTranslationY()
            r0.l = r2
        L6b:
            boolean r3 = r0.p
            if (r3 != 0) goto L75
            float r3 = r0.k
            r0.m = r3
            r0.n = r2
        L75:
            int r15 = r17.save()
            androidx.recyclerview.widget.i r3 = r0.e
            float r4 = r0.k
            float r5 = r0.l
            byte r6 = r0.f
            r7 = 0
            r2 = r18
            r0 = r1
            r1 = r17
            r0.o(r1, r2, r3, r4, r5, r6, r7)
            r1.restoreToCount(r15)
            int r14 = r14 + 1
            r1 = r0
            goto L27
        L91:
            r0 = r1
            r1 = r17
            if (r10 == 0) goto La7
            int r12 = r1.save()
            r7 = 1
            r2 = r18
            r5 = r8
            r4 = r9
            r3 = r10
            r6 = r11
            r0.o(r1, r2, r3, r4, r5, r6, r7)
            r1.restoreToCount(r12)
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.flb.onDraw(android.graphics.Canvas, androidx.recyclerview.widget.RecyclerView, vph):void");
    }

    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, vph vphVar) {
        float f;
        float f2;
        boolean z = true;
        boolean z2 = false;
        if (this.c != null) {
            float[] fArr = this.b;
            o(fArr);
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        i iVar = this.c;
        byte b = this.r;
        blb blbVar = this.q;
        blbVar.getClass();
        ArrayList arrayList = this.t;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            elb elbVar = (elb) arrayList.get(i);
            int iSave = canvas.save();
            blbVar.b = elbVar.o;
            int i2 = i;
            blb blbVar2 = blbVar;
            blbVar2.p(canvas, recyclerView, elbVar.e, elbVar.m, elbVar.n, elbVar.f, false);
            blbVar2.b = null;
            canvas.restoreToCount(iSave);
            z = z;
            blbVar = blbVar2;
            i = i2 + 1;
        }
        blb blbVar3 = blbVar;
        boolean z3 = z;
        if (iVar != null) {
            int iSave2 = canvas.save();
            blbVar3.p(canvas, recyclerView, iVar, f2, f, b, true);
            canvas.restoreToCount(iSave2);
        }
        for (int i3 = size - 1; i3 >= 0; i3--) {
            elb elbVar2 = (elb) arrayList.get(i3);
            if (!elbVar2.r) {
                z2 = z3;
            } else if (!elbVar2.i) {
                arrayList.remove(i3);
            }
        }
        if (z2) {
            recyclerView.invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(androidx.recyclerview.widget.i r22) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.flb.q(androidx.recyclerview.widget.i):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(androidx.recyclerview.widget.i r19, int r20) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.flb.r(androidx.recyclerview.widget.i, int):void");
    }

    public final void s(i iVar) {
        RecyclerView recyclerView = this.v;
        if ((blb.e(this.q.h(recyclerView, iVar), recyclerView.getLayoutDirection()) & 16711680) == 0 || iVar.itemView.getParent() != this.v) {
            return;
        }
        VelocityTracker velocityTracker = this.x;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.x = VelocityTracker.obtain();
        this.e = this.g;
        this.f = this.h;
        this.m = 0.0f;
        this.l = 0.0f;
        r(iVar, 2);
    }

    public final void t(int i, float f, float f2) {
        this.v.getLocationOnScreen(this.N);
        float[] fArr = this.M;
        fArr[0] = r1[0] + f;
        fArr[1] = r1[1] + f2;
        u(i, f, f2);
    }

    public final void u(int i, float f, float f2) {
        float f3 = f - this.e;
        this.l = f3;
        this.m = f2 - this.f;
        boolean z = (this.r & 1) == 1;
        int i2 = i & 4;
        blb blbVar = this.q;
        if (i2 == 0) {
            this.l = Math.max(0.0f, f3);
        } else if (z && f3 < 0.0f && blbVar.n(4)) {
            this.l = Math.max(-this.k, this.l * 0.25f);
        }
        if ((i & 8) == 0) {
            this.l = Math.min(0.0f, this.l);
        } else if (z && this.l > 0.0f && blbVar.n(8)) {
            this.l = Math.min(this.k, this.l * 0.25f);
        }
        if ((i & 1) == 0) {
            this.m = Math.max(0.0f, this.m);
        }
        if ((i & 2) == 0) {
            this.m = Math.min(0.0f, this.m);
        }
    }
}
