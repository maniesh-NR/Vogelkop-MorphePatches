package defpackage;

import J.N;
import com.opera.android.browser.BrowserUtils;
import com.opera.android.browser.UrlMangler;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class ypm {
    public static final ypm l = new ypm();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final zg g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    public ypm() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = null;
        this.i = false;
        this.h = false;
        this.j = false;
        this.k = false;
    }

    public ypm(b2l b2lVar) {
        int iIndexOf;
        d7l d7lVar = (d7l) b2lVar;
        String strG0 = d7lVar.g0();
        this.a = wqm.r(strG0) ? wqm.H(strG0) : strG0;
        knf knfVarH = d7lVar.e.h();
        String strZ = knfVarH != null ? knfVarH.z() : BrowserUtils.getEditableString(d7lVar.j.getUrl());
        if (strZ.length() >= 1000 && strZ.startsWith("data:") && (iIndexOf = strZ.indexOf(44) + 1) != 0 && strZ.length() - 1 > iIndexOf) {
            strZ = strZ.substring(0, iIndexOf).concat("uri-content");
        }
        this.b = strZ;
        String url = d7lVar.j.getUrl();
        this.c = url;
        this.d = d7lVar.h0();
        this.e = d7lVar.i0();
        GURL gurl = new GURL(url);
        this.f = N.MKonq97J(gurl) ? (String) N.M6gdEujY(gurl) : d7lVar.h0();
        this.g = BrowserUtils.b(d7lVar.j.getUrl());
        boolean zIsOffline = UrlMangler.isOffline(url);
        this.i = zIsOffline;
        this.h = wqm.A(url) || wqm.w(url) || zIsOffline || UrlMangler.d(d7lVar.j.getUrl()) || UrlMangler.c(url) || UrlMangler.b(url) || "jump".equals(UrlMangler.getAuthority(url)) || url.startsWith("market://") || d7lVar.j.c0();
        this.j = d7lVar.j.m();
        this.k = d7lVar.n0();
    }
}
