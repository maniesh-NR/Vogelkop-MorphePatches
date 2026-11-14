package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PointF;
import android.net.Uri;
import android.text.Spannable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.internal.play_billing.zzcf;
import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class i9c implements hh4 {
    public Object a;
    public boolean b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;

    public i9c(a5l a5lVar, String str, p6l p6lVar, Function1 function1) {
        this.g = a5lVar;
        this.c = str;
        this.d = p6lVar;
        this.e = function1;
        this.f = new rml(Unit.a, a5lVar.a).a(new d7k((Object) a5lVar, (Object) this, (byte) 14)).m(a5lVar.g);
    }

    public i9c(Context context) {
        this.c = context;
        this.d = uf2.c;
    }

    public i9c(Context context, ye3 ye3Var, mgh mghVar) {
        this.g = zzcf.zzk();
        this.c = context;
        this.d = ye3Var;
        this.e = mghVar;
        this.a = new uop(this, true);
        this.f = new uop(this, false);
    }

    public i9c(ViewGroup viewGroup, cie cieVar, i16 i16Var) {
        this.a = new ArrayList();
        this.c = cieVar;
        this.f = i16Var;
        this.d = viewGroup;
        WeakHashMap weakHashMap = r5n.a;
        this.e = (ViewGroup) ((View) m5n.f(viewGroup, 2131362885));
        d(2131362897, cieVar.F);
        d(2131362887, cieVar.G);
        d(2131362896, cieVar.H);
        d(2131362891, cieVar.q);
        CharSequence charSequenceO0 = g10.o0(cieVar, viewGroup);
        sma smaVar = new sma(this, (byte) 8);
        int i = x00.f;
        boolean z = false;
        if (charSequenceO0 instanceof Spannable) {
            x00[] x00VarArr = (x00[]) ((Spannable) charSequenceO0).getSpans(0, charSequenceO0.length(), x00.class);
            if (x00VarArr.length > 0) {
                x00VarArr[0].e = smaVar;
            }
        }
        vwj.a(d(2131362899, charSequenceO0));
        ImageView imageView = (ImageView) ((View) m5n.f(viewGroup, 2131362894));
        gu8.g0(cieVar.p, imageView, ga6.m(imageView, viewGroup));
        Collection collection = cieVar.I;
        Iterator it = ((List) (collection == null ? Collections.EMPTY_LIST : collection)).iterator();
        while (it.hasNext()) {
            h9c h9cVar = new h9c((ViewGroup) this.e, (k7c) it.next(), new dnb(this, (byte) 6));
            ((ArrayList) this.a).add(h9cVar);
            ((ViewGroup) this.e).addView(h9cVar.b);
        }
        ArrayList arrayList = (ArrayList) this.a;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z = true;
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            if (!((h9c) obj).f) {
                break;
            }
        }
        if (this.b != z) {
            this.b = z;
            Callback callback = (Callback) this.g;
            if (callback != null) {
                callback.run(Boolean.valueOf(z));
            }
        }
    }

    public i9c(ViewGroup viewGroup, ncn ncnVar) {
        final byte b = 0;
        this.e = 0;
        this.a = 0;
        this.f = 0;
        this.g = 0;
        this.c = viewGroup.getContext();
        this.d = ncnVar;
        dvb dvbVar = new dvb(new String[]{"**", "ThemeColor", "**"});
        PointF pointF = k3d.a;
        final byte b2 = 1;
        ncnVar.a(dvbVar, 1, new ykj(this) { // from class: wcn
            public final /* synthetic */ i9c b;

            {
                this.b = this;
            }

            public final Object k(g3d g3dVar) {
                byte b3 = b;
                i9c i9cVar = this.b;
                switch (b3) {
                }
                return (Integer) i9cVar.f;
            }
        });
        final byte b3 = 2;
        ncnVar.a(new dvb(new String[]{"**", "ThemeStroke", "**"}), 2, new ykj(this) { // from class: wcn
            public final /* synthetic */ i9c b;

            {
                this.b = this;
            }

            public final Object k(g3d g3dVar) {
                byte b32 = b2;
                i9c i9cVar = this.b;
                switch (b32) {
                }
                return (Integer) i9cVar.f;
            }
        });
        final byte b4 = 4;
        ncnVar.a(new dvb(new String[]{"**", "ThemeColor", "**"}), 4, new ykj(this) { // from class: wcn
            public final /* synthetic */ i9c b;

            {
                this.b = this;
            }

            public final Object k(g3d g3dVar) {
                byte b32 = b3;
                i9c i9cVar = this.b;
                switch (b32) {
                }
                return (Integer) i9cVar.f;
            }
        });
        final byte b5 = 3;
        ncnVar.a(new dvb(new String[]{"**", "ThemeStroke", "**"}), 4, new ykj(this) { // from class: wcn
            public final /* synthetic */ i9c b;

            {
                this.b = this;
            }

            public final Object k(g3d g3dVar) {
                byte b32 = b5;
                i9c i9cVar = this.b;
                switch (b32) {
                }
                return (Integer) i9cVar.f;
            }
        });
        ncnVar.a(new dvb(new String[]{"**", "GradientLight", "**"}), 4, new ykj(this) { // from class: wcn
            public final /* synthetic */ i9c b;

            {
                this.b = this;
            }

            public final Object k(g3d g3dVar) {
                byte b32 = b4;
                i9c i9cVar = this.b;
                switch (b32) {
                }
                return (Integer) i9cVar.f;
            }
        });
        final byte b6 = 5;
        ncnVar.a(new dvb(new String[]{"**", "GradientStrokeLight", "**"}), 4, new ykj(this) { // from class: wcn
            public final /* synthetic */ i9c b;

            {
                this.b = this;
            }

            public final Object k(g3d g3dVar) {
                byte b32 = b6;
                i9c i9cVar = this.b;
                switch (b32) {
                }
                return (Integer) i9cVar.f;
            }
        });
        final byte b7 = 6;
        ncnVar.a(new dvb(new String[]{"**", "GradientDark", "**"}), 4, new ykj(this) { // from class: wcn
            public final /* synthetic */ i9c b;

            {
                this.b = this;
            }

            public final Object k(g3d g3dVar) {
                byte b32 = b7;
                i9c i9cVar = this.b;
                switch (b32) {
                }
                return (Integer) i9cVar.f;
            }
        });
        final byte b8 = 7;
        ncnVar.a(new dvb(new String[]{"**", "GradientStrokeDark", "**"}), 4, new ykj(this) { // from class: wcn
            public final /* synthetic */ i9c b;

            {
                this.b = this;
            }

            public final Object k(g3d g3dVar) {
                byte b32 = b8;
                i9c i9cVar = this.b;
                switch (b32) {
                }
                return (Integer) i9cVar.f;
            }
        });
        svk svkVar = new svk(this, (byte) 22);
        dll dllVarS = q9n.s(viewGroup);
        if (dllVarS != null) {
            u8n.b(dllVarS, viewGroup, svkVar);
        }
        svkVar.a(viewGroup);
    }

    public i9c(ndc ndcVar, ghj ghjVar, k42 k42Var, x5f x5fVar) {
        this.c = ndcVar;
        this.d = ghjVar;
        this.e = k42Var;
        this.f = x5fVar;
        this.a = new ArrayList();
        this.b = true;
    }

    public i9c(ru9 ru9Var, db dbVar, ydn ydnVar) {
        nj2 nj2Var = new nj2(this, (byte) 9);
        this.a = nj2Var;
        nlk nlkVar = new nlk(this, (byte) 2);
        this.c = ru9Var;
        this.d = dbVar;
        this.e = ydnVar;
        boolean z = ru9Var.a.getBoolean("vpn.vpnpro_expected", false);
        this.b = z;
        if (z) {
            dbVar.a(nj2Var);
        }
        ydnVar.F(nlkVar);
        c();
    }

    public i9c(umi umiVar, ndc ndcVar, kw3 kw3Var, hx5 hx5Var, ydp ydpVar, ii iiVar) {
        r16 r16Var = ngh.a;
        this.c = umiVar;
        this.d = kw3Var;
        this.e = hx5Var;
        this.a = iiVar;
        i32 i32Var = new i32(this, umiVar);
        this.g = i32Var;
        t77 t77Var = new t77((Object) this, (byte) 3);
        i32Var.h();
        hx5Var.j(ndcVar, t77Var);
    }

    public final void a() {
        Context context = (Context) this.c;
        this.e = Integer.valueOf(f03.t(2130969365, context, 2131101243));
        boolean zV = f03.V(2130971255, context);
        this.a = Integer.valueOf((this.b && zV) ? 100 : 0);
        this.f = Integer.valueOf((!this.b || zV) ? 0 : 100);
        this.g = Integer.valueOf(this.b ? 0 : 100);
        ((ncn) this.d).invalidateSelf();
    }

    public final void b(jd7 jd7Var, Uri uri) {
        Object obj = null;
        if (!jd7Var.c()) {
            if (uri != null) {
                ((i32) this.g).g(null);
                return;
            }
            return;
        }
        final Uri uri2 = Uri.parse(jd7Var.b());
        if (Intrinsics.a(uri2, uri) || this.b) {
            return;
        }
        final byte b = 1;
        this.b = true;
        umi umiVar = (umi) this.c;
        Unit unit = Unit.a;
        final byte b2 = 0;
        nml nmlVarG = umiVar.g(new o62(new Function1(this) { // from class: jdb
            public final /* synthetic */ i9c b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj2) {
                byte b3 = b2;
                Uri uri3 = uri2;
                i9c i9cVar = this.b;
                switch (b3) {
                    case 0:
                        t9f t9fVar = (t9f) ((ii) i9cVar.a).get();
                        fvh fvhVar = new fvh();
                        fvhVar.h(uri3.toString());
                        fvhVar.d("Accept", "application/x-protobuf");
                        return (t0i) vtp.R(t9fVar.c(new kvh(fvhVar)), new gbb((byte) 6), new gbb((byte) 7), 0, 0L, 120);
                    default:
                        i9cVar.b = false;
                        Object obj3 = ((t0i) obj2).a;
                        if (t0i.d(obj3) == null) {
                            ((i32) i9cVar.g).g(new ldb(uri3, (byte[]) obj3));
                        }
                        return Unit.a;
                }
            }
        }, (byte) 4));
        new plk(umiVar, nmlVarG, new eyi(unit, nmlVarG), obj).t(new Function1(this) { // from class: jdb
            public final /* synthetic */ i9c b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj2) {
                byte b3 = b;
                Uri uri3 = uri2;
                i9c i9cVar = this.b;
                switch (b3) {
                    case 0:
                        t9f t9fVar = (t9f) ((ii) i9cVar.a).get();
                        fvh fvhVar = new fvh();
                        fvhVar.h(uri3.toString());
                        fvhVar.d("Accept", "application/x-protobuf");
                        return (t0i) vtp.R(t9fVar.c(new kvh(fvhVar)), new gbb((byte) 6), new gbb((byte) 7), 0, 0L, 120);
                    default:
                        i9cVar.b = false;
                        Object obj3 = ((t0i) obj2).a;
                        if (t0i.d(obj3) == null) {
                            ((i32) i9cVar.g).g(new ldb(uri3, (byte[]) obj3));
                        }
                        return Unit.a;
                }
            }
        }).l();
    }

    public final void c() {
        db dbVar = (db) this.d;
        ydn ydnVar = (ydn) this.e;
        if (ydnVar.c.isEnabled()) {
            if (dbVar.a.f && dbVar.f()) {
                e(true);
                return;
            }
            return;
        }
        if (!this.b || !ydnVar.d.a || dbVar.f()) {
            gkj gkjVar = (gkj) this.g;
            if (gkjVar == null) {
                return;
            }
            gkjVar.finish(hjm.b);
            return;
        }
        qim qimVar = (qim) this.f;
        if (qimVar == null || ((gkj) this.g) != null) {
            return;
        }
        rxh rxhVar = new rxh(2132022235);
        r2n r2nVar = new r2n((Object) this, (byte) 4);
        gkj gkjVar2 = new gkj(false, false);
        gkjVar2.a = null;
        gkjVar2.b = null;
        gkjVar2.c = null;
        gkjVar2.d = null;
        gkjVar2.e = null;
        gkjVar2.f = r2nVar;
        gkjVar2.g = null;
        gkjVar2.h = null;
        gkjVar2.i = null;
        gkjVar2.j = null;
        gkjVar2.k = 2132020155;
        gkjVar2.l = 0;
        gkjVar2.m = 2132022236;
        gkjVar2.n = true;
        gkjVar2.o = rxhVar;
        this.g = gkjVar2;
        z77 z77Var = qimVar.c;
        z77Var.getClass();
        z77Var.b(gkjVar2, ijm.b);
    }

    @Override // defpackage.hh4
    public final void cancel() {
        this.b = true;
        ((p1j) this.f).cancel(false);
        hh4 hh4Var = (hh4) this.a;
        if (hh4Var != null) {
            hh4Var.cancel();
        }
    }

    public final TextView d(int i, CharSequence charSequence) {
        ViewGroup viewGroup = (ViewGroup) this.d;
        WeakHashMap weakHashMap = r5n.a;
        TextView textView = (TextView) ((View) m5n.f(viewGroup, i));
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
        return textView;
    }

    public final void e(boolean z) {
        nj2 nj2Var = (nj2) this.a;
        db dbVar = (db) this.d;
        gkj gkjVar = (gkj) this.g;
        if (gkjVar != null) {
            gkjVar.finish(hjm.b);
        }
        if (this.b == z) {
            return;
        }
        this.b = z;
        ru9 ru9Var = (ru9) this.c;
        if (z) {
            nv6 nv6VarB = ru9Var.b();
            ((SharedPreferences.Editor) nv6VarB.a).putBoolean("vpn.vpnpro_expected", true);
            nv6VarB.w();
            dbVar.a(nj2Var);
            return;
        }
        nv6 nv6VarB2 = ru9Var.b();
        ((SharedPreferences.Editor) nv6VarB2.a).remove("vpn.vpnpro_expected");
        nv6VarB2.w();
        dbVar.h(nj2Var);
    }

    public final void f(isl islVar) {
        ArrayList arrayList = (ArrayList) this.a;
        List listK0 = CollectionsKt.k0(arrayList);
        arrayList.clear();
        Iterator it = listK0.iterator();
        while (it.hasNext()) {
            ((Callback) it.next()).run(islVar);
        }
    }

    public final void g() throws JSONException {
        cie cieVar = (cie) this.c;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("description", cieVar.r);
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = (ArrayList) this.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                h9c h9cVar = (h9c) obj;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("leadType", j7c.i(h9cVar.a.a));
                jSONObject2.put("content", h9cVar.d.getText().toString());
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("leadsItems", jSONArray);
            String string = jSONObject.toString();
            ArrayList arrayList2 = cieVar.N;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                ArrayList arrayList3 = cieVar.N;
                z0c z0cVar = new z0c(cieVar, string, (byte) 25);
                int size2 = arrayList3.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList3.get(i2);
                    i2++;
                    String str = (String) obj2;
                    if (URLUtil.isNetworkUrl(str)) {
                        hyg.c(new jro(str, string, 0, 1, z0cVar));
                    } else {
                        hyg.b(z0cVar);
                    }
                }
            }
        } catch (JSONException unused) {
        }
        ((i16) this.f).x(true, false);
    }
}
