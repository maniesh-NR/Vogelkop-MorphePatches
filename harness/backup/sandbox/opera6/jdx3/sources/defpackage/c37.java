package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.view.Choreographer;
import android.view.MenuItem;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.live_score.LiveCommentaryService;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.annotation.Annotation;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c37 implements fua, gm8, vx4, dkg, o7h, qo3, ox8 {
    public static final Object c = new Object();
    public static final rhk d = new rhk("_root_");
    public static c37 e;
    public static c37 f;
    public Object a;
    public Object b;

    public c37(byte b) {
        switch (b) {
            case 8:
                v08 v08Var = v08.a;
                n08 n08Var = n08.a;
                this.a = v08Var;
                this.b = n08Var;
                break;
            case 16:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.a = byteArrayOutputStream;
                this.b = new DataOutputStream(byteArrayOutputStream);
                break;
            case 19:
                this.a = new HashSet();
                this.b = new i7f();
                break;
            case SizeUtil.textSize0 /* 20 */:
                this.a = new HashMap();
                break;
            default:
                this.a = Choreographer.getInstance();
                this.b = Looper.myLooper();
                break;
        }
    }

    public c37(Boolean bool) {
        nak nakVarF = z4o.f(bool);
        this.a = nakVarF;
        this.b = nakVarF;
    }

    public /* synthetic */ c37(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public c37(String str, byte b) {
        switch (b) {
            case 17:
                this.b = null;
                this.a = str;
                break;
            default:
                this.a = new LinkedHashMap();
                this.b = str;
                break;
        }
    }

    public c37(kze kzeVar, k6l k6lVar, MenuItem menuItem) {
        this.a = k6lVar;
        this.b = menuItem;
        a26.U(k6lVar.w, kzeVar, new q6l(new dg7(this, (byte) 27), (byte) 0), new al7((Object) this, (byte) 10));
    }

    public static boolean g(orb orbVar, ArrayList arrayList, Object obj, int i) throws JSONException {
        JSONObject jSONObject = orbVar.a;
        int i2 = i + 1;
        if (i2 >= arrayList.size()) {
            String str = (String) arrayList.get(i);
            if (c != obj) {
                Object objOpt = jSONObject.opt(str);
                Object objU = null;
                if (objOpt != JSONObject.NULL && objOpt != null) {
                    objU = orb.u(objOpt);
                }
                orbVar.p(obj, str);
                if (objU == null || !objU.equals(obj)) {
                    return true;
                }
            } else if (orb.u(jSONObject.remove(str)) != null) {
                return true;
            }
        } else {
            orb orbVarI = orbVar.i((String) arrayList.get(i));
            if (orbVarI != null) {
                return g(orbVarI, arrayList, obj, i2);
            }
            if (jSONObject.has((String) arrayList.get(i))) {
                orbVar.c((String) arrayList.get(i));
            }
        }
        return false;
    }

    public static c37 r() {
        c37 c37Var = e;
        if (c37Var != null) {
            return c37Var;
        }
        c37 c37Var2 = new c37((byte) 19);
        e = c37Var2;
        return c37Var2;
    }

    public static c37 s() {
        c37 c37Var = f;
        if (c37Var != null) {
            return c37Var;
        }
        c37 c37Var2 = new c37();
        c37Var2.b = rm5.q(6, "Sdk initialization error.");
        f = c37Var2;
        return c37Var2;
    }

    public static void y(qhf qhfVar, String str) {
        qhfVar.getClass();
        qhf.a();
    }

    public final z0c A(String str) {
        if (!StringsKt.E(str, "{userId}", false)) {
            return null;
        }
        Uri uri = Uri.parse(str);
        c3j c3jVarD = ((d3j) e3j.t(((t1) this.a).b).i()).d(38, false);
        if (c3jVarD == null || !((String) c3jVarD.d).equals(uri.getHost())) {
            return null;
        }
        return new z0c(this, str, (byte) 28);
    }

    public final void B(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.a = Integer.valueOf(i);
    }

    public final void C(Annotation annotation) {
        HashMap map = (HashMap) this.b;
        if (map == null) {
            map = new HashMap();
            this.b = map;
        }
        map.put(annotation.annotationType(), annotation);
    }

    public final void a(ChipGroup chipGroup) {
        kg7 kg7Var;
        ev4 ev4Var = ((ChipGroup) this.b).h;
        if (ev4Var.b) {
            igi igiVar = (igi) this.a;
            int iE = ev4Var.e();
            HashMap map = (HashMap) igiVar.b;
            Iterator it = map.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    kg7Var = null;
                    break;
                }
                kg7Var = (kg7) it.next();
                Chip chip = (Chip) map.get(kg7Var);
                if (chip != null && iE == chip.getId()) {
                    break;
                }
            }
            igiVar.g = kg7Var;
            ze7 ze7Var = (ze7) igiVar.c;
            ze7Var.k = kg7Var;
            if (ze7Var.j != null) {
                ze7Var.J(new ArrayList(ze7Var.a), ze7Var.j);
            }
            igiVar.I0();
        }
    }

    public final mil b(List list) {
        us7 us7Var;
        Exception e2;
        us7 us7Var2;
        try {
            int size = list.size();
            int i = 0;
            us7Var = null;
            while (i < size) {
                try {
                    us7Var2 = (us7) list.get(i);
                } catch (Exception e3) {
                    e2 = e3;
                }
                try {
                    us7Var2.a((pw7) this.b);
                    i++;
                    us7Var = us7Var2;
                } catch (Exception e4) {
                    e2 = e4;
                    us7Var = us7Var2;
                    StringBuilder sb = new StringBuilder();
                    int iT = ((i1) ((pw7) this.b).f).t();
                    xjl xjlVarC = ((pw7) this.b).c();
                    pw7 pw7Var = (pw7) this.b;
                    sb.append("Error while applying EditCommand batch to buffer (length=" + iT + ", composition=" + xjlVarC + ", selection=" + xjl.h(upj.c(pw7Var.b, pw7Var.c)) + "):");
                    sb.append('\n');
                    CollectionsKt.O(list, sb, "\n", new tu7(us7Var, this), 60);
                    throw new RuntimeException(sb.toString(), e2);
                }
            }
            pw7 pw7Var2 = (pw7) this.b;
            pw7Var2.getClass();
            sf1 sf1Var = new sf1(((i1) pw7Var2.f).toString());
            pw7 pw7Var3 = (pw7) this.b;
            long jC = upj.c(pw7Var3.b, pw7Var3.c);
            xjl xjlVar = xjl.g(((mil) this.a).b) ? null : new xjl(jC);
            mil milVar = new mil(sf1Var, xjlVar != null ? xjlVar.a : upj.c(xjl.e(jC), xjl.f(jC)), ((pw7) this.b).c());
            this.a = milVar;
            return milVar;
        } catch (Exception e5) {
            us7Var = null;
            e2 = e5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.io.OutputStreamWriter, java.io.Writer] */
    public final void c(File file) throws Throwable {
        String str = (String) this.b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.a;
        if (linkedHashMap.isEmpty()) {
            return;
        }
        File file2 = new File(file, str);
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file2);
            try {
                orb orbVar = new orb(xvg.z(fileInputStream2));
                xvg.l(fileInputStream2);
                boolean z = false;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    try {
                        if (g(orbVar, aik.r(true, (String) entry.getKey(), '.'), entry.getValue(), 0)) {
                            z = true;
                        }
                    } catch (JSONException unused) {
                    }
                }
                if (!z) {
                    return;
                }
                File file3 = new File(file, ".~".concat(str));
                try {
                    ?? outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file3), StandardCharsets.UTF_8);
                    try {
                        outputStreamWriter.write(orbVar.a.toString());
                        outputStreamWriter.close();
                        if (file3.renameTo(file2)) {
                            return;
                        }
                        file3.delete();
                    } catch (IOException unused2) {
                        fileInputStream = outputStreamWriter;
                        xvg.l(fileInputStream);
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = outputStreamWriter;
                        xvg.l(fileInputStream);
                        throw th;
                    }
                } catch (IOException unused3) {
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (FileNotFoundException | IOException | JSONException unused4) {
                fileInputStream = fileInputStream2;
                xvg.l(fileInputStream);
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = fileInputStream2;
                xvg.l(fileInputStream);
                throw th;
            }
        } catch (FileNotFoundException | IOException | JSONException unused5) {
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // defpackage.gm8
    public final void d() {
        ((v6d) this.a).b(t6d.c);
        z43 z43Var = ((BrowserActivity) this.b).z;
        if (z43Var == null) {
            z43Var = null;
        }
        z43Var.B(true);
    }

    @Override // defpackage.gm8
    public final void e() {
        ((v6d) this.a).b(t6d.a);
        z43 z43Var = ((BrowserActivity) this.b).z;
        if (z43Var == null) {
            z43Var = null;
        }
        z43Var.B(false);
    }

    @Override // defpackage.ox8
    public final void f(List list) {
        ((uqe) this.a).j((msh) this.b, list, true, false);
    }

    public final Object get() {
        return new pxd((Context) ((qh) this.a).a, (qb7) ((d06) this.b).get());
    }

    public final s40 h() {
        Integer num = (Integer) this.a;
        if (num == null) {
            t3p.w("Key size is not set");
            return null;
        }
        if (((r40) this.b) != null) {
            return new s40(num.intValue(), (r40) this.b);
        }
        t3p.w("Variant is not set");
        return null;
    }

    @Override // defpackage.fua
    public final Drawable i() {
        return new BitmapDrawable(((Context) this.a).getResources(), (Bitmap) this.b);
    }

    public final xz8 j() {
        return new xz8((String) this.a, ((HashMap) this.b) == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new HashMap((HashMap) this.b)));
    }

    public final PendingIntent k(gk9 gk9Var) {
        String string;
        Long lK0;
        Bundle bundle = gk9Var.q0().I;
        LiveCommentaryService liveCommentaryService = (LiveCommentaryService) this.b;
        if (bundle != null && (string = bundle.getString("extra_id")) != null && (lK0 = StringsKt.k0(string)) != null) {
            long jLongValue = lK0.longValue();
            ix5 ix5Var = LiveCommentaryService.o;
            Object applicationContext = liveCommentaryService.getApplicationContext();
            hmc hmcVar = applicationContext instanceof hmc ? (hmc) applicationContext : null;
            vv1 vv1Var = hmcVar != null ? (vv1) ((OperaApplication) hmcVar).r.X.get() : null;
            if (vv1Var != null) {
                return PendingIntent.getActivity(liveCommentaryService, (int) jLongValue, mdb.b(vv1Var.a.a).setAction("com.opera.android.action.SHOW_LIVE_SCORE_MATCH").putExtra("action_show_match_id", jLongValue).putExtra("action_show_match_type", zi4.Z(apc.c)), 201326592);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(int r9, android.view.KeyEvent r10) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.a
            java.util.HashSet r0 = (java.util.HashSet) r0
            int r1 = r10.getAction()
            r2 = 1
            if (r1 != 0) goto L9c
            r1 = 0
            boolean r3 = fr3.H(r1, r10)
            r4 = 0
            if (r3 != 0) goto L5e
            java.lang.Object r8 = r8.b
            i7f r8 = (defpackage.i7f) r8
            g7f r3 = new g7f
            r3.<init>(r8)
        L1c:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L5e
            java.lang.Object r8 = r3.next()
            mv3 r8 = (defpackage.mv3) r8
            com.opera.android.BrowserActivity r8 = r8.a
            vvb r5 = r8.q1
            dnb r5 = r5.a(r10)
            if (r5 != 0) goto L5b
            switch(r9) {
                case 1: goto L5a;
                case 2: goto L37;
                case 3: goto L5a;
                case 4: goto L5a;
                case 5: goto L5a;
                case 6: goto L5a;
                default: goto L35;
            }
        L35:
            r5 = r1
            goto L38
        L37:
            r5 = r2
        L38:
            pad r6 = r8.u
            java.lang.Object r6 = r6.c
            l24 r6 = (defpackage.l24) r6
            if (r6 == 0) goto L4b
            vvb r6 = r6.b()
            if (r6 == 0) goto L4b
            dnb r6 = r6.a(r10)
            goto L4c
        L4b:
            r6 = r4
        L4c:
            if (r6 == 0) goto L58
            if (r5 == 0) goto L58
            bi2 r5 = new bi2
            r7 = 19
            r5.<init>(r8, r6, r7)
            goto L5b
        L58:
            r5 = r6
            goto L5b
        L5a:
            r5 = r4
        L5b:
            if (r5 == 0) goto L1c
            r4 = r5
        L5e:
            if (r4 == 0) goto L64
            defpackage.vml.c(r4)
            goto L8f
        L64:
            boolean r8 = defpackage.i0l.g()
            if (r8 == 0) goto L9b
            r8 = 2
            boolean r8 = fr3.H(r8, r10)
            r9 = 42
            if (r8 == 0) goto L82
            int r8 = r10.getKeyCode()
            if (r8 == r9) goto L8f
            r9 = 48
            if (r8 == r9) goto L8f
            r9 = 51
            if (r8 == r9) goto L8f
            goto L9b
        L82:
            r8 = 6
            boolean r8 = fr3.H(r8, r10)
            if (r8 == 0) goto L9b
            int r8 = r10.getKeyCode()
            if (r8 != r9) goto L9b
        L8f:
            int r8 = r10.getKeyCode()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r0.add(r8)
            return r2
        L9b:
            return r1
        L9c:
            int r8 = r10.getAction()
            if (r8 != r2) goto Laf
            int r8 = r10.getKeyCode()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            boolean r8 = r0.remove(r8)
            return r8
        Laf:
            int r8 = r10.getKeyCode()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            boolean r8 = r0.contains(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c37.l(int, android.view.KeyEvent):boolean");
    }

    @Override // defpackage.qo3
    public final lak m() {
        return (nak) this.b;
    }

    public final byte[] n(uc8 uc8Var) throws IOException {
        DataOutputStream dataOutputStream = (DataOutputStream) this.b;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.a;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(uc8Var.a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(uc8Var.b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(uc8Var.c);
            dataOutputStream.writeLong(uc8Var.d);
            dataOutputStream.write(uc8Var.e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            rqd.p(e2);
            return null;
        }
    }

    public final CharSequence o(gk9 gk9Var) {
        return ((LiveCommentaryService) this.b).h;
    }

    public final ArrayList p(String str) {
        TreeMap treeMap = e6i.i;
        e6i e6iVarE = aoh.e(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        e6iVarE.w(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        workDatabase_Impl.b();
        Cursor cursorS = workDatabase_Impl.s(e6iVarE);
        try {
            ArrayList arrayList = new ArrayList(cursorS.getCount());
            while (cursorS.moveToNext()) {
                arrayList.add(cursorS.getString(0));
            }
            return arrayList;
        } finally {
            cursorS.close();
            e6iVarE.release();
        }
    }

    public final CharSequence q(gk9 gk9Var) {
        return ((LiveCommentaryService) this.b).g;
    }

    public final Bitmap t(gk9 gk9Var) {
        Bitmap bitmap = ((LiveCommentaryService) this.b).e;
        return bitmap == null ? (Bitmap) ((zyk) this.a).getValue() : bitmap;
    }

    public final tfd u() {
        return (tfd) ((t0g) this.b).getValue();
    }

    public final String v(int i) {
        String strB;
        vvb vvbVarB;
        g7f g7fVar = new g7f((i7f) this.b);
        do {
            strB = null;
            if (!g7fVar.hasNext()) {
                break;
            }
            BrowserActivity browserActivity = ((mv3) g7fVar.next()).a;
            String strB2 = browserActivity.q1.b(i);
            if (strB2 != null) {
                strB = strB2;
            } else {
                l24 l24Var = (l24) browserActivity.u.c;
                if (l24Var != null && (vvbVarB = l24Var.b()) != null) {
                    strB = vvbVarB.b(i);
                }
            }
        } while (strB == null);
        return strB;
    }

    public final synchronized Map w() {
        Map mapUnmodifiableMap;
        mapUnmodifiableMap = (Map) this.b;
        if (mapUnmodifiableMap == null) {
            mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap((HashMap) this.a));
            this.b = mapUnmodifiableMap;
        }
        return mapUnmodifiableMap;
    }

    public final void x(Context context, String str, zkf zkfVar, qhf qhfVar) {
        if (Boolean.TRUE.equals((Boolean) this.a)) {
            zkfVar.e();
            return;
        }
        if (Boolean.FALSE.equals((Boolean) this.a)) {
            zkfVar.d((AdError) this.b);
            return;
        }
        y(qhfVar, "initialize: Opera Ads SDK...");
        Objects.toString(MobileAds.getVersion());
        qhf.a();
        int tagForChildDirectedTreatment = MobileAds.getRequestConfiguration().getTagForChildDirectedTreatment();
        Integer num = tagForChildDirectedTreatment != 0 ? tagForChildDirectedTreatment != 1 ? null : 1 : 0;
        kn[] knVarArr = kn.a;
        pfp.c(new jbd(context, new ypi(str, null, new c30(MobileAds.getVersion().toString(), (byte) 4), num), new ykf(this, qhfVar, zkfVar), (byte) 9));
    }

    public final void z(String str) {
        ((LinkedHashMap) this.a).put(str, c);
    }
}
