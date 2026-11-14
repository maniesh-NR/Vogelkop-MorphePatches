package defpackage;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class mmo extends ozb implements Function1 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ yoo j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mmo(yoo yooVar, byte b) {
        super(1);
        this.i = b;
        this.j = yooVar;
    }

    public final Object invoke(Object obj) {
        switch (this.i) {
            case 0:
                ylp ylpVar = (ylp) this.j.d;
                if (ylpVar != null) {
                    uro uroVarD = ocp.d(ylpVar);
                    if (this.j.d != uroVarD.a) {
                        uroVarD = null;
                    }
                    if (uroVarD != null) {
                        uroVarD.a = null;
                        uroVarD.b = null;
                        uroVarD.c = null;
                        uroVarD.d = null;
                    }
                }
                super/*pxo*/.a();
                return null;
            default:
                ViewGroup viewGroup = (ViewGroup) obj;
                bap bapVar = this.j.e;
                if (bapVar.a && !bapVar.c && !bapVar.b) {
                    yoo yooVar = this.j;
                    yooVar.f = viewGroup;
                    yooVar.e();
                }
                return Unit.a;
        }
    }
}
