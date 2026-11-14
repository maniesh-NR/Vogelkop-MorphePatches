package defpackage;

import com.opera.android.BrowserActivity;
import java.util.function.IntConsumer;

/* loaded from: classes.dex */
public final /* synthetic */ class ut3 implements IntConsumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ut3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                int i2 = BrowserActivity.E1;
                tg7 tg7Var = ((BrowserActivity) obj).N0;
                if (tg7Var != null) {
                    tg7Var.d = i;
                    gtj gtjVar = (gtj) tg7Var.e;
                    if (gtjVar != null) {
                        gtjVar.h(i);
                        break;
                    }
                }
                break;
            case 1:
                qi8 qi8Var = ((pi8) obj).c;
                if (!qi8Var.k0) {
                    qi8Var.O0(1, 19, Integer.valueOf(i));
                    break;
                }
                break;
            default:
                pr prVar = ((cv8) obj).v;
                if (i != prVar.a) {
                    prVar.a = i;
                    prVar.E();
                    break;
                }
                break;
        }
    }
}
