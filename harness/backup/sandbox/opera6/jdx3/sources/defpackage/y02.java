package defpackage;

import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class y02 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a12 b;

    public /* synthetic */ y02(a12 a12Var, byte b) {
        this.a = b;
        this.b = a12Var;
    }

    public final Object invoke() {
        byte b = this.a;
        a12 a12Var = this.b;
        switch (b) {
            case 0:
                SharedPreferences.Editor editorEdit = ((SharedPreferences) a12Var.b.get()).edit();
                editorEdit.clear();
                editorEdit.apply();
                return Unit.a;
            default:
                return ((SharedPreferences) a12Var.b.get()).getAll().keySet();
        }
    }
}
