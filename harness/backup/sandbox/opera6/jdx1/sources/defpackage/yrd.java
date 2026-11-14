package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class yrd implements lkg {
    public final Context a;
    public final qi8 b;
    public final ij5 c;
    public final hp2 d;
    public final okg e;
    public final vzk f;

    public yrd(Context context, qi8 qi8Var, hp2 hp2Var, okg okgVar) throws d45 {
        String str;
        this.a = context;
        this.b = qi8Var;
        ij5 ij5Var = new ij5(new l73[0]);
        this.c = ij5Var;
        qi8Var.Y0();
        List listSingletonList = Collections.singletonList(ij5Var);
        qi8Var.Y0();
        qi8Var.Y0();
        qi8Var.P0(listSingletonList, true, -9223372036854775807L, -1);
        this.d = hp2Var;
        this.e = okgVar;
        vzk vzkVar = new vzk();
        vzkVar.d = this;
        Context context2 = this.a;
        String string = context2.getString(2132017591);
        String str2 = tym.a;
        try {
            str = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = "?";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append("/");
        sb.append(str);
        sb.append(" (Linux;Android ");
        i16 i16Var = new i16(context2, z1m.l(sb, Build.VERSION.RELEASE, ") AndroidXMedia3/1.9.0"));
        vzkVar.a = new i5h(i16Var, new mp6());
        vzkVar.b = new DashMediaSource$Factory(i16Var);
        vzkVar.c = new HlsMediaSource$Factory(i16Var);
        this.f = vzkVar;
    }

    public final vjd a(vjd vjdVar, egd egdVar) {
        return vjdVar;
    }

    public final void b() {
        ij5 ij5Var = this.c;
        hij hijVar = new hij(0);
        synchronized (ij5Var) {
            int[] iArr = hijVar.b;
            Handler handler = ij5Var.m;
            if (handler != null) {
                int iF = ij5Var.F();
                Object objCloneAndInsert = hijVar;
                if (iArr.length != iF) {
                    objCloneAndInsert = ((hij) hijVar.cloneAndClear()).cloneAndInsert(0, iF);
                }
                handler.obtainMessage(4, new hj5(0, objCloneAndInsert, null)).sendToTarget();
            } else {
                jij jijVarCloneAndClear = hijVar;
                if (iArr.length > 0) {
                    jijVarCloneAndClear = hijVar.cloneAndClear();
                }
                ij5Var.t = jijVarCloneAndClear;
            }
        }
    }

    public final void c(int i, int i2) {
        ij5 ij5Var = this.c;
        synchronized (ij5Var) {
            Handler handler = ij5Var.m;
            ArrayList arrayList = ij5Var.k;
            arrayList.add(i2, (gj5) arrayList.remove(i));
            if (handler != null) {
                handler.obtainMessage(3, new hj5(i, Integer.valueOf(i2), null)).sendToTarget();
            }
        }
    }

    public final void clear() {
        ij5 ij5Var = this.c;
        synchronized (ij5Var) {
            int iF = ij5Var.F();
            synchronized (ij5Var) {
                try {
                    ij5Var.G(0, iF);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void d(mkg[] mkgVarArr, int i, long j) {
        clear();
        g(0, mkgVarArr);
        this.b.w0(i, j, false);
    }

    public final void destroy() {
    }

    public final kod f() {
        return new yhe(this.e, (byte) 9);
    }

    public final void g(int i, mkg[] mkgVarArr) {
        int i2;
        int i3;
        vzk vzkVar = this.f;
        vzkVar.getClass();
        ArrayList arrayList = new ArrayList(mkgVarArr.length);
        int length = mkgVarArr.length;
        int i4 = 0;
        while (i4 < length) {
            mkg mkgVar = mkgVarArr[i4];
            vjd vjdVar = mkgVar.a;
            egd egdVar = mkgVar.b;
            String strValueOf = mkgVar.d;
            yrd yrdVar = (yrd) vzkVar.d;
            yrdVar.getClass();
            fjd fjdVar = new fjd();
            ijd ijdVar = new ijd();
            List list = Collections.EMPTY_LIST;
            a1b a1bVar = h1b.b;
            csh cshVar = csh.e;
            kjd kjdVar = new kjd();
            njd njdVar = njd.d;
            Uri uriD0 = sfe.d0(vjdVar);
            if (strValueOf == null) {
                hp2 hp2Var = yrdVar.d;
                i3 = i4;
                long j = hp2Var.b;
                i2 = length;
                hp2Var.b = j + 1;
                strValueOf = String.valueOf(j);
            } else {
                i2 = length;
                i3 = i4;
            }
            String str = strValueOf;
            str.getClass();
            z4o.H(((Uri) ijdVar.e) == null || ((UUID) ijdVar.d) != null);
            qjd qjdVar = new qjd(str, new hjd(fjdVar), uriD0 != null ? new mjd(uriD0, null, ((UUID) ijdVar.d) != null ? new jjd(ijdVar) : null, null, list, null, cshVar, -9223372036854775807L) : null, new ljd(kjdVar), vjdVar, njdVar);
            int iOrdinal = egdVar.b().ordinal();
            arrayList.add(iOrdinal != 3 ? iOrdinal != 4 ? ((i5h) vzkVar.a).a(qjdVar) : ((HlsMediaSource$Factory) vzkVar.c).a(qjdVar) : ((DashMediaSource$Factory) vzkVar.b).a(qjdVar));
            i4 = i3 + 1;
            length = i2;
        }
        for (int i5 = 0; i5 < mkgVarArr.length; i5++) {
            okg okgVar = this.e;
            mkg mkgVar2 = mkgVarArr[i5];
            String str2 = ((l73) arrayList.get(i5)).i().a;
            okgVar.d.put(str2, mkgVar2.c);
            okgVar.e.put(str2, mkgVar2.b);
        }
        ij5 ij5Var = this.c;
        if (i == -1) {
            synchronized (ij5Var) {
                ij5Var.A(ij5Var.k.size(), arrayList);
            }
        } else {
            synchronized (ij5Var) {
                ij5Var.A(i, arrayList);
            }
        }
    }

    public final void h(od3 od3Var, boolean z) {
        ij5 ij5Var = this.c;
        if (z) {
            for (int i = 0; i < ij5Var.F(); i++) {
                od3Var.c(Integer.valueOf(i), ij5Var.E(i).k.i());
            }
            return;
        }
        for (int iF = ij5Var.F() - 1; iF >= 0; iF--) {
            od3Var.c(Integer.valueOf(iF), ij5Var.E(iF).k.i());
        }
    }

    public final boolean isEmpty() {
        return this.c.F() == 0;
    }

    public final void remove(int i) {
        ij5 ij5Var = this.c;
        synchronized (ij5Var) {
            ij5Var.E(i);
            ij5Var.G(i, i + 1);
        }
    }
}
