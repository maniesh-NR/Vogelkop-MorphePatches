package defpackage;

import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class p91 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ aog b;

    public /* synthetic */ p91(aog aogVar, byte b) {
        this.a = b;
        this.b = aogVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        aog aogVar = this.b;
        switch (b) {
            case 0:
                aogVar.q.setValue((gcb) obj);
                aogVar.r();
                break;
            case 1:
                aogVar.r.setValue(((b2c) obj).R());
                aogVar.q();
                break;
            default:
                Function0 function0 = (Function0) obj;
                Handler handler = aogVar.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    function0.invoke();
                } else {
                    Handler handler2 = aogVar.getHandler();
                    if (handler2 != null) {
                        handler2.post(new l31(function0, (byte) 2));
                    }
                }
                break;
        }
        return Unit.a;
    }
}
