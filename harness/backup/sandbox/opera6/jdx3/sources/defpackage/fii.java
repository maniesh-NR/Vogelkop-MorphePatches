package defpackage;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import com.opera.android.OperaApplication;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public final /* synthetic */ class fii implements n5o {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gii b;

    public /* synthetic */ fii(gii giiVar, byte b) {
        this.a = b;
        this.b = giiVar;
    }

    public final Object g(Object obj) throws Throwable {
        Throwable th;
        InputStream inputStreamOpenInputStream;
        long j;
        MessageDigest messageDigest;
        byte[] bArr;
        byte b = this.a;
        boolean z = false;
        InputStream inputStream = null;
        byte[] bArrDigest = null;
        gii giiVar = this.b;
        switch (b) {
            case 0:
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = giiVar.a.getContentResolver().openFileDescriptor(giiVar.i, "w");
                    giiVar.l = parcelFileDescriptorOpenFileDescriptor;
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        z = true;
                    }
                } catch (FileNotFoundException | IllegalStateException unused) {
                }
                return Boolean.valueOf(z);
            case 1:
                if (((Boolean) obj).booleanValue()) {
                    giiVar.c(giiVar.d.l);
                } else {
                    giiVar.e();
                }
                return null;
            case 2:
                dd7 dd7Var = (dd7) obj;
                try {
                    messageDigest = MessageDigest.getInstance("SHA-256");
                    inputStreamOpenInputStream = giiVar.a.getContentResolver().openInputStream(giiVar.i);
                    try {
                        try {
                            bArr = new byte[32768];
                            j = 0;
                        } catch (IOException | NoSuchAlgorithmException unused2) {
                            long j2 = dd7Var != null ? dd7Var.j() : 0L;
                            xvg.l(inputStreamOpenInputStream);
                            j = j2;
                            return new Pair(Long.valueOf(j), bArrDigest);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = inputStreamOpenInputStream;
                        xvg.l(inputStream);
                        throw th;
                    }
                } catch (IOException | NoSuchAlgorithmException unused3) {
                    inputStreamOpenInputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    xvg.l(inputStream);
                    throw th;
                }
                while (true) {
                    int i = inputStreamOpenInputStream.read(bArr, 0, 32768);
                    if (i < 0) {
                        bArrDigest = messageDigest.digest();
                        xvg.l(inputStreamOpenInputStream);
                        return new Pair(Long.valueOf(j), bArrDigest);
                    }
                    messageDigest.update(bArr, 0, i);
                    j += i;
                }
            default:
                Pair pair = (Pair) obj;
                long jLongValue = ((Long) pair.first).longValue();
                byte[] bArr2 = (byte[]) pair.second;
                Context context = giiVar.a;
                String[] strArr = OperaApplication.K;
                ((OperaApplication) context.getApplicationContext()).n().b(giiVar.h, giiVar.i, "application/pdf", giiVar.j, bArr2, jLongValue, new zzh(giiVar, (byte) 4));
                zzh zzhVar = giiVar.m;
                if (zzhVar != null) {
                    giiVar.m = null;
                    zzhVar.run(Boolean.TRUE);
                }
                return null;
        }
    }
}
