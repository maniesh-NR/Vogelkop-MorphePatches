package defpackage;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.media.Image;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzqh;
import com.google.android.gms.internal.mlkit_vision_barcode.zzqi;
import com.google.android.gms.internal.mlkit_vision_barcode.zzqo;
import com.google.android.gms.internal.mlkit_vision_barcode.zzra;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwe;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwo;
import com.google.android.gms.internal.mlkit_vision_barcode.zzws;
import com.opera.android.OperaApplication;
import com.opera.android.browser.WebContentsWrapper;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Set;
import org.chromium.ui.base.WindowAndroid;

/* loaded from: classes.dex */
public final class mlf implements zzwo {
    public static final llf g = new llf();
    public long a;
    public final Object b;
    public Object c;
    public Object d;
    public Object e;
    public final Object f;

    public mlf(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = j;
        this.b = bArr;
        this.c = bArr2;
        this.d = bArr3;
        this.e = bArr4;
        this.f = bArr5;
    }

    public mlf(aeb aebVar) {
        ty3 ty3Var = new ty3(this, (byte) 3);
        this.f = ty3Var;
        this.b = aebVar;
        aebVar.a.k(ty3Var);
    }

    public mlf(OperaApplication operaApplication, umi umiVar, x5f x5fVar) {
        b59 b59VarL = w1h.l(operaApplication, umiVar, "opera_job_stop_event_tracker", new bg1[0]);
        klf klfVar = new klf();
        this.b = umiVar;
        this.c = b59VarL;
        this.d = x5fVar;
        this.e = klfVar;
        on7 on7Var = pn7.b;
        this.a = cs5.x0(10, un7.e);
        this.f = new Object();
        b59VarL.a(new td7(this, (byte) 1));
    }

    public /* synthetic */ mlf(mtp mtpVar, long j, zzrb zzrbVar, zzcp zzcpVar, zzcp zzcpVar2, x8b x8bVar) {
        this.b = mtpVar;
        this.a = j;
        this.c = zzrbVar;
        this.d = zzcpVar;
        this.e = zzcpVar2;
        this.f = x8bVar;
    }

    public static mlf a(int i, int i2, int i3, byte[] bArr) {
        String str;
        if (bArr.length >= (i3 << 2) + i) {
            long j = bArr[0] & 255;
            for (int i4 = 1; i4 < i; i4++) {
                j = (j << 8) | (bArr[i4] & 255);
            }
            if (hn9.l(i2, j)) {
                int i5 = i + i3;
                byte[] bArrY = alo.y(i, i5, bArr);
                int i6 = i5 + i3;
                byte[] bArrY2 = alo.y(i5, i6, bArr);
                int i7 = i6 + i3;
                byte[] bArrY3 = alo.y(i6, i7, bArr);
                int i8 = i7 + i3;
                return new mlf(j, bArrY, bArrY2, bArrY3, alo.y(i7, i8, bArr), alo.y(i8, bArr.length, bArr));
            }
            str = "index out of bounds";
        } else {
            str = "private key has wrong size";
        }
        qp2.o(str);
        return null;
    }

    public static byte[] b(long j, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        if (i < 8 && (j >>> (i << 3)) != 0) {
            throw new IllegalStateException("index " + j + " does not fit the " + i + " byte index field of a stored private key");
        }
        byte[] bArr6 = new byte[bArr.length + i + bArr2.length + bArr3.length + bArr4.length + bArr5.length];
        sfe.w0(j, bArr6, 0, i);
        System.arraycopy(bArr, 0, bArr6, i, bArr.length);
        int length = i + bArr.length;
        System.arraycopy(bArr2, 0, bArr6, length, bArr2.length);
        int length2 = length + bArr2.length;
        System.arraycopy(bArr3, 0, bArr6, length2, bArr3.length);
        int length3 = length2 + bArr3.length;
        System.arraycopy(bArr4, 0, bArr6, length3, bArr4.length);
        System.arraycopy(bArr5, 0, bArr6, length3 + bArr4.length, bArr5.length);
        return bArr6;
    }

    public static boolean c(iao iaoVar, iao iaoVar2) {
        return ((q0) iaoVar.c).p((q0) iaoVar2.c) & (iaoVar.a == iaoVar2.a) & (iaoVar.b == iaoVar2.b) & alo.x((byte[]) iaoVar.d, (byte[]) iaoVar2.d) & alo.x((byte[]) iaoVar.e, (byte[]) iaoVar2.e) & alo.x((byte[]) iaoVar.f, (byte[]) iaoVar2.f) & alo.x((byte[]) iaoVar.g, (byte[]) iaoVar2.g);
    }

    public static LinkedHashMap d(SharedPreferences sharedPreferences) {
        Set<String> setKeySet = sharedPreferences.getAll().keySet();
        int iA = qbd.a(k95.o(setKeySet, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Object obj : setKeySet) {
            linkedHashMap.put(obj, Integer.valueOf(sharedPreferences.getInt((String) obj, 0)));
        }
        return linkedHashMap;
    }

    public final Context e() {
        return (Context) f().f.get();
    }

    public final WindowAndroid f() {
        return ((WebContentsWrapper) ((aeb) this.b).a).b;
    }

    public final void g(JobParameters jobParameters) {
        ((klf) this.e).getClass();
        if (llf.b(jobParameters)) {
            String strA = llf.a(jobParameters);
            SharedPreferences sharedPreferences = (SharedPreferences) ((b59) this.c).get();
            String strConcat = "stop_event_".concat(strA);
            synchronized (this.f) {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putInt(strConcat, sharedPreferences.getInt(strConcat, 0) + 1);
                editorEdit.apply();
            }
        }
    }

    public final boolean h(int i, nl5 nl5Var) {
        b2l b2lVarF;
        aeb aebVar = (aeb) this.b;
        dx3 dx3VarC = aebVar.a.c();
        if (dx3VarC == null || (b2lVarF = aebVar.b.F()) == null) {
            return false;
        }
        this.a = aebVar.j;
        ol5 ol5Var = new ol5(2132018998, i, 2132020197, new ge5((Object) this, (Object) nl5Var, (byte) 18), true);
        ol5Var.g = true;
        this.e = ol5Var;
        qim qimVar = dx3VarC.o;
        Objects.requireNonNull(qimVar);
        qimVar.f.Q((ol5) this.e, b2lVarF);
        return true;
    }

    public final zzwe zza() {
        mtp mtpVar = (mtp) this.b;
        long j = this.a;
        zzrb zzrbVar = (zzrb) this.c;
        zzcp zzcpVar = (zzcp) this.d;
        zzcp zzcpVar2 = (zzcp) this.e;
        x8b x8bVar = (x8b) this.f;
        zzrp zzrpVar = new zzrp();
        zzqo zzqoVar = new zzqo();
        zzqoVar.zzc(Long.valueOf(j));
        zzqoVar.zzd(zzrbVar);
        zzqoVar.zze(Boolean.valueOf(mtp.k));
        Boolean bool = Boolean.TRUE;
        zzqoVar.zza(bool);
        zzqoVar.zzb(bool);
        zzrpVar.zzh(zzqoVar.zzf());
        zzrpVar.zzi(zpp.a(mtpVar.d));
        zzrpVar.zze(zzcpVar.zzf());
        zzrpVar.zzf(zzcpVar2.zzf());
        int i = x8bVar.f;
        mtp.j.getClass();
        int i2 = x8bVar.f;
        int allocationByteCount = i2 == -1 ? ((Bitmap) Preconditions.checkNotNull(x8bVar.a)).getAllocationByteCount() : (i2 == 17 || i2 == 842094169) ? ((ByteBuffer) Preconditions.checkNotNull((Object) null)).limit() : i2 != 35 ? 0 : (((Image.Plane[]) Preconditions.checkNotNull(x8bVar.a()))[0].getBuffer().limit() * 3) / 2;
        zzqh zzqhVar = new zzqh();
        zzqhVar.zza(i != -1 ? i != 35 ? i != 842094169 ? i != 16 ? i != 17 ? zzqi.UNKNOWN_FORMAT : zzqi.NV21 : zzqi.NV16 : zzqi.YV12 : zzqi.YUV_420_888 : zzqi.BITMAP);
        zzqhVar.zzb(Integer.valueOf(allocationByteCount));
        zzrpVar.zzg(zzqhVar.zzd());
        zzrd zzrdVar = new zzrd();
        zzrdVar.zze(mtpVar.i ? zzra.zzc : zzra.zzb);
        zzrdVar.zzg(zzrpVar.zzj());
        return zzws.zzf(zzrdVar);
    }
}
