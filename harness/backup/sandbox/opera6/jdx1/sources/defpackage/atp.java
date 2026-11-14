package defpackage;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxa;

/* loaded from: classes.dex */
public final class atp extends x4c {
    public final k3e a;

    public atp(k3e k3eVar) {
        this.a = k3eVar;
    }

    public final Object create(Object obj) {
        t33 t33Var = (t33) obj;
        k3e k3eVar = this.a;
        Context contextB = k3eVar.b();
        zzwp zzwpVarZzb = zzxa.zzb(true != zpp.c() ? "play-services-mlkit-barcode-scanning" : "barcode-scanning");
        zzcs zzcsVar = cup.h;
        return new mtp(k3eVar, t33Var, (DynamiteModule.getLocalVersion(contextB, "com.google.mlkit.dynamite.barcode") > 0 || GoogleApiAvailabilityLight.getInstance().getApkVersion(contextB) >= 204500000) ? new cup(contextB, t33Var, zzwpVarZzb) : new iup(contextB, t33Var, zzwpVarZzb), zzwpVarZzb);
    }
}
