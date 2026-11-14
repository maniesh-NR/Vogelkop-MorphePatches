package defpackage;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

/* loaded from: classes.dex */
public abstract class i93 extends lj implements on9 {
    public final boolean r;
    public final rn9 s;

    public i93(int i) {
        this(i, 0, 14);
    }

    public i93(int i, int i2) {
        this(i, i2, 8);
    }

    public /* synthetic */ i93(int i, int i2, int i3) {
        this(i, (i3 & 2) != 0 ? 2131755021 : i2, (i3 & 4) != 0 ? fki.a : 2, (i3 & 8) != 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i93(int i, int i2, int i3, boolean z) {
        u7k u7kVarF = u7k.f(i3);
        u7kVarF.s(i);
        itl itlVar = (itl) u7kVarF.a;
        itlVar.b = i2;
        this(itlVar, z);
    }

    public i93(itl itlVar, boolean z) {
        super(itlVar);
        this.r = z;
        this.s = new rn9((Object) this, (Object) this, (byte) 0);
    }

    public h93 G0() {
        return ulp.b;
    }

    @Override // defpackage.on9
    public final qe6 H() {
        return this.j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.on9
    public oba a() {
        int[] intArray;
        Integer numValueOf;
        if (this instanceof o37) {
            n37 n37VarP = ((o37) this).r().p();
            if (n37VarP instanceof pn9) {
                return ((pn9) n37VarP).a();
            }
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            return new oba(3, 0, null);
        }
        if (arguments.containsKey("highlights")) {
            intArray = arguments.getIntArray("highlights");
            arguments.remove("highlights");
        } else {
            intArray = null;
        }
        if (arguments.containsKey("highlight_scroll_to_view_behavior")) {
            numValueOf = Integer.valueOf(arguments.getInt("highlight_scroll_to_view_behavior", 3));
            arguments.remove("highlight_scroll_to_view_behavior");
        } else {
            numValueOf = null;
        }
        return intArray == null ? new oba(3, 0, null) : new oba(intArray, numValueOf != null ? numValueOf.intValue() : 3);
    }

    @Override // defpackage.ltl
    public boolean onMenuItemClick(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131364146) {
            return false;
        }
        G0().s();
        return true;
    }

    @Override // defpackage.k24
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.r) {
            this.s.F();
        }
    }
}
