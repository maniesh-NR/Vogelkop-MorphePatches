package defpackage;

import ads_mobile_sdk.bj1;
import ads_mobile_sdk.bv0;
import ads_mobile_sdk.dv0;
import ads_mobile_sdk.hv0;
import ads_mobile_sdk.iv0;
import ads_mobile_sdk.ku0;
import ads_mobile_sdk.nf2;
import ads_mobile_sdk.rm0;
import ads_mobile_sdk.yk3;
import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.webkit.WebView;
import com.opera.android.browser.SimpleUrlLoader;
import com.opera.android.suggestion.Suggestion;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.g;
import org.chromium.support_lib_boundary.SpeculativeLoadingParametersBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ioj implements hoj, SpeculativeLoadingParametersBoundaryInterface, iqk, g, o3n, f94, lo7, uwn, d2i, djp, ee5 {
    public final /* synthetic */ byte a;

    public /* synthetic */ ioj(byte b) {
        this.a = b;
    }

    public /* synthetic */ ioj(Object obj, byte b) {
        this.a = b;
    }

    public static rm0 b(rap rapVar) {
        if (rapVar instanceof hv0) {
            return rm0.c;
        }
        if (rapVar instanceof iv0) {
            return rm0.e;
        }
        if (rapVar instanceof bv0) {
            return ((bv0) rapVar).c instanceof CancellationException ? rm0.g : rm0.h;
        }
        if (!(rapVar instanceof dv0)) {
            return rm0.i;
        }
        int iIntValue = ((dv0) rapVar).c.E().intValue();
        xrc xrcVar = xrc.INTERNAL_ERROR;
        return iIntValue == 7 ? rm0.f : iIntValue == 3 ? rm0.d : rm0.i;
    }

    public static yk3 c(Object obj) {
        ku0 ku0Var = (ku0) obj;
        yk3 yk3Var = ku0Var.b;
        if (yk3Var != yk3.f) {
            return yk3Var;
        }
        yk3 yk3VarB = yk3.b();
        ku0Var.b = yk3VarB;
        return yk3VarB;
    }

    public static boolean d(int i, r05 r05Var, Object obj) throws bj1 {
        int i2 = r05Var.b;
        v9g v9gVar = (v9g) r05Var.e;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            r05Var.b(0);
            ((yk3) obj).a(i3 << 3, Long.valueOf(v9gVar.k()));
            return true;
        }
        if (i4 == 1) {
            r05Var.b(1);
            ((yk3) obj).a((i3 << 3) | 1, Long.valueOf(v9gVar.h()));
            return true;
        }
        if (i4 == 2) {
            r05Var.b(2);
            ((yk3) obj).a((i3 << 3) | 2, v9gVar.d());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                if (i != 0) {
                    return false;
                }
                t3p.j("Protocol message end-group tag did not match expected tag.");
                return false;
            }
            if (i4 != 5) {
                t3p.c();
                return false;
            }
            r05Var.b(5);
            ((yk3) obj).a((i3 << 3) | 5, Integer.valueOf(v9gVar.g()));
            return true;
        }
        yk3 yk3VarB = yk3.b();
        int i5 = i3 << 3;
        int i6 = i5 | 4;
        int i7 = i + 1;
        if (i7 >= 100) {
            t3p.j("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return false;
        }
        while (r05Var.a() != Integer.MAX_VALUE && d(i7, r05Var, yk3VarB)) {
        }
        if (i6 != r05Var.b) {
            t3p.j("Protocol message end-group tag did not match expected tag.");
            return false;
        }
        if (yk3VarB.e) {
            yk3VarB.e = false;
        }
        ((yk3) obj).a(i5 | 3, yk3VarB);
        return true;
    }

    public final Object a(int i) {
        nf2 nf2VarA = nf2.a(i);
        return nf2VarA == null ? nf2.USER_POPULATION_UNSPECIFIED : nf2VarA;
    }

    public final void f(String str, tmi tmiVar) {
        tmiVar.invoke((Object) null);
    }

    @Override // org.chromium.support_lib_boundary.SpeculativeLoadingParametersBoundaryInterface
    public final Map getAdditionalHeaders() {
        return new HashMap();
    }

    @Override // defpackage.d2i
    public final int getAmount() {
        return 1;
    }

    @Override // org.chromium.support_lib_boundary.SpeculativeLoadingParametersBoundaryInterface
    public final InvocationHandler getNoVarySearchData() {
        return null;
    }

    @Override // defpackage.d2i
    public final String getType() {
        return "";
    }

    @Override // defpackage.o3n
    public final void h(MediaMetadataRetriever mediaMetadataRetriever, Object obj) throws IllegalArgumentException {
        mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }

    @Override // org.chromium.support_lib_boundary.SpeculativeLoadingParametersBoundaryInterface
    public final boolean isJavaScriptEnabled() {
        return false;
    }

    public final void l(pvb pvbVar, boolean z) {
    }

    public final void m(SimpleUrlLoader simpleUrlLoader, String str, xnj xnjVar) {
        xnjVar.invoke((Object) null);
    }

    public final void onFailure(v84 v84Var, IOException iOException) {
    }

    public final void onPostMessage(WebView webView, jun junVar, Uri uri, boolean z, xmb xmbVar) {
        try {
            JSONObject jSONObject = new JSONObject(junVar.b());
            auj.i(jSONObject.getString("method"), jSONObject.getJSONObject("data"));
        } catch (JSONException unused) {
        }
    }

    public final void onResponse(v84 v84Var, pzh pzhVar) {
        pzhVar.close();
    }

    public final void q(Suggestion suggestion, boolean z) {
    }

    public final Object r(x79 x79Var) {
        switch (this.a) {
            case 18:
                return new wth(x79Var.i(qfh.a(vth.class)));
            default:
                return new vth(x79Var.k(psp.class));
        }
    }

    public final void removeAll() {
    }

    public final no7 x(Context context) {
        return new rwn(context, 17, "webViewBlacklist");
    }
}
