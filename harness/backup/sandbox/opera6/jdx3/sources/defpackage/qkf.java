package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.opera.android.OperaApplication;
import com.opera.android.firebase.OperaFirebaseMessagingService;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class qkf implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ OperaFirebaseMessagingService b;

    public /* synthetic */ qkf(OperaFirebaseMessagingService operaFirebaseMessagingService, byte b) {
        this.a = b;
        this.b = operaFirebaseMessagingService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        FirebaseMessagingService firebaseMessagingService = this.b;
        switch (b) {
            case 0:
                int i = OperaFirebaseMessagingService.b;
                Context applicationContext = firebaseMessagingService.getApplicationContext();
                String[] strArr = OperaApplication.K;
                Iterator it = ((OperaApplication) applicationContext.getApplicationContext()).q().a.values().iterator();
                while (it.hasNext()) {
                    ((c59) it.next()).f(false);
                }
                break;
            default:
                String[] strArr2 = OperaApplication.K;
                slk slkVarM = ((OperaApplication) firebaseMessagingService.getApplicationContext()).M();
                mcj mcjVar = slkVarM.b.a;
                ((SharedPreferences) ((b59) mcjVar.a).get()).edit().putLong("last_push", System.currentTimeMillis()).apply();
                slkVarM.b(null);
                break;
        }
    }
}
