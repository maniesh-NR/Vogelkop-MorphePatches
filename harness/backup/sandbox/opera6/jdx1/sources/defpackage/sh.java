package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.w;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class sh extends rh {
    public final /* synthetic */ byte a;

    public /* synthetic */ sh(byte b) {
        this.a = b;
    }

    @Override // defpackage.rh
    public final Intent a(Object obj) {
        Bundle bundleExtra;
        switch (this.a) {
            case 0:
                return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[]) obj);
            case 1:
                return (Intent) obj;
            case 2:
                return new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", (hdb) obj);
            default:
                hdb hdbVar = (hdb) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = hdbVar.b;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        hdbVar = new hdb(hdbVar.a, null, hdbVar.c, hdbVar.d);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", hdbVar);
                if (w.N(2)) {
                    intent.toString();
                }
                return intent;
        }
    }

    @Override // defpackage.rh
    public final qh b(Context context, Object obj) {
        switch (this.a) {
            case 0:
                String[] strArr = (String[]) obj;
                if (strArr.length == 0) {
                    return new qh(n08.a);
                }
                for (String str : strArr) {
                    if (nb6.h(context, str) != 0) {
                        return null;
                    }
                }
                int iA = qbd.a(strArr.length);
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new qh(linkedHashMap);
            default:
                return super.b(context, obj);
        }
    }

    @Override // defpackage.rh
    public final Object c(int i, Intent intent) {
        switch (this.a) {
            case 0:
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i2 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i2 == 0));
                        }
                        break;
                    } else {
                        break;
                    }
                }
                break;
        }
        return new oh(i, intent);
    }
}
