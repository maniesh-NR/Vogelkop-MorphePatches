package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import com.leanplum.internal.Clock;
import com.opera.android.live_score.LiveCommentaryService;
import com.opera.android.settings.SettingsManager;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Future;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class ta7 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public final Object l;
    public Object m;

    public ta7(Context context, t7f t7fVar, ceg cegVar, isd isdVar, nv6 nv6Var, sbk sbkVar) {
        ma7 ma7Var = new ma7("Picasso-Dispatcher", 10);
        ma7Var.start();
        Looper looper = ma7Var.getLooper();
        StringBuilder sb = zym.a;
        ceg cegVar2 = new ceg(looper, (byte) 3);
        cegVar2.sendMessageDelayed(cegVar2.obtainMessage(), 1000L);
        this.b = context;
        this.c = t7fVar;
        this.e = new LinkedHashMap();
        this.f = new WeakHashMap();
        this.g = new WeakHashMap();
        this.h = new LinkedHashSet();
        this.i = new ue2(ma7Var.getLooper(), this, (byte) 3);
        this.d = isdVar;
        this.j = cegVar;
        this.k = nv6Var;
        this.l = sbkVar;
        this.m = new ArrayList(4);
        try {
            Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0);
        } catch (NullPointerException | SecurityException unused) {
        }
        this.a = context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0;
        BroadcastReceiver up1Var = new up1((byte) 8, this, false);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
        ta7 ta7Var = (ta7) ((up1) up1Var).b;
        if (ta7Var.a) {
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
        ((Context) ta7Var.b).registerReceiver(up1Var, intentFilter);
    }

    public ta7(Context context, umi umiVar) {
        this.l = new nrl((byte) 26);
        this.b = new i16(context, umiVar);
        qb7 qb7Var = new qb7();
        i32 i32Var = new i32(qb7Var, context, umiVar);
        qb7Var.a = i32Var;
        i32Var.h();
        this.c = qb7Var;
        this.d = new yqa(context, umiVar);
        s6h s6hVar = new s6h();
        i32 i32Var2 = new i32(s6hVar, context, umiVar);
        s6hVar.a = i32Var2;
        i32Var2.h();
        this.e = s6hVar;
        this.f = w1h.l(context, umiVar, "newsfeed", new bg1[]{new a00(this, (byte) 8)});
    }

    public ta7(u02 u02Var, y0a y0aVar, j4c j4cVar, orm ormVar, wyn wynVar, vx vxVar, boolean z, SettingsManager settingsManager, cs6 cs6Var, xoc xocVar, dw3 dw3Var, dw3 dw3Var2) {
        this.b = u02Var;
        this.c = y0aVar;
        this.d = j4cVar;
        this.e = ormVar;
        this.f = wynVar;
        this.g = vxVar;
        this.a = z;
        this.h = settingsManager;
        this.i = cs6Var;
        this.j = xocVar;
        this.k = dw3Var;
        this.l = dw3Var2;
    }

    public static apc E(qcd qcdVar) {
        int iOrdinal = qcdVar.ordinal();
        if (iOrdinal == 0) {
            return apc.c;
        }
        if (iOrdinal == 1) {
            return apc.d;
        }
        h9o.p();
        return null;
    }

    public static String q(URL url) {
        String authority = url.getAuthority();
        String path = url.getPath();
        return (TextUtils.isEmpty(path) || "/".equals(path)) ? authority : sko.v(authority, "/", path);
    }

    public final void A(yla ylaVar) {
        String str;
        byte bE;
        String str2;
        l0c l0cVar;
        String string = "";
        if (ylaVar == null) {
            bE = 0;
            str = "";
            str2 = str;
        } else {
            String string2 = ylaVar.a.toString();
            String string3 = ylaVar.b.toString();
            str = string2;
            bE = o18.e(ylaVar.c);
            str2 = string3;
        }
        if (ylaVar != null && (l0cVar = ylaVar.e) != null) {
            string = l0cVar.toString();
        }
        am2.x(s().edit().putString("hosts_news_feed", str).putString("hosts_article_detail", str2).putInt("hosts_origin", bE).putString("hosts_language_region", string), "hosts_timestamp");
        this.g = ylaVar;
        this.a = true;
    }

    public final void B(String str, dka dkaVar) {
        try {
            String string = ((SharedPreferences) ((sqc) ((vx) this.g).get()).a.get()).getString(str, null);
            dkaVar.n(new sw7(string != null ? new ska(string) : null));
        } catch (Throwable th) {
            dkaVar.n(new rw7(new dqb(th)));
        }
    }

    public final void C(String str, dka dkaVar) {
        try {
            SharedPreferences.Editor editorEdit = ((SharedPreferences) ((sqc) ((vx) this.g).get()).a.get()).edit();
            editorEdit.remove(str);
            editorEdit.apply();
            dkaVar.n(new sw7(Unit.a));
        } catch (Throwable th) {
            dkaVar.n(new rw7(new dqb(th)));
        }
    }

    public final void D(String str, String str2, dka dkaVar) {
        try {
            SharedPreferences.Editor editorEdit = ((SharedPreferences) ((sqc) ((vx) this.g).get()).a.get()).edit();
            editorEdit.putString(str, str2);
            editorEdit.apply();
            dkaVar.n(new sw7(Unit.a));
        } catch (Throwable th) {
            dkaVar.n(new rw7(new dqb(th)));
        }
    }

    public final void F(cre creVar, boolean z) {
        yqa yqaVar = (yqa) this.d;
        List list = (List) yqaVar.c;
        i32 i32Var = (i32) yqaVar.b;
        if (list == null) {
            i32Var.i();
        }
        List list2 = (List) yqaVar.c;
        if (list2 != null) {
            ArrayList arrayListJ = nb6.J(new zlb(list2, new f15(creVar, (byte) 0), (byte) 0));
            if (creVar.a != null) {
                arrayListJ.add(new g15(creVar, z ? 3 : 2));
            }
            yqaVar.c = arrayListJ;
            i32Var.g(arrayListJ);
        }
        this.k = null;
    }

    public final void a(mka mkaVar) {
        apc apcVar;
        apc apcVar2;
        j4c j4cVar = (j4c) this.d;
        if (mkaVar instanceof oha) {
            vs6 vs6Var = (vs6) j4cVar.get();
            pcd pcdVar = ((oha) mkaVar).a;
            vs6Var.b(pcdVar.a, E(pcdVar.b), 1, ch9.a);
            return;
        }
        if (mkaVar instanceof pha) {
            vs6 vs6Var2 = (vs6) j4cVar.get();
            gdl gdlVar = ((pha) mkaVar).a;
            long j = gdlVar.a;
            int iOrdinal = gdlVar.b.ordinal();
            if (iOrdinal == 0) {
                apcVar2 = apc.c;
            } else {
                if (iOrdinal != 1) {
                    h9o.p();
                    return;
                }
                apcVar2 = apc.d;
            }
            vs6Var2.b(j, apcVar2, 2, ch9.a);
            return;
        }
        if (!(mkaVar instanceof qha)) {
            h9o.p();
            return;
        }
        vs6 vs6Var3 = (vs6) j4cVar.get();
        oxl oxlVar = ((qha) mkaVar).a;
        long j2 = oxlVar.a;
        int iOrdinal2 = oxlVar.b.ordinal();
        if (iOrdinal2 == 0) {
            apcVar = apc.c;
        } else {
            if (iOrdinal2 != 1) {
                h9o.p();
                return;
            }
            apcVar = apc.d;
        }
        vs6Var3.b(j2, apcVar, 3, ch9.a);
    }

    public final rha b() {
        f3j f3jVar = (f3j) ((dw3) this.k).get();
        String strU = StringsKt.U(f3jVar.b.toString(), "/");
        Uri uri = f3jVar.c;
        return new rha(strU, uri != null ? StringsKt.U(uri.toString(), "/") : null, StringsKt.U(f3jVar.d.toString(), "/"), StringsKt.U(f3jVar.e.toString(), "/"));
    }

    public final void c(String str, dka dkaVar) {
        try {
            vx3 vx3VarA = ay3.a(str, lqm.A, false);
            vx3VarA.c(true);
            vx3VarA.f = true;
            vx3VarA.c = this.a ? 2 : 3;
            ac8.a(new ay3(vx3VarA));
            dkaVar.n(new sw7(Unit.a));
        } catch (Throwable th) {
            dkaVar.n(new rw7(new dqb(th)));
        }
    }

    public final void d(String str, dka dkaVar) {
        cs6 cs6Var = (cs6) this.i;
        rlh rlhVar = cs6Var.b;
        rlh rlhVar2 = cs6Var.b;
        akc akcVar = (akc) rlhVar.a.getValue();
        if (!Intrinsics.a(akcVar, xjc.a)) {
            if (akcVar instanceof wjc) {
                wjc wjcVar = (wjc) akcVar;
                if (Intrinsics.a(wjcVar.a, str)) {
                    dkaVar.n(new sw7(new cia(new dia(0L, wjcVar.b))));
                    return;
                }
            } else if (akcVar instanceof yjc) {
                if (Intrinsics.a(((yjc) akcVar).a, str)) {
                    dkaVar.n(new sw7(null));
                    return;
                }
            } else {
                if (!(akcVar instanceof zjc)) {
                    h9o.p();
                    return;
                }
                if (Intrinsics.a(((zjc) akcVar).a, str)) {
                    q4b q4bVar = new q4b(dkaVar, (byte) 20);
                    a7b a7bVar = new a7b(dkaVar, (byte) 4);
                    new wqc((akc) rlhVar2.a.getValue(), xf8.u(rlhVar2), new ve9(false, (Function1) new rkc((Object) dkaVar, (byte) 6), (Function0) q4bVar, (Function2) a7bVar));
                    Context context = cs6Var.a;
                    Intent intent = new Intent(context, (Class<?>) LiveCommentaryService.class);
                    intent.setAction("com.opera.android.live_score.ACTION_PAUSE");
                    context.startService(intent);
                    return;
                }
            }
        }
        dkaVar.n(new rw7(new dqb(new IllegalArgumentException(""))));
    }

    public final void e(lf lfVar, dka dkaVar) {
        cs6 cs6Var = (cs6) this.i;
        boolean z = true;
        if (!(lfVar instanceof mf)) {
            if (!(lfVar instanceof j7b)) {
                h9o.p();
                return;
            }
            tqc tqcVar = new tqc(dkaVar, (byte) 1);
            uqc uqcVar = new uqc(dkaVar, (byte) 1);
            new wqc((akc) cs6Var.b.a.getValue(), xf8.u(cs6Var.b), new ve9(z, (Function1) new vqc(dkaVar, (byte) 1), (Function0) tqcVar, (Function2) uqcVar));
            j7b j7bVar = (j7b) lfVar;
            String str = j7bVar.a;
            String str2 = j7bVar.b;
            String str3 = j7bVar.d;
            String str4 = j7bVar.e;
            String str5 = j7bVar.c;
            Context context = cs6Var.a;
            Intent intent = new Intent(context, (Class<?>) LiveCommentaryService.class);
            intent.setAction("com.opera.android.live_score.ACTION_PLAY");
            intent.putExtra("extra_id", str);
            intent.putExtra("extra_url", str2);
            intent.putExtra("extra_title", str3);
            intent.putExtra("extra_description", str4);
            if (str5 != null) {
                intent.putExtra("extra_image_url", str5);
            }
            context.startForegroundService(intent);
            return;
        }
        rlh rlhVar = cs6Var.b;
        rlh rlhVar2 = cs6Var.b;
        akc akcVar = (akc) rlhVar.a.getValue();
        if (!Intrinsics.a(akcVar, xjc.a)) {
            if (akcVar instanceof wjc) {
                wjc wjcVar = (wjc) akcVar;
                if (Intrinsics.a(wjcVar.a, ((mf) lfVar).a)) {
                    dkaVar.n(new sw7(new eia(new fia(0L, wjcVar.b))));
                    return;
                }
            } else if (akcVar instanceof yjc) {
                if (Intrinsics.a(((yjc) akcVar).a, ((mf) lfVar).a)) {
                    tqc tqcVar2 = new tqc(dkaVar, (byte) 0);
                    uqc uqcVar2 = new uqc(dkaVar, (byte) 0);
                    new wqc((akc) rlhVar2.a.getValue(), xf8.u(rlhVar2), new ve9(z, (Function1) new vqc(dkaVar, (byte) 0), (Function0) tqcVar2, (Function2) uqcVar2));
                    Context context2 = cs6Var.a;
                    Intent intent2 = new Intent(context2, (Class<?>) LiveCommentaryService.class);
                    intent2.setAction("com.opera.android.live_score.ACTION_RESUME");
                    context2.startService(intent2);
                    return;
                }
            } else if (!(akcVar instanceof zjc)) {
                h9o.p();
                return;
            } else if (Intrinsics.a(((zjc) akcVar).a, ((mf) lfVar).a)) {
                dkaVar.n(new sw7(null));
                return;
            }
        }
        dkaVar.n(new rw7(new dqb(new IllegalArgumentException(""))));
    }

    public final void f(String str, dka dkaVar) {
        try {
            eq6 eq6Var = (eq6) this.m;
            if (eq6Var != null) {
                qxh qxhVar = new qxh(str);
                ysj ysjVar = (ysj) ((ew3) eq6Var.a).get();
                qt qtVar = new qt(qxhVar, (byte) 2);
                ysjVar.getClass();
                ysjVar.b(qtVar, ijm.b);
            }
            dkaVar.n(new sw7(Unit.a));
        } catch (Throwable th) {
            dkaVar.n(new rw7(new dqb(th)));
        }
    }

    public final void g(String str, dka dkaVar) {
        boolean zA;
        cs6 cs6Var = (cs6) this.i;
        rlh rlhVar = cs6Var.b;
        rlh rlhVar2 = cs6Var.b;
        akc akcVar = (akc) rlhVar.a.getValue();
        if (Intrinsics.a(akcVar, xjc.a)) {
            dkaVar.n(new sw7(null));
            return;
        }
        if (akcVar instanceof wjc) {
            zA = Intrinsics.a(((wjc) akcVar).a, str);
        } else if (akcVar instanceof yjc) {
            zA = Intrinsics.a(((yjc) akcVar).a, str);
        } else {
            if (!(akcVar instanceof zjc)) {
                h9o.p();
                return;
            }
            zA = Intrinsics.a(((zjc) akcVar).a, str);
        }
        if (!zA) {
            dkaVar.n(new rw7(new dqb(new IllegalArgumentException(""))));
            return;
        }
        q4b q4bVar = new q4b(dkaVar, (byte) 21);
        a7b a7bVar = new a7b(dkaVar, (byte) 5);
        new wqc((akc) rlhVar2.a.getValue(), xf8.u(rlhVar2), new ve9(false, (Function1) new rkc((Object) dkaVar, (byte) 7), (Function0) q4bVar, (Function2) a7bVar));
        Context context = cs6Var.a;
        Intent intent = new Intent(context, (Class<?>) LiveCommentaryService.class);
        intent.setAction("com.opera.android.live_score.ACTION_STOP");
        context.startService(intent);
    }

    public final void h(mka mkaVar) {
        apc apcVar;
        apc apcVar2;
        j4c j4cVar = (j4c) this.d;
        if (mkaVar instanceof oha) {
            vs6 vs6Var = (vs6) j4cVar.get();
            pcd pcdVar = ((oha) mkaVar).a;
            long j = pcdVar.a;
            apc apcVarE = E(pcdVar.b);
            ch9 ch9Var = ch9.a;
            vs6Var.d(j, apcVarE, 1);
            return;
        }
        if (mkaVar instanceof pha) {
            vs6 vs6Var2 = (vs6) j4cVar.get();
            gdl gdlVar = ((pha) mkaVar).a;
            long j2 = gdlVar.a;
            int iOrdinal = gdlVar.b.ordinal();
            if (iOrdinal == 0) {
                apcVar2 = apc.c;
            } else {
                if (iOrdinal != 1) {
                    h9o.p();
                    return;
                }
                apcVar2 = apc.d;
            }
            ch9 ch9Var2 = ch9.a;
            vs6Var2.d(j2, apcVar2, 2);
            return;
        }
        if (!(mkaVar instanceof qha)) {
            h9o.p();
            return;
        }
        vs6 vs6Var3 = (vs6) j4cVar.get();
        oxl oxlVar = ((qha) mkaVar).a;
        long j3 = oxlVar.a;
        int iOrdinal2 = oxlVar.b.ordinal();
        if (iOrdinal2 == 0) {
            apcVar = apc.c;
        } else {
            if (iOrdinal2 != 1) {
                h9o.p();
                return;
            }
            apcVar = apc.d;
        }
        ch9 ch9Var3 = ch9.a;
        vs6Var3.d(j3, apcVar, 3);
    }

    public final void i(wuh wuhVar, String str) {
        xg0 xg0Var;
        xoc xocVar = (xoc) this.j;
        orm ormVar = (orm) this.e;
        byte b = 2;
        boolean z = false;
        z = false;
        byte b2 = 1;
        if (wuhVar instanceof p7f) {
            p7f p7fVar = (p7f) wuhVar;
            String str2 = p7fVar.c;
            String str3 = p7fVar.b;
            int iOrdinal = p7fVar.a.ordinal();
            if (iOrdinal == 0) {
                String strConcat = "bottom_sheet_".concat(str);
                x5f x5fVar = (x5f) ormVar;
                if (x5fVar.h) {
                    zpa zpaVar = x5fVar.d;
                    x56 x56VarF = zpa.F();
                    new ck0(zpaVar, x56VarF).e().a().b(strConcat, new e5f(str3, str2, b2));
                    x5fVar.U0(x56VarF);
                    return;
                }
                return;
            }
            if (iOrdinal == 1) {
                String strConcat2 = "bottom_sheet_".concat(str);
                x5f x5fVar2 = (x5f) ormVar;
                if (x5fVar2.h) {
                    zpa zpaVar2 = x5fVar2.d;
                    x56 x56VarF2 = zpa.F();
                    new ck0(zpaVar2, x56VarF2).e().a().b(strConcat2, new e5f(str3, str2, z ? (byte) 1 : (byte) 0));
                    x5fVar2.U0(x56VarF2);
                    return;
                }
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    h9o.p();
                    return;
                }
                String strConcat3 = "bottom_sheet_".concat(str);
                x5f x5fVar3 = (x5f) ormVar;
                if (x5fVar3.h) {
                    zpa zpaVar3 = x5fVar3.d;
                    x56 x56VarF3 = zpa.F();
                    new ck0(zpaVar3, x56VarF3).e().a().b(strConcat3, new e5f(str3, str2, b));
                    x5fVar3.U0(x56VarF3);
                    return;
                }
                return;
            }
            return;
        }
        if (wuhVar instanceof elj) {
            int iOrdinal2 = ((elj) wuhVar).a.ordinal();
            op0 op0Var = op0.d;
            switch (iOrdinal2) {
                case 0:
                    x5f x5fVar4 = (x5f) ormVar;
                    if (x5fVar4.h) {
                        zpa zpaVar4 = x5fVar4.d;
                        x56 x56VarF4 = zpa.F();
                        qg0 qg0Var = new qg0(2443, -1, 13);
                        qg0Var.e(0);
                        x56VarF4.E(zpaVar4).y(zpaVar4).x().put(str, qg0Var);
                        x5fVar4.U0(x56VarF4);
                        break;
                    }
                    break;
                case 1:
                    x5f x5fVar5 = (x5f) ormVar;
                    if (x5fVar5.h) {
                        x5fVar5.a0(1, str);
                        break;
                    }
                    break;
                case 2:
                    x5f x5fVar6 = (x5f) ormVar;
                    if (x5fVar6.h) {
                        x5fVar6.a0(4, str);
                        break;
                    }
                    break;
                case 3:
                    ((x5f) ormVar).M0(8, op0Var, true);
                    break;
                case 4:
                    ((x5f) ormVar).M0(8, op0Var, false);
                    break;
                case 5:
                    ((x5f) ormVar).M0(9, op0Var, true);
                    break;
                case 6:
                    ((x5f) ormVar).M0(9, op0Var, false);
                    break;
                case 7:
                    x5f x5fVar7 = (x5f) ormVar;
                    if (x5fVar7.h) {
                        x5fVar7.a0(9, str);
                        break;
                    }
                    break;
                default:
                    h9o.p();
                    break;
            }
            return;
        }
        boolean z2 = wuhVar instanceof r7f;
        op0 op0Var2 = op0.b;
        if (z2) {
            r7f r7fVar = (r7f) wuhVar;
            boolean z3 = r7fVar.a;
            boolean z4 = r7fVar.b;
            if (z3 != z4) {
                ((x5f) ormVar).M0(8, op0Var2, z4);
                return;
            }
            return;
        }
        if (wuhVar instanceof e1h) {
            e1h e1hVar = (e1h) wuhVar;
            boolean z5 = e1hVar.a;
            boolean z6 = e1hVar.b;
            if (z5 != z6) {
                ((x5f) ormVar).M0(9, op0Var2, z6);
                return;
            }
            return;
        }
        if (!(wuhVar instanceof dh9)) {
            if (!(wuhVar instanceof wdf)) {
                h9o.p();
                return;
            }
            int iOrdinal3 = ((wdf) wuhVar).a.ordinal();
            xg0 xg0Var2 = xg0.c;
            xg0 xg0Var3 = xg0.e;
            if (iOrdinal3 == 0) {
                xg0Var = xg0Var2;
            } else if (iOrdinal3 == 1) {
                xg0Var = xg0.b;
            } else if (iOrdinal3 == 2) {
                xg0Var = xg0.d;
            } else {
                if (iOrdinal3 != 3) {
                    h9o.p();
                    return;
                }
                xg0Var = xg0Var3;
            }
            xocVar.getClass();
            if (xg0Var != xg0Var2 && xg0Var != xg0Var3) {
                z = true;
            }
            xocVar.e = z;
            x5f x5fVar8 = xocVar.a;
            if (x5fVar8.h) {
                zpa zpaVar5 = x5fVar8.d;
                x56 x56VarF5 = zpa.F();
                new ck0(zpaVar5, x56VarF5).b(new rkc((Object) xg0Var, (byte) 25));
                x5fVar8.U0(x56VarF5);
                return;
            }
            return;
        }
        dh9 dh9Var = (dh9) wuhVar;
        sua suaVar = dh9Var.b;
        int iOrdinal4 = dh9Var.a.ordinal();
        if (iOrdinal4 == 0) {
            if (suaVar instanceof sua) {
                String string = suaVar.a.toString();
                x5f x5fVar9 = xocVar.a;
                if (x5fVar9.h) {
                    x5fVar9.a0(2, str);
                }
                HashMap map = xocVar.b;
                Object obj = map.get(str);
                Object obj2 = obj;
                if (obj == null) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    map.put(str, linkedHashSet);
                    obj2 = linkedHashSet;
                }
                ((Set) obj2).add(string);
                return;
            }
            if (suaVar instanceof tua) {
                String string2 = ((tua) suaVar).a.toString();
                x5f x5fVar10 = xocVar.a;
                if (x5fVar10.h) {
                    x5fVar10.a0(7, str);
                }
                HashMap map2 = xocVar.c;
                Object obj3 = map2.get(str);
                Object obj4 = obj3;
                if (obj3 == null) {
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    map2.put(str, linkedHashSet2);
                    obj4 = linkedHashSet2;
                }
                ((Set) obj4).add(string2);
                return;
            }
            if (!(suaVar instanceof uua)) {
                h9o.p();
                return;
            }
            String string3 = ((uua) suaVar).a.toString();
            x5f x5fVar11 = xocVar.a;
            if (x5fVar11.h) {
                x5fVar11.a0(5, str);
            }
            HashMap map3 = xocVar.d;
            Object obj5 = map3.get(str);
            Object obj6 = obj5;
            if (obj5 == null) {
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                map3.put(str, linkedHashSet3);
                obj6 = linkedHashSet3;
            }
            ((Set) obj6).add(string3);
            return;
        }
        if (iOrdinal4 != 1) {
            h9o.p();
            return;
        }
        if (suaVar instanceof sua) {
            String string4 = suaVar.a.toString();
            x5f x5fVar12 = xocVar.a;
            if (x5fVar12.h) {
                x5fVar12.a0(3, str);
            }
            HashMap map4 = xocVar.b;
            Object obj7 = map4.get(str);
            Object obj8 = obj7;
            if (obj7 == null) {
                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                map4.put(str, linkedHashSet4);
                obj8 = linkedHashSet4;
            }
            ((Set) obj8).remove(string4);
            return;
        }
        if (suaVar instanceof tua) {
            String string5 = ((tua) suaVar).a.toString();
            x5f x5fVar13 = xocVar.a;
            if (x5fVar13.h) {
                x5fVar13.a0(8, str);
            }
            HashMap map5 = xocVar.c;
            Object obj9 = map5.get(str);
            Object obj10 = obj9;
            if (obj9 == null) {
                LinkedHashSet linkedHashSet5 = new LinkedHashSet();
                map5.put(str, linkedHashSet5);
                obj10 = linkedHashSet5;
            }
            ((Set) obj10).remove(string5);
            return;
        }
        if (!(suaVar instanceof uua)) {
            h9o.p();
            return;
        }
        String string6 = ((uua) suaVar).a.toString();
        x5f x5fVar14 = xocVar.a;
        if (x5fVar14.h) {
            x5fVar14.a0(6, str);
        }
        HashMap map6 = xocVar.d;
        Object obj11 = map6.get(str);
        Object obj12 = obj11;
        if (obj11 == null) {
            LinkedHashSet linkedHashSet6 = new LinkedHashSet();
            map6.put(str, linkedHashSet6);
            obj12 = linkedHashSet6;
        }
        ((Set) obj12).remove(string6);
    }

    public final void j(String str) {
        if0 if0Var;
        x5f x5fVar = (x5f) ((orm) this.e);
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            ug0 ug0VarY = x56VarF.E(zpaVar).y(zpaVar);
            Map map = (Map) ug0VarY.n(1);
            if (map == null || map.isEmpty()) {
                HashMap map2 = new HashMap();
                ug0VarY.q(1, 1, map2);
                if0Var = new if0(ug0VarY, 1, map2);
            } else {
                if0Var = new if0(ug0VarY, 1, map);
            }
            if0Var.put(str, 1L);
            x5fVar.U0(x56VarF);
        }
    }

    public final void k(sg3 sg3Var) {
        ue2 ue2Var = (ue2) this.i;
        Future future = sg3Var.m;
        if (future == null || !future.isCancelled()) {
            Bitmap bitmap = sg3Var.l;
            if (bitmap != null) {
                bitmap.prepareToDraw();
            }
            ((ArrayList) this.m).add(sg3Var);
            if (ue2Var.hasMessages(7)) {
                return;
            }
            ue2Var.sendEmptyMessageDelayed(7, 0L);
        }
    }

    public final void l(sg3 sg3Var) {
        ue2 ue2Var = (ue2) this.i;
        ue2Var.sendMessage(ue2Var.obtainMessage(4, sg3Var));
    }

    public final void m(sg3 sg3Var) {
        ue2 ue2Var = (ue2) this.i;
        ue2Var.sendMessage(ue2Var.obtainMessage(6, sg3Var));
    }

    public final List n() {
        List listJ = (List) this.i;
        if (listJ == null) {
            qb7 qb7Var = (qb7) this.c;
            if (((List) qb7Var.b) == null) {
                ((i32) qb7Var.a).i();
            }
            List list = (List) qb7Var.b;
            listJ = list == null ? Collections.EMPTY_LIST : nb6.J(new zlb(list, new b10((byte) 5), (byte) 1));
            this.i = listJ;
        }
        return listJ;
    }

    public final cre o(String str, String str2) {
        List<cre> listJ = (List) this.k;
        if (listJ == null) {
            yqa yqaVar = (yqa) this.d;
            if (((List) yqaVar.c) == null) {
                ((i32) yqaVar.b).i();
            }
            List list = (List) yqaVar.c;
            listJ = list == null ? Collections.EMPTY_LIST : nb6.J(new zlb(list, new b10((byte) 6), (byte) 1));
            this.k = listJ;
        }
        for (cre creVar : listJ) {
            if (creVar.c.equals(str) && creVar.d.equals(str2)) {
                return creVar;
            }
        }
        return null;
    }

    public final pu8 p() {
        SharedPreferences sharedPreferencesS = s();
        int i = sharedPreferencesS.getInt("duration_threshold", -1);
        int i2 = sharedPreferencesS.getInt("percent_threshold", -1);
        s6h s6hVar = (s6h) this.e;
        ux8 ux8Var = (ux8) s6hVar.b;
        i32 i32Var = (i32) s6hVar.a;
        if (ux8Var == null) {
            i32Var.i();
        }
        ux8 ux8Var2 = (ux8) s6hVar.b;
        Map map = ux8Var2.a;
        if (ux8Var2 == null) {
            i32Var.i();
        }
        Map map2 = ((ux8) s6hVar.b).b;
        if (i == -1 && i2 == -1 && map == null && map2 == null && !sharedPreferencesS.contains("enable_local_push") && !sharedPreferencesS.contains("enable_native_push") && !sharedPreferencesS.contains("enable_video_theater")) {
            return null;
        }
        boolean z = sharedPreferencesS.getBoolean("enable_local_push", false);
        boolean z2 = sharedPreferencesS.getBoolean("enable_native_push", false);
        boolean z3 = sharedPreferencesS.getBoolean("enable_video_theater", false);
        sharedPreferencesS.getBoolean("enable_insta_clips", false);
        Integer numValueOf = null;
        Integer numValueOf2 = i == -1 ? null : Integer.valueOf(i);
        if (i2 != -1) {
            numValueOf = Integer.valueOf(i2);
        }
        return new pu8(numValueOf2, numValueOf, map, map2, z, z2, z3);
    }

    public final yla r() {
        int i;
        if (this.a) {
            return (yla) this.g;
        }
        SharedPreferences sharedPreferencesS = s();
        int i2 = sharedPreferencesS.getInt("hosts_origin", 0);
        if (i2 == 0) {
            this.g = null;
            this.a = true;
            return null;
        }
        String string = sharedPreferencesS.getString("hosts_news_feed", "");
        String string2 = sharedPreferencesS.getString("hosts_article_detail", "");
        long jAbs = Math.abs(System.currentTimeMillis() - sharedPreferencesS.getLong("hosts_timestamp", 0L));
        try {
        } catch (MalformedURLException unused) {
            A(null);
        }
        for (int i3 : vep.B(3)) {
            if (o18.e(i3) == i2) {
                URL url = new URL(string);
                URL url2 = new URL(string2);
                String string3 = sharedPreferencesS.getString("hosts_language_region", "");
                int iIndexOf = string3 != null ? string3.indexOf(58) : -1;
                this.g = new yla(url, url2, i3, iIndexOf != -1 ? new l0c(string3.substring(0, iIndexOf), string3.substring(iIndexOf + 1)) : null, jAbs >= Clock.DAY_MILLIS);
                this.a = true;
                return (yla) this.g;
            }
        }
        throw new IllegalArgumentException("Unknown value");
    }

    public final SharedPreferences s() {
        return (SharedPreferences) ((b59) this.f).get();
    }

    public final bre t() {
        bre breVar = (bre) this.j;
        if (breVar != null) {
            return breVar;
        }
        qb7 qb7Var = (qb7) this.c;
        if (((List) qb7Var.b) == null) {
            ((i32) qb7Var.a).i();
        }
        d15 d15Var = (d15) qb7Var.c;
        if (d15Var == null) {
            d15Var = null;
        }
        bre breVar2 = d15Var != null ? d15Var.b : null;
        this.j = breVar2;
        return breVar2;
    }

    public final boolean u() {
        qb7 qb7Var = (qb7) this.c;
        if (((List) qb7Var.b) == null) {
            ((i32) qb7Var.a).i();
        }
        d15 d15Var = (d15) qb7Var.c;
        if (d15Var == null) {
            d15Var = null;
        }
        return d15Var != null && d15Var.c == 3;
    }

    public final boolean v(fp4 fp4Var) {
        long j;
        try {
            j = s().getLong("cities_features", 0L);
        } catch (ClassCastException unused) {
            j = s().getInt("cities_features", 0);
        }
        String string = s().getString("cities_config_bundle", null);
        if (n().isEmpty() || j != fp4Var.b || !Objects.equals(string, fp4Var.c)) {
            return false;
        }
        URL url = fp4Var.a.a;
        String string2 = s().getString("cities_host", null);
        return string2 == null ? true : string2.equals(q(url));
    }

    public final void w(sg3 sg3Var, boolean z) {
        sg3Var.a.getClass();
        ((LinkedHashMap) this.e).remove(sg3Var.e);
        k(sg3Var);
    }

    public final void x(dc dcVar, boolean z) {
        ta7 ta7Var;
        dc dcVar2;
        sg3 sg3Var;
        t7f t7fVar = (t7f) this.c;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.e;
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.h;
        dc dcVar3 = dcVar.i;
        jvh jvhVar = dcVar.b;
        String str = dcVar.h;
        deg degVar = dcVar.a;
        if (linkedHashSet.contains(dcVar3)) {
            ((WeakHashMap) this.g).put(dcVar.d(), dcVar);
            degVar.getClass();
            return;
        }
        sg3 sg3Var2 = (sg3) linkedHashMap.get(str);
        if (sg3Var2 != null) {
            sg3Var2.a.getClass();
            if (sg3Var2.j == null) {
                sg3Var2.j = dcVar;
                return;
            }
            ArrayList arrayList = sg3Var2.k;
            if (arrayList == null) {
                arrayList = new ArrayList(3);
                sg3Var2.k = arrayList;
            }
            arrayList.add(dcVar);
            int i = jvhVar.n;
            if (vep.A(i) > vep.A(sg3Var2.q)) {
                sg3Var2.q = i;
                return;
            }
            return;
        }
        t7fVar.getClass();
        nv6 nv6Var = (nv6) this.k;
        sbk sbkVar = (sbk) this.l;
        Object obj = sg3.r;
        List list = degVar.b;
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                ta7Var = this;
                dcVar2 = dcVar;
                sg3Var = new sg3(degVar, ta7Var, nv6Var, sbkVar, dcVar2, sg3.u);
                break;
            } else {
                jwh jwhVar = (jwh) list.get(i2);
                if (jwhVar.b(jvhVar)) {
                    ta7Var = this;
                    dcVar2 = dcVar;
                    sg3Var = new sg3(degVar, ta7Var, nv6Var, sbkVar, dcVar2, jwhVar);
                    break;
                }
                i2++;
            }
        }
        sg3Var.m = t7fVar.submit((Runnable) sg3Var);
        linkedHashMap.put(str, sg3Var);
        if (z) {
            ((WeakHashMap) ta7Var.f).remove(dcVar2.d());
        }
        degVar.getClass();
    }

    public final void y(List list, bre breVar, boolean z) {
        int size = -1;
        if (breVar != null) {
            int iIndexOf = list.indexOf(breVar);
            if (iIndexOf == -1) {
                size = list.size();
                list.add(breVar);
            } else {
                size = iIndexOf;
            }
        }
        qb7 qb7Var = (qb7) this.c;
        qb7Var.getClass();
        ArrayList arrayList = new ArrayList(list.size());
        d15 d15Var = null;
        int i = 0;
        while (i < list.size()) {
            bre breVar2 = (bre) list.get(i);
            boolean z2 = i == size;
            d15 d15Var2 = new d15(i, breVar2, z2 ? z ? 3 : 2 : 1);
            arrayList.add(d15Var2);
            if (z2) {
                d15Var = d15Var2;
            }
            i++;
        }
        qb7Var.b = arrayList;
        qb7Var.c = d15Var;
        ((i32) qb7Var.a).g(arrayList);
        this.i = null;
        this.j = null;
    }

    public final void z(long j, String str, URL url, List list, bre breVar, boolean z) {
        s().edit().putLong("cities_features", j).putString("cities_config_bundle", str).putString("cities_host", q(url)).apply();
        y(list, breVar, z);
    }
}
