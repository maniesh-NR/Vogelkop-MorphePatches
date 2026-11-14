package defpackage;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public class j3m extends y2m {
    public int H;
    public y2m[] K;
    public ArrayList F = new ArrayList();
    public boolean G = true;
    public boolean I = false;
    public int J = 0;

    @Override // defpackage.y2m
    public final void A(ViewGroup viewGroup) {
        super.A(viewGroup);
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            ((y2m) this.F.get(i)).A(viewGroup);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.y2m
    public final void B() {
        this.y = 0L;
        i3m i3mVar = new i3m(this, 0 == true ? 1 : 0);
        for (int i = 0; i < this.F.size(); i++) {
            y2m y2mVar = (y2m) this.F.get(i);
            y2mVar.b(i3mVar);
            y2mVar.B();
            long j = y2mVar.y;
            boolean z = this.G;
            long j2 = this.y;
            if (z) {
                this.y = Math.max(j2, j);
            } else {
                y2mVar.A = j2;
                this.y = j2 + j;
            }
        }
    }

    @Override // defpackage.y2m
    public final y2m C(x2m x2mVar) {
        super.C(x2mVar);
        return this;
    }

    @Override // defpackage.y2m
    public final void D(View view) {
        for (int i = 0; i < this.F.size(); i++) {
            ((y2m) this.F.get(i)).D(view);
        }
        this.f.remove(view);
    }

    @Override // defpackage.y2m
    public final void E(View view) {
        super.E(view);
        y2m[] y2mVarArr = this.K;
        this.K = null;
        if (y2mVarArr == null) {
            y2mVarArr = new y2m[this.F.size()];
        }
        y2m[] y2mVarArr2 = (y2m[]) this.F.toArray(y2mVarArr);
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            y2mVarArr2[i].E(view);
        }
        Arrays.fill(y2mVarArr2, (Object) null);
        this.K = y2mVarArr2;
    }

    @Override // defpackage.y2m
    public final void F() {
        ArrayList arrayList;
        if (this.F.isEmpty()) {
            N();
            p();
            return;
        }
        i3m i3mVar = new i3m();
        i3mVar.b = this;
        ArrayList arrayList2 = this.F;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ((y2m) obj).b(i3mVar);
        }
        this.H = this.F.size();
        if (this.G) {
            ArrayList arrayList3 = this.F;
            int size2 = arrayList3.size();
            while (i < size2) {
                Object obj2 = arrayList3.get(i);
                i++;
                ((y2m) obj2).F();
            }
            return;
        }
        int i3 = 1;
        while (true) {
            int size3 = this.F.size();
            arrayList = this.F;
            if (i3 >= size3) {
                break;
            }
            ((y2m) arrayList.get(i3 - 1)).b(new i3m((y2m) this.F.get(i3), (byte) 2));
            i3++;
        }
        y2m y2mVar = (y2m) arrayList.get(0);
        if (y2mVar != null) {
            y2mVar.F();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.y2m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(long r20, long r22) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j3m.G(long, long):void");
    }

    @Override // defpackage.y2m
    public final void H(long j) {
        ArrayList arrayList;
        this.c = j;
        if (j < 0 || (arrayList = this.F) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((y2m) this.F.get(i)).H(j);
        }
    }

    @Override // defpackage.y2m
    public final void I(hn9 hn9Var) {
        this.w = hn9Var;
        this.J |= 8;
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            ((y2m) this.F.get(i)).I(hn9Var);
        }
    }

    @Override // defpackage.y2m
    public final void J(TimeInterpolator timeInterpolator) {
        this.J |= 1;
        ArrayList arrayList = this.F;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((y2m) this.F.get(i)).J(timeInterpolator);
            }
        }
        this.d = timeInterpolator;
    }

    @Override // defpackage.y2m
    public final void K(cpj cpjVar) {
        super.K(cpjVar);
        this.J |= 4;
        if (this.F != null) {
            for (int i = 0; i < this.F.size(); i++) {
                ((y2m) this.F.get(i)).K(cpjVar);
            }
        }
    }

    @Override // defpackage.y2m
    public final void L(qs7 qs7Var) {
        this.v = qs7Var;
        this.J |= 2;
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            ((y2m) this.F.get(i)).L(qs7Var);
        }
    }

    @Override // defpackage.y2m
    public final void M(long j) {
        this.b = j;
    }

    @Override // defpackage.y2m
    public final String O(String str) {
        String strO = super.O(str);
        for (int i = 0; i < this.F.size(); i++) {
            StringBuilder sbR = p3p.r(strO, "\n");
            sbR.append(((y2m) this.F.get(i)).O(str.concat("  ")));
            strO = sbR.toString();
        }
        return strO;
    }

    public final void P(y2m y2mVar) {
        this.F.add(y2mVar);
        y2mVar.i = this;
        long j = this.c;
        if (j >= 0) {
            y2mVar.H(j);
        }
        if ((this.J & 1) != 0) {
            y2mVar.J(this.d);
        }
        if ((this.J & 2) != 0) {
            y2mVar.L(this.v);
        }
        if ((this.J & 4) != 0) {
            y2mVar.K(this.x);
        }
        if ((this.J & 8) != 0) {
            y2mVar.I(this.w);
        }
    }

    public final y2m Q(int i) {
        if (i < 0 || i >= this.F.size()) {
            return null;
        }
        return (y2m) this.F.get(i);
    }

    @Override // defpackage.y2m
    public final void c(View view) {
        for (int i = 0; i < this.F.size(); i++) {
            ((y2m) this.F.get(i)).c(view);
        }
        this.f.add(view);
    }

    @Override // defpackage.y2m
    public final void cancel() {
        super.cancel();
        y2m[] y2mVarArr = this.K;
        this.K = null;
        if (y2mVarArr == null) {
            y2mVarArr = new y2m[this.F.size()];
        }
        y2m[] y2mVarArr2 = (y2m[]) this.F.toArray(y2mVarArr);
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            y2mVarArr2[i].cancel();
        }
        Arrays.fill(y2mVarArr2, (Object) null);
        this.K = y2mVarArr2;
    }

    @Override // defpackage.y2m
    public final void f(k3m k3mVar) {
        View view = k3mVar.b;
        if (y(view)) {
            ArrayList arrayList = this.F;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                y2m y2mVar = (y2m) obj;
                if (y2mVar.y(view)) {
                    y2mVar.f(k3mVar);
                    k3mVar.c.add(y2mVar);
                }
            }
        }
    }

    @Override // defpackage.y2m
    public final void i(k3m k3mVar) {
        super.i(k3mVar);
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            ((y2m) this.F.get(i)).i(k3mVar);
        }
    }

    @Override // defpackage.y2m
    public final void j(k3m k3mVar) {
        View view = k3mVar.b;
        if (y(view)) {
            ArrayList arrayList = this.F;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                y2m y2mVar = (y2m) obj;
                if (y2mVar.y(view)) {
                    y2mVar.j(k3mVar);
                    k3mVar.c.add(y2mVar);
                }
            }
        }
    }

    @Override // defpackage.y2m
    /* renamed from: m */
    public final y2m clone() {
        j3m j3mVar = (j3m) super.clone();
        j3mVar.F = new ArrayList();
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            y2m y2mVarClone = ((y2m) this.F.get(i)).clone();
            j3mVar.F.add(y2mVarClone);
            y2mVarClone.i = j3mVar;
        }
        return j3mVar;
    }

    @Override // defpackage.y2m
    public final void o(ViewGroup viewGroup, t9l t9lVar, t9l t9lVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.b;
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            y2m y2mVar = (y2m) this.F.get(i);
            if (j > 0 && (this.G || i == 0)) {
                long j2 = y2mVar.b;
                if (j2 > 0) {
                    y2mVar.M(j2 + j);
                } else {
                    y2mVar.M(j);
                }
            }
            y2mVar.o(viewGroup, t9lVar, t9lVar2, arrayList, arrayList2);
        }
    }

    @Override // defpackage.y2m
    public final boolean v() {
        for (int i = 0; i < this.F.size(); i++) {
            if (((y2m) this.F.get(i)).v()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.y2m
    public final boolean w() {
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            if (!((y2m) this.F.get(i)).w()) {
                return false;
            }
        }
        return true;
    }
}
