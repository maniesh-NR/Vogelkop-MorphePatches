package defpackage;

import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.mlkit_vision_barcode.zzra;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzws;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ysp extends r6e implements s33 {
    public static final /* synthetic */ int g = 0;
    public final boolean f;

    public ysp(t33 t33Var, mtp mtpVar, Executor executor, zzwp zzwpVar) {
        super(mtpVar, executor);
        boolean zC = zpp.c();
        this.f = zC;
        zzrp zzrpVar = new zzrp();
        zzrpVar.zzi(zpp.a(t33Var));
        zzrr zzrrVarZzj = zzrpVar.zzj();
        zzrd zzrdVar = new zzrd();
        zzrdVar.zze(zC ? zzra.zzc : zzra.zzb);
        zzrdVar.zzg(zzrrVarZzj);
        zzwpVar.zzd(zzws.zzg(zzrdVar, 1), zzrc.zzk);
    }

    @Override // defpackage.r6e, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        super.close();
    }

    public final Feature[] getOptionalFeatures() {
        return this.f ? rrf.a : new Feature[]{rrf.b};
    }
}
