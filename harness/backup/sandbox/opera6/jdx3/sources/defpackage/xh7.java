package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public final class xh7 implements w6f {
    public final /* synthetic */ byte a;
    public final i7f b;
    public final Object c;
    public final Object d;
    public final Object e;

    public xh7() {
        this.a = (byte) 0;
        this.b = new i7f();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new LinkedHashMap();
    }

    public xh7(nx5 nx5Var, fs6 fs6Var) {
        this.a = (byte) 1;
        this.b = new i7f();
        nak nakVarF = z4o.f(l08.a);
        this.c = nakVarF;
        this.d = z4o.f(Boolean.FALSE);
        List listSingletonList = Collections.singletonList(new cw(nakVarF, this, (byte) 10));
        h58 h58Var = qoc.g;
        ArrayList arrayList = new ArrayList(k95.o(h58Var, 10));
        Iterator it = h58Var.iterator();
        while (true) {
            byte b = 11;
            mt5 mt5Var = null;
            if (!it.hasNext()) {
                ArrayList arrayListV = CollectionsKt.V(arrayList, listSingletonList);
                int i = ma9.a;
                this.e = new ur4(arrayListV, h.a, -2, h04.a, (byte) 1);
                w7d.i(ma9.b(qbe.t(nb6.l(xf8.t(fs6Var.d), xf8.t(fs6Var.f), (nak) this.d, new ooc(4, null, (byte) 0))), new zp6((byte) 9, mt5Var, this)), nx5Var, new fb9(b, mt5Var, this));
                return;
            }
            arrayList.add(new xd6(new hz1((qoc) it.next(), this, (mt5) null, (byte) 17), (byte) 11));
        }
    }

    @Override // defpackage.w6f
    public final void F(Object obj) {
        byte b = this.a;
        i7f i7fVar = this.b;
        switch (b) {
            case 0:
                i7fVar.b((okb) obj);
                break;
            default:
                i7fVar.b((pi9) obj);
                break;
        }
    }

    @Override // defpackage.w6f
    public final void H(Object obj) {
        byte b = this.a;
        i7f i7fVar = this.b;
        switch (b) {
            case 0:
                i7fVar.c((okb) obj);
                break;
            default:
                i7fVar.c((pi9) obj);
                break;
        }
    }

    public final float a(View view) {
        Object animatedValue;
        ValueAnimator valueAnimator = (ValueAnimator) ((LinkedHashMap) this.d).get(view);
        if (valueAnimator == null || (animatedValue = valueAnimator.getAnimatedValue()) == null) {
            return 0.0f;
        }
        return ((Float) animatedValue).floatValue();
    }

    public final float b() {
        Iterator it = ((LinkedHashMap) this.d).values().iterator();
        float f = 0.0f;
        while (it.hasNext()) {
            float fFloatValue = ((Float) ((ValueAnimator) it.next()).getAnimatedValue()).floatValue();
            if (f < fFloatValue) {
                f = fFloatValue;
            }
        }
        return f;
    }

    public final void c() {
        g7f g7fVar = new g7f(this.b);
        while (g7fVar.hasNext()) {
            okb okbVar = (okb) g7fVar.next();
            byte b = okbVar.a;
            Object obj = okbVar.b;
            switch (b) {
                case 0:
                    ((rkb) obj).a.invalidate();
                    break;
                case 1:
                    ((f0e) obj).U();
                    break;
                default:
                    ((ev7) obj).j();
                    break;
            }
        }
    }

    public final qoc e(poc pocVar) {
        int iOrdinal = pocVar.b.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                return null;
            }
            return qoc.b;
        }
        on7 on7Var = pn7.b;
        long jY0 = cs5.y0(pocVar.c - System.currentTimeMillis(), un7.d);
        return pn7.c(jY0, cs5.x0(1, un7.h)) > 0 ? qoc.e : pn7.c(jY0, cs5.x0(2, un7.g)) > 0 ? qoc.d : pn7.c(jY0, cs5.x0(5, un7.f)) > 0 ? qoc.c : qoc.b;
    }
}
