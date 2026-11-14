package com.opera.android.vpn;

import androidx.annotation.NonNull;
import com.opera.api.Callback;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class VpnManager$OnFreeVpnError implements Callback {
    public final wv1 a;

    public VpnManager$OnFreeVpnError(wv1 wv1Var) {
        this.a = wv1Var;
    }

    public final void run(@NonNull int[] iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.toString(i));
        }
        x5f x5fVar = (orm) this.a.b.get();
        if (x5fVar.h) {
            x5fVar.T0(new l51(arrayList, (byte) 3));
        }
    }
}
