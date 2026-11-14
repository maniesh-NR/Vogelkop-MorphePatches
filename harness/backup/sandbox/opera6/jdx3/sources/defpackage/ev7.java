package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.ChipGroup;
import com.opera.android.search.behavior.ScrollableToolbarLinearLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ev7 {
    public Object a;
    public Object b;
    public boolean c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;
    public Object n;
    public Object o;

    public ev7(fe5 fe5Var, umi umiVar, vs vsVar, iv7 iv7Var, wzg wzgVar, pde pdeVar, pde pdeVar2, tsd tsdVar) {
        this.d = fe5Var;
        this.e = umiVar;
        this.f = vsVar;
        this.g = iv7Var;
        this.h = wzgVar;
        this.a = pdeVar;
        this.i = new dv7(this);
        this.j = new qe6(this, (byte) 8);
        this.k = new xh5(new View(((ScrollableToolbarLinearLayout) vsVar.b).getContext()));
        final byte b = 0;
        this.l = z4c.b(new Function0(this) { // from class: yu7
            public final /* synthetic */ ev7 b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b2 = b;
                ev7 ev7Var = this.b;
                switch (b2) {
                    case 0:
                        return sgb.F(2131231988, ((ChipGroup) ((vs) ev7Var.f).d).getContext());
                    case 1:
                        return sgb.F(2131232198, ((ChipGroup) ((vs) ev7Var.f).d).getContext());
                    default:
                        return sgb.F(2131232596, ((ChipGroup) ((vs) ev7Var.f).d).getContext());
                }
            }
        });
        final byte b2 = 1;
        this.m = z4c.b(new Function0(this) { // from class: yu7
            public final /* synthetic */ ev7 b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b2;
                ev7 ev7Var = this.b;
                switch (b22) {
                    case 0:
                        return sgb.F(2131231988, ((ChipGroup) ((vs) ev7Var.f).d).getContext());
                    case 1:
                        return sgb.F(2131232198, ((ChipGroup) ((vs) ev7Var.f).d).getContext());
                    default:
                        return sgb.F(2131232596, ((ChipGroup) ((vs) ev7Var.f).d).getContext());
                }
            }
        });
        final byte b3 = 2;
        this.n = z4c.b(new Function0(this) { // from class: yu7
            public final /* synthetic */ ev7 b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b3;
                ev7 ev7Var = this.b;
                switch (b22) {
                    case 0:
                        return sgb.F(2131231988, ((ChipGroup) ((vs) ev7Var.f).d).getContext());
                    case 1:
                        return sgb.F(2131232198, ((ChipGroup) ((vs) ev7Var.f).d).getContext());
                    default:
                        return sgb.F(2131232596, ((ChipGroup) ((vs) ev7Var.f).d).getContext());
                }
            }
        });
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        h58 h58Var = hri.e;
        w4 w4VarE = sko.e(h58Var, h58Var);
        while (w4VarE.hasNext()) {
            linkedHashMap.put((hri) w4VarE.next(), gri.j);
        }
        this.b = linkedHashMap;
        umi umiVar2 = (umi) this.e;
        on7 on7Var = pn7.b;
        knl knlVar = new knl(umiVar2, cs5.x0(100, un7.d));
        knlVar.e.b(new zu7(this, (byte) 0));
        this.o = knlVar;
        xf8.g0(((iv7) this.g).i, (fe5) this.d, new f7f(this) { // from class: av7
            public final /* synthetic */ ev7 b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b4 = b;
                ev7 ev7Var = this.b;
                switch (b4) {
                    case 0:
                        ((knl) ev7Var.o).c();
                        break;
                    default:
                        knl knlVar2 = (knl) ev7Var.o;
                        if (knlVar2.c == null) {
                            knlVar2.c = fac.B(knlVar2.a, knlVar2.b, knlVar2.d);
                            break;
                        }
                        break;
                }
            }
        });
        xf8.g0((pde) this.a, (fe5) this.d, new f7f(this) { // from class: av7
            public final /* synthetic */ ev7 b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b4 = b2;
                ev7 ev7Var = this.b;
                switch (b4) {
                    case 0:
                        ((knl) ev7Var.o).c();
                        break;
                    default:
                        knl knlVar2 = (knl) ev7Var.o;
                        if (knlVar2.c == null) {
                            knlVar2.c = fac.B(knlVar2.a, knlVar2.b, knlVar2.d);
                            break;
                        }
                        break;
                }
            }
        });
        ((ChipGroup) ((vs) this.f).d).setTouchDelegate((xh5) this.k);
        knlVar.c();
        pdeVar2.j((fe5) this.d, new ug(new Function1(this) { // from class: bv7
            public final /* synthetic */ ev7 b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b4 = b;
                ev7 ev7Var = this.b;
                switch (b4) {
                    case 0:
                        ScrollableToolbarLinearLayout scrollableToolbarLinearLayout = (ScrollableToolbarLinearLayout) ((vs) ev7Var.f).c;
                        int iD = m9f.d(scrollableToolbarLinearLayout.getContext());
                        scrollableToolbarLinearLayout.setPadding(iD, scrollableToolbarLinearLayout.getPaddingTop(), iD, scrollableToolbarLinearLayout.getPaddingBottom());
                        break;
                    case 1:
                        ((ScrollableToolbarLinearLayout) ((vs) ev7Var.f).b).setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
                        break;
                    default:
                        ((knl) ev7Var.o).c();
                        break;
                }
                return Unit.a;
            }
        }, (byte) 18));
        tsdVar.j((fe5) this.d, new ug(new Function1(this) { // from class: bv7
            public final /* synthetic */ ev7 b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b4 = b2;
                ev7 ev7Var = this.b;
                switch (b4) {
                    case 0:
                        ScrollableToolbarLinearLayout scrollableToolbarLinearLayout = (ScrollableToolbarLinearLayout) ((vs) ev7Var.f).c;
                        int iD = m9f.d(scrollableToolbarLinearLayout.getContext());
                        scrollableToolbarLinearLayout.setPadding(iD, scrollableToolbarLinearLayout.getPaddingTop(), iD, scrollableToolbarLinearLayout.getPaddingBottom());
                        break;
                    case 1:
                        ((ScrollableToolbarLinearLayout) ((vs) ev7Var.f).b).setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
                        break;
                    default:
                        ((knl) ev7Var.o).c();
                        break;
                }
                return Unit.a;
            }
        }, (byte) 18));
        oup.l0(((fe5) this.d).b, (Function1) null, (Function1) null, (Function1) null, new Function1(this) { // from class: bv7
            public final /* synthetic */ ev7 b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b4 = b3;
                ev7 ev7Var = this.b;
                switch (b4) {
                    case 0:
                        ScrollableToolbarLinearLayout scrollableToolbarLinearLayout = (ScrollableToolbarLinearLayout) ((vs) ev7Var.f).c;
                        int iD = m9f.d(scrollableToolbarLinearLayout.getContext());
                        scrollableToolbarLinearLayout.setPadding(iD, scrollableToolbarLinearLayout.getPaddingTop(), iD, scrollableToolbarLinearLayout.getPaddingBottom());
                        break;
                    case 1:
                        ((ScrollableToolbarLinearLayout) ((vs) ev7Var.f).b).setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
                        break;
                    default:
                        ((knl) ev7Var.o).c();
                        break;
                }
                return Unit.a;
            }
        }, 7);
    }

    public ev7(id1 id1Var) {
        this.d = new Matrix();
        vk vkVar = id1Var.a;
        this.a = vkVar == null ? null : vkVar.D();
        kd1 kd1Var = id1Var.b;
        this.i = kd1Var == null ? null : kd1Var.D();
        dd1 dd1Var = id1Var.c;
        this.j = dd1Var == null ? null : dd1Var.D();
        ed1 ed1Var = id1Var.d;
        this.k = ed1Var == null ? null : ed1Var.D();
        ed1 ed1Var2 = id1Var.f;
        t89 t89VarD = ed1Var2 == null ? null : ed1Var2.D();
        this.m = t89VarD;
        this.c = id1Var.j;
        if (t89VarD != null) {
            this.e = new Matrix();
            this.f = new Matrix();
            this.g = new Matrix();
            this.h = new float[9];
        } else {
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = null;
        }
        ed1 ed1Var3 = id1Var.g;
        this.n = ed1Var3 == null ? null : ed1Var3.D();
        dd1 dd1Var2 = id1Var.e;
        if (dd1Var2 != null) {
            this.l = dd1Var2.D();
        }
        ed1 ed1Var4 = id1Var.h;
        if (ed1Var4 != null) {
            this.b = ed1Var4.D();
        } else {
            this.b = null;
        }
        ed1 ed1Var5 = id1Var.i;
        if (ed1Var5 != null) {
            this.o = ed1Var5.D();
        } else {
            this.o = null;
        }
    }

    public ev7(pde pdeVar, v8a v8aVar, ypd ypdVar, RecyclerView recyclerView, FrameLayout frameLayout, pde pdeVar2, pde pdeVar3, xh7 xh7Var, oji ojiVar) {
        this.a = pdeVar;
        this.d = v8aVar;
        this.e = ypdVar;
        this.f = recyclerView;
        this.g = pdeVar2;
        this.h = pdeVar3;
        this.i = xh7Var;
        this.j = ojiVar;
        this.k = new pde(fvl.c);
        this.b = new LinkedHashMap();
        this.l = new LinkedHashMap();
        this.m = new ArrayList();
        this.n = new mni(this, (byte) 27);
        wck wckVar = new wck(frameLayout.getContext());
        frameLayout.addView(wckVar, -1, -1);
        this.o = wckVar;
        final byte b = 1;
        recyclerView.m(new s93(this, (byte) 1));
        final byte b2 = 0;
        a26.T(pdeVar3, pdeVar, new f7f(this) { // from class: rck
            public final /* synthetic */ ev7 b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b3 = b2;
                ev7 ev7Var = this.b;
                switch (b3) {
                    case 0:
                        LinkedHashMap linkedHashMap = (LinkedHashMap) ev7Var.b;
                        Iterator it = linkedHashMap.values().iterator();
                        while (it.hasNext()) {
                            ev7Var.i((sck) it.next());
                        }
                        linkedHashMap.clear();
                        ((ArrayList) ev7Var.m).clear();
                        break;
                    default:
                        ev7Var.j();
                        break;
                }
            }
        });
        a26.T(pdeVar2, pdeVar, new f7f(this) { // from class: rck
            public final /* synthetic */ ev7 b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b3 = b;
                ev7 ev7Var = this.b;
                switch (b3) {
                    case 0:
                        LinkedHashMap linkedHashMap = (LinkedHashMap) ev7Var.b;
                        Iterator it = linkedHashMap.values().iterator();
                        while (it.hasNext()) {
                            ev7Var.i((sck) it.next());
                        }
                        linkedHashMap.clear();
                        ((ArrayList) ev7Var.m).clear();
                        break;
                    default:
                        ev7Var.j();
                        break;
                }
            }
        });
        a26.V(xh7Var, pdeVar, new okb(this, (byte) 2));
    }

    public final void a(c73 c73Var) {
        c73Var.g((a73) this.l);
        c73Var.g((a73) this.b);
        c73Var.g((a73) this.o);
        c73Var.g((a73) this.a);
        c73Var.g((a73) this.i);
        c73Var.g((a73) this.j);
        c73Var.g((a73) this.k);
        c73Var.g((t89) this.m);
        c73Var.g((t89) this.n);
    }

    public final void b(x63 x63Var) {
        a73 a73Var = (a73) this.l;
        if (a73Var != null) {
            a73Var.a(x63Var);
        }
        a73 a73Var2 = (a73) this.b;
        if (a73Var2 != null) {
            a73Var2.a(x63Var);
        }
        a73 a73Var3 = (a73) this.o;
        if (a73Var3 != null) {
            a73Var3.a(x63Var);
        }
        a73 a73Var4 = (a73) this.a;
        if (a73Var4 != null) {
            a73Var4.a(x63Var);
        }
        a73 a73Var5 = (a73) this.i;
        if (a73Var5 != null) {
            a73Var5.a(x63Var);
        }
        a73 a73Var6 = (a73) this.j;
        if (a73Var6 != null) {
            a73Var6.a(x63Var);
        }
        a73 a73Var7 = (a73) this.k;
        if (a73Var7 != null) {
            a73Var7.a(x63Var);
        }
        t89 t89Var = (t89) this.m;
        if (t89Var != null) {
            t89Var.a(x63Var);
        }
        t89 t89Var2 = (t89) this.n;
        if (t89Var2 != null) {
            t89Var2.a(x63Var);
        }
    }

    public final boolean c(ua7 ua7Var, Object obj) {
        Float fValueOf = Float.valueOf(100.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        if (obj == k3d.a) {
            a73 a73Var = (a73) this.a;
            if (a73Var == null) {
                this.a = new zzm(ua7Var, new PointF());
                return true;
            }
            a73Var.j(ua7Var);
            return true;
        }
        if (obj == k3d.b) {
            a73 a73Var2 = (a73) this.i;
            if (a73Var2 == null) {
                this.i = new zzm(ua7Var, new PointF());
                return true;
            }
            a73Var2.j(ua7Var);
            return true;
        }
        if (obj == k3d.c) {
            o0k o0kVar = (a73) this.i;
            if (o0kVar instanceof o0k) {
                o0k o0kVar2 = o0kVar;
                ua7 ua7Var2 = o0kVar2.m;
                if (ua7Var2 != null) {
                    ua7Var2.c = null;
                }
                o0kVar2.m = ua7Var;
                if (ua7Var == null) {
                    return true;
                }
                ua7Var.c = o0kVar2;
                return true;
            }
        }
        if (obj == k3d.d) {
            o0k o0kVar3 = (a73) this.i;
            if (o0kVar3 instanceof o0k) {
                o0k o0kVar4 = o0kVar3;
                ua7 ua7Var3 = o0kVar4.n;
                if (ua7Var3 != null) {
                    ua7Var3.c = null;
                }
                o0kVar4.n = ua7Var;
                if (ua7Var == null) {
                    return true;
                }
                ua7Var.c = o0kVar4;
                return true;
            }
        }
        if (obj == k3d.j) {
            a73 a73Var3 = (a73) this.j;
            if (a73Var3 == null) {
                this.j = new zzm(ua7Var, new nli());
                return true;
            }
            a73Var3.j(ua7Var);
            return true;
        }
        if (obj == k3d.k) {
            a73 a73Var4 = (a73) this.k;
            if (a73Var4 == null) {
                this.k = new zzm(ua7Var, fValueOf2);
                return true;
            }
            a73Var4.j(ua7Var);
            return true;
        }
        if (obj == 3) {
            a73 a73Var5 = (a73) this.l;
            if (a73Var5 == null) {
                this.l = new zzm(ua7Var, 100);
                return true;
            }
            a73Var5.j(ua7Var);
            return true;
        }
        if (obj == k3d.x) {
            a73 a73Var6 = (a73) this.b;
            if (a73Var6 == null) {
                this.b = new zzm(ua7Var, fValueOf);
                return true;
            }
            a73Var6.j(ua7Var);
            return true;
        }
        if (obj == k3d.y) {
            a73 a73Var7 = (a73) this.o;
            if (a73Var7 == null) {
                this.o = new zzm(ua7Var, fValueOf);
                return true;
            }
            a73Var7.j(ua7Var);
            return true;
        }
        if (obj == k3d.l) {
            t89 t89Var = (t89) this.m;
            if (t89Var == null) {
                t89Var = new t89(Collections.singletonList(new zvb(fValueOf2)));
                this.m = t89Var;
            }
            t89Var.j(ua7Var);
            return true;
        }
        if (obj != k3d.m) {
            return false;
        }
        t89 t89Var2 = (t89) this.n;
        if (t89Var2 == null) {
            t89Var2 = new t89(Collections.singletonList(new zvb(fValueOf2)));
            this.n = t89Var2;
        }
        t89Var2.j(ua7Var);
        return true;
    }

    public final void d() {
        for (int i = 0; i < 9; i++) {
            ((float[]) this.h)[i] = 0.0f;
        }
    }

    public final Matrix e() {
        PointF pointF;
        nli nliVar;
        PointF pointF2;
        Matrix matrix = (Matrix) this.e;
        Matrix matrix2 = (Matrix) this.g;
        Matrix matrix3 = (Matrix) this.f;
        float[] fArr = (float[]) this.h;
        Matrix matrix4 = (Matrix) this.d;
        matrix4.reset();
        a73 a73Var = (a73) this.i;
        if (a73Var != null && (pointF2 = (PointF) a73Var.e()) != null) {
            float f = pointF2.x;
            if (f != 0.0f || pointF2.y != 0.0f) {
                matrix4.preTranslate(f, pointF2.y);
            }
        }
        if (!this.c) {
            t89 t89Var = (a73) this.k;
            if (t89Var != null) {
                float fFloatValue = t89Var instanceof zzm ? ((Float) t89Var.e()).floatValue() : t89Var.k();
                if (fFloatValue != 0.0f) {
                    matrix4.preRotate(fFloatValue);
                }
            }
        } else if (a73Var != null) {
            float f2 = a73Var.d;
            PointF pointF3 = (PointF) a73Var.e();
            float f3 = pointF3.x;
            float f4 = pointF3.y;
            a73Var.i(1.0E-4f + f2);
            PointF pointF4 = (PointF) a73Var.e();
            a73Var.i(f2);
            matrix4.preRotate((float) Math.toDegrees(Math.atan2(pointF4.y - f4, pointF4.x - f3)));
        }
        if (((t89) this.m) != null) {
            float fCos = ((t89) this.n) == null ? 0.0f : (float) Math.cos(Math.toRadians((-r9.k()) + 90.0f));
            float fSin = ((t89) this.n) == null ? 1.0f : (float) Math.sin(Math.toRadians((-r11.k()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(r6.k()));
            d();
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f5 = -fSin;
            fArr[3] = f5;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            matrix.setValues(fArr);
            d();
            fArr[0] = 1.0f;
            fArr[3] = fTan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            matrix3.setValues(fArr);
            d();
            fArr[0] = fCos;
            fArr[1] = f5;
            fArr[3] = fSin;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            matrix2.setValues(fArr);
            matrix3.preConcat(matrix);
            matrix2.preConcat(matrix3);
            matrix4.preConcat(matrix2);
        }
        a73 a73Var2 = (a73) this.j;
        if (a73Var2 != null && (nliVar = (nli) a73Var2.e()) != null) {
            float f6 = nliVar.a;
            if (f6 != 1.0f || nliVar.b != 1.0f) {
                matrix4.preScale(f6, nliVar.b);
            }
        }
        a73 a73Var3 = (a73) this.a;
        if (a73Var3 != null && (pointF = (PointF) a73Var3.e()) != null) {
            float f7 = pointF.x;
            if (f7 != 0.0f || pointF.y != 0.0f) {
                matrix4.preTranslate(-f7, -pointF.y);
            }
        }
        return matrix4;
    }

    public final Matrix f(float f) {
        float f2;
        float f3;
        Matrix matrix = (Matrix) this.d;
        a73 a73Var = (a73) this.i;
        PointF pointF = a73Var == null ? null : (PointF) a73Var.e();
        a73 a73Var2 = (a73) this.j;
        nli nliVar = a73Var2 == null ? null : (nli) a73Var2.e();
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f, pointF.y * f);
        }
        if (nliVar != null) {
            double d = f;
            matrix.preScale((float) Math.pow(nliVar.a, d), (float) Math.pow(nliVar.b, d));
        }
        a73 a73Var3 = (a73) this.k;
        if (a73Var3 != null) {
            float fFloatValue = ((Float) a73Var3.e()).floatValue();
            a73 a73Var4 = (a73) this.a;
            PointF pointF2 = a73Var4 != null ? (PointF) a73Var4.e() : null;
            float f4 = fFloatValue * f;
            if (pointF2 == null) {
                f3 = 0.0f;
                f2 = 0.0f;
            } else {
                f2 = pointF2.x;
                f3 = pointF2.y;
            }
            matrix.preRotate(f4, f2, f3);
        }
        return matrix;
    }

    public final void g(int i, int i2, int i3, int i4, int i5, float f) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        Integer numValueOf = Integer.valueOf(i);
        Object sckVar = linkedHashMap.get(numValueOf);
        if (sckVar == null) {
            sckVar = new sck(i);
            linkedHashMap.put(numValueOf, sckVar);
        }
        sck sckVar2 = (sck) sckVar;
        Rect rect = sckVar2.b;
        if (rect.isEmpty()) {
            rect.set(i2, i3, i4, i5);
        } else {
            rect.union(i2, i3, i4, i5);
        }
        float f2 = sckVar2.c;
        if (f2 >= f) {
            f = f2;
        }
        sckVar2.c = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(x83 x83Var, hri hriVar, gri griVar, eri eriVar, eri eriVar2, l42 l42Var) {
        if (griVar.g) {
            int iOrdinal = hriVar.ordinal();
            if (iOrdinal == 0) {
                eriVar = griVar.c ? eriVar2 : null;
            } else if (iOrdinal == 1) {
                eriVar = l42Var;
            } else if (iOrdinal != 2) {
                h9o.p();
                return;
            }
            if (eriVar == null) {
                return;
            }
            Context context = x83Var.getContext();
            rg rgVar = new rg((Object) this, (Object) hriVar, (Object) x83Var, (Object) griVar, (byte) 5);
            int iK = x83.K.k(context);
            eriVar.h(new eh7(iK), new lt2(rgVar, context, iK));
        }
    }

    public final void i(sck sckVar) {
        uck uckVar = (uck) ((LinkedHashMap) this.l).remove(Integer.valueOf(sckVar.a));
        if (uckVar == null) {
            return;
        }
        ((wck) this.o).removeView(uckVar.a.a);
        ((ArrayList) this.m).add(uckVar);
    }

    public final void j() {
        if (this.c) {
            return;
        }
        this.c = true;
        ((RecyclerView) this.f).postOnAnimation((mni) this.n);
    }

    public final void k(eri eriVar) {
        if (((iv7) this.g).e(eriVar, true)) {
            ((dbf) ((wzg) this.h).c).A(qk0.b);
        }
    }
}
