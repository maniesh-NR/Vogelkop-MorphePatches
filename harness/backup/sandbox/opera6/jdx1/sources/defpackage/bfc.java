package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class bfc {
    public hsf a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    public bfc() {
        c();
    }

    public final void a() {
        boolean z = this.d;
        hsf hsfVar = this.a;
        this.c = z ? hsfVar.g() : hsfVar.k();
    }

    public final void b(int i, View view) {
        int iM = this.a.m();
        if (iM >= 0) {
            boolean z = this.d;
            hsf hsfVar = this.a;
            if (z) {
                this.c = this.a.m() + hsfVar.b(view);
            } else {
                this.c = hsfVar.e(view);
            }
            this.b = i;
            return;
        }
        this.b = i;
        boolean z2 = this.d;
        hsf hsfVar2 = this.a;
        if (!z2) {
            int iE = hsfVar2.e(view);
            int iK = iE - this.a.k();
            this.c = iE;
            if (iK > 0) {
                int iG = (this.a.g() - Math.min(0, (this.a.g() - iM) - this.a.b(view))) - (this.a.c(view) + iE);
                if (iG < 0) {
                    this.c -= Math.min(iK, -iG);
                    return;
                }
                return;
            }
            return;
        }
        int iG2 = (hsfVar2.g() - iM) - this.a.b(view);
        this.c = this.a.g() - iG2;
        if (iG2 > 0) {
            int iC = this.c - this.a.c(view);
            int iK2 = this.a.k();
            int iMin = iC - (Math.min(this.a.e(view) - iK2, 0) + iK2);
            if (iMin < 0) {
                this.c = Math.min(iG2, -iMin) + this.c;
            }
        }
    }

    public final void c() {
        this.b = -1;
        this.c = LinearLayoutManager.INVALID_OFFSET;
        this.d = false;
        this.e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.e + '}';
    }
}
