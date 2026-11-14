package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public class ln9 extends gn9 {
    @Override // defpackage.gn9
    public final void a(View view, Object obj) {
        ((y2m) obj).c(view);
    }

    @Override // defpackage.gn9
    public final void b(Object obj, ArrayList arrayList) {
        y2m y2mVar = (y2m) obj;
        if (y2mVar != null) {
            int i = 0;
            if (y2mVar instanceof j3m) {
                j3m j3mVar = (j3m) y2mVar;
                int size = j3mVar.F.size();
                while (i < size) {
                    b(j3mVar.Q(i), arrayList);
                    i++;
                }
                return;
            }
            if (gn9.k(y2mVar.e) && gn9.k(y2mVar.f)) {
                int size2 = arrayList.size();
                while (i < size2) {
                    y2mVar.c((View) arrayList.get(i));
                    i++;
                }
            }
        }
    }

    @Override // defpackage.gn9
    public final void c(Object obj) {
        ((t2m) obj).h();
    }

    @Override // defpackage.gn9
    public final void d(Object obj, fh4 fh4Var) {
        t2m t2mVar = (t2m) obj;
        t2mVar.g = fh4Var;
        if (!t2mVar.b) {
            t2mVar.d = (byte) 2;
        } else {
            t2mVar.i();
            t2mVar.e.a(0.0f);
        }
    }

    @Override // defpackage.gn9
    public final void e(ViewGroup viewGroup, Object obj) {
        h3m.a(viewGroup, (y2m) obj);
    }

    @Override // defpackage.gn9
    public final boolean g(Object obj) {
        return obj instanceof y2m;
    }

    @Override // defpackage.gn9
    public final Object h(Object obj) {
        if (obj != null) {
            return ((y2m) obj).clone();
        }
        return null;
    }

    @Override // defpackage.gn9
    public final Object i(ViewGroup viewGroup, Object obj) {
        y2m y2mVar = (y2m) obj;
        ArrayList arrayList = h3m.c;
        if (!arrayList.contains(viewGroup) && viewGroup.isLaidOut() && Build.VERSION.SDK_INT >= 34) {
            if (y2mVar.w()) {
                arrayList.add(viewGroup);
                y2m y2mVarM = y2mVar.clone();
                j3m j3mVar = new j3m();
                j3mVar.P(y2mVarM);
                h3m.c(viewGroup, j3mVar);
                viewGroup.setTag(2131364835, null);
                g3m g3mVar = new g3m();
                g3mVar.a = j3mVar;
                g3mVar.b = viewGroup;
                viewGroup.addOnAttachStateChangeListener(g3mVar);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(g3mVar);
                viewGroup.invalidate();
                t2m t2mVar = new t2m(j3mVar);
                j3mVar.z = t2mVar;
                j3mVar.b(t2mVar);
                return j3mVar.z;
            }
            qp2.o("The Transition must support seeking.");
        }
        return null;
    }

    @Override // defpackage.gn9
    public final boolean l() {
        return true;
    }

    @Override // defpackage.gn9
    public final boolean m(Object obj) {
        boolean zW = ((y2m) obj).w();
        if (!zW) {
            Objects.toString(obj);
        }
        return zW;
    }

    @Override // defpackage.gn9
    public final Object n(Object obj, Object obj2, Object obj3) {
        y2m y2mVar = (y2m) obj;
        y2m y2mVar2 = (y2m) obj2;
        y2m y2mVar3 = (y2m) obj3;
        if (y2mVar == null) {
            y2mVar = y2mVar2 != null ? y2mVar2 : null;
        } else if (y2mVar2 != null) {
            j3m j3mVar = new j3m();
            j3mVar.P(y2mVar);
            j3mVar.P(y2mVar2);
            j3mVar.G = false;
            y2mVar = j3mVar;
        }
        if (y2mVar3 == null) {
            return y2mVar;
        }
        j3m j3mVar2 = new j3m();
        if (y2mVar != null) {
            j3mVar2.P(y2mVar);
        }
        j3mVar2.P(y2mVar3);
        return j3mVar2;
    }

    @Override // defpackage.gn9
    public final Object o(Object obj, Object obj2) {
        j3m j3mVar = new j3m();
        if (obj != null) {
            j3mVar.P((y2m) obj);
        }
        j3mVar.P((y2m) obj2);
        return j3mVar;
    }

    @Override // defpackage.gn9
    public final void p(Object obj, View view, ArrayList arrayList) {
        ((y2m) obj).b(new in9(view, arrayList));
    }

    @Override // defpackage.gn9
    public final void q(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((y2m) obj).b(new jn9(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // defpackage.gn9
    public final void r(Object obj, float f) {
        t2m t2mVar = (t2m) obj;
        boolean z = t2mVar.b;
        if (z) {
            j3m j3mVar = t2mVar.h;
            long j = j3mVar.y;
            long j2 = (long) (f * j);
            if (j2 == 0) {
                j2 = 1;
            }
            if (j2 == j) {
                j2 = j - 1;
            }
            if (t2mVar.e != null) {
                qp2.n("setCurrentPlayTimeMillis() called after animation has been started");
                return;
            }
            long j3 = t2mVar.a;
            if (j2 == j3 || !z) {
                return;
            }
            if (!t2mVar.c) {
                if (j2 == 0 && j3 > 0) {
                    j2 = -1;
                } else if (j2 == j && j3 < j) {
                    j2 = j + 1;
                }
                if (j2 != j3) {
                    j3mVar.G(j2, j3);
                    t2mVar.a = j2;
                }
            }
            uuj uujVar = t2mVar.f;
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            int i = (uujVar.a + 1) % 20;
            uujVar.a = i;
            ((long[]) uujVar.b)[i] = jCurrentAnimationTimeMillis;
            ((float[]) uujVar.c)[i] = j2;
        }
    }

    @Override // defpackage.gn9
    public final void s(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            gn9.j(rect, view);
            ((y2m) obj).I(new hn9(rect, (byte) 0));
        }
    }

    @Override // defpackage.gn9
    public final void t(Object obj, Rect rect) {
        ((y2m) obj).I(new hn9(rect, (byte) 1));
    }

    @Override // defpackage.gn9
    public final void u(Fragment fragment, Object obj, jh jhVar, Runnable runnable) {
        v(obj, jhVar, null, runnable);
    }

    @Override // defpackage.gn9
    public final void v(Object obj, jh jhVar, bl6 bl6Var, Runnable runnable) {
        y2m y2mVar = (y2m) obj;
        a32 a32Var = new a32(bl6Var, y2mVar, runnable, (byte) 14);
        synchronized (jhVar) {
            while (jhVar.b) {
                try {
                    jhVar.wait();
                } catch (InterruptedException unused) {
                }
            }
            if (((a32) jhVar.c) != a32Var) {
                jhVar.c = a32Var;
                if (jhVar.a) {
                    bl6 bl6Var2 = (bl6) a32Var.b;
                    y2m y2mVar2 = (y2m) a32Var.c;
                    Runnable runnable2 = (Runnable) a32Var.d;
                    if (bl6Var2 == null) {
                        y2mVar2.cancel();
                        runnable2.run();
                    } else {
                        bl6Var2.run();
                    }
                }
            }
        }
        y2mVar.b(new kn9(runnable, (byte) 0));
    }

    @Override // defpackage.gn9
    public final void w(Object obj, View view, ArrayList arrayList) {
        j3m j3mVar = (j3m) obj;
        ArrayList arrayList2 = j3mVar.f;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            gn9.f((View) arrayList.get(i), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(j3mVar, arrayList);
    }

    @Override // defpackage.gn9
    public final void x(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        j3m j3mVar = (j3m) obj;
        if (j3mVar != null) {
            ArrayList arrayList3 = j3mVar.f;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            z(j3mVar, arrayList, arrayList2);
        }
    }

    @Override // defpackage.gn9
    public final Object y(Object obj) {
        if (obj == null) {
            return null;
        }
        j3m j3mVar = new j3m();
        j3mVar.P((y2m) obj);
        return j3mVar;
    }

    public final void z(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        y2m y2mVar = (y2m) obj;
        int i = 0;
        if (y2mVar instanceof j3m) {
            j3m j3mVar = (j3m) y2mVar;
            int size = j3mVar.F.size();
            while (i < size) {
                z(j3mVar.Q(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (gn9.k(y2mVar.e)) {
            ArrayList arrayList3 = y2mVar.f;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size2) {
                    y2mVar.c((View) arrayList2.get(i));
                    i++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    y2mVar.D((View) arrayList.get(size3));
                }
            }
        }
    }
}
