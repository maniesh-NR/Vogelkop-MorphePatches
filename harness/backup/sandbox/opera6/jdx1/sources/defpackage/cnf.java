package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.mediarouter.app.OperaMediaRouteButton;
import com.google.android.gms.internal.play_billing.zzbo;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzju;
import com.google.android.gms.internal.play_billing.zzjv;
import com.google.android.gms.internal.play_billing.zzjy;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzkb;
import com.google.android.gms.internal.play_billing.zzkp;
import com.google.android.gms.internal.play_billing.zzkr;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class cnf extends BroadcastReceiver {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public final Object d;

    public cnf(Context context) {
        this.a = (byte) 0;
        this.b = true;
        this.c = context;
        this.d = new ArrayList();
    }

    public cnf(mgh mghVar) {
        this.a = (byte) 1;
        this.b = false;
        this.d = mghVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z;
        byte b = this.a;
        int i = 0;
        Object obj = this.d;
        switch (b) {
            case 0:
                if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) && this.b != (!intent.getBooleanExtra("noConnectivity", false))) {
                    this.b = z;
                    ArrayList arrayList = (ArrayList) obj;
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj2 = arrayList.get(i);
                        i++;
                        ((OperaMediaRouteButton) obj2).c();
                    }
                    break;
                }
                break;
            default:
                mgh mghVar = (mgh) obj;
                if (intent != null) {
                    zzc.zzn("ProxyBillingReceiver", "Received intent action: ".concat(String.valueOf(intent.getAction())));
                    if (!Objects.equals(intent.getAction(), "com.android.vending.billing.IN_APP_BILLING_RESULT_UPDATE_ACTION")) {
                        if (!Objects.equals(intent.getAction(), "com.android.vending.billing.PLAY_BILLING_ACTIVITY_CREATED_ACTION")) {
                            zzc.zzo("ProxyBillingReceiver", "Unexpected broadcast action: ".concat(String.valueOf(intent.getAction())));
                            break;
                        } else {
                            this.b = true;
                            if (mghVar != null) {
                                long longExtra = intent.getLongExtra("billingClientTransactionId", 0L);
                                try {
                                    zzjv zzjvVarZza = zzjy.zza();
                                    zzjvVarZza.zze(4);
                                    zzjvVarZza.zza(zzju.zzf);
                                    zzjy zzjyVarZzi = zzjvVarZza.zzi();
                                    zzkp zzkpVarZza = zzkr.zza();
                                    zzkb zzkbVar = (zzkb) mghVar.b;
                                    if (longExtra != 0) {
                                        zzjz zzjzVarZzq = zzkbVar.zzq();
                                        zzjzVarZzq.zze(longExtra);
                                        zzkbVar = (zzkb) zzjzVarZzq.zzi();
                                    }
                                    zzkpVarZza.zzp(zzkbVar);
                                    zzkpVarZza.zze(zzjyVarZzi);
                                    ((n9k) mghVar.c).m(zzkpVarZza.zzi());
                                    break;
                                } catch (Throwable th) {
                                    zzc.zzp("BillingLogger", "Unable to log.", th);
                                    return;
                                }
                            }
                        }
                    } else if (!intent.hasExtra("RESPONSE_CODE")) {
                        zzc.zzo("ProxyBillingReceiver", "Missing RESPONSE_CODE in intent.");
                        if (mghVar != null) {
                            mghVar.p(null, intent.getLongExtra("billingClientTransactionId", 0L));
                            break;
                        }
                    } else {
                        o1 o1VarA = mf3.a();
                        o1VarA.c = intent.getIntExtra("RESPONSE_CODE", 0);
                        o1VarA.b = zzbo.zzc(intent.getStringExtra("DEBUG_MESSAGE"));
                        mf3 mf3VarA = o1VarA.a();
                        this.c = mf3VarA;
                        if (mghVar != null) {
                            mghVar.p(mf3VarA, intent.getLongExtra("billingClientTransactionId", 0L));
                            break;
                        }
                    }
                } else {
                    zzc.zzo("ProxyBillingReceiver", "Null intent!");
                    break;
                }
                break;
        }
    }
}
