package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.Lazy;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.settings.SettingsManager;
import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.content_public.browser.NavigationController;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final /* synthetic */ class iu2 implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iu2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v16, types: [android.content.Context, com.opera.android.BrowserActivity] */
    /* JADX WARN: Type inference failed for: r11v33, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v14, types: [p99, s63] */
    /* JADX WARN: Type inference failed for: r1v13, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaListItem] */
    /* JADX WARN: Type inference failed for: r3v0, types: [byte] */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        boolean z;
        o7j q0iVar;
        String str;
        o7j[] o7jVarArrValues;
        int length;
        int i;
        f7j q0iVar2;
        String str2;
        f7j[] f7jVarArrValues;
        int length2;
        int i2;
        byte b = this.a;
        ?? r3 = 0;
        int i3 = 0;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ju2 ju2Var = (ju2) obj2;
                ju2Var.d = null;
                ((x5f) ju2Var.c).C(!((Boolean) obj).booleanValue(), true, ((SettingsManager) ju2Var.b).i("password_manager_autosave"));
                return;
            case 1:
                mu2 mu2Var = (mu2) obj2;
                a4g a4gVar = (a4g) obj;
                mu2Var.f = a4gVar;
                mu2Var.e.r(a4gVar != null ? a4gVar : null);
                return;
            case 2:
                gv2 gv2Var = (gv2) obj2;
                gv2Var.b = (List) obj;
                gv2Var.e();
                return;
            case 3:
                ((ImageView) obj2).setImageDrawable((Drawable) obj);
                return;
            case 4:
                im3 im3Var = (im3) obj2;
                ml3 ml3Var = (ml3) obj;
                im3Var.l.D((ml3Var == null || ml3Var.h()) ? im3Var.getString(2132020570) : alo.J(ml3Var, im3Var.getResources()));
                if (im3Var.G.isActionViewExpanded()) {
                    im3Var.G.collapseActionView();
                }
                im3Var.P0(ml3Var);
                return;
            case 5:
                int i4 = BrowserActivity.E1;
                ((gyf) obj2).a();
                return;
            case 6:
                bv3 bv3Var = (bv3) obj2;
                String str3 = (String) obj;
                if (str3 == null) {
                    bv3Var.e.run();
                    return;
                }
                vx3 vx3VarA = ay3.a(str3, lqm.m, true);
                vx3VarA.a(true);
                vx3VarA.b = 2;
                vx3VarA.c = 3;
                am2.v(vx3VarA);
                return;
            case 7:
                hv3 hv3Var = (hv3) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                hv3Var.getClass();
                if (zBooleanValue) {
                    new p99().w0(hv3Var.a);
                    return;
                }
                return;
            case 8:
                d84 d84Var = (d84) obj2;
                c84 c84Var = (c84) obj;
                if (c84Var != null) {
                    d84Var.a = c84Var;
                    return;
                }
                return;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((b84) obj2).a((c84) obj);
                return;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                qb7 qb7Var = (qb7) obj2;
                List<hu4> list = (List) obj;
                vk6 vk6Var = (vk6) qb7Var.a;
                if (list.isEmpty()) {
                    ((kze) qb7Var.c).r(Boolean.TRUE);
                    return;
                }
                HashMap map = new HashMap();
                vr9 vr9Var = new vr9(new fh4(qb7Var, map, (byte) 4), list.size());
                for (hu4 hu4Var : list) {
                    long j = hu4Var.a;
                    if (j == 0 || (z = hu4Var.b)) {
                        vr9Var.run();
                    } else if (hu4Var.f) {
                        vr9Var.run();
                    } else {
                        f9 f9Var = new f9((Object) map, (Object) hu4Var, (Object) vr9Var, (byte) 18);
                        umi umiVar = vk6Var.b;
                        if (z) {
                            qp2.o("Loading messages for incognito chat");
                            return;
                        }
                        if (j == 0) {
                            qp2.o("Chat must be inserted first");
                            return;
                        }
                        qie qieVar = vk6Var.c;
                        nml nmlVarE = umiVar.e(new ge5(vk6Var, hu4Var, (byte) 9));
                        oml omlVar = new oml(umiVar.f(new uk6(f9Var, (byte) r3)));
                        if (nmlVarE.d != null) {
                            h9o.e();
                            return;
                        } else {
                            nmlVarE.d = omlVar;
                            qieVar.n(new oml(nmlVarE), null);
                        }
                    }
                }
                return;
            case 11:
                fz4 fz4Var = (fz4) obj2;
                if (((Boolean) obj).booleanValue()) {
                    ChromiumContent chromiumContent = (ChromiumContent) fz4Var.d;
                    GURL gurl = ChromiumContent.V;
                    NavigationController navigationControllerD = chromiumContent.d();
                    if (navigationControllerD != null) {
                        navigationControllerD.b();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                List list2 = (List) obj;
                ((o8f) obj2).run(list2.subList(0, Math.min(list2.size(), 100)));
                return;
            case 13:
                ((k25) obj2).run((Integer) obj);
                return;
            case 14:
                e35 e35Var = (e35) obj2;
                s25 s25Var = (s25) obj;
                e35Var.x = s25Var;
                ?? r11 = e35Var.r;
                int size = r11.size();
                while (r3 < size) {
                    Object obj3 = r11.get(r3);
                    r3++;
                    c35 c35Var = (c35) obj3;
                    r25 r25Var = c35Var.a;
                    boolean zD = r25Var.d(s25Var);
                    c35Var.e = zD;
                    if (zD) {
                        r25Var.c(s25Var, new iu2(c35Var, (byte) 15));
                    } else {
                        ac1 ac1Var = c35Var.f.v;
                        ac1Var.a--;
                        ac1Var.k();
                        c35Var.b.setVisibility(8);
                    }
                }
                return;
            case 15:
                c35 c35Var2 = (c35) obj2;
                v0g.m(c35Var2.b, (String) obj);
                c35Var2.c = true;
                c35Var2.f.z.d();
                return;
            case 16:
                a55 a55Var = (a55) obj2;
                z45 z45Var = (z45) obj;
                if (z45Var != null) {
                    a55Var.a(1, z45Var);
                    a55Var.a(2, z45Var);
                }
                a55Var.c.K();
                return;
            case 17:
                ((wa) obj2).c((Uri) obj);
                return;
            case SizeUtil.textSize0_1 /* 18 */:
                o85 o85Var = (o85) obj2;
                ((ImageView) o85Var.a.j).setImageDrawable(eti.b(o85Var.c, (Bitmap) obj, o85Var.f));
                return;
            case 19:
                l45 l45Var = (l45) obj2;
                r9i r9iVar = (r9i) l45Var.c;
                tw7 tw7Var = (tw7) obj;
                if (tw7Var instanceof rw7) {
                    rw7 rw7Var = new rw7(Collections.singletonList((p58) ((rw7) tw7Var).a));
                    ((LinkedHashSet) r9iVar.e).remove(l45Var);
                    ((Callback) l45Var.b).run(rw7Var);
                    return;
                }
                if (!(tw7Var instanceof sw7)) {
                    h9o.p();
                    return;
                }
                lb4 lb4Var = new lb4(l45Var, (byte) 24);
                wj5 wj5Var = (wj5) l45Var.a;
                vr9 vr9Var2 = new vr9(lb4Var, wj5Var.q.size() + 2);
                String str4 = (String) CollectionsKt.firstOrNull(wj5Var.s);
                if (str4 != null) {
                    ((qln) ((Lazy) ((u59) r9iVar.c).b).get()).p(7, vq8.m(str4));
                }
                vr9Var2.run();
                for (y5j y5jVar : wj5Var.q) {
                    i16 i16Var = (i16) r9iVar.b;
                    String str5 = wj5Var.p;
                    SettingsManager settingsManager = (SettingsManager) i16Var.b;
                    if (y5jVar != null) {
                        if (y5jVar instanceof x5j) {
                            g7j g7jVarD = g7j.d(((x5j) y5jVar).b);
                            if (g7jVarD != null) {
                                settingsManager.U(g7jVarD, true);
                            }
                            vr9Var2.run();
                        } else if (y5jVar instanceof w5j) {
                            try {
                                p0i p0iVar = t0i.b;
                                str2 = ((w5j) y5jVar).b;
                                f7jVarArrValues = f7j.values();
                                length2 = f7jVarArrValues.length;
                            } catch (Throwable th) {
                                p0i p0iVar2 = t0i.b;
                                q0iVar2 = new q0i(th);
                            }
                            for (i2 = 0; i2 < length2; i2++) {
                                q0iVar2 = f7jVarArrValues[i2];
                                if (q0iVar2.b.equals(str2)) {
                                    if (t0i.d(q0iVar2) == null) {
                                        settingsManager.getClass();
                                        settingsManager.V(q0iVar2.ordinal(), "app_theme");
                                    }
                                    vr9Var2.run();
                                }
                            }
                            throw new IllegalArgumentException("Unknown App theme: " + str2);
                            break;
                        } else if (y5jVar instanceof r5j) {
                            settingsManager.V(((r5j) y5jVar).b ? 1 : 0, "live_scores_enabled");
                            vr9Var2.run();
                        } else if (y5jVar instanceof u5j) {
                            u5j u5jVar = (u5j) y5jVar;
                            if (u5jVar instanceof s5j) {
                                vr9Var2.run();
                            } else {
                                if (!(u5jVar instanceof t5j)) {
                                    h9o.p();
                                    return;
                                }
                                new gte((i3j) i16Var.c, str5, (t5j) y5jVar, vr9Var2);
                            }
                        } else if (y5jVar instanceof v5j) {
                            try {
                                p0i p0iVar3 = t0i.b;
                                str = ((v5j) y5jVar).b;
                                o7jVarArrValues = o7j.values();
                                length = o7jVarArrValues.length;
                            } catch (Throwable th2) {
                                p0i p0iVar4 = t0i.b;
                                q0iVar = new q0i(th2);
                            }
                            for (i = 0; i < length; i++) {
                                q0iVar = o7jVarArrValues[i];
                                if (q0iVar.b.equals(str)) {
                                    if (t0i.d(q0iVar) == null) {
                                        settingsManager.getClass();
                                        settingsManager.V(q0iVar.ordinal(), "enable_reading_mode_as_default");
                                    }
                                    vr9Var2.run();
                                }
                            }
                            throw new IllegalArgumentException("Unknown reading mode disposition: " + str);
                            break;
                        }
                    }
                    h9o.p();
                    return;
                    break;
                }
                if (wj5Var.t) {
                    ((s99) r9iVar.d).invoke();
                }
                vr9Var2.run();
                return;
            case SizeUtil.textSize0 /* 20 */:
                ((uk5) obj2).run((tw7) obj);
                return;
            case 21:
                ((dnn) obj).a(new tw2(obj2, (byte) 23));
                return;
            case SizeUtil.textSize1 /* 22 */:
                ((yqa) obj2).j((dl5) obj);
                return;
            case 23:
                ((i9c) obj2).f((isl) obj);
                return;
            case SizeUtil.textSize2 /* 24 */:
                yk6 yk6Var = (yk6) obj2;
                x5f x5fVar = yk6Var.g;
                ipf ipfVar = (ipf) obj;
                if (Intrinsics.a(ipfVar, epf.a)) {
                    return;
                }
                if (ipfVar instanceof cpf) {
                    x5fVar.x(b70.g);
                    return;
                }
                if (Intrinsics.a(ipfVar, gpf.a)) {
                    x5fVar.x(b70.c);
                    return;
                } else if (ipfVar instanceof fpf) {
                    x5fVar.x(yk6Var.f.a.getBoolean("ai.used_chat", false) ? b70.f : b70.e);
                    return;
                } else {
                    h9o.p();
                    return;
                }
            case 25:
                c5o c5oVar = (c5o) obj2;
                ArrayList arrayList = (ArrayList) c5oVar.b;
                c5oVar.b = null;
                int size2 = arrayList.size();
                while (i3 < size2) {
                    Object obj4 = arrayList.get(i3);
                    i3++;
                    ((Callback) obj4).run(c5oVar.s());
                }
                return;
            case 26:
                r2 r2Var = (r2) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    r2Var.invoke(new sw7(bitmap));
                    return;
                } else {
                    r2Var.invoke(new rw7(new op6(true)));
                    return;
                }
            case 27:
                ((gg7) obj2).run();
                return;
            case 28:
                a21 a21Var = (a21) obj2;
                re7 re7Var = (re7) obj;
                BrowserActivity browserActivity = (BrowserActivity) a21Var.d;
                if (browserActivity != null) {
                    igi.u0((Context) a21Var.a, browserActivity, (uk6) a21Var.e, (rf7) a21Var.c, re7Var, (x5f) a21Var.l);
                    return;
                }
                return;
            default:
                ((SettingsManager) obj2).Y("downloads_location", ((Uri) obj).toString());
                return;
        }
    }
}
