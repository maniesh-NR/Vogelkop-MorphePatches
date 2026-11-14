package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.opera.android.custom_views.OperaActionMenuItemView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ne implements lud {
    public final Context a;
    public Context b;
    public itd c;
    public final LayoutInflater d;
    public kud e;
    public qud f;
    public me g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public le o;
    public le p;
    public vr9 q;
    public u59 r;
    public final SparseBooleanArray n = new SparseBooleanArray();
    public final tw2 s = new tw2(this, (byte) 4);

    public ne(Context context) {
        this.a = context;
        this.d = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v4, types: [pud] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final View a(ptd ptdVar, View view, ViewGroup viewGroup) {
        View actionView = ptdVar.getActionView();
        if (actionView == null || ptdVar.c()) {
            OperaActionMenuItemView operaActionMenuItemView = view instanceof pud ? (pud) view : (pud) this.d.inflate(2131558402, viewGroup, false);
            operaActionMenuItemView.d(ptdVar);
            OperaActionMenuItemView operaActionMenuItemView2 = operaActionMenuItemView;
            operaActionMenuItemView2.k = (qe) this.f;
            u59 u59Var = this.r;
            if (u59Var == null) {
                u59Var = new u59(this, (byte) 5);
                this.r = u59Var;
            }
            operaActionMenuItemView2.m = u59Var;
            actionView = operaActionMenuItemView;
        }
        actionView.setVisibility(ptdVar.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((qe) viewGroup).getClass();
        if (!(layoutParams instanceof pe)) {
            actionView.setLayoutParams(qe.i(layoutParams));
        }
        return actionView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lud
    public final boolean b(akk akkVar) {
        boolean z;
        if (akkVar.hasVisibleItems()) {
            akk akkVar2 = akkVar;
            while (true) {
                itd itdVar = akkVar2.A;
                if (itdVar == this.c) {
                    break;
                }
                akkVar2 = (akk) itdVar;
            }
            ptd ptdVar = akkVar2.B;
            ViewGroup viewGroup = (ViewGroup) this.f;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof pud) && ((pud) childAt).k() == ptdVar) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                int size = akkVar.f.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = akkVar.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                le leVar = new le(this, this.b, akkVar, view);
                this.p = leVar;
                leVar.h = z;
                eud eudVar = leVar.j;
                if (eudVar != null) {
                    eudVar.n(z);
                }
                le leVar2 = this.p;
                if (!leVar2.b()) {
                    if (leVar2.f == null) {
                        qp2.n("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    leVar2.d(0, 0, false, false);
                }
                kud kudVar = this.e;
                if (kudVar != null) {
                    kudVar.p(akkVar);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.lud
    public final boolean c(ptd ptdVar) {
        return false;
    }

    @Override // defpackage.lud
    public final void d(kud kudVar) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lud
    public final void e() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.f;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            itd itdVar = this.c;
            if (itdVar != null) {
                itdVar.i();
                ArrayList arrayListL = this.c.l();
                int size = arrayListL.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    ptd ptdVar = (ptd) arrayListL.get(i2);
                    if ((ptdVar.x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        ptd ptdVarK = childAt instanceof pud ? ((pud) childAt).k() : null;
                        View viewA = a(ptdVar, childAt, viewGroup);
                        if (ptdVar != ptdVarK) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((ViewGroup) this.f).addView(viewA, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.g) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f).requestLayout();
        itd itdVar2 = this.c;
        if (itdVar2 != null) {
            itdVar2.i();
            ArrayList arrayList2 = itdVar2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ff ffVar = ((ptd) arrayList2.get(i3)).A;
                if (ffVar != null) {
                    ffVar.b = this;
                }
            }
        }
        itd itdVar3 = this.c;
        if (itdVar3 != null) {
            itdVar3.i();
            arrayList = itdVar3.j;
        }
        if (this.h && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((ptd) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z = true;
            }
        }
        me meVar = this.g;
        if (z) {
            if (meVar == null) {
                meVar = new me(this, this.a);
                this.g = meVar;
            }
            ViewGroup viewGroup3 = (ViewGroup) meVar.getParent();
            if (viewGroup3 != this.f) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.g);
                }
                qe qeVar = (qe) this.f;
                me meVar2 = this.g;
                qeVar.getClass();
                pe peVarH = qe.h();
                peVarH.a = true;
                qeVar.addView(meVar2, peVarH);
            }
        } else if (meVar != null) {
            Object parent = meVar.getParent();
            Object obj = this.f;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.g);
            }
        }
        ((qe) this.f).s = this.h;
    }

    @Override // defpackage.lud
    public final void f(itd itdVar, boolean z) {
        j();
        le leVar = this.p;
        if (leVar != null && leVar.b()) {
            leVar.j.dismiss();
        }
        kud kudVar = this.e;
        if (kudVar != null) {
            kudVar.f(itdVar, z);
        }
    }

    @Override // defpackage.lud
    public final boolean g() {
        ArrayList arrayListL;
        int size;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        itd itdVar = this.c;
        View view = null;
        if (itdVar != null) {
            arrayListL = itdVar.l();
            size = arrayListL.size();
        } else {
            arrayListL = null;
            size = 0;
        }
        int i2 = this.l;
        int i3 = this.k;
        ViewGroup viewGroup = (ViewGroup) this.f;
        int i4 = 0;
        boolean z4 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            ptd ptdVar = (ptd) arrayListL.get(i4);
            int i7 = ptdVar.y;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z4 = true;
            }
            if (this.m && ptdVar.C) {
                i2 = 0;
            }
            i4++;
        }
        if (this.h && (z4 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = this.n;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            ptd ptdVar2 = (ptd) arrayListL.get(i9);
            int i11 = ptdVar2.y;
            boolean z5 = (i11 & 2) == i ? z : false;
            int i12 = ptdVar2.b;
            if (z5) {
                View viewA = a(ptdVar2, view, viewGroup);
                viewA.measure(0, 0);
                int measuredWidth = viewA.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                ptdVar2.e(z);
                z2 = z;
            } else if ((i11 & 1) == z) {
                boolean z6 = sparseBooleanArray.get(i12);
                boolean z7 = ((i8 > 0 || z6) && i3 > 0) ? z : false;
                if (z7) {
                    View viewA2 = a(ptdVar2, view, viewGroup);
                    viewA2.measure(0, 0);
                    int measuredWidth2 = viewA2.getMeasuredWidth();
                    i3 -= measuredWidth2;
                    if (i10 == 0) {
                        i10 = measuredWidth2;
                    }
                    z7 &= i3 + i10 > 0 ? z : false;
                }
                if (z7 && i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                } else if (z6) {
                    sparseBooleanArray.put(i12, false);
                    int i13 = 0;
                    while (i13 < i9) {
                        ptd ptdVar3 = (ptd) arrayListL.get(i13);
                        if (ptdVar3.b == i12) {
                            z3 = z;
                            if ((ptdVar3.x & 32) == 32) {
                                i8++;
                            }
                            ptdVar3.e(false);
                        } else {
                            z3 = z;
                        }
                        i13++;
                        z = z3;
                    }
                }
                z2 = z;
                if (z7) {
                    i8--;
                }
                ptdVar2.e(z7);
            } else {
                z2 = z;
                ptdVar2.e(false);
            }
            i9++;
            z = z2;
            view = null;
            i = 2;
        }
        return z;
    }

    @Override // defpackage.lud
    public final boolean h(ptd ptdVar) {
        return false;
    }

    @Override // defpackage.lud
    public final void i(Context context, itd itdVar) {
        this.b = context;
        LayoutInflater.from(context);
        this.c = itdVar;
        Resources resources = context.getResources();
        if (!this.i) {
            this.h = true;
        }
        int i = 2;
        this.j = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.l = i;
        int measuredWidth = this.j;
        if (this.h) {
            if (this.g == null) {
                me meVar = new me(this, this.a);
                this.g = meVar;
                meVar.measure(0, 0);
            }
            measuredWidth -= this.g.getMeasuredWidth();
        } else {
            this.g = null;
        }
        this.k = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    public final boolean j() {
        Object obj;
        vr9 vr9Var = this.q;
        if (vr9Var != null && (obj = this.f) != null) {
            ((View) obj).removeCallbacks(vr9Var);
            this.q = null;
            return true;
        }
        le leVar = this.o;
        if (leVar == null) {
            return false;
        }
        if (leVar.b()) {
            leVar.j.dismiss();
        }
        return true;
    }

    public final boolean k() {
        le leVar = this.o;
        return leVar != null && leVar.b();
    }

    public final boolean l() {
        itd itdVar;
        boolean z = false;
        if (this.h && !k() && (itdVar = this.c) != null && this.f != null && this.q == null) {
            itdVar.i();
            if (!itdVar.j.isEmpty()) {
                vr9 vr9Var = new vr9((byte) 1, (Object) this, (Object) new le(this, this.b, this.c, this.g), z);
                this.q = vr9Var;
                ((View) this.f).post(vr9Var);
                return true;
            }
        }
        return false;
    }
}
