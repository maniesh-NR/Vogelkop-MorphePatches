package defpackage;

import android.net.Uri;
import com.leanplum.utils.SizeUtil;
import com.opera.android.browser.BrowserUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* loaded from: classes.dex */
public final /* synthetic */ class tx0 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    public /* synthetic */ tx0(Object obj, String str, byte b) {
        this.a = b;
        this.b = str;
    }

    public /* synthetic */ tx0(String str, byte b) {
        this.a = b;
        this.b = str;
    }

    public /* synthetic */ tx0(String str, ob2 ob2Var) {
        this.a = (byte) 7;
        this.b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj) throws Exception {
        wsk wskVarH;
        if0 if0Var;
        hf0 hf0Var;
        byte b = this.a;
        String str = this.b;
        switch (b) {
            case 0:
                String str2 = (String) ((Pair) obj).b;
                return Boolean.valueOf(!Intrinsics.a(str, str2) && c.q(str2, str, false));
            case 1:
                ((wa1) obj).w(0, str);
                return Unit.a;
            case 2:
                wa1 wa1Var = (wa1) obj;
                wa1Var.w(0, str);
                wa1Var.w(1, str);
                return Unit.a;
            case 3:
                ((wa1) obj).w(0, str);
                return Unit.a;
            case 4:
                ((wa1) obj).w(0, str);
                return Unit.a;
            case 5:
                ((wa1) obj).w(0, str);
                return Unit.a;
            case 6:
                return Boolean.valueOf(Intrinsics.a(((jx1) obj).getId(), str));
            case 7:
                wskVarH = ((osk) obj).h("SELECT * FROM asset_links WHERE ? == domain");
                try {
                    wskVarH.h(1, str);
                    int iF = hyg.f(wskVarH, "domain");
                    int iF2 = hyg.f(wskVarH, "relation");
                    int iF3 = hyg.f(wskVarH, "namespace");
                    int iF4 = hyg.f(wskVarH, "packageName");
                    int iF5 = hyg.f(wskVarH, "sha256CertFingerprints");
                    int iF6 = hyg.f(wskVarH, "timestamp");
                    ArrayList arrayList = new ArrayList();
                    while (wskVarH.n()) {
                        String strL = wskVarH.l(iF);
                        String strL2 = wskVarH.l(iF2);
                        qpb qpbVar = rpb.d;
                        qpbVar.getClass();
                        xhk xhkVar = xhk.a;
                        List list = (List) qpbVar.a(strL2, new k72(xhkVar, (byte) 0));
                        String strL3 = wskVarH.isNull(iF3) ? null : wskVarH.l(iF3);
                        String strL4 = wskVarH.l(iF4);
                        String strL5 = wskVarH.l(iF5);
                        qpbVar.getClass();
                        arrayList.add(new pb2(strL, list, strL3, strL4, (List) qpbVar.a(strL5, new k72(xhkVar, (byte) 0)), wskVarH.getLong(iF6)));
                    }
                    return arrayList;
                } finally {
                }
            case 8:
                wskVarH = ((osk) obj).h("SELECT * FROM whitelisted_domains WHERE ? == domain LIMIT 1");
                try {
                    wskVarH.h(1, str);
                    return wskVarH.n() ? new s0o(wskVarH.l(hyg.f(wskVarH, "domain"))) : null;
                } finally {
                }
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                q0j q0jVar = (q0j) obj;
                xtb[] xtbVarArr = o0j.a;
                p0j p0jVar = n0j.k;
                xtb xtbVar = o0j.a[3];
                nkc nkcVar = new nkc(1);
                p0jVar.getClass();
                q0jVar.b(p0jVar, nkcVar);
                o0j.g(q0jVar, str);
                return Unit.a;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                q0j q0jVar2 = (q0j) obj;
                o0j.h(q0jVar2, 0);
                o0j.d(q0jVar2, str);
                return Unit.a;
            case 11:
                Uri uri = Uri.parse(BrowserUtils.getRendererUrl(((b65) obj).b));
                return Boolean.valueOf(Intrinsics.a(Intrinsics.a(uri.getScheme(), "opera-aria") ? wqm.m(uri, "s") : null, str));
            case 12:
                o0j.g((q0j) obj, str);
                return Unit.a;
            case 13:
                wskVarH = ((osk) obj).h("SELECT * FROM entry WHERE pageUrl LIKE ?|| '%'");
                try {
                    wskVarH.h(1, str);
                    int iF7 = hyg.f(wskVarH, "pageUrl");
                    int iF8 = hyg.f(wskVarH, "imageUrl");
                    int iF9 = hyg.f(wskVarH, "timeStamp");
                    int iF10 = hyg.f(wskVarH, "flags");
                    ArrayList arrayList2 = new ArrayList();
                    while (wskVarH.n()) {
                        arrayList2.add(new x4l(wskVarH.l(iF7), (int) wskVarH.getLong(iF10), wskVarH.isNull(iF8) ? null : wskVarH.l(iF8), wskVarH.getLong(iF9)));
                    }
                    return arrayList2;
                } finally {
                }
            case 14:
                wskVarH = ((osk) obj).h("SELECT * FROM entry WHERE pageUrl = ?");
                try {
                    wskVarH.h(1, str);
                    int iF11 = hyg.f(wskVarH, "pageUrl");
                    int iF12 = hyg.f(wskVarH, "imageUrl");
                    int iF13 = hyg.f(wskVarH, "timeStamp");
                    int iF14 = hyg.f(wskVarH, "flags");
                    if (wskVarH.n()) {
                        x4lVar = new x4l(wskVarH.l(iF11), (int) wskVarH.getLong(iF14), wskVarH.isNull(iF12) ? null : wskVarH.l(iF12), wskVarH.getLong(iF13));
                    }
                    return x4lVar;
                } finally {
                }
            case 15:
                return Boolean.valueOf(Intrinsics.a(((b0a) obj).getId(), str));
            case 16:
                lee leeVar = (lee) obj;
                leeVar.d(r9a.d, str);
                r9a.d(leeVar, str);
                return null;
            case 17:
                wskVarH = ((osk) obj).h("DELETE FROM entry WHERE storageId = ?");
                try {
                    wskVarH.h(1, str);
                    wskVarH.n();
                    wskVarH.close();
                    return Unit.a;
                } finally {
                }
            case SizeUtil.textSize0_1 /* 18 */:
                q0j q0jVar3 = (q0j) obj;
                o0j.d(q0jVar3, str);
                o0j.h(q0jVar3, 5);
                return Unit.a;
            case 19:
                q0j q0jVar4 = (q0j) obj;
                o0j.d(q0jVar4, str);
                o0j.h(q0jVar4, 5);
                return Unit.a;
            case SizeUtil.textSize0 /* 20 */:
                ((wa1) obj).w(0, str);
                return Unit.a;
            case 21:
                ((wa1) obj).w(0, str);
                return Unit.a;
            case SizeUtil.textSize1 /* 22 */:
                q0j q0jVar5 = (q0j) obj;
                o0j.g(q0jVar5, str);
                p0j p0jVar2 = n0j.u;
                xtb xtbVar2 = o0j.a[11];
                Float fValueOf = Float.valueOf(0.0f);
                p0jVar2.getClass();
                q0jVar5.b(p0jVar2, fValueOf);
                return Unit.a;
            case 23:
                ed0 ed0Var = ((fd0) obj).a;
                Map map = (Map) ed0Var.n(1);
                if (map == null || map.isEmpty()) {
                    HashMap map2 = new HashMap();
                    ed0Var.q(1, 1, map2);
                    if0Var = new if0(ed0Var, 1, map2);
                } else {
                    if0Var = new if0(ed0Var, 1, map);
                }
                if0Var.put(str, 1L);
                return Unit.a;
            case SizeUtil.textSize2 /* 24 */:
                ((lk0) obj).a(str, new zbe((byte) 20));
                return Unit.a;
            case 25:
                ((lk0) obj).a(str, new zbe((byte) 19));
                return Unit.a;
            case 26:
                ((lk0) obj).a(str, new zbe((byte) 21));
                return Unit.a;
            case 27:
                a70 a70Var = (a70) obj;
                a70Var.a.q(0, str == null ? 0 : 1, str);
                a70Var.a.p(2, 1, 1L);
                return Unit.a;
            case 28:
                a70 a70Var2 = (a70) obj;
                a70Var2.a.q(0, str == null ? 0 : 1, str);
                a70Var2.a.p(1, 1, 1L);
                return Unit.a;
            default:
                String[] strArr = {str};
                q56 q56Var = ((ck0) obj).c().b;
                List list2 = (List) q56Var.n(0);
                if (list2 == null || list2.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList();
                    q56Var.q(0, 1, arrayList3);
                    hf0Var = new hf0(q56Var, 0, arrayList3);
                } else {
                    hf0Var = new hf0(q56Var, 0, list2);
                }
                hf0Var.addAll(Arrays.asList(strArr));
                return Unit.a;
        }
    }
}
