package defpackage;

import android.animation.TimeAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import com.opera.android.BrowserActivity;
import com.opera.android.browser.SessionRestore$State;
import com.opera.android.widget.UrlFieldEditText;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class jl6 implements lmn {
    public final /* synthetic */ byte a;
    public int b;
    public int c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;

    public jl6(int i) {
        this.a = (byte) 2;
        this.d = new esg((byte) 19);
        this.e = new v3d((byte) 0);
        this.f = new HashMap();
        this.g = new HashMap();
        this.b = i;
    }

    public jl6(Bitmap bitmap, gjf gjfVar, int i, int i2) {
        this.a = (byte) 1;
        Paint paint = new Paint(3);
        this.f = paint;
        this.g = new Matrix();
        this.d = bitmap;
        this.e = gjfVar;
        this.b = i;
        this.c = i2;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public jl6(BrowserActivity browserActivity, umi umiVar, k6l k6lVar, x5f x5fVar) {
        this.a = (byte) 3;
        Context applicationContext = browserActivity.getApplicationContext();
        this.d = applicationContext;
        this.e = w1h.l(applicationContext, umiVar, "sessionrestore", new bg1[0]);
        this.f = k6lVar;
        this.g = x5fVar;
    }

    public jl6(UrlFieldEditText urlFieldEditText) {
        this.a = (byte) 4;
        this.d = urlFieldEditText;
    }

    public jl6(jmn jmnVar, View view, o2c o2cVar, int i, int i2, TimeAnimator timeAnimator) {
        this.a = (byte) 5;
        this.d = view;
        this.e = o2cVar;
        this.b = i;
        this.c = i2;
        this.f = timeAnimator;
        this.g = jmnVar;
    }

    public jl6(oj9 oj9Var, oj9 oj9Var2, int i, int i2, yg2 yg2Var, ah2 ah2Var) {
        this.a = (byte) 0;
        this.d = oj9Var;
        this.e = oj9Var2;
        this.b = i;
        this.c = i2;
        this.f = yg2Var;
        this.g = ah2Var;
    }

    public jl6(rr rrVar, String str, int i) {
        this.a = (byte) 6;
        this.f = rrVar;
        this.g = str;
        this.c = i;
        this.d = rrVar;
        this.e = str;
        this.b = i;
    }

    public final void a(Class cls, int i) {
        NavigableMap navigableMapM = m(cls);
        Integer num = (Integer) navigableMapM.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapM.remove(Integer.valueOf(i));
                return;
            } else {
                navigableMapM.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    @Override // defpackage.lmn
    public final void b() {
        ((jmn) this.g).C = null;
        ((TimeAnimator) this.f).end();
    }

    @Override // defpackage.lmn
    public final void c() {
        jmn jmnVar = (jmn) this.g;
        jmnVar.C = null;
        ((TimeAnimator) this.f).end();
        jmnVar.K0(true);
    }

    @Override // defpackage.lmn
    public final void d(qjn qjnVar) {
        jmn jmnVar = (jmn) this.g;
        jmnVar.v = qjnVar.g;
        jmnVar.C = null;
        ((TimeAnimator) this.f).end();
        View view = (View) this.d;
        lkn lknVarA = qjnVar.a(this.b, view.getContext());
        view.setBackground(lknVarA);
        view.animate().alpha(1.0f).translationZ(this.c);
        jmnVar.w = lknVarA;
        w6j w6jVar = jmnVar.A;
        w6jVar.e = lknVarA;
        zjn zjnVar = (zjn) w6jVar.a;
        zjnVar.a = 0.0f;
        zjnVar.b = 0.5f;
        zjnVar.c = 0.5f;
        if (lknVarA.b() <= 0 || ((lkn) w6jVar.e).a() <= 0) {
            jmnVar.z.i.setVisibility(8);
            jmnVar.z.i.animate().cancel();
        } else {
            jmnVar.D = false;
            jmnVar.z.i.setVisibility(0);
            jmnVar.z.i.setAlpha(1.0f);
            jmnVar.G0(3000, 1000);
        }
    }

    @Override // defpackage.lmn
    public final void e(aln alnVar) {
        jmn jmnVar = (jmn) this.g;
        jmnVar.x = alnVar;
        g7j g7jVarB = alnVar.b();
        byte b = 8;
        if (g7jVarB == null || jmnVar.J == g7jVarB) {
            jmnVar.z.q.setVisibility(8);
        } else {
            jmnVar.z.q.setVisibility(0);
            jmnVar.z.r.setOnCheckedChangeListener(new iwf(this, g7jVarB, (byte) 2));
            if (!jmnVar.K) {
                jmnVar.F.U(g7jVarB, false);
                jmnVar.K = true;
            }
        }
        Map map = (Map) jmnVar.H.h.g();
        k15 k15Var = map != null ? (k15) map.get(alnVar.getId()) : null;
        if (k15Var == null || k15Var.a()) {
            jmnVar.z.k.setVisibility(0);
            jmnVar.Q0();
            jmnVar.z.p.setVisibility(8);
            jmnVar.z.k.setEnabled(true);
            jmnVar.z.m.setEnabled(true);
        } else {
            MenuItem menuItemR0 = jmnVar.r0(2131365066);
            if (menuItemR0 != null) {
                menuItemR0.setVisible(false);
            }
            jmnVar.z.p.setVisibility(0);
            jmnVar.z.p.setText(phj.X(jmnVar.requireContext(), 2132020940, new CharSequence[]{upj.o(jmnVar.requireContext(), k15Var.b, false)}));
            jmnVar.z.p.setOnClickListener(new obn(this, k15Var, b));
            jmnVar.z.k.setVisibility(8);
            jmnVar.z.m.setVisibility(8);
        }
        jmnVar.N0(alnVar);
        jmnVar.M0();
        h06 h06VarG = alnVar.g(((View) this.d).getContext(), (o2c) this.e);
        exd exdVar = jmnVar.B;
        if (exdVar != null) {
            exdVar.b(hjm.a);
        }
        jmnVar.y = h06VarG;
        jmnVar.O0();
    }

    @Override // defpackage.lmn
    public final void f() {
        jmn jmnVar = (jmn) this.g;
        jmnVar.C = null;
        ((TimeAnimator) this.f).end();
        jmnVar.K0(true);
    }

    public final void g(Canvas canvas, int i, int i2, int i3, int i4) {
        Matrix matrix = (Matrix) this.g;
        Paint paint = (Paint) this.f;
        int i5 = i3 - i;
        bcd bcdVarB = ((gjf) this.e).b(i5, this.b);
        Bitmap bitmap = (Bitmap) this.d;
        float width = i5 / bitmap.getWidth();
        float height = (i4 - i2) / bitmap.getHeight();
        if (width == 1.0f && height == 1.0f) {
            paint.getShader().setLocalMatrix(null);
        } else {
            float fMax = Math.max(width, height);
            matrix.setScale(fMax, fMax);
            paint.getShader().setLocalMatrix(matrix);
        }
        Path path = new Path(bcdVarB.c);
        canvas.save();
        canvas.translate(i, i2);
        canvas.drawPath(path, paint);
        int i6 = this.c;
        if (i6 != 0) {
            bcdVarB.a(canvas, i6);
        }
        canvas.restore();
    }

    public final void h(int i) {
        String str;
        while (this.c > i) {
            Object objD = ((esg) this.d).D();
            qyn.k(objD);
            r24 r24VarJ = j(objD.getClass());
            this.c -= r24VarJ.b() * r24VarJ.a(objD);
            a(objD.getClass(), r24VarJ.a(objD));
            switch (r24VarJ.a) {
                case 0:
                    str = "ByteArrayPool";
                    break;
                default:
                    str = "IntegerArrayPool";
                    break;
            }
            if (Log.isLoggable(str, 2)) {
                r24VarJ.a(objD);
            }
        }
    }

    public final synchronized Object i(Class cls, int i) {
        u3d u3dVar;
        int i2;
        Integer num = (Integer) m(cls).ceilingKey(Integer.valueOf(i));
        boolean z = num != null && ((i2 = this.c) == 0 || this.b / i2 >= 2 || num.intValue() <= (i << 3));
        v3d v3dVar = (v3d) this.e;
        if (z) {
            int iIntValue = num.intValue();
            sng sngVarH0 = (sng) ((ArrayDeque) v3dVar.b).poll();
            if (sngVarH0 == null) {
                sngVarH0 = v3dVar.H0();
            }
            u3dVar = (u3d) sngVarH0;
            u3dVar.b = iIntValue;
            u3dVar.c = cls;
        } else {
            sng sngVarH02 = (sng) ((ArrayDeque) v3dVar.b).poll();
            if (sngVarH02 == null) {
                sngVarH02 = v3dVar.H0();
            }
            u3dVar = (u3d) sngVarH02;
            u3dVar.b = i;
            u3dVar.c = cls;
        }
        return k(u3dVar, cls);
    }

    public final r24 j(Class cls) {
        r24 r24Var;
        HashMap map = (HashMap) this.g;
        r24 r24Var2 = (r24) map.get(cls);
        if (r24Var2 != null) {
            return r24Var2;
        }
        if (cls.equals(int[].class)) {
            r24Var = new r24((byte) 1);
        } else {
            if (!cls.equals(byte[].class)) {
                qp2.o("No array pool found for: ".concat(cls.getSimpleName()));
                return null;
            }
            r24Var = new r24((byte) 0);
        }
        map.put(cls, r24Var);
        return r24Var;
    }

    public final Object k(u3d u3dVar, Class cls) {
        r24 r24VarJ = j(cls);
        Object objR = ((esg) this.d).r(u3dVar);
        if (objR == null) {
            int i = u3dVar.b;
            switch (r24VarJ.a) {
                case 0:
                    return new byte[i];
                default:
                    return new int[i];
            }
        }
        this.c -= r24VarJ.b() * r24VarJ.a(objR);
        a(cls, r24VarJ.a(objR));
        return objR;
    }

    public final int l(String str) {
        try {
            int i = ((SharedPreferences) ((b59) this.e).get()).getInt(str, 5);
            int[] iArrB = vep.B(6);
            if (i >= 0 && i < iArrB.length) {
                return iArrB[i];
            }
        } catch (ClassCastException unused) {
        }
        return 6;
    }

    public final NavigableMap m(Class cls) {
        HashMap map = (HashMap) this.f;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    public final boolean n() {
        return Objects.equals(((oj9) this.d).n, "audio/raw");
    }

    public final synchronized void o(Object obj) {
        Class<?> cls = obj.getClass();
        r24 r24VarJ = j(cls);
        int iA = r24VarJ.a(obj);
        int iB = r24VarJ.b() * iA;
        if (iB <= this.b / 2) {
            v3d v3dVar = (v3d) this.e;
            sng sngVarH0 = (sng) ((ArrayDeque) v3dVar.b).poll();
            if (sngVarH0 == null) {
                sngVarH0 = v3dVar.H0();
            }
            u3d u3dVar = (u3d) sngVarH0;
            u3dVar.b = iA;
            u3dVar.c = cls;
            ((esg) this.d).A(u3dVar, obj);
            NavigableMap navigableMapM = m(cls);
            Integer num = (Integer) navigableMapM.get(Integer.valueOf(u3dVar.b));
            navigableMapM.put(Integer.valueOf(u3dVar.b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            this.c += iB;
            h(this.b);
        }
    }

    public final void p(SessionRestore$State sessionRestore$State) {
        k6l k6lVar = (k6l) this.f;
        n9g n9gVar = sessionRestore$State.b;
        HashMap map = k6lVar.c;
        h7f h7fVar = k6lVar.q;
        ArrayList arrayList = k6lVar.b;
        h6l h6lVar = h6l.a;
        k6lVar.h(h6lVar);
        try {
            byte b = n9gVar.b;
            int i = n9gVar.a;
            List list = (List) n9gVar.c;
            int i2 = 1;
            boolean z = b != 1 ? false : (i < 0 || i >= list.size()) ? true : !wqm.w(((a9l) list.get(i)).k().getUrl());
            boolean z2 = n9gVar.b == 2;
            ArrayList arrayList2 = new ArrayList();
            d7l d7lVarM = null;
            int i3 = 0;
            while (i3 < list.size()) {
                a9l a9lVar = (a9l) list.get(i3);
                d7l d7lVarL = a9lVar.l(k6lVar.a);
                int i4 = (z && wqm.w(a9lVar.k().getUrl())) ? i2 : 0;
                arrayList.add(d7lVarL);
                map.put(Integer.valueOf(d7lVarL.j.getId()), d7lVarL);
                if (i4 != 0) {
                    arrayList2.add(d7lVarL);
                }
                if (d7lVarL.j.m()) {
                    k6lVar.n += i2;
                }
                int size = arrayList.size() - 1;
                h7fVar.getClass();
                g7f g7fVar = new g7f(h7fVar);
                while (g7fVar.hasNext()) {
                    boolean z3 = z;
                    try {
                        ((j6l) g7fVar.next()).o(d7lVarL, size, true);
                    } catch (RuntimeException e) {
                        ks3.D(e);
                    }
                    z = z3;
                }
                boolean z4 = z;
                d7lVarL.F(k6lVar.s);
                if (i4 == 0) {
                    k6lVar.x.getClass();
                    d7lVarM = d7lVarL;
                }
                i3++;
                z = z4;
                i2 = 1;
            }
            boolean z5 = z;
            int size2 = arrayList2.size();
            int i5 = 0;
            while (i5 < size2) {
                int i6 = i5 + 1;
                b2l b2lVar = (b2l) arrayList2.get(i5);
                arrayList.remove(b2lVar);
                map.remove(Integer.valueOf(((d7l) b2lVar).j.getId()));
                h7fVar.getClass();
                g7f g7fVar2 = new g7f(h7fVar);
                while (g7fVar2.hasNext()) {
                    try {
                        ((j6l) g7fVar2.next()).L(b2lVar, false);
                    } catch (RuntimeException e2) {
                        ks3.D(e2);
                    }
                }
                k6lVar.t.post(new wr9((byte) 21, k6lVar, b2lVar, false));
                i5 = i6;
            }
            if (z2 && k6lVar.n == 0) {
                if (arrayList.isEmpty()) {
                    d7lVarM = k6lVar.m(false);
                    k6lVar.g(d7lVarM, 0);
                }
                k6lVar.f(d7lVarM, k6lVar.m(true), true);
            } else if (arrayList.isEmpty() || z5) {
                k6lVar.f(d7lVarM, k6lVar.m(false), true);
            } else {
                k6lVar.C((b2l) arrayList.get(i), 2);
            }
            h7fVar.getClass();
            g7f g7fVar3 = new g7f(h7fVar);
            while (g7fVar3.hasNext()) {
                j6l j6lVar = (j6l) g7fVar3.next();
                try {
                    arrayList.size();
                    j6lVar.d(k6lVar.n);
                } catch (RuntimeException e3) {
                    ks3.D(e3);
                }
            }
            k6lVar.n(h6lVar);
        } catch (Throwable th) {
            arrayList.clear();
            map.clear();
            k6lVar.o = null;
            k6lVar.n(h6lVar);
            throw th;
        }
    }

    public final void q(int i) {
        SharedPreferences.Editor editorEdit = ((SharedPreferences) ((b59) this.e).get()).edit();
        editorEdit.putInt("phase", vep.A(i));
        editorEdit.apply();
    }

    public final void r() {
        bq1 bq1Var = (UrlFieldEditText) this.d;
        int marginStart = ((i2c) bq1Var.getLayoutParams()).getMarginStart();
        int marginEnd = ((i2c) bq1Var.getLayoutParams()).getMarginEnd();
        ValueAnimator valueAnimator = (ValueAnimator) this.f;
        int iIntValue = valueAnimator != null ? ((Integer) valueAnimator.getAnimatedValue()).intValue() : marginStart;
        ValueAnimator valueAnimator2 = (ValueAnimator) this.g;
        int iIntValue2 = valueAnimator2 != null ? ((Integer) valueAnimator2.getAnimatedValue()).intValue() : marginEnd;
        if (marginStart == iIntValue && marginEnd == iIntValue2) {
            return;
        }
        i2c i2cVar = (i2c) bq1Var.getLayoutParams();
        i2cVar.setMarginStart(iIntValue);
        i2cVar.setMarginEnd(iIntValue2);
        bq1Var.setLayoutParams(i2cVar);
    }

    public final String toString() {
        switch (this.a) {
            case 6:
                return "Adapter in state " + ((rr) this.f) + " completed in " + this.c + " with description: " + ((String) this.g);
            default:
                return super.toString();
        }
    }
}
