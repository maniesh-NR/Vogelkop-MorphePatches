package defpackage;

import J.N;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.opera.android.http.server.HttpServer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class bp4 implements lkg {
    public final zo4 a;
    public final zn4 b;
    public final hp2 c;
    public final okg d;
    public final HashMap e = new HashMap();

    public bp4(zo4 zo4Var, zn4 zn4Var, hp2 hp2Var, okg okgVar) {
        this.a = zo4Var;
        this.b = zn4Var;
        this.c = hp2Var;
        this.d = okgVar;
    }

    @Override // defpackage.lkg
    public final vjd a(vjd vjdVar, egd egdVar) {
        Uri uriD0 = sfe.d0(vjdVar);
        if (uriD0 != null && zi4.E(egdVar.c())) {
            Uri uri = this.b.e;
            if (Objects.equals(uri.getScheme(), uriD0.getScheme()) && Objects.equals(uri.getHost(), uriD0.getHost()) && uri.getPort() == uriD0.getPort() && uriD0.getPath() != null && uriD0.getPath().startsWith(uri.buildUpon().path("/media/").build().getPath())) {
                Uri uriC = egdVar.c();
                Bundle bundle = vjdVar.I;
                if (bundle != null) {
                    bundle.putString("com.opera.android.media.MEDIA_URI", uriC != null ? uriC.toString() : null);
                } else if (uriC != null) {
                    ujd ujdVarA = vjdVar.a();
                    ujdVarA.H = sfe.L(uriC);
                    return new vjd(ujdVarA);
                }
            }
        }
        return vjdVar;
    }

    @Override // defpackage.lkg
    public final void b() {
        zo4 zo4Var = this.a;
        boolean z = zo4Var.M;
        ArrayList arrayList = zo4Var.k;
        if (!z) {
            zo4Var.N = new hij(arrayList.size());
            return;
        }
        int[] iArrB0 = zo4.B0(0, arrayList.size(), zo4Var.N);
        zo4Var.N = new hij(arrayList.size());
        zo4Var.E0(iArrB0, zo4.B0(0, arrayList.size(), zo4Var.N));
    }

    @Override // defpackage.lkg
    public final void c(int i, int i2) {
        this.a.h0(i, i2);
    }

    @Override // defpackage.lkg
    public final void clear() {
        this.a.f();
        this.e.clear();
        zn4 zn4Var = this.b;
        HashSet hashSet = zn4Var.c;
        HttpServer httpServer = zn4Var.d;
        HashSet hashSet2 = zn4Var.b;
        if (zn4Var.g) {
            return;
        }
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            httpServer.a((String) it.next());
        }
        hashSet2.clear();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            httpServer.a((String) it2.next());
        }
        hashSet.clear();
    }

    @Override // defpackage.lkg
    public final void d(mkg[] mkgVarArr, int i, long j) throws JSONException {
        this.a.x(i, i(mkgVarArr), j);
    }

    @Override // defpackage.lkg
    public final void destroy() {
        this.b.a();
    }

    @Override // defpackage.lkg
    public final Uri e(String str) {
        return (Uri) this.e.get(str);
    }

    @Override // defpackage.lkg
    public final kod f() {
        return new ap4(this.d, (byte) 9);
    }

    @Override // defpackage.lkg
    public final void g(int i, mkg[] mkgVarArr) throws JSONException {
        ArrayList arrayListI = i(mkgVarArr);
        zo4 zo4Var = this.a;
        if (zo4Var.p() == 0) {
            zo4Var.r0(arrayListI);
        } else if (i == -1) {
            zo4Var.j0(arrayListI);
        } else {
            zo4Var.b0(i, arrayListI);
        }
    }

    @Override // defpackage.lkg
    public final void h(od3 od3Var, boolean z) {
        zo4 zo4Var = this.a;
        if (z) {
            for (int i = 0; i < zo4Var.p(); i++) {
                qjd qjdVarQ = zo4Var.Q(i);
                if (qjdVarQ != null) {
                    od3Var.c(Integer.valueOf(i), qjdVarQ);
                }
            }
            return;
        }
        for (int iP = zo4Var.p() - 1; iP >= 0; iP--) {
            qjd qjdVarQ2 = zo4Var.Q(iP);
            if (qjdVarQ2 != null) {
                od3Var.c(Integer.valueOf(iP), qjdVarQ2);
            }
        }
    }

    public final ArrayList i(mkg[] mkgVarArr) {
        String lastPathSegment;
        int i;
        zn4 zn4Var;
        String str;
        Uri uriBuild;
        ArrayList arrayList = new ArrayList(mkgVarArr.length);
        int length = mkgVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            mkg mkgVar = mkgVarArr[i2];
            vjd vjdVar = mkgVar.a;
            Bitmap bitmap = mkgVar.c;
            egd egdVar = mkgVar.b;
            Uri uriD0 = sfe.d0(vjdVar);
            Bundle bundle = vjdVar.I;
            String string = bundle != null ? bundle.getString("com.opera.android.media.FILE_TYPE", null) : null;
            if (TextUtils.isEmpty(string)) {
                string = egdVar.c;
            }
            if ((TextUtils.isEmpty(string) || string.equals("application/octet-stream")) && (lastPathSegment = uriD0.getLastPathSegment()) != null) {
                string = MimeTypeMap.getSingleton().getMimeTypeFromExtension(s29.d(lastPathSegment).toLowerCase(Locale.US));
            }
            String str2 = string;
            boolean zE = zi4.E(uriD0);
            zn4 zn4Var2 = this.b;
            if (zE) {
                Bundle bundle2 = vjdVar.I;
                i = i2;
                long j = bundle2 != null ? bundle2.getLong("com.opera.android.media.FILE_LENGTH", -1L) : -1L;
                if (zn4Var2.g) {
                    uriD0 = null;
                    zn4Var = zn4Var2;
                    str = str2;
                } else {
                    str = str2;
                    String strB = zn4Var2.b();
                    zn4Var2.b.add(strB);
                    zn4Var = zn4Var2;
                    N.Mq9zNq9U(zn4Var2.d.b, strB, uriD0.toString(), j == -1 ? -1L : j, str);
                    uriD0 = zn4Var.e.buildUpon().path(strB).build();
                }
                if (uriD0 != null) {
                }
                i2 = i + 1;
            } else {
                i = i2;
                zn4Var = zn4Var2;
                str = str2;
            }
            Uri uri = uriD0;
            CharSequence charSequence = vjdVar.a;
            String strValueOf = mkgVar.d;
            if (strValueOf == null) {
                hp2 hp2Var = this.c;
                long j2 = hp2Var.b;
                hp2Var.b = j2 + 1;
                strValueOf = String.valueOf(j2);
            }
            if (vjdVar.m == null && bitmap != null) {
                if (zn4Var.g) {
                    uriBuild = null;
                } else {
                    String strB2 = zn4Var.b();
                    zn4Var.c.add(strB2);
                    N.MWJPnKV_(zn4Var.d.b, strB2);
                    zn4Var.f.execute(new k3(zn4Var, strB2, bitmap, (byte) 23));
                    uriBuild = zn4Var.e.buildUpon().path(strB2).build();
                }
                this.e.put(strValueOf, uriBuild);
            }
            fjd fjdVar = new fjd();
            ijd ijdVar = new ijd();
            List list = Collections.EMPTY_LIST;
            a1b a1bVar = h1b.b;
            csh cshVar = csh.e;
            kjd kjdVar = new kjd();
            njd njdVar = njd.d;
            strValueOf.getClass();
            ujd ujdVar = new ujd();
            ujdVar.a = charSequence != null ? charSequence.toString() : null;
            ujdVar.H = sfe.L(uri);
            vjd vjdVar2 = new vjd(ujdVar);
            z4o.H(((Uri) ijdVar.e) == null || ((UUID) ijdVar.d) != null);
            qjd qjdVar = new qjd(strValueOf, new hjd(fjdVar), new mjd(uri, str, ((UUID) ijdVar.d) != null ? new jjd(ijdVar) : null, (djd) null, list, (String) null, cshVar, -9223372036854775807L), new ljd(kjdVar), vjdVar2, njdVar);
            okg okgVar = this.d;
            okgVar.d.put(strValueOf, bitmap);
            okgVar.e.put(strValueOf, egdVar);
            arrayList.add(qjdVar);
            i2 = i + 1;
        }
        return arrayList;
    }

    @Override // defpackage.lkg
    public final boolean isEmpty() {
        return this.a.p() == 0;
    }

    @Override // defpackage.lkg
    public final void remove(int i) {
        Uri uri;
        mjd mjdVar;
        zo4 zo4Var = this.a;
        qjd qjdVarQ = zo4Var.Q(i);
        zn4 zn4Var = this.b;
        if (qjdVarQ != null && (mjdVar = qjdVarQ.c) != null) {
            zn4Var.c(mjdVar.a);
        }
        if (qjdVarQ != null && (uri = (Uri) this.e.remove(qjdVarQ.a)) != null) {
            zn4Var.c(uri);
        }
        zo4Var.o(i);
    }
}
