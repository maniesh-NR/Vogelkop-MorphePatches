package defpackage;

import android.view.View;
import com.opera.android.sheet.OperaBottomSheetBehavior;
import java.util.Set;

/* loaded from: classes.dex */
public final class mjf implements Runnable {
    public final /* synthetic */ byte a = 0;
    public boolean b;
    public int c;
    public final Object d;
    public final Object e;

    public mjf(OperaBottomSheetBehavior operaBottomSheetBehavior, View view, int i) {
        this.e = operaBottomSheetBehavior;
        this.d = view;
        this.c = i;
    }

    public mjf(t1h t1hVar, w8k w8kVar, boolean z, int i) {
        this.d = t1hVar;
        this.e = w8kVar;
        this.b = z;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z5o z5oVarB;
        switch (this.a) {
            case 0:
                OperaBottomSheetBehavior operaBottomSheetBehavior = (OperaBottomSheetBehavior) this.e;
                if (operaBottomSheetBehavior.q != 2) {
                    this.b = false;
                    return;
                }
                x5n x5nVar = operaBottomSheetBehavior.r;
                if (x5nVar == null || !x5nVar.f()) {
                    operaBottomSheetBehavior.J(this.c);
                } else {
                    ((View) this.d).postOnAnimation(this);
                }
                this.b = false;
                return;
            default:
                boolean z = this.b;
                t1h t1hVar = (t1h) this.d;
                w8k w8kVar = (w8k) this.e;
                if (z) {
                    int i = this.c;
                    t1hVar.getClass();
                    String str = w8kVar.a.a;
                    synchronized (t1hVar.k) {
                        z5oVarB = t1hVar.b(str);
                    }
                    t1h.d(z5oVarB, i);
                } else {
                    int i2 = this.c;
                    t1hVar.getClass();
                    String str2 = w8kVar.a.a;
                    synchronized (t1hVar.k) {
                        if (t1hVar.f.get(str2) != null) {
                            qs7.x().getClass();
                        } else {
                            Set set = (Set) t1hVar.h.get(str2);
                            if (set != null && set.contains(w8kVar)) {
                                t1h.d(t1hVar.b(str2), i2);
                            }
                        }
                    }
                }
                qs7 qs7VarX = qs7.x();
                qs7.B("StopWorkRunnable");
                String str3 = ((w8k) this.e).a.a;
                qs7VarX.getClass();
                return;
        }
    }
}
