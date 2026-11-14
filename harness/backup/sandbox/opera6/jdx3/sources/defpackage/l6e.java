package defpackage;

import J.N;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Size;
import com.leanplum.internal.Constants;
import com.opera.android.browser.obml.Platform;
import com.opera.api.Callback;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;
import java.util.regex.Matcher;
import org.chromium.content_public.common.ResourceRequestBody;

/* loaded from: classes.dex */
public class l6e implements eri {
    public static final hr5 k = new hr5();
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int h;
    public wzg i;
    public vsi j;
    public long b = -1;
    public pqk g = k;

    public l6e(int i, String str, String str2, String str3, String str4) {
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.h = i;
    }

    public static lsc o(lsc lscVar, sce sceVar) {
        lscVar.c = true;
        HashMap map = new HashMap(1);
        map.put("Content-Type", sceVar.c.a);
        lscVar.f = map;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        slh slhVar = new slh(new me2(byteArrayOutputStream, new jql(), (byte) 1));
        try {
            sceVar.a(slhVar, false);
            slhVar.flush();
            lscVar.i = new ResourceRequestBody((byte[]) N.MugoAW_d(byteArrayOutputStream.toByteArray()));
            lscVar.c = true;
            return lscVar;
        } catch (IOException unused) {
            return new lsc("", 0);
        }
    }

    public static boolean p(String str) {
        String[] strArr = wqm.a;
        for (String str2 : aik.g(str).split("\\.")) {
            if ("google".equals(str2)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.eri
    public String a(int i, p6l p6lVar, String str) {
        String strC = a26.C(str);
        String strReplace = this.d.replace("%i", "10");
        return (strReplace.contains("%s") || strReplace.contains("{searchTerms}")) ? strReplace.replace("%s", strC).replace("{searchTerms}", strC) : sko.j(strReplace, strC);
    }

    @Override // defpackage.eri
    public final boolean b() {
        return this.h == 5;
    }

    @Override // defpackage.eri
    public boolean c() {
        return this instanceof fco;
    }

    @Override // defpackage.eri
    public final void cancel() {
        vsi vsiVar = this.j;
        if (vsiVar != null) {
            vsiVar.a();
        }
    }

    @Override // defpackage.eri
    public final boolean d() {
        return this.h == 5;
    }

    @Override // defpackage.eri
    public boolean e() {
        return !(this instanceof l42);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6e)) {
            return false;
        }
        l6e l6eVar = (l6e) obj;
        long j = this.b;
        if (j < 0) {
            return false;
        }
        long j2 = l6eVar.b;
        return j2 >= 0 && j == j2 && Objects.equals(this.c, l6eVar.c) && Objects.equals(this.d, l6eVar.d) && Objects.equals(this.e, l6eVar.e) && Objects.equals(this.f, l6eVar.f) && Objects.equals(this.g, l6eVar.g) && this.h == l6eVar.h && this.i == l6eVar.i && this.j == l6eVar.j;
    }

    @Override // defpackage.eri
    public final boolean f() {
        return !TextUtils.isEmpty(this.f);
    }

    @Override // defpackage.eri
    public lsc g(byte[] bArr, Size size, Size size2, String str) {
        return new lsc("", 0);
    }

    @Override // defpackage.eri
    public final long getId() {
        return this.b;
    }

    @Override // defpackage.eri
    public final String getTitle() {
        return this.c;
    }

    @Override // defpackage.eri
    public final String getUrl() {
        return this.d;
    }

    @Override // defpackage.eri
    public final hh4 h(eh7 eh7Var, Callback callback) {
        wzg wzgVar;
        gpk gpkVar = hh4.Po;
        String str = this.e;
        if (str == null || (wzgVar = this.i) == null) {
            callback.run(null);
            return gpkVar;
        }
        if (wzg.b(str)) {
            dwh dwhVarH = yne.b.h(new File(Platform.d(str)));
            if (eh7Var != null) {
                dwhVarH.b.c(eh7Var);
            }
            phi phiVar = new phi(callback);
            dwhVarH.f(phiVar);
            return phiVar;
        }
        if (str.isEmpty()) {
            callback.run(null);
            return gpkVar;
        }
        int identifier = ((Resources) wzgVar.c).getIdentifier(str, "drawable", (String) wzgVar.b);
        if (identifier == 0) {
            callback.run(null);
            return gpkVar;
        }
        deg degVar = yne.b;
        degVar.getClass();
        if (identifier == 0) {
            qp2.o("Resource ID must not be zero.");
            return null;
        }
        dwh dwhVar = new dwh(degVar, (Uri) null, identifier);
        if (eh7Var != null) {
            dwhVar.b.c(eh7Var);
        }
        phi phiVar2 = new phi(callback);
        dwhVar.f(phiVar2);
        return phiVar2;
    }

    public final int hashCode() {
        long j = this.b;
        if (j < 0) {
            return System.identityHashCode(this);
        }
        Long lValueOf = Long.valueOf(j);
        pqk pqkVar = this.g;
        wzg wzgVar = this.i;
        vsi vsiVar = this.j;
        return Objects.hash(lValueOf, this.c, this.d, this.e, this.f, pqkVar, vep.c(this.h), wzgVar, vsiVar);
    }

    @Override // defpackage.eri
    public final void i(String str, boolean z, tn tnVar) {
        int i;
        vsi vsiVar = this.j;
        if (vsiVar == null) {
            String str2 = this.f;
            if (TextUtils.isEmpty(str2)) {
                tnVar.L(Collections.EMPTY_LIST);
                return;
            } else {
                vsi vsiVar2 = new vsi(str2, n(this.g));
                this.j = vsiVar2;
                vsiVar = vsiVar2;
            }
        }
        if (!TextUtils.isEmpty(str) && str.length() <= 256) {
            URL url = null;
            try {
                String strC = a26.C(str);
                String str3 = vsiVar.a;
                StringBuffer stringBuffer = new StringBuffer(str3.length());
                Matcher matcher = eti.c.matcher(str3);
                while (matcher.find()) {
                    String strGroup = matcher.group(1);
                    strGroup.getClass();
                    matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(!strGroup.equals(Constants.Keys.LOCALE) ? !strGroup.equals("query") ? "" : strC : vsi.b()));
                }
                matcher.appendTail(stringBuffer);
                String string = stringBuffer.toString();
                if (string != null) {
                    url = new URL(string);
                }
            } catch (MalformedURLException unused) {
            }
            if (url != null) {
                tsi tsiVar = new tsi(str, z, tnVar, url);
                tsi tsiVar2 = vsiVar.d;
                if (tsiVar2 == null || !tsiVar2.equals(tsiVar)) {
                    vsiVar.a();
                    if (vsiVar.h > 0 || (i = vsiVar.b) == 2) {
                        vsiVar.e = tsiVar;
                        vsiVar.c(false);
                        return;
                    } else {
                        if (i == 1) {
                            vsiVar.b = 2;
                        }
                        vsiVar.c(false);
                        vsiVar.f(tsiVar);
                        return;
                    }
                }
                return;
            }
        }
        vsiVar.a();
        tnVar.L(Collections.EMPTY_LIST);
    }

    @Override // defpackage.eri
    public final String j() {
        wzg wzgVar;
        String str = this.e;
        if (str == null || (wzgVar = this.i) == null) {
            return null;
        }
        wzgVar.getClass();
        if (wzg.b(str)) {
            return Platform.d(str);
        }
        return null;
    }

    @Override // defpackage.eri
    public final String k() {
        return this.e;
    }

    @Override // defpackage.eri
    public int m() {
        return 0;
    }

    public h6e n(pqk pqkVar) {
        return new e1a(pqkVar, 0, (byte) 1);
    }

    public final void q() {
        String str;
        wzg wzgVar = this.i;
        if (wzgVar == null || (str = this.e) == null) {
            return;
        }
        wzgVar.getClass();
        if (wzg.b(str)) {
            new File(Platform.d(str)).delete();
        }
    }
}
