package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public class bxe extends eog {
    public int i = 1;
    public String j = "";

    public final void onCreate(Bundle bundle) {
        int i;
        super/*androidx.fragment.app.i*/.onCreate(bundle);
        Bundle arguments = getArguments();
        this.i = vep.B(3)[arguments.getInt("option", 0)];
        this.j = arguments.getString("title", "");
        ps5 ps5Var = new ps5(getContext());
        ps5Var.c = this;
        ps5Var.e = this;
        int[] iArrB = vep.B(3);
        int length = iArrB.length;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 >= length) {
                ps5Var.setHeaderTitle(this.j);
                ps5Var.setGroupCheckable(1, true, true);
                this.d = ps5Var;
                this.h = new axe(this, (byte) 0);
                return;
            }
            int i3 = iArrB[i2];
            int iA = vep.A(i3);
            if (i3 == 1) {
                i = 2132021300;
            } else if (i3 == 2) {
                i = 2132021296;
            } else {
                if (i3 != 3) {
                    throw null;
                }
                i = 2132021301;
            }
            qtd qtdVarA = ps5Var.a(1, iA, 0, getString(i));
            if (i3 != this.i) {
                z = false;
            }
            qtdVarA.setChecked(z);
            i2++;
        }
    }
}
