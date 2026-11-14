package defpackage;

import ads_mobile_sdk.d91;
import ads_mobile_sdk.h21;
import ads_mobile_sdk.hf1;
import ads_mobile_sdk.in0;
import ads_mobile_sdk.m5;
import ads_mobile_sdk.w22;
import ads_mobile_sdk.ws;
import java.net.URL;
import java.util.Map;

/* loaded from: classes.dex */
public interface vkp {
    static /* synthetic */ Object b(vkp vkpVar, URL url, Map map, nt5 nt5Var, int i) {
        if ((i & 4) != 0) {
            map = null;
        }
        return vkpVar.a(url, map, (i & 16) != 0, nt5Var);
    }

    static /* synthetic */ Object c(vkp vkpVar, h21 h21Var, pn7 pn7Var, mt5 mt5Var, int i) {
        if ((i & 2) != 0) {
            pn7Var = null;
        }
        return vkpVar.a(h21Var, pn7Var, null, (i & 8) == 0, (i & 16) != 0, mt5Var);
    }

    Object a(int i, long j, m5 m5Var);

    Object a(h21 h21Var, pn7 pn7Var, w22 w22Var);

    Object a(h21 h21Var, pn7 pn7Var, Map map, boolean z, boolean z2, mt5 mt5Var);

    Object a(hf1 hf1Var);

    Object a(String str, Map map, mt5 mt5Var);

    Object a(URL url, in0 in0Var, mt5 mt5Var);

    Object a(URL url, Map map, boolean z, nt5 nt5Var);

    Object a(URL url, mt5 mt5Var);

    void a(d91 d91Var);

    void a(ws wsVar);
}
