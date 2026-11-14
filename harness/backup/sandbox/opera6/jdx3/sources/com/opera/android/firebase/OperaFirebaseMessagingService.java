package com.opera.android.firebase;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.opera.android.OperaApplication;
import defpackage.q9c;
import defpackage.qkf;
import defpackage.vml;

/* loaded from: classes.dex */
public class OperaFirebaseMessagingService extends FirebaseMessagingService {
    public static final /* synthetic */ int b = 0;
    public final q9c a = new q9c();

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c() {
        if (sfe.g0(this)) {
            return true;
        }
        String[] strArr = OperaApplication.K;
        return ((OperaApplication) getApplicationContext()).U();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate() {
        super/*android.app.Service*/.onCreate();
        if (c()) {
            return;
        }
        this.a.a.onCreate(getApplicationContext());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0356 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0378 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x021e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMessageReceived(rth r30) throws java.util.concurrent.ExecutionException, org.json.JSONException, java.lang.InterruptedException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 2480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.opera.android.firebase.OperaFirebaseMessagingService.onMessageReceived(rth):void");
    }

    public final void onNewToken(String str) {
        if (c()) {
            return;
        }
        vml.c(new qkf(this, (byte) 0));
    }
}
