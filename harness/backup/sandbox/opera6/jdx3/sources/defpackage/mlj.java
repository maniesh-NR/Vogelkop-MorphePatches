package defpackage;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class mlj {
    public final ysj a;
    public final View b;
    public o93 c;

    public mlj(ysj ysjVar, View view) {
        this.a = ysjVar;
        this.b = view;
    }

    public final void a(rxh rxhVar, int i) {
        o93 o93Var = this.c;
        if (o93Var != null) {
            o93Var.b(hjm.b, 3);
        }
        klj kljVar = new klj(rxhVar, i, this);
        ysj ysjVar = this.a;
        ysjVar.getClass();
        ysjVar.b(kljVar, ijm.b);
        this.c = kljVar;
    }

    public final void b(rxh rxhVar, int i, rxh rxhVar2, Function0 function0) {
        o93 o93Var = this.c;
        if (o93Var != null) {
            o93Var.b(hjm.b, 3);
        }
        llj lljVar = new llj(rxhVar, i, this, rxhVar2, function0);
        ysj ysjVar = this.a;
        ysjVar.getClass();
        ysjVar.b(lljVar, ijm.b);
        this.c = lljVar;
    }
}
