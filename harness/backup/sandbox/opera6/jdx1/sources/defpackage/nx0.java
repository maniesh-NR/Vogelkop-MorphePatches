package defpackage;

import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class nx0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ nx0(Function0 function0, byte b) {
        this.a = b;
        this.b = function0;
    }

    public final Object invoke() {
        byte b = this.a;
        Function0 function0 = this.b;
        switch (b) {
            case 0:
                function0.invoke();
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                try {
                    break;
                } catch (SSLPeerUnverifiedException unused) {
                    return l08.a;
                }
            case 5:
                function0.invoke();
                break;
            case 6:
                function0.invoke();
                break;
            case 7:
                break;
            case 8:
                function0.invoke();
                break;
            default:
                function0.invoke();
                break;
        }
        return Unit.a;
    }
}
