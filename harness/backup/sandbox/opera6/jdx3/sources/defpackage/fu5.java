package defpackage;

import com.opera.android.continue_on_booking.NativeContinueOnBookingStorage;
import com.opera.api.Callback;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class fu5 implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ku5 b;

    public /* synthetic */ fu5(ku5 ku5Var, byte b) {
        this.a = b;
        this.b = ku5Var;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        ku5 ku5Var = this.b;
        switch (b) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    c5o c5oVar = ku5Var.a;
                    fu5 fu5Var = new fu5(ku5Var, (byte) 1);
                    ArrayList arrayList = (ArrayList) c5oVar.b;
                    if (arrayList == null) {
                        fu5Var.run(c5oVar.s());
                    } else {
                        arrayList.add(fu5Var);
                    }
                    NativeContinueOnBookingStorage nativeContinueOnBookingStorage = ku5Var.b;
                    eu5 eu5Var = ku5Var.h;
                    NativeContinueOnBookingStorage.EventHandler eventHandler = nativeContinueOnBookingStorage.a;
                    if (eventHandler == null) {
                        eventHandler = new NativeContinueOnBookingStorage.EventHandler();
                        nativeContinueOnBookingStorage.a = eventHandler;
                    }
                    eventHandler.a.b(eu5Var);
                    break;
                }
                break;
            default:
                if (((lu5) obj) != lu5.b) {
                    if (ku5Var.a()) {
                        ku5Var.f(new gu5(ku5Var, (byte) 3));
                        break;
                    }
                } else {
                    ku5Var.f(new gu5(ku5Var, (byte) 2));
                    break;
                }
                break;
        }
    }
}
