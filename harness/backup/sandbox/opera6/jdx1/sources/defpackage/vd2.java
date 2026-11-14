package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class vd2 implements Runnable {
    public final /* synthetic */ byte a;
    public int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final /* synthetic */ Object f;

    public vd2(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.a = (byte) 2;
        this.b = i;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f = arrayList4;
    }

    public vd2(vzk vzkVar, d06 d06Var, d06 d06Var2, int i) {
        this.a = (byte) 1;
        this.f = vzkVar;
        this.c = d06Var;
        this.d = d06Var2;
        this.b = i;
        this.e = a(this);
    }

    public vd2(xd2 xd2Var, List list, List list2, int i, vl9 vl9Var) {
        this.a = (byte) 0;
        this.f = xd2Var;
        this.c = list;
        this.d = list2;
        this.b = i;
        this.e = vl9Var;
    }

    public final ViewPropertyAnimator a(vd2 vd2Var) {
        vzk vzkVar = (vzk) this.f;
        int i = this.b;
        if (i == -1) {
            ((d06) this.c).m((ImageView) vzkVar.a);
        } else if (i == 0) {
            ((d06) this.d).m((ImageView) vzkVar.a);
        }
        return ((ImageView) vzkVar.a).animate().setInterpolator(lf1.f).setDuration(100L).scaleX(this.b == -1 ? 0.0f : 1.0f).withEndAction(vd2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object[] objArr = 0;
        Object obj = this.f;
        switch (b) {
            case 0:
                ((xd2) obj).c.execute(new vr9((byte) 2, (Object) this, (Object) uup.k(new ud2(this), true), (boolean) (objArr == true ? 1 : 0)));
                return;
            case 1:
                int i = this.b + 1;
                this.b = i;
                if (i == 0) {
                    a(this);
                    return;
                } else {
                    if (i == 1) {
                        ((vzk) obj).d = null;
                        return;
                    }
                    return;
                }
        }
        for (int i2 = 0; i2 < this.b; i2++) {
            View view = (View) ((ArrayList) this.c).get(i2);
            String str = (String) ((ArrayList) this.d).get(i2);
            WeakHashMap weakHashMap = r5n.a;
            view.setTransitionName(str);
            ((View) ((ArrayList) this.e).get(i2)).setTransitionName((String) ((ArrayList) obj).get(i2));
        }
    }
}
