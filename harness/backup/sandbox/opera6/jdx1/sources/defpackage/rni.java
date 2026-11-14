package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.hardware.display.DisplayManager;
import android.view.Display;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class rni {
    public final Context a;
    public final kze b = new kze(Boolean.valueOf(a()));
    public final up1 c = new up1(this, (byte) 17);

    public rni(Context context, qdc qdcVar) {
        this.a = context;
        final byte b = 0;
        Function1 function1 = new Function1(this) { // from class: qni
            public final /* synthetic */ rni b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b2 = b;
                rni rniVar = this.b;
                switch (b2) {
                    case 0:
                        Context context2 = rniVar.a;
                        up1 up1Var = rniVar.c;
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("android.intent.action.SCREEN_ON");
                        intentFilter.addAction("android.intent.action.SCREEN_OFF");
                        context2.registerReceiver(up1Var, intentFilter);
                        break;
                    default:
                        rniVar.a.unregisterReceiver(rniVar.c);
                        break;
                }
                return Unit.a;
            }
        };
        final byte b2 = 1;
        oup.l0(qdcVar, function1, new Function1(this) { // from class: qni
            public final /* synthetic */ rni b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b22 = b2;
                rni rniVar = this.b;
                switch (b22) {
                    case 0:
                        Context context2 = rniVar.a;
                        up1 up1Var = rniVar.c;
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("android.intent.action.SCREEN_ON");
                        intentFilter.addAction("android.intent.action.SCREEN_OFF");
                        context2.registerReceiver(up1Var, intentFilter);
                        break;
                    default:
                        rniVar.a.unregisterReceiver(rniVar.c);
                        break;
                }
                return Unit.a;
            }
        }, (Function1) null, (Function1) null, 12);
    }

    public final boolean a() {
        for (Display display : ((DisplayManager) this.a.getSystemService("display")).getDisplays()) {
            if (display.getState() != 1) {
                return true;
            }
        }
        return false;
    }
}
