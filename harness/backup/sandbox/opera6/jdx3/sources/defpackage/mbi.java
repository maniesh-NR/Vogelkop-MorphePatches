package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.os.Handler;
import android.view.LayoutInflater;
import com.opera.ad.interstitial.AdActivity;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class mbi extends ContextWrapper {
    public final /* synthetic */ byte a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mbi(Context context, byte b) {
        super(context);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbi(nxo nxoVar, Context context) {
        super(context);
        this.a = (byte) 2;
        this.b = nxoVar;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final ApplicationInfo getApplicationInfo() {
        switch (this.a) {
            case 0:
                ApplicationInfo applicationInfo = new ApplicationInfo(super.getApplicationInfo());
                applicationInfo.flags |= 4194304;
                return applicationInfo;
            default:
                return super.getApplicationInfo();
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        switch (this.a) {
            case 0:
                if (!"layout_inflater".equals(str)) {
                    break;
                } else {
                    LayoutInflater layoutInflater = (LayoutInflater) this.b;
                    if (layoutInflater == null) {
                        LayoutInflater layoutInflaterCloneInContext = LayoutInflater.from(getBaseContext()).cloneInContext(this);
                        this.b = layoutInflaterCloneInContext;
                        break;
                    }
                }
                break;
        }
        return super.getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        switch (this.a) {
            case 1:
                throw new RuntimeException();
            default:
                return super.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        switch (this.a) {
            case 1:
                throw new RuntimeException();
            default:
                return super.registerReceiver(broadcastReceiver, intentFilter, i);
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler) {
        switch (this.a) {
            case 1:
                if (intentFilter.hasAction("com.google.android.gms.auth.api.phone.SMS_CODE_RETRIEVED")) {
                    this.b = broadcastReceiver;
                }
                break;
        }
        return super.registerReceiver(broadcastReceiver, intentFilter, str, handler);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
        switch (this.a) {
            case 1:
                if (intentFilter.hasAction("com.google.android.gms.auth.api.phone.SMS_CODE_RETRIEVED")) {
                    this.b = broadcastReceiver;
                }
                break;
        }
        return super.registerReceiver(broadcastReceiver, intentFilter, str, handler, i);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        switch (this.a) {
            case 2:
                nxo nxoVar = (nxo) this.b;
                WeakReference weakReference = nxoVar.q;
                if (weakReference != null && weakReference.get() != null) {
                    AdActivity adActivity = (AdActivity) nxoVar.q.get();
                    adActivity.getClass();
                    AdActivity.a(adActivity, intent);
                    if (!adActivity.isFinishing()) {
                        adActivity.startActivity(intent);
                        break;
                    }
                } else {
                    super.startActivity(intent);
                    break;
                }
                break;
            default:
                super.startActivity(intent);
                break;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        switch (this.a) {
            case 1:
                if (broadcastReceiver == ((BroadcastReceiver) this.b)) {
                    this.b = null;
                }
                super.unregisterReceiver(broadcastReceiver);
                break;
            default:
                super.unregisterReceiver(broadcastReceiver);
                break;
        }
    }
}
