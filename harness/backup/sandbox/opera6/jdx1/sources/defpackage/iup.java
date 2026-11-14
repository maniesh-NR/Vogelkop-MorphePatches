package defpackage;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_common.zzaf;
import com.google.android.gms.internal.mlkit_vision_barcode.zzah;
import com.google.android.gms.internal.mlkit_vision_barcode.zzaj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzal;
import com.google.android.gms.internal.mlkit_vision_barcode.zzan;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzu;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class iup implements qtp {
    public boolean a;
    public final Context b;
    public final zzah c;
    public final zzwp d;
    public zzaj e;

    public iup(Context context, t33 t33Var, zzwp zzwpVar) {
        zzah zzahVar = new zzah();
        this.c = zzahVar;
        this.b = context;
        t33Var.getClass();
        zzahVar.zza = 0;
        this.d = zzwpVar;
    }

    @Override // defpackage.qtp
    public final ArrayList a(x8b x8bVar) throws l3e {
        zzu[] zzuVarArrZzf;
        if (this.e == null) {
            zzc();
        }
        zzaj zzajVar = this.e;
        if (zzajVar == null) {
            throw new l3e("Error initializing the legacy barcode scanner.", 14);
        }
        zzaj zzajVar2 = (zzaj) Preconditions.checkNotNull(zzajVar);
        zzan zzanVar = new zzan(x8bVar.c, x8bVar.d, 0, 0L, aib.r(x8bVar.e));
        try {
            int i = x8bVar.f;
            if (i == -1) {
                zzuVarArrZzf = zzajVar2.zzf(ObjectWrapper.wrap(x8bVar.a), zzanVar);
            } else if (i == 17) {
                zzuVarArrZzf = zzajVar2.zze(ObjectWrapper.wrap((Object) null), zzanVar);
            } else if (i == 35) {
                Image.Plane[] planeArr = (Image.Plane[]) Preconditions.checkNotNull(x8bVar.a());
                zzanVar.zza = planeArr[0].getRowStride();
                zzuVarArrZzf = zzajVar2.zze(ObjectWrapper.wrap(planeArr[0].getBuffer()), zzanVar);
            } else {
                if (i != 842094169) {
                    throw new l3e("Unsupported image format: " + x8bVar.f, 3);
                }
                zzuVarArrZzf = zzajVar2.zze(ObjectWrapper.wrap(a26.y(x8bVar)), zzanVar);
            }
            ArrayList arrayList = new ArrayList();
            for (zzu zzuVar : zzuVarArrZzf) {
                arrayList.add(new f33(new wtp(zzuVar, (byte) 1), x8bVar.g));
            }
            return arrayList;
        } catch (RemoteException e) {
            throw new l3e("Failed to detect with legacy barcode detector", e);
        }
    }

    @Override // defpackage.qtp
    public final void zzb() {
        zzaj zzajVar = this.e;
        if (zzajVar != null) {
            try {
                zzajVar.zzd();
            } catch (RemoteException unused) {
            }
            this.e = null;
        }
    }

    @Override // defpackage.qtp
    public final boolean zzc() throws l3e {
        Context context = this.b;
        if (this.e != null) {
            return false;
        }
        try {
            zzaj zzajVarZzd = zzal.zza(DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.vision.dynamite").instantiate("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator")).zzd(ObjectWrapper.wrap(context), this.c);
            this.e = zzajVarZzd;
            zzwp zzwpVar = this.d;
            if (zzajVarZzd != null || this.a) {
                zpp.b(zzwpVar, zzrb.zza);
                return false;
            }
            Feature[] featureArr = rrf.a;
            rrf.a(context, zzaf.zzh("barcode"));
            this.a = true;
            zpp.b(zzwpVar, zzrb.zzB);
            throw new l3e("Waiting for the barcode module to be downloaded. Please wait.", 14);
        } catch (DynamiteModule.LoadingException e) {
            throw new l3e("Failed to load deprecated vision dynamite module.", (Exception) e);
        } catch (RemoteException e2) {
            throw new l3e("Failed to create legacy barcode detector.", e2);
        }
    }
}
