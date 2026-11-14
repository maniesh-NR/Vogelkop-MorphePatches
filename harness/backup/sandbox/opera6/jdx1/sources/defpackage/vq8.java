package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.appsflyer.AdRevenueScheme;
import com.opera.android.settings.SettingsManager;
import java.io.File;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.internal.connection.RealCall;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class vq8 implements bln {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public Object k;
    public Object l;

    public vq8() {
        this.b = new mbj[4];
        this.c = new Matrix[4];
        this.d = new Matrix[4];
        this.e = new PointF();
        this.f = new Path();
        this.g = new Path();
        this.h = new mbj();
        this.i = new float[2];
        this.j = new float[2];
        this.k = new Path();
        this.l = new Path();
        this.a = true;
        for (int i = 0; i < 4; i++) {
            ((mbj[]) this.b)[i] = new mbj();
            ((Matrix[]) this.c)[i] = new Matrix();
            ((Matrix[]) this.d)[i] = new Matrix();
        }
    }

    public vq8(File file, umi umiVar, ii iiVar, hga hgaVar, t1 t1Var, rgh rghVar, qi5 qi5Var) {
        this.j = new kze(new ArrayList());
        this.k = new vl9();
        this.b = file;
        this.d = hgaVar;
        this.e = t1Var;
        this.i = qi5Var;
        this.f = new File(file, "network_data_fallback");
        this.g = umiVar;
        this.h = iiVar;
        this.c = rghVar;
    }

    public vq8(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = str10;
        this.l = str11;
        this.a = z;
    }

    public vq8(tq8 tq8Var, SettingsManager settingsManager, boolean z, orm ormVar, skm skmVar, mdh mdhVar, qdh qdhVar, qr8 qr8Var, nv2 nv2Var, tlg tlgVar, zzj zzjVar, p6l p6lVar) {
        this.b = tq8Var;
        this.c = settingsManager;
        this.a = z;
        this.d = ormVar;
        this.e = skmVar;
        this.f = mdhVar;
        this.g = qdhVar;
        this.h = qr8Var;
        this.i = nv2Var;
        this.j = tlgVar;
        this.k = zzjVar;
        this.l = p6lVar;
    }

    public vq8(zi8 zi8Var, el6 el6Var, szk szkVar, fjg fjgVar) {
        this.b = fjgVar;
        this.f = zi8Var;
        this.k = new hij(0);
        this.d = new IdentityHashMap();
        this.e = new HashMap();
        this.c = new ArrayList();
        this.i = el6Var;
        this.j = szkVar;
        this.g = new HashMap();
        this.h = new HashSet();
    }

    public static vq8 h() {
        return Looper.getMainLooper().getThread() == Thread.currentThread() ? taj.a : new vq8();
    }

    public static ArrayList j(String str) {
        JSONArray jSONArray = new JSONArray(str);
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(hln.h(new orb(jSONArray.getJSONObject(i))));
            } catch (IllegalArgumentException unused) {
            }
        }
        return arrayList;
    }

    public static String m(String str) {
        return sko.j("NETWORK_", str);
    }

    public final gql a(int i, ArrayList arrayList, jij jijVar) {
        ArrayList arrayList2 = (ArrayList) this.c;
        if (!arrayList.isEmpty()) {
            this.k = jijVar;
            for (int i2 = i; i2 < arrayList.size() + i; i2++) {
                xrd xrdVar = (xrd) arrayList.get(i2 - i);
                if (i2 > 0) {
                    xrd xrdVar2 = (xrd) arrayList2.get(i2 - 1);
                    xrdVar.d = xrdVar2.a.o.e.o() + xrdVar2.d;
                    xrdVar.e = false;
                    xrdVar.c.clear();
                } else {
                    xrdVar.d = 0;
                    xrdVar.e = false;
                    xrdVar.c.clear();
                }
                int iO = xrdVar.a.o.e.o();
                for (int i3 = i2; i3 < arrayList2.size(); i3++) {
                    ((xrd) arrayList2.get(i3)).d += iO;
                }
                arrayList2.add(i2, xrdVar);
                ((HashMap) this.e).put(xrdVar.b, xrdVar);
                if (this.a) {
                    o(xrdVar);
                    if (((IdentityHashMap) this.d).isEmpty()) {
                        ((HashSet) this.h).add(xrdVar);
                    } else {
                        wrd wrdVar = (wrd) ((HashMap) this.g).get(xrdVar);
                        if (wrdVar != null) {
                            wrdVar.a.d(wrdVar.b);
                        }
                    }
                }
            }
        }
        return e();
    }

    public final aln b(String str) {
        try {
            return hln.h(new orb(str));
        } catch (IllegalArgumentException | JSONException unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v5 */
    public final void c(saj sajVar, float[] fArr, float f, RectF rectF, ga6 ga6Var, Path path) {
        boolean z;
        int i;
        Path path2;
        ga6 ga6Var2;
        boolean z2;
        zw5 m15Var;
        int i2;
        ga6 ga6Var3 = ga6Var;
        Path path3 = path;
        Matrix[] matrixArr = (Matrix[]) this.d;
        float[] fArr2 = (float[]) this.i;
        mbj[] mbjVarArr = (mbj[]) this.b;
        Matrix[] matrixArr2 = (Matrix[]) this.c;
        path3.rewind();
        Path path4 = (Path) this.f;
        path4.rewind();
        Path path5 = (Path) this.g;
        path5.rewind();
        path5.addRect(rectF, Path.Direction.CW);
        int i3 = 0;
        while (true) {
            z = 0;
            int i4 = 1;
            if (i3 >= 4) {
                break;
            }
            PointF pointF = (PointF) this.e;
            if (fArr == null) {
                m15Var = i3 != 1 ? i3 != 2 ? i3 != 3 ? sajVar.f : sajVar.e : sajVar.h : sajVar.g;
            } else {
                m15Var = new m15(fArr[i3]);
                i4 = 1;
            }
            ui6 ui6Var = i3 != i4 ? i3 != 2 ? i3 != 3 ? sajVar.b : sajVar.a : sajVar.d : sajVar.c;
            Matrix[] matrixArr3 = matrixArr;
            mbj mbjVar = mbjVarArr[i3];
            ui6Var.getClass();
            ui6Var.w(mbjVar, f, m15Var.a(rectF));
            int i5 = i3 + 1;
            float f2 = (i5 % 4) * 90;
            matrixArr2[i3].reset();
            if (i3 == 1) {
                i2 = i5;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i3 == 2) {
                i2 = i5;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i3 != 3) {
                i2 = i5;
                pointF.set(rectF.right, rectF.top);
            } else {
                i2 = i5;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i3].setTranslate(pointF.x, pointF.y);
            matrixArr2[i3].preRotate(f2);
            mbj mbjVar2 = mbjVarArr[i3];
            fArr2[0] = mbjVar2.c;
            fArr2[1] = mbjVar2.d;
            matrixArr2[i3].mapPoints(fArr2);
            matrixArr3[i3].reset();
            matrixArr3[i3].setTranslate(fArr2[0], fArr2[1]);
            matrixArr3[i3].preRotate(f2);
            i3 = i2;
            matrixArr = matrixArr3;
        }
        Matrix[] matrixArr4 = matrixArr;
        char c = 1;
        int i6 = 0;
        for (i = 4; i6 < i; i = 4) {
            mbj mbjVar3 = mbjVarArr[i6];
            fArr2[z] = mbjVar3.a;
            fArr2[c] = mbjVar3.b;
            matrixArr2[i6].mapPoints(fArr2);
            if (i6 == 0) {
                path3.moveTo(fArr2[z], fArr2[c]);
            } else {
                path3.lineTo(fArr2[z], fArr2[c]);
            }
            mbjVarArr[i6].b(matrixArr2[i6], path3);
            if (ga6Var3 != null) {
                mbj mbjVar4 = mbjVarArr[i6];
                Matrix matrix = matrixArr2[i6];
                zdd zddVar = (zdd) ga6Var3.b;
                BitSet bitSet = zddVar.e;
                mbjVar4.getClass();
                bitSet.set(i6, z);
                lbj[] lbjVarArr = zddVar.c;
                mbjVar4.a(mbjVar4.f);
                lbjVarArr[i6] = new fbj(new ArrayList(mbjVar4.h), new Matrix(matrix));
            }
            Path path6 = (Path) this.k;
            mbj mbjVar5 = (mbj) this.h;
            int i7 = i6 + 1;
            int i8 = i7 % 4;
            mbj mbjVar6 = mbjVarArr[i6];
            mbj[] mbjVarArr2 = mbjVarArr;
            fArr2[0] = mbjVar6.c;
            fArr2[1] = mbjVar6.d;
            matrixArr2[i6].mapPoints(fArr2);
            float[] fArr3 = (float[]) this.j;
            mbj mbjVar7 = mbjVarArr2[i8];
            Matrix[] matrixArr5 = matrixArr2;
            fArr3[0] = mbjVar7.a;
            fArr3[1] = mbjVar7.b;
            matrixArr5[i8].mapPoints(fArr3);
            float fMax = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, 0.0f);
            mbj mbjVar8 = mbjVarArr2[i6];
            fArr2[0] = mbjVar8.c;
            fArr2[1] = mbjVar8.d;
            matrixArr5[i6].mapPoints(fArr2);
            float fAbs = (i6 == 1 || i6 == 3) ? Math.abs(rectF.centerX() - fArr2[0]) : Math.abs(rectF.centerY() - fArr2[1]);
            mbjVar5.d(0.0f, 0.0f, 270.0f, 0.0f);
            qs7 qs7Var = i6 != 1 ? i6 != 2 ? i6 != 3 ? sajVar.j : sajVar.i : sajVar.l : sajVar.k;
            qs7Var.y(fMax, fAbs, f, mbjVar5);
            path6.reset();
            mbjVar5.b(matrixArr4[i6], path6);
            if (this.a && (qs7Var.w() || n(path6, i6) || n(path6, i8))) {
                path6.op(path6, path5, Path.Op.DIFFERENCE);
                fArr2[0] = mbjVar5.a;
                c = 1;
                fArr2[1] = mbjVar5.b;
                matrixArr4[i6].mapPoints(fArr2);
                path4.moveTo(fArr2[0], fArr2[1]);
                mbjVar5.b(matrixArr4[i6], path4);
                path2 = path;
            } else {
                c = 1;
                path2 = path;
                mbjVar5.b(matrixArr4[i6], path2);
            }
            if (ga6Var != null) {
                Matrix matrix2 = matrixArr4[i6];
                ga6Var2 = ga6Var;
                zdd zddVar2 = (zdd) ga6Var2.b;
                z2 = false;
                zddVar2.e.set(i6 + 4, false);
                lbj[] lbjVarArr2 = zddVar2.d;
                mbjVar5.a(mbjVar5.f);
                lbjVarArr2[i6] = new fbj(new ArrayList(mbjVar5.h), new Matrix(matrix2));
            } else {
                ga6Var2 = ga6Var;
                z2 = false;
            }
            path3 = path2;
            ga6Var3 = ga6Var2;
            i6 = i7;
            z = z2;
            mbjVarArr = mbjVarArr2;
            matrixArr2 = matrixArr5;
        }
        Path path7 = path3;
        path7.close();
        path4.close();
        if (path4.isEmpty()) {
            return;
        }
        path7.op(path4, Path.Op.UNION);
    }

    public final RealCall d(Set set) {
        t9f t9fVar = (t9f) ((ii) this.h).get();
        fvh fvhVar = new fvh();
        fvhVar.c();
        Context context = ((t1) this.e).b;
        String strK = sko.k("https://", cqp.j0(context).a, "/v2/wallpapers");
        rma rmaVar = new rma((byte) 4);
        rmaVar.o(strK, (hra) null);
        rma rmaVarG = rmaVar.d().g();
        String str = (String) ((hga) this.d).get();
        rmaVarG.b("product", "ofa");
        rgh rghVar = (rgh) this.c;
        Resources resources = (Resources) rghVar.b;
        rmaVarG.b("height", Integer.toString(((resources.getDisplayMetrics().heightPixels - ((Context) rghVar.a).getResources().getDimensionPixelSize(2131165344)) * 90) / 100));
        rmaVarG.b("width", Integer.toString((resources.getDisplayMetrics().widthPixels * 90) / 100));
        rmaVarG.b("hide_wallpapers", String.valueOf(true));
        if (!TextUtils.isEmpty(str)) {
            rmaVarG.b(AdRevenueScheme.COUNTRY, str.toLowerCase(Locale.US));
        }
        if (!set.isEmpty()) {
            rmaVarG.b("ids", TextUtils.join(",", set));
        }
        fvhVar.a = rmaVarG.d();
        fvhVar.a("Api-Key", cqp.j0(context).b);
        return t9fVar.c(new kvh(fvhVar));
    }

    public final gql e() {
        ArrayList arrayList = (ArrayList) this.c;
        if (arrayList.isEmpty()) {
            return gql.a;
        }
        int iO = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            xrd xrdVar = (xrd) arrayList.get(i);
            xrdVar.d = iO;
            iO += xrdVar.a.o.e.o();
        }
        return new blg(arrayList, (jij) this.k);
    }

    public final aln f(String str) {
        return (aln) ((List) ((kze) this.j).g()).stream().filter(new n0h(str, (byte) 1)).findFirst().orElse(null);
    }

    public final void g() {
        Iterator it = ((HashSet) this.h).iterator();
        while (it.hasNext()) {
            xrd xrdVar = (xrd) it.next();
            if (xrdVar.c.isEmpty()) {
                wrd wrdVar = (wrd) ((HashMap) this.g).get(xrdVar);
                if (wrdVar != null) {
                    wrdVar.a.d(wrdVar.b);
                }
                it.remove();
            }
        }
    }

    public final boolean i() {
        return !((List) ((kze) this.j).g()).isEmpty();
    }

    public final void k(String str, lt2 lt2Var) {
        if (i()) {
            lt2Var.run((aln) ((List) ((kze) this.j).g()).stream().filter(new n0h(str, (byte) 1)).findFirst().orElse(null));
        } else {
            p(new h4m(this, lt2Var, str, (byte) 6));
        }
    }

    public final void l(xrd xrdVar) {
        if (xrdVar.e && xrdVar.c.isEmpty()) {
            wrd wrdVar = (wrd) ((HashMap) this.g).remove(xrdVar);
            wrdVar.getClass();
            vrd vrdVar = wrdVar.c;
            l73 l73Var = wrdVar.a;
            l73Var.p(wrdVar.b);
            l73Var.s(vrdVar);
            l73Var.r(vrdVar);
            ((HashSet) this.h).remove(xrdVar);
        }
    }

    public final boolean n(Path path, int i) {
        Path path2 = (Path) this.l;
        path2.reset();
        ((mbj[]) this.b)[i].b(((Matrix[]) this.c)[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [krd, rrd] */
    public final void o(xrd xrdVar) {
        lcd lcdVar = xrdVar.a;
        ?? r1 = new krd() { // from class: rrd
            @Override // defpackage.krd
            public final void a(l73 l73Var, gql gqlVar) {
                szk szkVar = ((zi8) this.a.f).h;
                szkVar.d(2);
                szkVar.e(22);
            }
        };
        vrd vrdVar = new vrd(this, xrdVar);
        ((HashMap) this.g).put(xrdVar, new wrd(lcdVar, (rrd) r1, vrdVar));
        String str = tym.a;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(looperMyLooper, null);
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) lcdVar.c.d;
        ord ordVar = new ord();
        ordVar.a = handler;
        ordVar.b = vrdVar;
        copyOnWriteArrayList.add(ordVar);
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(looperMyLooper2, null);
        CopyOnWriteArrayList copyOnWriteArrayList2 = lcdVar.d.c;
        zl7 zl7Var = new zl7();
        zl7Var.a = handler2;
        zl7Var.b = vrdVar;
        copyOnWriteArrayList2.add(zl7Var);
        lcdVar.l(r1, (pl6) this.l, (fjg) this.b);
    }

    public final void p(Runnable runnable) {
        ((vl9) this.k).a(runnable);
        if (((rii) this.l) != null) {
            return;
        }
        this.a = false;
        this.l = new rii(this, (byte) 20);
        new q59(((qi5) this.i).c, new s2g(this, Collections.EMPTY_SET, new ilm(this, (byte) 10), (byte) 12));
    }

    public final void q(nkd nkdVar) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.d;
        xrd xrdVar = (xrd) identityHashMap.remove(nkdVar);
        xrdVar.getClass();
        xrdVar.a.o(nkdVar);
        xrdVar.c.remove(((icd) nkdVar).a);
        if (!identityHashMap.isEmpty()) {
            g();
        }
        l(xrdVar);
    }

    public final void r(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.c;
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            xrd xrdVar = (xrd) arrayList.remove(i3);
            ((HashMap) this.e).remove(xrdVar.b);
            int i4 = -xrdVar.a.o.e.o();
            for (int i5 = i3; i5 < arrayList.size(); i5++) {
                ((xrd) arrayList.get(i5)).d += i4;
            }
            xrdVar.e = true;
            if (this.a) {
                l(xrdVar);
            }
        }
    }
}
