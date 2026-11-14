package defpackage;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class fa1 extends b8e implements hi5, lk7, z1c {
    public final lde o;
    public final boolean p;
    public final float q;
    public final u17 r;
    public final t17 s;
    public s14 t;
    public float u;
    public boolean w;
    public l5i y;
    public m5i z;
    public long v = 0;
    public final dee x = new dee();

    public fa1(lde ldeVar, boolean z, float f, u17 u17Var, t17 t17Var) {
        this.o = ldeVar;
        this.p = z;
        this.q = f;
        this.r = u17Var;
        this.s = t17Var;
    }

    @Override // defpackage.b8e
    public final boolean I0() {
        return false;
    }

    @Override // defpackage.b8e
    public final void L0() {
        na2.B(H0(), null, null, new r8h((byte) 8, null, this), 3);
    }

    @Override // defpackage.b8e
    public final void M0() {
        l5i l5iVar = this.y;
        if (l5iVar != null) {
            this.z = null;
            c26.y(this);
            d7h d7hVar = l5iVar.d;
            m5i m5iVar = (m5i) ((LinkedHashMap) d7hVar.b).get(this);
            if (m5iVar != null) {
                m5iVar.a();
                LinkedHashMap linkedHashMap = (LinkedHashMap) d7hVar.b;
                m5i m5iVar2 = (m5i) linkedHashMap.get(this);
                if (m5iVar2 != null) {
                }
                linkedHashMap.remove(this);
                l5iVar.c.add(m5iVar);
            }
        }
    }

    public final void T0(pwg pwgVar) {
        m5i m5iVar;
        if (!(pwgVar instanceof nwg)) {
            if (pwgVar instanceof owg) {
                m5i m5iVar2 = this.z;
                if (m5iVar2 != null) {
                    m5iVar2.c(false);
                    return;
                }
                return;
            }
            if (!(pwgVar instanceof mwg) || (m5iVar = this.z) == null) {
                return;
            }
            m5iVar.c(false);
            return;
        }
        long j = ((nwg) pwgVar).a;
        long j2 = this.v;
        float f = this.u;
        l5i l5iVar = this.y;
        if (l5iVar == null) {
            Object obj = (View) z4o.N(this, j41.f);
            while (!(obj instanceof ViewGroup)) {
                Object parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    j9h.t(obj, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?", "Couldn't find a valid parent for ");
                    return;
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    l5i l5iVar2 = new l5i(viewGroup.getContext());
                    viewGroup.addView(l5iVar2);
                    l5iVar = l5iVar2;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof l5i) {
                        l5iVar = (l5i) childAt;
                        break;
                    }
                    i++;
                }
            }
            this.y = l5iVar;
        }
        ArrayList arrayList = l5iVar.b;
        d7h d7hVar = l5iVar.d;
        LinkedHashMap linkedHashMap = (LinkedHashMap) d7hVar.b;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) d7hVar.b;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) d7hVar.c;
        m5i m5iVar3 = (m5i) linkedHashMap.get(this);
        if (m5iVar3 == null) {
            ArrayList arrayList2 = l5iVar.c;
            m5iVar3 = (m5i) (arrayList2.isEmpty() ? null : arrayList2.remove(0));
            if (m5iVar3 == null) {
                if (l5iVar.e > j95.h(arrayList)) {
                    m5iVar3 = new m5i(l5iVar.getContext());
                    l5iVar.addView(m5iVar3);
                    arrayList.add(m5iVar3);
                } else {
                    m5iVar3 = (m5i) arrayList.get(l5iVar.e);
                    fa1 fa1Var = (fa1) linkedHashMap3.get(m5iVar3);
                    if (fa1Var != null) {
                        fa1Var.z = null;
                        c26.y(fa1Var);
                        m5i m5iVar4 = (m5i) linkedHashMap2.get(fa1Var);
                        if (m5iVar4 != null) {
                        }
                        linkedHashMap2.remove(fa1Var);
                        m5iVar3.a();
                    }
                }
                int i2 = l5iVar.e;
                if (i2 < l5iVar.a - 1) {
                    l5iVar.e = i2 + 1;
                } else {
                    l5iVar.e = 0;
                }
            }
            linkedHashMap2.put(this, m5iVar3);
            linkedHashMap3.put(m5iVar3, this);
        }
        m5i m5iVar5 = m5iVar3;
        int iB = zed.b(f);
        long jA = this.r.a();
        float f2 = ((j5i) this.s.invoke()).d;
        pa paVar = new pa(this, (byte) 18);
        umm ummVar = m5iVar5.a;
        boolean z = this.p;
        if (ummVar == null || !Boolean.valueOf(z).equals(m5iVar5.b)) {
            umm ummVar2 = new umm(z);
            m5iVar5.setBackground(ummVar2);
            m5iVar5.a = ummVar2;
            m5iVar5.b = Boolean.valueOf(z);
        }
        umm ummVar3 = m5iVar5.a;
        m5iVar5.e = paVar;
        m5iVar5.b(j2, iB, jA, f2);
        if (z) {
            ummVar3.setHotspot(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        } else {
            ummVar3.setHotspot(ummVar3.getBounds().centerX(), ummVar3.getBounds().centerY());
        }
        m5iVar5.c(true);
        this.z = m5iVar5;
        c26.y(this);
    }

    @Override // defpackage.z1c, defpackage.xfd
    public final void a(long j) {
        float fO0;
        this.w = true;
        n27 n27Var = ui6.e0(this).y;
        this.v = fr3.g0(j);
        float f = this.q;
        if (Float.isNaN(f)) {
            long j2 = this.v;
            float fD = bpj.d(j2);
            float fB = bpj.b(j2);
            fO0 = y8f.c((Float.floatToRawIntBits(fD) << 32) | (Float.floatToRawIntBits(fB) & 4294967295L)) / 2.0f;
            if (this.p) {
                fO0 += n27Var.o0(10.0f);
            }
        } else {
            fO0 = n27Var.o0(f);
        }
        this.u = fO0;
        dee deeVar = this.x;
        Object[] objArr = deeVar.a;
        int i = deeVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            T0((pwg) objArr[i2]);
        }
        deeVar.d();
    }

    @Override // defpackage.lk7
    public final void v0(o3c o3cVar) {
        uh4 uh4Var = o3cVar.a;
        o3cVar.a();
        s14 s14Var = this.t;
        if (s14Var != null) {
            float f = this.u;
            long jA = this.r.a();
            float fFloatValue = ((Number) ((cd1) s14Var.d).d()).floatValue();
            if (fFloatValue > 0.0f) {
                long jB = u95.b(jA, fFloatValue);
                if (s14Var.b) {
                    float fD = bpj.d(uh4Var.e());
                    float fB = bpj.b(uh4Var.e());
                    d5o d5oVar = uh4Var.b;
                    long jD = d5oVar.D();
                    d5oVar.A().j();
                    try {
                        ((wth) d5oVar.a).q(0.0f, 0.0f, fD, fB, 1);
                        mk7.I(o3cVar, jB, f, 0L, null, 124);
                    } finally {
                        am2.w(d5oVar, jD);
                    }
                } else {
                    mk7.I(o3cVar, jB, f, 0L, null, 124);
                }
            }
        }
        sh4 sh4VarA = uh4Var.b.A();
        m5i m5iVar = this.z;
        if (m5iVar != null) {
            m5iVar.b(this.v, zed.b(this.u), this.r.a(), ((j5i) this.s.invoke()).d);
            Canvas canvas = b31.a;
            m5iVar.draw(((a31) sh4VarA).a);
        }
    }
}
