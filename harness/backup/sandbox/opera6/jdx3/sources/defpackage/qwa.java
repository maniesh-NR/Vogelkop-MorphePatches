package defpackage;

import android.content.DialogInterface;
import androidx.fragment.app.r;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class qwa implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ywa b;

    public /* synthetic */ qwa(ywa ywaVar, byte b) {
        this.a = b;
        this.b = ywaVar;
    }

    public final Object invoke() {
        byte b = this.a;
        ywa ywaVar = this.b;
        switch (b) {
            case 0:
                xtb[] xtbVarArr = ywa.g;
                hy7 hy7Var = new hy7();
                hy7Var.a = ywaVar;
                return hy7Var;
            case 1:
                xtb[] xtbVarArr2 = ywa.g;
                return ywaVar.f0();
            case 2:
                xtb[] xtbVarArr3 = ywa.g;
                r rVarRequireActivity = ywaVar.requireActivity();
                az0 az0Var = new az0(rVarRequireActivity);
                az0Var.b(2132019271);
                az0Var.a(2132019268);
                return az0Var.setPositiveButton(2132019270, new sk(rVarRequireActivity, (byte) 9)).setNegativeButton(2132019269, (DialogInterface.OnClickListener) null).create();
            default:
                return ywaVar.getViewLifecycleOwner().getLifecycle();
        }
    }
}
