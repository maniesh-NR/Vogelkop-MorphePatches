package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.Image;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstall;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyn;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyo;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyu;
import com.google.android.gms.tasks.Tasks;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class cup implements qtp {
    public static final zzcs h = zzcs.zzh("com.google.android.gms.vision.barcode", "com.google.android.gms.tflite_dynamite");
    public boolean a;
    public boolean b;
    public boolean c;
    public final Context d;
    public final t33 e;
    public final zzwp f;
    public zzyl g;

    public cup(Context context, t33 t33Var, zzwp zzwpVar) {
        this.d = context;
        this.e = t33Var;
        this.f = zzwpVar;
    }

    @Override // defpackage.qtp
    public final ArrayList a(x8b x8bVar) throws l3e {
        IObjectWrapper iObjectWrapperWrap;
        if (this.g == null) {
            zzc();
        }
        zzyl zzylVar = (zzyl) Preconditions.checkNotNull(this.g);
        if (!this.a) {
            try {
                zzylVar.zze();
                this.a = true;
            } catch (RemoteException e) {
                throw new l3e("Failed to init barcode scanner.", e);
            }
        }
        int rowStride = x8bVar.c;
        if (x8bVar.f == 35) {
            rowStride = ((Image.Plane[]) Preconditions.checkNotNull(x8bVar.a()))[0].getRowStride();
        }
        zzyu zzyuVar = new zzyu(x8bVar.f, rowStride, x8bVar.d, aib.r(x8bVar.e), SystemClock.elapsedRealtime());
        vza.a.getClass();
        int i = x8bVar.f;
        if (i != -1) {
            if (i == 17) {
                iObjectWrapperWrap = ObjectWrapper.wrap((ByteBuffer) Preconditions.checkNotNull((Object) null));
            } else if (i != 35) {
                if (i != 842094169) {
                    throw new l3e(sko.i(x8bVar.f, "Unsupported image format: "), 3);
                }
                iObjectWrapperWrap = ObjectWrapper.wrap((ByteBuffer) Preconditions.checkNotNull((Object) null));
            } else {
                iObjectWrapperWrap = ObjectWrapper.wrap(x8bVar.b != null ? (Image) x8bVar.b.a : null);
            }
        } else {
            iObjectWrapperWrap = ObjectWrapper.wrap((Bitmap) Preconditions.checkNotNull(x8bVar.a));
        }
        try {
            List listZzd = zzylVar.zzd(iObjectWrapperWrap, zzyuVar);
            ArrayList arrayList = new ArrayList();
            Iterator it = listZzd.iterator();
            while (it.hasNext()) {
                arrayList.add(new f33(new wtp((zzyb) it.next(), (byte) 0), x8bVar.g));
            }
            return arrayList;
        } catch (RemoteException e2) {
            throw new l3e("Failed to run barcode scanner.", e2);
        }
    }

    public final zzyl b(DynamiteModule.VersionPolicy versionPolicy, String str, String str2) {
        Context context = this.d;
        zzyo zzyoVarZza = zzyn.zza(DynamiteModule.load(context, versionPolicy, str).instantiate(str2));
        IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(context);
        this.e.getClass();
        return zzyoVarZza.zzd(iObjectWrapperWrap, new zzyd(0, true));
    }

    @Override // defpackage.qtp
    public final void zzb() {
        zzyl zzylVar = this.g;
        if (zzylVar != null) {
            try {
                zzylVar.zzf();
            } catch (RemoteException unused) {
            }
            this.g = null;
            this.a = false;
        }
    }

    @Override // defpackage.qtp
    public final boolean zzc() throws l3e {
        if (this.g != null) {
            return this.b;
        }
        Context context = this.d;
        int localVersion = DynamiteModule.getLocalVersion(context, "com.google.mlkit.dynamite.barcode");
        zzwp zzwpVar = this.f;
        final byte b = 1;
        if (localVersion > 0) {
            this.b = true;
            try {
                this.g = b(DynamiteModule.PREFER_LOCAL, "com.google.mlkit.dynamite.barcode", "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator");
            } catch (DynamiteModule.LoadingException e) {
                throw new l3e("Failed to load the bundled barcode module.", (Exception) e);
            } catch (RemoteException e2) {
                throw new l3e("Failed to create thick barcode scanner.", e2);
            }
        } else {
            boolean zAreModulesAvailable = false;
            this.b = false;
            Feature[] featureArr = rrf.a;
            int apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(context);
            zzcs zzcsVar = h;
            if (apkVersion >= 221500000) {
                final Feature[] featureArrB = rrf.b(rrf.d, zzcsVar);
                try {
                    zAreModulesAvailable = ((ModuleAvailabilityResponse) Tasks.await(ModuleInstall.getClient(context).areModulesAvailable(new OptionalModuleApi[]{new OptionalModuleApi() { // from class: bup
                        public final Feature[] getOptionalFeatures() {
                            byte b2 = b;
                            Feature[] featureArr2 = featureArrB;
                            switch (b2) {
                                case 0:
                                    Feature[] featureArr3 = rrf.a;
                                    break;
                                default:
                                    Feature[] featureArr4 = rrf.a;
                                    break;
                            }
                            return featureArr2;
                        }
                    }}).addOnFailureListener(new drj((byte) 19)))).areModulesAvailable();
                } catch (InterruptedException | ExecutionException | DynamiteModule.LoadingException unused) {
                }
            } else {
                Iterator it = zzcsVar.iterator();
                while (it.hasNext()) {
                    DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, (String) it.next());
                }
                zAreModulesAvailable = true;
            }
            if (!zAreModulesAvailable) {
                if (!this.c) {
                    rrf.a(context, zzcs.zzh("barcode", "tflite_dynamite"));
                    this.c = true;
                }
                zpp.b(zzwpVar, zzrb.zzB);
                throw new l3e("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            try {
                this.g = b(DynamiteModule.PREFER_REMOTE, "com.google.android.gms.vision.barcode", "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator");
            } catch (DynamiteModule.LoadingException | RemoteException e3) {
                zpp.b(zzwpVar, zzrb.zzC);
                throw new l3e("Failed to create thin barcode scanner.", (Exception) e3);
            }
        }
        zpp.b(zzwpVar, zzrb.zza);
        return this.b;
    }
}
