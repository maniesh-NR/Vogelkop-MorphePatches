package com.opera.android.autofill;

import J.N;
import androidx.annotation.NonNull;
import defpackage.bq2;
import defpackage.ew;
import defpackage.fw;
import defpackage.hjf;
import defpackage.k3;
import defpackage.nrl;
import defpackage.p1;
import defpackage.xnh;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class AddressEditorManager {
    public final nrl a;
    public boolean b;
    public long c;

    public interface RegionsReceiver {
        void a(String str, Map map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AddressEditorManager(hjf hjfVar) {
        xnh xnhVarT = xnh.t(hjfVar);
        this.a = new nrl((byte) 26);
        xnhVarT.F(new p1((byte) 1, this, xnhVarT, false));
    }

    public static void addComponent(@NonNull List<fw> list, int i, @NonNull String str, boolean z, boolean z2) {
        ew ewVar;
        ew[] ewVarArrValues = ew.values();
        int length = ewVarArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                ewVar = null;
                break;
            }
            ewVar = ewVarArrValues[i2];
            if (ewVar.a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (ewVar == null) {
            return;
        }
        list.add(new fw(ewVar, str, z, z2));
    }

    public static void callRegionsReceiver(@NonNull RegionsReceiver regionsReceiver, @NonNull String str, @NonNull String[] strArr, @NonNull String[] strArr2) {
        HashMap map = new HashMap(strArr.length);
        fillMap(map, strArr, strArr2);
        regionsReceiver.a(str, map);
    }

    public static void fillMap(@NonNull Map<String, String> map, @NonNull String[] strArr, @NonNull String[] strArr2) {
        for (int i = 0; i < strArr.length; i++) {
            map.put(strArr[i], strArr2[i]);
        }
    }

    public final void a(String str, bq2 bq2Var) {
        nrl nrlVar = this.a;
        if (!nrlVar.a) {
            nrlVar.d(new k3(this, str, bq2Var, (byte) 5));
            return;
        }
        long j = this.c;
        if (j != 0) {
            N.M9Uqsbl$(j, str, bq2Var);
        } else if (bq2Var != null) {
            bq2Var.a(str, Collections.EMPTY_MAP);
        }
    }
}
