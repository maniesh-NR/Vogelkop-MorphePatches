package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class c5n {
    public final b5n a;
    public final nud b;

    public c5n(b5n b5nVar) {
        this.a = b5nVar;
        nud nudVar = new nud();
        nudVar.a = 0;
        this.b = nudVar;
    }

    public final View a(int i, int i2, int i3, int i4) {
        b5n b5nVar = this.a;
        int i5 = b5nVar.i();
        int iM = b5nVar.m();
        int i6 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewW = b5nVar.w(i);
            int iD = b5nVar.d(viewW);
            int iA = b5nVar.A(viewW);
            nud nudVar = this.b;
            nudVar.b = i5;
            nudVar.c = iM;
            nudVar.d = iD;
            nudVar.e = iA;
            if (i3 != 0) {
                nudVar.a = i3;
                if (nudVar.a()) {
                    return viewW;
                }
            }
            if (i4 != 0) {
                nudVar.a = i4;
                if (nudVar.a()) {
                    view = viewW;
                }
            }
            i += i6;
        }
        return view;
    }

    public final boolean b(View view) {
        b5n b5nVar = this.a;
        int i = b5nVar.i();
        int iM = b5nVar.m();
        int iD = b5nVar.d(view);
        int iA = b5nVar.A(view);
        nud nudVar = this.b;
        nudVar.b = i;
        nudVar.c = iM;
        nudVar.d = iD;
        nudVar.e = iA;
        nudVar.a = 24579;
        return nudVar.a();
    }
}
