package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
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
public class glb extends iph implements mph {
    public Rect A;
    public long B;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public final clb m;
    public int o;
    public int q;
    public RecyclerView r;
    public VelocityTracker t;
    public ArrayList u;
    public ArrayList v;
    public GestureDetector x;
    public dlb y;
    public final ArrayList a = new ArrayList();
    public final float[] b = new float[2];
    public i c = null;
    public int l = -1;
    public byte n = 0;
    public final ArrayList p = new ArrayList();
    public final vl9 s = new vl9(this, (byte) 6);
    public View w = null;
    public final em3 z = new em3(this, (byte) 2);

    public glb(clb clbVar) {
        this.m = clbVar;
    }

    public static boolean l(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    @Override // defpackage.mph
    public final void a(View view) {
        if (view == this.w) {
            this.w = null;
        }
        i iVarT = this.r.T(view);
        if (iVarT != null) {
            i iVar = this.c;
            if (iVar != null && iVarT == iVar) {
                n(null, 0);
                return;
            }
            i(iVarT, false);
            if (this.a.remove(iVarT.itemView)) {
                this.m.b(this.r, iVarT);
            }
        }
    }

    public final void e(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.r;
        if (recyclerView2 != recyclerView) {
            nph nphVar = this.z;
            if (recyclerView2 != null) {
                recyclerView2.q0(this);
                this.r.s0(nphVar);
                ArrayList arrayList = this.r.C;
                if (arrayList != null) {
                    arrayList.remove(this);
                }
                ArrayList arrayList2 = this.p;
                int size = arrayList2.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    xkb xkbVar = (xkb) arrayList2.get(0);
                    xkbVar.g.cancel();
                    this.m.b(this.r, xkbVar.e);
                }
                arrayList2.clear();
                this.w = null;
                VelocityTracker velocityTracker = this.t;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.t = null;
                }
                dlb dlbVar = this.y;
                if (dlbVar != null) {
                    dlbVar.a = false;
                    this.y = null;
                }
                if (this.x != null) {
                    this.x = null;
                }
            }
            this.r = recyclerView;
            if (recyclerView != null) {
                Resources resources = recyclerView.getResources();
                this.f = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
                this.g = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
                this.q = ViewConfiguration.get(this.r.getContext()).getScaledTouchSlop();
                this.r.m(this);
                this.r.n(nphVar);
                RecyclerView recyclerView3 = this.r;
                ArrayList arrayList3 = recyclerView3.C;
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    recyclerView3.C = arrayList3;
                }
                arrayList3.add(this);
                this.y = new dlb(this);
                this.x = new GestureDetector(this.r.getContext(), this.y);
            }
        }
    }

    public final int f(i iVar, int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.h > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.t;
        clb clbVar = this.m;
        if (velocityTracker != null && this.l > -1) {
            velocityTracker.computeCurrentVelocity(1000, clbVar.h(this.g));
            float xVelocity = this.t.getXVelocity(this.l);
            float yVelocity = this.t.getYVelocity(this.l);
            int i3 = xVelocity > 0.0f ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && fAbs >= this.f && fAbs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float fG = clbVar.g(iVar) * this.r.getWidth();
        if ((i & i2) == 0 || Math.abs(this.h) <= fG) {
            return 0;
        }
        return i2;
    }

    public final void g(int i, int i2, MotionEvent motionEvent) {
        View viewJ;
        if (this.c == null && i == 2 && this.n != 2) {
            clb clbVar = this.m;
            if (clbVar instanceof mte) {
                return;
            }
            RecyclerView recyclerView = this.r;
            if (recyclerView.N != 1) {
                f fVar = recyclerView.n;
                int i3 = this.l;
                i iVarT = null;
                if (i3 != -1) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i3);
                    float x = motionEvent.getX(iFindPointerIndex) - this.d;
                    float y = motionEvent.getY(iFindPointerIndex) - this.e;
                    float fAbs = Math.abs(x);
                    float fAbs2 = Math.abs(y);
                    float f = this.q;
                    if ((fAbs >= f || fAbs2 >= f) && ((fAbs <= fAbs2 || !fVar.canScrollHorizontally()) && ((fAbs2 <= fAbs || !fVar.canScrollVertically()) && (viewJ = j(motionEvent)) != null))) {
                        iVarT = this.r.T(viewJ);
                    }
                }
                if (iVarT != null) {
                    RecyclerView recyclerView2 = this.r;
                    int iC = (clb.c(clbVar.f(recyclerView2, iVarT), recyclerView2.getLayoutDirection()) & 65280) >> 8;
                    if (iC != 0) {
                        float x2 = motionEvent.getX(i2);
                        float y2 = motionEvent.getY(i2);
                        float f2 = x2 - this.d;
                        float f3 = y2 - this.e;
                        float fAbs3 = Math.abs(f2);
                        float fAbs4 = Math.abs(f3);
                        float f4 = this.q;
                        if (fAbs3 >= f4 || fAbs4 >= f4) {
                            if (fAbs3 > fAbs4) {
                                if (f2 < 0.0f && (iC & 4) == 0) {
                                    return;
                                }
                                if (f2 > 0.0f && (iC & 8) == 0) {
                                    return;
                                }
                            } else {
                                if (f3 < 0.0f && (iC & 1) == 0) {
                                    return;
                                }
                                if (f3 > 0.0f && (iC & 2) == 0) {
                                    return;
                                }
                            }
                            this.i = 0.0f;
                            this.h = 0.0f;
                            this.l = motionEvent.getPointerId(0);
                            n(iVarT, 1);
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.iph
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, vph vphVar) {
        rect.setEmpty();
    }

    public final int h(i iVar, int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.i > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.t;
        clb clbVar = this.m;
        if (velocityTracker != null && this.l > -1) {
            velocityTracker.computeCurrentVelocity(1000, clbVar.h(this.g));
            float xVelocity = this.t.getXVelocity(this.l);
            float yVelocity = this.t.getYVelocity(this.l);
            int i3 = yVelocity > 0.0f ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && fAbs >= this.f && fAbs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float fG = clbVar.g(iVar) * this.r.getHeight();
        if ((i & i2) == 0 || Math.abs(this.i) <= fG) {
            return 0;
        }
        return i2;
    }

    public final void i(i iVar, boolean z) {
        ArrayList arrayList = this.p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            xkb xkbVar = (xkb) arrayList.get(size);
            if (xkbVar.e == iVar) {
                xkbVar.k |= z;
                if (!xkbVar.l) {
                    xkbVar.g.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View j(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        i iVar = this.c;
        if (iVar != null) {
            View view = iVar.itemView;
            if (l(view, x, y, this.j + this.h, this.k + this.i)) {
                return view;
            }
        }
        ArrayList arrayList = this.p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            xkb xkbVar = (xkb) arrayList.get(size);
            View view2 = xkbVar.e.itemView;
            if (l(view2, x, y, xkbVar.i, xkbVar.j)) {
                return view2;
            }
        }
        return this.r.H(x, y);
    }

    public final void k(float[] fArr) {
        if ((this.o & 12) != 0) {
            fArr[0] = (this.j + this.h) - this.c.itemView.getLeft();
        } else {
            fArr[0] = this.c.itemView.getTranslationX();
        }
        if ((this.o & 3) != 0) {
            fArr[1] = (this.k + this.i) - this.c.itemView.getTop();
        } else {
            fArr[1] = this.c.itemView.getTranslationY();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(androidx.recyclerview.widget.i r22) {
        /*
            Method dump skipped, instructions count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.glb.m(androidx.recyclerview.widget.i):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(androidx.recyclerview.widget.i r20, int r21) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.glb.n(androidx.recyclerview.widget.i, int):void");
    }

    public final void o(int i, int i2, MotionEvent motionEvent) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float fMax = x - this.d;
        this.h = fMax;
        this.i = y - this.e;
        if ((i & 4) == 0) {
            fMax = Math.max(0.0f, fMax);
            this.h = fMax;
        }
        if ((i & 8) == 0) {
            this.h = Math.min(0.0f, fMax);
        }
        if ((i & 1) == 0) {
            this.i = Math.max(0.0f, this.i);
        }
        if ((i & 2) == 0) {
            this.i = Math.min(0.0f, this.i);
        }
    }

    @Override // defpackage.iph
    public void onDraw(Canvas canvas, RecyclerView recyclerView, vph vphVar) {
        float f;
        float f2;
        clb clbVar;
        glb glbVar = this;
        if (glbVar.c != null) {
            float[] fArr = glbVar.b;
            glbVar.k(fArr);
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        i iVar = glbVar.c;
        byte b = glbVar.n;
        ArrayList arrayList = glbVar.p;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            clbVar = glbVar.m;
            if (i >= size) {
                break;
            }
            xkb xkbVar = (xkb) arrayList.get(i);
            i iVar2 = xkbVar.e;
            float f4 = xkbVar.a;
            float f5 = xkbVar.c;
            if (f4 == f5) {
                xkbVar.i = iVar2.itemView.getTranslationX();
            } else {
                xkbVar.i = v0g.g(f5, f4, xkbVar.m, f4);
            }
            float f6 = xkbVar.b;
            float f7 = xkbVar.d;
            if (f6 == f7) {
                xkbVar.j = iVar2.itemView.getTranslationY();
            } else {
                xkbVar.j = v0g.g(f7, f6, xkbVar.m, f6);
            }
            int iSave = canvas.save();
            clbVar.k(canvas, recyclerView, xkbVar.e, xkbVar.i, xkbVar.j, xkbVar.f, false);
            canvas.restoreToCount(iSave);
            i++;
            glbVar = this;
        }
        if (iVar != null) {
            int iSave2 = canvas.save();
            clbVar.k(canvas, recyclerView, iVar, f2, f, b, true);
            canvas.restoreToCount(iSave2);
        }
    }

    @Override // defpackage.iph
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, vph vphVar) {
        boolean z = false;
        if (this.c != null) {
            float[] fArr = this.b;
            k(fArr);
            float f = fArr[0];
            float f2 = fArr[1];
        }
        i iVar = this.c;
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            xkb xkbVar = (xkb) arrayList.get(i);
            int iSave = canvas.save();
            View view = xkbVar.e.itemView;
            canvas.restoreToCount(iSave);
        }
        if (iVar != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            xkb xkbVar2 = (xkb) arrayList.get(i2);
            if (!xkbVar2.l) {
                z = true;
            } else if (!xkbVar2.h) {
                arrayList.remove(i2);
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }
}
