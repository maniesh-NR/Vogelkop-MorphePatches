package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.flexbox.FlexboxLayoutManager;

/* loaded from: classes.dex */
public final class z79 {
    public int a;
    public int b;
    public int c;
    public int d = 0;
    public boolean e;
    public boolean f;
    public boolean g;
    public final /* synthetic */ FlexboxLayoutManager h;

    public z79(FlexboxLayoutManager flexboxLayoutManager) {
        this.h = flexboxLayoutManager;
    }

    public final void a() {
        FlexboxLayoutManager flexboxLayoutManager = this.h;
        if (!flexboxLayoutManager.l() && flexboxLayoutManager.e) {
            this.c = this.e ? flexboxLayoutManager.m.g() : flexboxLayoutManager.getWidth() - flexboxLayoutManager.m.k();
            return;
        }
        boolean z = this.e;
        hsf hsfVar = flexboxLayoutManager.m;
        this.c = z ? hsfVar.g() : hsfVar.k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        this.a = -1;
        this.b = -1;
        this.c = LinearLayoutManager.INVALID_OFFSET;
        this.f = false;
        this.g = false;
        FlexboxLayoutManager flexboxLayoutManager = this.h;
        boolean zL = flexboxLayoutManager.l();
        boolean z = flexboxLayoutManager.b;
        if (zL) {
            if (z == 0) {
                this.e = flexboxLayoutManager.a == 1;
                return;
            } else {
                this.e = z == 2;
                return;
            }
        }
        if (z == 0) {
            this.e = flexboxLayoutManager.a == 3;
        } else {
            this.e = z == 2;
        }
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.a + ", mFlexLinePosition=" + this.b + ", mCoordinate=" + this.c + ", mPerpendicularCoordinate=" + this.d + ", mLayoutFromEnd=" + this.e + ", mValid=" + this.f + ", mAssignedFromSavedState=" + this.g + '}';
    }
}
