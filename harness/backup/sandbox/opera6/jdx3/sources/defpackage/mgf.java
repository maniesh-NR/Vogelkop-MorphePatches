package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.Bundle;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.util.Size;
import android.view.MenuItem;
import android.widget.AutoCompleteTextView;
import androidx.collection.ArrayMap;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.leanplum.utils.SizeUtil;
import com.opera.android.browser.obml.Platform;
import com.opera.android.ui.catalog.widget.OperaListItem;
import com.opera.api.Callback;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.CharsKt;
import kotlin.text.c;
import okhttp3.internal.dns.DnsQuery;
import okhttp3.internal.dns.Question;
import okhttp3.internal.dns.RealDnsCache;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final /* synthetic */ class mgf implements n5o, m94, vlf, dkj, jr9, od3, thj, tj9, DnsQuery.Factory, Continuation, mm9, tya, fua, ekj {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mgf(glh glhVar, xx1 xx1Var, String str) {
        this.a = (byte) 13;
        this.b = glhVar;
        this.c = xx1Var;
    }

    public /* synthetic */ mgf(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final void X(Bundle bundle, String str) {
        rn9 rn9Var = (rn9) this.b;
        Callback callback = (Callback) this.c;
        if ("SyncAuthPortalFragment_request".equals(str)) {
            int i = bundle.getInt("result_code");
            if (rn9Var.b) {
                callback.run(Boolean.valueOf(i == -1));
            }
            rn9Var.b = false;
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [android.content.Context, dx3, hjf] */
    @Override // defpackage.dkj
    public final void a() {
        tn tnVar = (tn) this.b;
        ?? r4 = (dx3) this.c;
        tnVar.a = true;
        r4.D(f03.n((Context) r4), new qj2(new vdf(tnVar, (byte) 23), (byte) 11));
    }

    public final Object apply(Object obj) {
        tjg tjgVar = (tjg) this.b;
        return new yrd(tjgVar.a, (qi8) this.c, tjgVar.u, (okg) obj);
    }

    public final Object attachCompleter(l94 l94Var) {
        qie qieVar = (qie) this.b;
        lyf lyfVar = (lyf) qieVar.b;
        if (lyfVar != null) {
            l94 l94Var2 = (l94) lyfVar.a;
            Objects.requireNonNull(l94Var2);
            l94Var2.c();
        }
        Object obj = this.c;
        qieVar.b = new lyf(l94Var, obj);
        return rfp.o(obj, "PendingValue ");
    }

    @Override // defpackage.ekj
    public final void b(hjm hjmVar) {
        ((r2) this.b).invoke(((pqh) this.c).a);
    }

    @Override // defpackage.od3
    public final void c(Integer num, qjd qjdVar) {
        okg okgVar = (okg) this.b;
        re7 re7Var = (re7) this.c;
        egd egdVarC = okgVar.c(qjdVar);
        if (egdVarC == null || !re7Var.equals(egdVarC.a)) {
            return;
        }
        okgVar.c.remove(num.intValue());
        okgVar.b.b();
    }

    @Override // defpackage.tj9
    public final void d(int i) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 11:
                ((Function1) obj2).invoke(((h58) ((xbf) obj).g).get(i));
                break;
            default:
                pii piiVar = (pii) obj2;
                za9 za9Var = (za9) obj;
                PrintAttributes.MediaSize mediaSize = (PrintAttributes.MediaSize) piiVar.r.get(i);
                boolean z = za9Var.a;
                boolean z2 = za9Var.b;
                boolean z3 = false;
                za9Var.a = mediaSize.asPortrait() != PrintAttributes.MediaSize.UNKNOWN_PORTRAIT;
                boolean z4 = mediaSize.asLandscape() != PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE;
                za9Var.b = z4;
                if (z != za9Var.a || z2 != z4) {
                    ro9 ro9Var = piiVar.x;
                    ((AutoCompleteTextView) ro9Var.d).setAdapter(new th6(ro9Var, ((TextInputLayout) ro9Var.c).getContext(), piiVar.y, za9Var));
                    ro9 ro9Var2 = piiVar.x;
                    int i2 = ro9Var2.b;
                    if (i2 == 0) {
                        z3 = za9Var.a;
                    } else if (i2 == 1) {
                        z3 = za9Var.b;
                    }
                    if (!z3) {
                        CharSequence[] charSequenceArr = piiVar.y;
                        int length = (i2 + 1) % charSequenceArr.length;
                        ro9Var2.a0(length, charSequenceArr[length]);
                    }
                }
                piiVar.N0();
                break;
        }
    }

    public final void e() {
        s14 s14Var = (s14) this.b;
        Function1 function1 = (Function1) this.c;
        synchronized (((j06) s14Var.c)) {
            s14Var.e = b5j.c((Set) s14Var.e, function1);
        }
    }

    public final boolean f() {
        usg usgVar = (usg) this.b;
        pv2 pv2Var = (pv2) this.c;
        boolean z = usgVar.q;
        if (z) {
            return z;
        }
        usgVar.h();
        long jA = pv2.a(usgVar.o, pv2Var.a);
        pv2Var.a = jA;
        boolean z2 = !usgVar.g(usgVar.n, jA + pv2Var.b);
        usgVar.q = z2;
        return z2;
    }

    /* JADX WARN: Finally extract failed */
    public final Object g(Object obj) throws IOException {
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                pgf pgfVar = (pgf) obj3;
                String str = (String) obj2;
                ogf ogfVar = (ogf) obj;
                if (str.equals(pgfVar.g)) {
                    pgfVar.h.r(ogfVar);
                    if (ogfVar != null) {
                        mu6 mu6Var = pgfVar.e;
                        if (mu6Var.a(pgfVar.b.o, str)) {
                            String strH = new GURL(str).d().h();
                            if (!strH.isEmpty()) {
                                hd hdVar = mu6Var.b;
                                if (hdVar.b) {
                                    hdVar.t(new u5f(strH, (byte) 5));
                                }
                            }
                        }
                    }
                }
                return null;
            case 1:
                ktf ktfVar = (ktf) obj3;
                Runnable runnable = (Runnable) obj2;
                Object obj4 = ((t0i) obj).a;
                ktfVar.getClass();
                if (t0i.d(obj4) == null) {
                    ktfVar.d = ktfVar.c;
                    ktfVar.e = (String) obj4;
                    ktfVar.c = null;
                    ktfVar.f = null;
                } else {
                    ktfVar.d = null;
                    ktfVar.e = null;
                    ktfVar.c = null;
                    ktfVar.f = null;
                }
                runnable.run();
                return Unit.a;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return Boolean.valueOf(qyn.v(((ueh) obj3).E, (Uri) obj2));
            case 12:
                glh glhVar = (glh) obj3;
                Context context = (Context) obj2;
                Set set = (Set) obj;
                if (set.isEmpty()) {
                    nv6 nv6VarB = ru9.c(context).b();
                    ((SharedPreferences.Editor) nv6VarB.a).putBoolean("readinglist.access_after_upgrade.all_access", true);
                    nv6VarB.w();
                } else {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        glhVar.g(((Long) it.next()).longValue(), true);
                    }
                }
                return null;
            case 13:
                glh glhVar2 = (glh) obj3;
                xx1 xx1Var = (xx1) obj2;
                Long l = (Long) obj;
                if (xx1Var != null) {
                    xx1Var.run(l);
                }
                if (l.longValue() != -1) {
                    h7f h7fVar = glhVar2.b;
                    g7f g7fVarH = am2.h(h7fVar, h7fVar);
                    while (g7fVarH.hasNext()) {
                        ((clh) g7fVarH.next()).a();
                    }
                }
                return null;
            case SizeUtil.textSize0 /* 20 */:
                pii piiVar = (pii) obj3;
                PageRange[] pageRangeArr = (PageRange[]) obj2;
                PdfRenderer pdfRenderer = (PdfRenderer) obj;
                lii liiVar = piiVar.G;
                piiVar.L = false;
                if (pdfRenderer != null) {
                    if (piiVar.N || piiVar.u == null) {
                        pdfRenderer.close();
                    } else {
                        int iM = (int) (liiVar.m() * 0.85f);
                        PrintAttributes.MediaSize mediaSize = piiVar.u.c().getMediaSize();
                        Size size = new Size(iM, (mediaSize.getHeightMils() * iM) / mediaSize.getWidthMils());
                        piiVar.J = new m9f(pdfRenderer, size.getWidth(), size.getHeight());
                        if (liiVar.a()) {
                            piiVar.K0();
                            liiVar.o(pageRangeArr.length);
                        }
                    }
                } else if (liiVar.a()) {
                    piiVar.L0();
                }
                return null;
            case SizeUtil.textSize1 /* 22 */:
                ((iji) obj3).n = (String) obj;
                ((vii) obj2).run(Boolean.TRUE);
                return null;
            case SizeUtil.textSize2 /* 24 */:
                String str2 = (String) obj2;
                File file = new File((File) ((ghf) obj3).b, "sdx_json_data");
                try {
                    File parentFile = file.getParentFile();
                    if (parentFile != null && !parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    s29.j(file, str2.getBytes(StandardCharsets.UTF_8));
                } catch (IOException unused) {
                    file.delete();
                }
                return Unit.a;
            case 25:
                Bitmap bitmap = (Bitmap) obj2;
                ((q6e) ((q4b) ((i3j) obj3).b).b).c.getClass();
                String str3 = "/searchengine_j_" + UUID.randomUUID();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(Platform.d(str3)));
                    try {
                        bitmap.compress(Bitmap.CompressFormat.PNG, 85, fileOutputStream);
                        fileOutputStream.close();
                        return str3;
                    } finally {
                    }
                } catch (IOException e) {
                    ks3.D(e);
                    return null;
                }
            case 28:
                vnj vnjVar = (vnj) obj3;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                vnjVar.h = ((jlh) obj2).getWritableDatabase();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                SQLiteDatabase sQLiteDatabase = vnjVar.h;
                Cursor cursorQuery = (sQLiteDatabase == null ? null : sQLiteDatabase).query("icons", new String[]{"id", "origin"}, null, null, null, null, null);
                try {
                    Cursor cursor = cursorQuery;
                    while (cursor.moveToNext()) {
                        linkedHashMap3.put(Long.valueOf(cursor.getLong(0)), cursor.getString(1));
                    }
                    vtp.v(cursorQuery, (Throwable) null);
                    File file2 = (File) vnjVar.c.get();
                    file2.mkdirs();
                    File[] fileArrListFiles = file2.listFiles();
                    if (fileArrListFiles != null) {
                        for (File file3 : fileArrListFiles) {
                            if (c.q(file3.getName(), "ico-", false)) {
                                try {
                                    String str4 = (String) linkedHashMap3.get(Long.valueOf(Long.parseLong(file3.getName().substring(4), CharsKt.checkRadix(16))));
                                    if (str4 != null) {
                                        linkedHashMap.put(str4, new tnj(file3));
                                        linkedHashMap2.put(str4, new LinkedHashSet());
                                    } else {
                                        file3.delete();
                                    }
                                } catch (NumberFormatException unused2) {
                                    file3.delete();
                                }
                            }
                        }
                    }
                    SQLiteDatabase sQLiteDatabase2 = vnjVar.h;
                    if (sQLiteDatabase2 == null) {
                        sQLiteDatabase2 = null;
                    }
                    sQLiteDatabase2.beginTransaction();
                    try {
                        o95.u(linkedHashMap3.entrySet(), new vvf(linkedHashMap, vnjVar, (byte) 23), true);
                        SQLiteDatabase sQLiteDatabase3 = vnjVar.h;
                        if (sQLiteDatabase3 == null) {
                            sQLiteDatabase3 = null;
                        }
                        sQLiteDatabase3.setTransactionSuccessful();
                        SQLiteDatabase sQLiteDatabase4 = vnjVar.h;
                        if (sQLiteDatabase4 == null) {
                            sQLiteDatabase4 = null;
                        }
                        sQLiteDatabase4.endTransaction();
                        h58 h58Var = mnj.e;
                        w4 w4VarE = sko.e(h58Var, h58Var);
                        while (w4VarE.hasNext()) {
                            mnj mnjVar = (mnj) w4VarE.next();
                            SQLiteDatabase sQLiteDatabase5 = vnjVar.h;
                            SQLiteDatabase sQLiteDatabase6 = sQLiteDatabase5 == null ? null : sQLiteDatabase5;
                            int i = vnj.j;
                            cursorQuery = sQLiteDatabase6.query(ybh.x(mnjVar), new String[]{ybh.d(mnjVar), "icon"}, null, null, null, null, null);
                            try {
                                Cursor cursor2 = cursorQuery;
                                while (cursor2.moveToNext()) {
                                    lnj lnjVar = new lnj(mnjVar, cursor2.getLong(0));
                                    if (cursor2.isNull(1)) {
                                        linkedHashSet.add(lnjVar);
                                    } else {
                                        ((Set) linkedHashMap2.get(linkedHashMap3.get(Long.valueOf(cursor2.getLong(1))))).add(lnjVar);
                                    }
                                }
                                vtp.v(cursorQuery, (Throwable) null);
                            } finally {
                            }
                        }
                        SQLiteDatabase sQLiteDatabase7 = vnjVar.h;
                        if (sQLiteDatabase7 == null) {
                            sQLiteDatabase7 = null;
                        }
                        sQLiteDatabase7.beginTransaction();
                        try {
                            o95.u(linkedHashMap3.entrySet(), new tmi(linkedHashMap2, linkedHashMap, vnjVar, (byte) 3), true);
                            SQLiteDatabase sQLiteDatabase8 = vnjVar.h;
                            if (sQLiteDatabase8 == null) {
                                sQLiteDatabase8 = null;
                            }
                            sQLiteDatabase8.setTransactionSuccessful();
                            SQLiteDatabase sQLiteDatabase9 = vnjVar.h;
                            (sQLiteDatabase9 != null ? sQLiteDatabase9 : null).endTransaction();
                            return new fnj(linkedHashMap, linkedHashMap2, linkedHashSet);
                        } catch (Throwable th) {
                            SQLiteDatabase sQLiteDatabase10 = vnjVar.h;
                            (sQLiteDatabase10 != null ? sQLiteDatabase10 : null).endTransaction();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        SQLiteDatabase sQLiteDatabase11 = vnjVar.h;
                        (sQLiteDatabase11 != null ? sQLiteDatabase11 : null).endTransaction();
                        throw th2;
                    }
                } finally {
                }
            default:
                vnj vnjVar2 = (vnj) obj3;
                File file4 = (File) obj;
                vnjVar2.f = false;
                vnjVar2.l(((pnj) obj2).a, file4 != null ? new tnj(file4) : nnj.a);
                return Unit.a;
        }
    }

    public final Object h(qwb qwbVar) {
        Class<k9h> cls;
        byg bygVar = (byg) this.b;
        e20 e20Var = (e20) this.c;
        oup oupVarA = qwbVar.a();
        switch (e20Var.a) {
            case 0:
                cls = z10.class;
                break;
            case 1:
                cls = c05.class;
                break;
            case 2:
                cls = hxg.class;
                break;
            case 3:
                cls = i9h.class;
                break;
            default:
                cls = k9h.class;
                break;
        }
        return bygVar.a(oupVarA, cls);
    }

    @Override // defpackage.fua
    public final Drawable i() {
        Context context = (Context) this.b;
        int iV = y9m.V(((pr) this.c).a, context);
        if (iV == 0) {
            iV = y9m.V(5, context);
        }
        return sgb.F(iV, context);
    }

    public final DnsQuery newQuery(Question question) {
        return RealDnsCache.b((RealDnsCache) this.b, (DnsQuery.Factory) this.c, question);
    }

    public final void o(uya uyaVar) {
        ((tya) this.c).o((bl9) this.b);
    }

    public final Object then(Task task) {
        ivg ivgVar = (ivg) this.b;
        String str = (String) this.c;
        synchronized (ivgVar) {
            ((ArrayMap) ivgVar.c).remove(str);
        }
        return task;
    }

    @Override // defpackage.vlf
    public final void u(OperaListItem operaListItem, boolean z) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 3:
                b9g b9gVar = ((g9g) obj2).s;
                b9gVar.getClass();
                new aq3(b9gVar, (String) obj, z, (byte) 1);
                break;
            default:
                eog eogVar = (eog) obj2;
                eogVar.getClass();
                eogVar.j0((qtd) ((MenuItem) obj));
                break;
        }
    }
}
