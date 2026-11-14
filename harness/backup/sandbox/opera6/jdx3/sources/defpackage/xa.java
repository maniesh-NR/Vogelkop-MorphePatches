package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioRouting;
import android.os.Handler;
import android.text.TextUtils;
import android.util.LongSparseArray;
import com.leanplum.utils.SizeUtil;
import com.opera.android.widget.GraphView;
import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class xa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xa(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        xf2 xf2Var;
        int size = 0;
        switch (this.a) {
            case 0:
                i42 i42Var = (i42) this.b;
                ehf ehfVar = (ehf) this.c;
                switch (i42Var.g) {
                    case 0:
                        k42 k42Var = (k42) i42Var.h;
                        k42Var.f = false;
                        k42Var.d.r(new t0i(ehfVar));
                        return;
                    default:
                        ((za) i42Var.h).run(ehfVar);
                        return;
                }
            case 1:
                aj ajVar = (aj) this.b;
                cj cjVar = (cj) this.c;
                ajVar.invoke(cjVar, Boolean.valueOf(cjVar.b), Boolean.valueOf(cjVar.c));
                return;
            case 2:
                wk wkVar = (wk) this.b;
                GraphView graphView = (GraphView) this.c;
                ArrayList arrayListB = wkVar.y.e.b();
                int measuredWidth = graphView.getMeasuredWidth() / fan.a(24.0f, graphView.getResources());
                int iMax = Math.max(0, arrayListB.size() - measuredWidth);
                while (true) {
                    if (iMax < arrayListB.size()) {
                        if (((ri5) arrayListB.get(iMax)).d != 0) {
                            size = arrayListB.size() - iMax;
                        } else {
                            iMax++;
                        }
                    }
                }
                new t59(new vk(wkVar, arrayListB), Math.min(Math.max(3, size), measuredWidth)).d(graphView);
                return;
            case 3:
                sl slVar = (sl) this.b;
                slVar.d.S((Context) this.c, new nl(slVar, (byte) 0));
                return;
            case 4:
                ((rn) this.b).d((ln) this.c);
                return;
            case 5:
                ((dr) this.b).c = (sjm) this.c;
                return;
            case 6:
                i5o i5oVar = (i5o) this.b;
                ab abVar = (ab) this.c;
                String str = ((nz) i5oVar.k).l;
                if (TextUtils.isEmpty(str)) {
                    str = (String) ((vx) i5oVar.g).get();
                }
                abVar.run(str);
                return;
            case 7:
                ((Callback) this.c).run(((e00) this.b).b().a);
                return;
            case 8:
                v00 v00Var = (v00) this.b;
                orb orbVar = (orb) this.c;
                nv6 nv6VarB = v00Var.b.b();
                ((SharedPreferences.Editor) nv6VarB.a).putString("ad.adx.last_cookie", orbVar.a.toString());
                nv6VarB.w();
                return;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((e50) this.b).j((h1b) this.c);
                return;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ((jy0) this.b).L(j95.j(new Long[]{Long.valueOf(((gy0) this.c).b())}));
                return;
            case 11:
                m41.e((o41) this.b, (LongSparseArray) this.c);
                return;
            case 12:
                n61 n61Var = (n61) this.b;
                HashMap map = (HashMap) this.c;
                m61 m61Var = new m61(16);
                m61Var.b = map;
                try {
                    n61Var.c.S0(m61Var.b(n61Var.b, new lvd(2, 2, n61Var.d)));
                    return;
                } catch (e13 e) {
                    h9o.o(e);
                    return;
                }
            case 13:
                n61 n61Var2 = (n61) this.b;
                qkh qkhVar = (qkh) this.c;
                r61 r61Var = new r61(16);
                r61Var.b = qkhVar;
                try {
                    n61Var2.c.S0(r61Var.b(n61Var2.b, new lvd(1, 6, n61Var2.d)));
                    return;
                } catch (e13 e2) {
                    h9o.o(e2);
                    return;
                }
            case 14:
                try {
                    ((b2n) this.b).onRequestFinished((da1) this.c);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 15:
                ((tya) this.c).o((rn9) this.b);
                return;
            case 16:
                ((ygf) this.b).run((String) this.c);
                return;
            case 17:
                op1 op1Var = (op1) this.b;
                try {
                    ((Runnable) this.c).run();
                    return;
                } finally {
                    op1Var.a();
                }
            case SizeUtil.textSize0_1 /* 18 */:
                nw1 nw1Var = (nw1) this.b;
                pw1 pw1Var = (pw1) this.c;
                if (((wnh) nw1Var.c.i()).b(262144)) {
                    try {
                        Map map2 = pw1Var.a;
                        if (map2 != null) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap(qbd.a(map2.size()));
                            for (Object obj : map2.entrySet()) {
                                Object key = ((Map.Entry) obj).getKey();
                                Object value = ((Map.Entry) obj).getValue();
                                linkedHashMap.put(key, value != null ? value.toString() : null);
                            }
                            JSONObject jSONObject = new JSONObject();
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                try {
                                    jSONObject.put((String) entry.getKey(), orb.t((String) entry.getValue()));
                                } catch (JSONException e3) {
                                    throw new IllegalArgumentException(e3);
                                }
                            }
                            String string = jSONObject.toString();
                            if (string != null) {
                                nw1Var.b.v0(string);
                                return;
                            }
                            return;
                        }
                        return;
                    } catch (IllegalArgumentException e4) {
                        ks3.D(e4);
                        return;
                    }
                }
                return;
            case 19:
                ((f12) this.b).c((ra) this.c);
                return;
            case SizeUtil.textSize0 /* 20 */:
                s62 s62Var = (s62) this.b;
                qdc qdcVar = (qdc) this.c;
                s62Var.A = null;
                vml.c(new q02(qdcVar, (byte) 10));
                return;
            case 21:
                fe2 fe2Var = (fe2) this.b;
                Object obj2 = this.c;
                if (fe2Var.c.get()) {
                    fe2Var.f(obj2);
                } else {
                    fe2Var.g(obj2);
                }
                fe2Var.b = (byte) 2;
                return;
            case SizeUtil.textSize1 /* 22 */:
                te2 te2Var = (te2) this.b;
                zr9 zr9Var = (zr9) this.c;
                te2Var.c.i();
                xe2 xe2Var = te2Var.b;
                synchronized (xe2Var.a) {
                    xe2Var.b();
                    zr9Var.run();
                }
                return;
            case 23:
                ((gg2) this.b).a((ei7) this.c);
                return;
            case SizeUtil.textSize2 /* 24 */:
                Context context = (Context) this.b;
                rj5 rj5Var = (rj5) this.c;
                scd.c = (AudioManager) context.getSystemService("audio");
                rj5Var.c();
                return;
            case 25:
                pad padVar = (pad) this.b;
                synchronized (((nj6) this.c)) {
                }
                mi8 mi8Var = (mi8) padVar.c;
                String str2 = tym.a;
                el6 el6Var = mi8Var.a.t;
                el6Var.V(el6Var.R((jrd) el6Var.d.f), 1013, new zk6((byte) 23));
                return;
            case 26:
                pad padVar2 = (pad) this.b;
                h75 h75Var = (h75) this.c;
                mi8 mi8Var2 = (mi8) padVar2.c;
                String str3 = tym.a;
                mi8Var2.a.G.H(h75Var);
                return;
            case 27:
                s9i s9iVar = (s9i) this.b;
                AudioDeviceInfo routedDevice = ((AudioRouting) this.c).getRoutedDevice();
                if (routedDevice != null) {
                    ((Handler) s9iVar.d).post(new xa(s9iVar, routedDevice, (byte) 28));
                    return;
                }
                return;
            case 28:
                s9i s9iVar2 = (s9i) this.b;
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.c;
                if (((qh2) s9iVar2.e) == null || (xf2Var = ((uh2) ((u59) s9iVar2.c).b).h) == null || audioDeviceInfo.equals((AudioDeviceInfo) xf2Var.i)) {
                    return;
                }
                xf2Var.i = audioDeviceInfo;
                xf2Var.a(uf2.b((Context) xf2Var.b, (pf2) xf2Var.j, audioDeviceInfo));
                return;
            default:
                ((ay1) this.b).run((String) this.c);
                return;
        }
    }
}
