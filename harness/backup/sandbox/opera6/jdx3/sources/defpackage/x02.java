package defpackage;

import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class x02 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a12 b;
    public final /* synthetic */ String c;

    public /* synthetic */ x02(a12 a12Var, String str, byte b) {
        this.a = b;
        this.b = a12Var;
        this.c = str;
    }

    public final Object invoke() {
        byte b = this.a;
        String str = this.c;
        a12 a12Var = this.b;
        switch (b) {
            case 0:
                SharedPreferences.Editor editorEdit = ((SharedPreferences) a12Var.b.get()).edit();
                editorEdit.remove(str);
                editorEdit.apply();
                return Unit.a;
            default:
                return ((SharedPreferences) a12Var.b.get()).getString(str, null);
        }
    }
}
