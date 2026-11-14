package com.android.billingclient.api;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.zzc;
import defpackage.bxk;
import defpackage.dcl;
import defpackage.ppp;
import defpackage.tvk;
import defpackage.u7k;
import defpackage.uto;

@UsedByReflection("PlatformActivityProxy")
/* loaded from: classes.dex */
public class ProxyBillingActivityV2 extends xd5 {
    public th a;
    public th b;
    public th c;
    public th d;
    public th e;
    public th f;
    public ResultReceiver g;
    public ResultReceiver h;
    public ResultReceiver i;
    public ResultReceiver j;
    public ResultReceiver k;
    public ResultReceiver l;

    public static final nh r() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            nh nhVar = new nh(ActivityOptions.makeBasic());
            nhVar.t0(3);
            return nhVar;
        }
        if (i < 34) {
            return null;
        }
        nh nhVar2 = new nh(ActivityOptions.makeBasic());
        nhVar2.t0(1);
        return nhVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = registerForActivityResult(new sh((byte) 2), new tvk(this));
        this.b = registerForActivityResult(new sh((byte) 2), new dcl(this));
        this.c = registerForActivityResult(new sh((byte) 2), new bxk(this, (byte) 21));
        this.d = registerForActivityResult(new sh((byte) 2), new u7k(this));
        this.e = registerForActivityResult(new sh((byte) 2), new ppp(this));
        this.f = registerForActivityResult(new sh((byte) 2), new uto(this, (byte) 6));
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.g = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
            }
            if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                this.h = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
            }
            if (bundle.containsKey("external_offer_flow_result_receiver")) {
                this.i = (ResultReceiver) bundle.getParcelable("external_offer_flow_result_receiver");
            }
            if (bundle.containsKey("launch_external_link_result_receiver")) {
                this.j = (ResultReceiver) bundle.getParcelable("launch_external_link_result_receiver");
            }
            if (bundle.containsKey("billing_program_information_dialog_result_receiver")) {
                this.k = (ResultReceiver) bundle.getParcelable("billing_program_information_dialog_result_receiver");
            }
            if (bundle.containsKey("subscription_management_action_result_receiver")) {
                this.l = (ResultReceiver) bundle.getParcelable("subscription_management_action_result_receiver");
                return;
            }
            return;
        }
        zzc.zzn("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.g = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            this.a.a(new hdb(pendingIntent.getIntentSender(), (Intent) null, 0, 0), r());
            return;
        }
        if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.h = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            this.b.a(new hdb(pendingIntent2.getIntentSender(), (Intent) null, 0, 0), r());
            return;
        }
        if (getIntent().hasExtra("external_offer_flow_pending_intent")) {
            PendingIntent pendingIntent3 = (PendingIntent) getIntent().getParcelableExtra("external_offer_flow_pending_intent");
            this.i = (ResultReceiver) getIntent().getParcelableExtra("external_offer_flow_result_receiver");
            this.c.a(new hdb(pendingIntent3.getIntentSender(), (Intent) null, 0, 0), r());
            return;
        }
        if (getIntent().hasExtra("launch_external_link_flow_pending_intent")) {
            PendingIntent pendingIntent4 = (PendingIntent) getIntent().getParcelableExtra("launch_external_link_flow_pending_intent");
            this.j = (ResultReceiver) getIntent().getParcelableExtra("launch_external_link_result_receiver");
            this.d.a(new hdb(pendingIntent4.getIntentSender(), (Intent) null, 0, 0), r());
        } else if (getIntent().hasExtra("billing_program_information_dialog_pending_intent")) {
            PendingIntent pendingIntent5 = (PendingIntent) getIntent().getParcelableExtra("billing_program_information_dialog_pending_intent");
            this.k = (ResultReceiver) getIntent().getParcelableExtra("billing_program_information_dialog_result_receiver");
            this.e.a(new hdb(pendingIntent5.getIntentSender(), (Intent) null, 0, 0), r());
        } else if (getIntent().hasExtra("SUBSCRIPTION_MANAGEMENT_INTENT")) {
            PendingIntent pendingIntent6 = (PendingIntent) getIntent().getParcelableExtra("SUBSCRIPTION_MANAGEMENT_INTENT");
            this.l = (ResultReceiver) getIntent().getParcelableExtra("subscription_management_action_result_receiver");
            this.f.a(new hdb(pendingIntent6.getIntentSender(), (Intent) null, 0, 0), r());
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.g;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.h;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
        ResultReceiver resultReceiver3 = this.i;
        if (resultReceiver3 != null) {
            bundle.putParcelable("external_offer_flow_result_receiver", resultReceiver3);
        }
        ResultReceiver resultReceiver4 = this.j;
        if (resultReceiver4 != null) {
            bundle.putParcelable("launch_external_link_result_receiver", resultReceiver4);
        }
        ResultReceiver resultReceiver5 = this.k;
        if (resultReceiver5 != null) {
            bundle.putParcelable("billing_program_information_dialog_result_receiver", resultReceiver5);
        }
        ResultReceiver resultReceiver6 = this.l;
        if (resultReceiver6 != null) {
            bundle.putParcelable("subscription_management_action_result_receiver", resultReceiver6);
        }
    }
}
