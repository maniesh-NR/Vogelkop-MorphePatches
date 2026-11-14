package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.appsflyer.internal.j;
import com.opera.android.OperaApplication;
import com.opera.android.PushedContentHandler;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes.dex */
public final class bml extends no7 {
    public static final drj l = new drj((byte) 5);
    public final b59 k;

    public bml(Context context) {
        super(context, 15, "thirdpartytools");
        this.k = w1h.l(context, vml.d, "thirdpartytools", new bg1[0]);
    }

    public static bml u(Context context) {
        return (bml) no7.n(context, io7.d, l);
    }

    public static aml v(izd izdVar) throws IOException {
        int i = izdVar.readByte() & 255;
        boolean z = false;
        int i2 = -1;
        String str = "";
        String str2 = str;
        String str3 = str2;
        for (int i3 = 0; i3 < i; i3++) {
            byte b = izdVar.readByte();
            byte[] bArr = new byte[izdVar.readUnsignedShort()];
            izdVar.readFully(bArr);
            izd izdVar2 = new izd(new ByteArrayInputStream(bArr));
            if (b == 76) {
                int unsignedShort = izdVar2.readUnsignedShort();
                if (izdVar2.available() > 0) {
                    String strH = izdVar2.h();
                    String[] strArr = aik.a;
                    str = strH == null ? "" : strH;
                    String strH2 = izdVar2.h();
                    str2 = strH2 == null ? "" : strH2;
                }
                if (izdVar2.available() > 0) {
                    String strH3 = izdVar2.h();
                    String[] strArr2 = aik.a;
                    str3 = strH3 == null ? "" : strH3;
                }
                i2 = unsignedShort;
            } else if (b == 89) {
                int unsignedShort2 = izdVar2.readUnsignedShort();
                if (unsignedShort2 > 0 && izdVar2.skipBytes(unsignedShort2) != unsignedShort2) {
                    throw new EOFException("Unexpected end of file while skipping bytes.");
                }
            } else if (b == 102) {
                z = true;
            }
        }
        return new aml(i2, str, str2, str3, z, false);
    }

    @Override // defpackage.no7, defpackage.mch
    public final void e(PushedContentHandler pushedContentHandler) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.k.get();
        if (sharedPreferences.getBoolean("one_time_upgrade_needed", true)) {
            pushedContentHandler.g(io7.d);
            sharedPreferences.edit().putBoolean("one_time_upgrade_needed", false).apply();
        }
    }

    @Override // defpackage.no7
    public final Object h() {
        return new aml(0, "", "", "", false, true);
    }

    @Override // defpackage.no7
    public final /* bridge */ /* synthetic */ Object k(izd izdVar) {
        return v(izdVar);
    }

    @Override // defpackage.no7
    public final void m(Object obj) {
        t((aml) obj);
    }

    @Override // defpackage.no7
    public final Object q(byte[] bArr) {
        return v(new izd(new ByteArrayInputStream(bArr)));
    }

    @Override // defpackage.no7
    public final void r(Object obj) {
        t((aml) obj);
    }

    public final void t(aml amlVar) {
        if (amlVar.f) {
            return;
        }
        String[] strArr = OperaApplication.K;
        m9c m9cVarU = ((OperaApplication) this.a.getApplicationContext()).u();
        int i = amlVar.b;
        SharedPreferences sharedPreferences = (SharedPreferences) m9cVarU.b.get();
        if (sharedPreferences.getInt("min_interval", 0) != i) {
            j.b(sharedPreferences, "min_interval", i);
        }
        String str = amlVar.c;
        ((SharedPreferences) m9cVarU.b.get()).edit().putString("endpoint_override_hostname_new", str).putString("endpoint_override_path_new", amlVar.d).apply();
    }
}
