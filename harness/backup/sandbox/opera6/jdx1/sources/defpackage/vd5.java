package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.fragment.app.r;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class vd5 extends zh {
    public final /* synthetic */ xd5 h;

    public vd5(xd5 xd5Var) {
        this.h = xd5Var;
    }

    @Override // defpackage.zh
    public final void b(int i, rh rhVar, Object obj, nh nhVar) {
        Bundle bundle;
        int i2;
        xd5 xd5Var = this.h;
        qh qhVarB = rhVar.b(xd5Var, obj);
        if (qhVarB != null) {
            new Handler(Looper.getMainLooper()).post(new d50((Object) this, i, (Object) qhVarB, (byte) 2));
            return;
        }
        Intent intentA = rhVar.a(obj);
        if (intentA.getExtras() != null && intentA.getExtras().getClassLoader() == null) {
            intentA.setExtrasClassLoader(xd5Var.getClassLoader());
        }
        if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundle = nhVar != null ? nhVar.s.toBundle() : null;
        }
        Bundle bundle2 = bundle;
        if (!"androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentA.getAction())) {
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentA.getAction())) {
                xd5Var.startActivityForResult(intentA, i, bundle2);
                return;
            }
            hdb hdbVar = (hdb) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                i2 = i;
            } catch (IntentSender.SendIntentException e) {
                e = e;
                i2 = i;
            }
            try {
                xd5Var.startIntentSenderForResult(hdbVar.a, i2, hdbVar.b, hdbVar.c, hdbVar.d, 0, bundle2);
                return;
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
                new Handler(Looper.getMainLooper()).post(new d50((Object) this, i2, (Object) e, (byte) 3));
                return;
            }
        }
        String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        if (stringArrayExtra == null) {
            stringArrayExtra = new String[0];
        }
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < stringArrayExtra.length; i3++) {
            if (TextUtils.isEmpty(stringArrayExtra[i3])) {
                qp2.o(z1m.l(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                return;
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i3], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i3));
            }
        }
        int size = hashSet.size();
        String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
        if (size > 0) {
            if (size == stringArrayExtra.length) {
                return;
            }
            int i4 = 0;
            for (int i5 = 0; i5 < stringArrayExtra.length; i5++) {
                if (!hashSet.contains(Integer.valueOf(i5))) {
                    strArr[i4] = stringArrayExtra[i5];
                    i4++;
                }
            }
        }
        if (xd5Var instanceof r) {
            ((r) xd5Var).validateRequestPermissionsRequestCode(i);
        }
        xd5Var.requestPermissions(stringArrayExtra, i);
    }
}
