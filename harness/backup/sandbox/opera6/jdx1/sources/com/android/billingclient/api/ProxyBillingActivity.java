package com.android.billingclient.api;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzjn;
import defpackage.cnf;
import defpackage.mf3;
import defpackage.mgh;

@UsedByReflection("PlatformActivityProxy")
/* loaded from: classes.dex */
public class ProxyBillingActivity extends Activity {
    public ResultReceiver a;
    public boolean b;
    public boolean c;
    public int d;
    public long e;
    public boolean f;
    public cnf g;
    public mgh h;

    public static zzjn a(int i, Intent intent) {
        return intent == null ? i != -1 ? i != 0 ? i != 3 ? i != 4 ? zzjn.zzbm : zzjn.zzbl : zzjn.zzbk : zzjn.zzbj : zzjn.zzbi : intent.getExtras() == null ? zzjn.zzv : i == 5 ? zzjn.zzbI : zzjn.zza;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.Intent b(com.google.android.gms.internal.play_billing.zzjn r8, long r9, boolean r11) {
        /*
            r7 = this;
            android.content.Intent r0 = r7.c()
            java.lang.String r1 = "FAILURE_LOGGING_PAYLOAD"
            r2 = 0
            r3 = 2
            java.lang.String r4 = "DEBUG_MESSAGE"
            java.lang.String r5 = "RESPONSE_CODE"
            if (r11 == 0) goto L50
            cnf r11 = r7.g
            if (r11 == 0) goto L23
            java.lang.Object r6 = r11.c
            mf3 r6 = (defpackage.mf3) r6
            if (r6 == 0) goto L23
            int r8 = r6.a
            r0.putExtra(r5, r8)
            java.lang.String r8 = r6.c
            r0.putExtra(r4, r8)
            goto L74
        L23:
            if (r11 == 0) goto L50
            boolean r11 = r11.b
            if (r11 != 0) goto L50
            r8 = 3
            r0.putExtra(r5, r8)
            java.lang.String r11 = "Play Store is blocked."
            r0.putExtra(r4, r11)
            o1 r4 = defpackage.mf3.a()
            r4.c = r8
            r4.b = r11
            mf3 r8 = r4.a()
            com.google.android.gms.internal.play_billing.zzjn r11 = com.google.android.gms.internal.play_billing.zzjn.zzbL
            int r4 = defpackage.nrp.a
            com.google.android.gms.internal.play_billing.zzju r4 = com.google.android.gms.internal.play_billing.zzju.zza
            com.google.android.gms.internal.play_billing.zzjg r8 = defpackage.nrp.b(r11, r3, r8, r2, r4)
            byte[] r8 = r8.zzQ()
            r0.putExtra(r1, r8)
            goto L74
        L50:
            r11 = 6
            r0.putExtra(r5, r11)
            java.lang.String r5 = "An internal error occurred."
            r0.putExtra(r4, r5)
            o1 r4 = defpackage.mf3.a()
            r4.c = r11
            r4.b = r5
            mf3 r11 = r4.a()
            int r4 = defpackage.nrp.a
            com.google.android.gms.internal.play_billing.zzju r4 = com.google.android.gms.internal.play_billing.zzju.zza
            com.google.android.gms.internal.play_billing.zzjg r8 = defpackage.nrp.b(r8, r3, r11, r2, r4)
            byte[] r8 = r8.zzQ()
            r0.putExtra(r1, r8)
        L74:
            java.lang.String r8 = "INTENT_SOURCE"
            java.lang.String r11 = "LAUNCH_BILLING_FLOW"
            r0.putExtra(r8, r11)
            java.lang.String r8 = "billingClientTransactionId"
            r0.putExtra(r8, r9)
            boolean r7 = r7.f
            java.lang.String r8 = "wasServiceAutoReconnected"
            r0.putExtra(r8, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.b(com.google.android.gms.internal.play_billing.zzjn, long, boolean):android.content.Intent");
    }

    public final Intent c() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0105  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityResult(int r10, int r11, android.content.Intent r12) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01be  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r13) throws android.content.IntentSender.SendIntentException {
        /*
            Method dump skipped, instructions count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        mf3 mf3Var;
        super.onDestroy();
        cnf cnfVar = this.g;
        if (cnfVar != null) {
            mf3Var = (mf3) cnfVar.c;
            try {
                unregisterReceiver(cnfVar);
            } catch (RuntimeException e) {
                zzc.zzp("ProxyBillingActivity", "Failed to unregister receiver.", e);
            }
        } else {
            mf3Var = null;
        }
        if (isFinishing() && this.b) {
            Intent intentC = c();
            if (mf3Var != null) {
                intentC.putExtra("RESPONSE_CODE", mf3Var.a);
                intentC.putExtra("DEBUG_MESSAGE", mf3Var.c);
            } else {
                intentC.putExtra("RESPONSE_CODE", 1);
                intentC.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            }
            if (this.c) {
                intentC.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            int i = this.d;
            if (i == 110 || i == 100) {
                intentC.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                intentC.putExtra("billingClientTransactionId", this.e);
            }
            sendBroadcast(intentC);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.a;
        if (resultReceiver != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.b);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.c);
        bundle.putInt("activity_code", this.d);
        bundle.putLong("billingClientTransactionId", this.e);
        bundle.putBoolean("wasServiceAutoReconnected", this.f);
    }
}
