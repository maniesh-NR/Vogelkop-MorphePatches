package defpackage;

import android.content.SharedPreferences;
import com.opera.android.OperaApplication;

/* loaded from: classes.dex */
public final /* synthetic */ class ty implements mo7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ty(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.mo7
    public final void o(boolean z) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                nn7 nn7Var = (nn7) obj;
                ey eyVar = (ey) ((wy) obj2).w.i();
                ey eyVar2 = nn7Var.p;
                if (eyVar2 != null) {
                    long j = eyVar2.c;
                    nn7Var.p = eyVar;
                    if (eyVar.c < j) {
                        nn7Var.m.getClass();
                        nn7Var.m(System.currentTimeMillis());
                        break;
                    }
                } else {
                    nn7Var.p = eyVar;
                    if (nn7Var.r != null) {
                        nn7Var.o();
                        break;
                    }
                }
                break;
            case 1:
                ((xk3) obj2).e = ((wnh) ((xnh) obj).i()).a(8388608);
                break;
            case 2:
                ((z1h) obj2).b(((no7) obj).i());
                break;
            case 3:
                xnc xncVar = (xnc) obj;
                wnh wnhVar = (wnh) ((xnh) obj2).i();
                boolean zB = wnhVar.b(1024);
                boolean zB2 = wnhVar.b(134217728);
                boolean z2 = !wnhVar.b(268435456);
                xncVar.a.r(Boolean.valueOf(zB));
                xncVar.b.r(Boolean.valueOf(zB2));
                xncVar.c.r(Boolean.valueOf(z2));
                xncVar.e.r(Boolean.FALSE);
                break;
            case 4:
                String[] strArr = OperaApplication.K;
                d3j d3jVar = (d3j) ((e3j) obj2).i();
                nv6 nv6VarB = ru9.c((OperaApplication) obj).b();
                h11 h11Var = h11.j;
                c3j c3jVarD = d3jVar.d(20, false);
                SharedPreferences.Editor editor = (SharedPreferences.Editor) nv6VarB.a;
                if (c3jVarD == null) {
                    editor.remove("osp.analytics_host");
                    editor.remove("osp.analytics_key");
                    h11Var.C(null, null);
                } else {
                    String str = (String) c3jVarD.b;
                    String str2 = (String) c3jVarD.d;
                    editor.putString("osp.analytics_host", str2);
                    editor.putString("osp.analytics_key", str);
                    h11Var.C(str2, str);
                }
                tc3 tc3Var = tc3.j;
                c3j c3jVarD2 = d3jVar.d(21, false);
                if (c3jVarD2 == null) {
                    editor.remove("osp.behavior_host");
                    editor.remove("osp.behavior_key");
                    tc3Var.C(null, null);
                } else {
                    String str3 = (String) c3jVarD2.b;
                    String str4 = (String) c3jVarD2.d;
                    editor.putString("osp.behavior_host", str4);
                    editor.putString("osp.behavior_key", str3);
                    tc3Var.C(str4, str3);
                }
                axh axhVar = axh.j;
                c3j c3jVarD3 = d3jVar.d(22, false);
                if (c3jVarD3 == null) {
                    editor.remove("osp.requests_host");
                    editor.remove("osp.requests_key");
                    axhVar.C(null, null);
                } else {
                    String str5 = (String) c3jVarD3.b;
                    String str6 = (String) c3jVarD3.d;
                    editor.putString("osp.requests_host", str6);
                    editor.putString("osp.requests_key", str5);
                    axhVar.C(str6, str5);
                }
                cef cefVar = cef.j;
                c3j c3jVarD4 = d3jVar.d(36, false);
                if (c3jVarD4 == null) {
                    editor.remove("osp.onboarding_host");
                    editor.remove("osp.onboarding_key");
                    cefVar.C(null, null);
                } else {
                    String str7 = (String) c3jVarD4.b;
                    String str8 = (String) c3jVarD4.d;
                    editor.putString("osp.onboarding_host", str8);
                    editor.putString("osp.onboarding_key", str7);
                    cefVar.C(str8, str7);
                }
                be7 be7Var = be7.j;
                c3j c3jVarD5 = d3jVar.d(39, false);
                if (c3jVarD5 == null) {
                    editor.remove("osp.domains_host");
                    editor.remove("osp.domains_key");
                    be7Var.C(null, null);
                } else {
                    String str9 = (String) c3jVarD5.b;
                    String str10 = (String) c3jVarD5.d;
                    editor.putString("osp.domains_host", str10);
                    editor.putString("osp.domains_key", str9);
                    be7Var.C(str10, str9);
                }
                nv6VarB.w();
                break;
            default:
                mdh mdhVar = (mdh) obj2;
                lqh lqhVar = (lqh) obj;
                mdh.b(mdhVar, lqhVar.a, null, new vvf(lqhVar, mdhVar, (byte) 6), 2);
                break;
        }
    }
}
