package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.CharsKt;

/* loaded from: classes.dex */
public final class vnj {
    public static final long i;
    public static final /* synthetic */ int j = 0;
    public final umi a;
    public final p8f b;
    public final k32 c;
    public final qie d;
    public final ArrayList e;
    public boolean f;
    public fnj g;
    public SQLiteDatabase h;

    static {
        on7 on7Var = pn7.b;
        i = cs5.x0(5, un7.f);
    }

    public vnj(Context context, umi umiVar) {
        p8f p8fVar = new p8f(context, umiVar);
        jlh jlhVar = new jlh(context, "bsi", null, 3, (byte) 2);
        k32 k32Var = new k32(context, (byte) 7);
        this.a = umiVar;
        this.b = p8fVar;
        this.c = k32Var;
        qie qieVar = new qie((byte) 19);
        this.d = qieVar;
        this.e = new ArrayList();
        qieVar.n(umiVar.e(new mgf((Object) this, (Object) jlhVar, (byte) 28)).c(new txi(this, (byte) 5)), null);
    }

    public final void a() {
        ArrayList arrayList = this.e;
        if (arrayList.isEmpty() || this.f || this.g == null) {
            return;
        }
        this.f = true;
        pnj pnjVar = (pnj) CollectionsKt.K(arrayList);
        String str = pnjVar.a;
        vvf vvfVar = new vvf(this, pnjVar, (byte) 22);
        p8f p8fVar = this.b;
        String strT = dbh.t(((pne) ((zyk) p8fVar.c).getValue()).a, str);
        if (strT.length() == 0) {
            vvfVar.invoke(new gnj(404));
        } else {
            ((umi) p8fVar.b).a(new jbd(p8fVar, strT, vvfVar, (byte) 18)).a(null);
        }
    }

    public final void b(String str, lnj lnjVar) {
        fnj fnjVar = this.g;
        if (fnjVar == null) {
            fnjVar = null;
        }
        if (fnjVar.c.remove(lnjVar)) {
            g(new cnj(this, lnjVar, (byte) 1));
            return;
        }
        fnj fnjVar2 = this.g;
        if (fnjVar2 == null) {
            fnjVar2 = null;
        }
        Set set = (Set) fnjVar2.b.get(str);
        if (set == null || !set.remove(lnjVar)) {
            return;
        }
        if (!set.isEmpty()) {
            g(new cnj(this, lnjVar, (byte) 2));
            return;
        }
        fnj fnjVar3 = this.g;
        if (fnjVar3 == null) {
            fnjVar3 = null;
        }
        fnjVar3.b.remove(str);
        fnj fnjVar4 = this.g;
        (fnjVar4 != null ? fnjVar4 : null).a.remove(str);
        g(new enj(this, lnjVar, str, (byte) 0));
    }

    public final void c() {
        mnj mnjVar = mnj.a;
        ArrayList arrayList = new ArrayList();
        fnj fnjVar = this.g;
        if (fnjVar == null) {
            fnjVar = null;
        }
        for (Map.Entry entry : fnjVar.b.entrySet()) {
            String str = (String) entry.getKey();
            for (lnj lnjVar : (Set) entry.getValue()) {
                if (lnjVar.a == mnjVar) {
                    arrayList.add(new Pair(lnjVar, str));
                }
            }
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            Pair pair = (Pair) obj;
            b((String) pair.b, (lnj) pair.a);
        }
    }

    public final void d(String str, lnj lnjVar) {
        fnj fnjVar = this.g;
        if (fnjVar == null) {
            fnjVar = null;
        }
        Set set = (Set) fnjVar.b.get(str);
        if (set == null || !set.contains(lnjVar)) {
            fnj fnjVar2 = this.g;
            if (fnjVar2 == null) {
                fnjVar2 = null;
            }
            if (fnjVar2.c.remove(lnjVar)) {
                g(new cnj(this, lnjVar, (byte) 0));
            }
            fnj fnjVar3 = this.g;
            if (fnjVar3 == null) {
                fnjVar3 = null;
            }
            this.d.n(this.a.e(new is6((Object) this, (Object) lnjVar, (Object) str, fnjVar3.a.get(str) instanceof tnj, (byte) 4)).c(new vdi(this, str, lnjVar, (byte) 3)), null);
        }
    }

    public final String e(knj knjVar) {
        String str = knjVar.a;
        this.b.getClass();
        String strR = dbh.r(str);
        if (strR.length() == 0) {
            return null;
        }
        return strR;
    }

    public final ifd f(knj knjVar, Function1 function1) {
        String strE = e(knjVar);
        lnj lnjVar = knjVar.b;
        nnj nnjVar = nnj.a;
        if (strE == null) {
            return nnjVar;
        }
        fnj fnjVar = this.g;
        ArrayList arrayList = this.e;
        if (fnjVar == null) {
            arrayList.add(new pnj(strE, lnjVar, function1));
            return null;
        }
        ifd ifdVar = (ifd) fnjVar.a.get(strE);
        if (ifdVar != null) {
            h(lnjVar, strE, ifdVar);
            return ifdVar;
        }
        fnj fnjVar2 = this.g;
        if (fnjVar2 == null) {
            fnjVar2 = null;
        }
        if (fnjVar2.c.contains(lnjVar)) {
            fnj fnjVar3 = this.g;
            (fnjVar3 != null ? fnjVar3 : null).a.put(strE, nnjVar);
            return nnjVar;
        }
        arrayList.add(new pnj(strE, lnjVar, function1));
        a();
        return null;
    }

    public final void g(Runnable runnable) {
        this.d.n(new oml(this.a.c(runnable)), null);
    }

    public final void h(lnj lnjVar, String str, ifd ifdVar) {
        if (ifdVar instanceof nnj) {
            return;
        }
        fnj fnjVar = this.g;
        if (fnjVar == null) {
            fnjVar = null;
        }
        if (((Set) fnjVar.b.get(str)).add(lnjVar)) {
            g(new enj(this, lnjVar, str, (byte) 1));
        }
    }

    public final File i(long j2) {
        return new File((File) this.c.get(), sko.j("ico-", Long.toString(j2, CharsKt.checkRadix(16))));
    }

    public final void j(knj knjVar) {
        String strE = e(knjVar);
        lnj lnjVar = knjVar.b;
        if (strE != null) {
            ArrayList arrayList = new ArrayList();
            vvf vvfVar = new vvf(knjVar, arrayList, (byte) 21);
            ArrayList arrayList2 = this.e;
            o95.v(arrayList2, vvfVar);
            if (this.g != null) {
                b(strE, lnjVar);
            } else {
                arrayList2.add(new qnj(strE, lnjVar));
            }
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((Function1) obj).invoke(nnj.a);
            }
        }
    }

    public final void k(lnj lnjVar) {
        SQLiteDatabase sQLiteDatabase = this.h;
        if (sQLiteDatabase == null) {
            sQLiteDatabase = null;
        }
        sQLiteDatabase.delete(ybh.x(lnjVar.a), ybh.d(lnjVar.a).concat("=?"), new String[]{String.valueOf(lnjVar.b)});
    }

    public final void l(String str, ifd ifdVar) {
        fnj fnjVar = this.g;
        if (fnjVar == null) {
            fnjVar = null;
        }
        fnjVar.a.put(str, ifdVar);
        fnj fnjVar2 = this.g;
        (fnjVar2 != null ? fnjVar2 : null).b.putIfAbsent(str, new LinkedHashSet());
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        o95.v(this.e, new pr3(str, ifdVar, this, linkedHashSet, linkedHashSet2, arrayList, (byte) 3));
        if (!linkedHashSet.isEmpty() || !linkedHashSet2.isEmpty()) {
            g(new jbd(this, linkedHashSet, linkedHashSet2, (byte) 17));
        }
        a();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((Function1) obj).invoke(ifdVar);
        }
    }

    public final void m(knj knjVar) {
        String strE = e(knjVar);
        lnj lnjVar = knjVar.b;
        if (strE == null) {
            return;
        }
        if (this.g != null) {
            d(strE, lnjVar);
        } else {
            this.e.add(new snj(strE, lnjVar));
        }
    }

    public final void n(Set set, Set set2) {
        SQLiteDatabase sQLiteDatabase = this.h;
        if (sQLiteDatabase == null) {
            sQLiteDatabase = null;
        }
        sQLiteDatabase.beginTransaction();
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                lnj lnjVar = (lnj) it.next();
                ContentValues contentValues = new ContentValues();
                contentValues.put(ybh.d(lnjVar.a), Long.valueOf(lnjVar.b));
                SQLiteDatabase sQLiteDatabase2 = this.h;
                if (sQLiteDatabase2 == null) {
                    sQLiteDatabase2 = null;
                }
                sQLiteDatabase2.insert(ybh.x(lnjVar.a), null, contentValues);
            }
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                lnj lnjVar2 = (lnj) it2.next();
                SQLiteDatabase sQLiteDatabase3 = this.h;
                if (sQLiteDatabase3 == null) {
                    sQLiteDatabase3 = null;
                }
                sQLiteDatabase3.delete(ybh.x(lnjVar2.a), ybh.d(lnjVar2.a).concat("=?") + " AND icon IS NULL", new String[]{String.valueOf(lnjVar2.b)});
            }
            SQLiteDatabase sQLiteDatabase4 = this.h;
            if (sQLiteDatabase4 == null) {
                sQLiteDatabase4 = null;
            }
            sQLiteDatabase4.setTransactionSuccessful();
        } finally {
            SQLiteDatabase sQLiteDatabase5 = this.h;
            (sQLiteDatabase5 != null ? sQLiteDatabase5 : null).endTransaction();
        }
    }

    public final File o(InputStream inputStream, String str) {
        SQLiteDatabase sQLiteDatabase = this.h;
        if (sQLiteDatabase == null) {
            sQLiteDatabase = null;
        }
        sQLiteDatabase.beginTransaction();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("origin", str);
            SQLiteDatabase sQLiteDatabase2 = this.h;
            if (sQLiteDatabase2 == null) {
                sQLiteDatabase2 = null;
            }
            File fileI = i(sQLiteDatabase2.insertOrThrow("icons", null, contentValues));
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileI), 8192);
                try {
                    s29.a(inputStream, bufferedOutputStream);
                    bufferedOutputStream.close();
                    SQLiteDatabase sQLiteDatabase3 = this.h;
                    if (sQLiteDatabase3 == null) {
                        sQLiteDatabase3 = null;
                    }
                    sQLiteDatabase3.setTransactionSuccessful();
                    return fileI;
                } finally {
                }
            } catch (IOException e) {
                fileI.delete();
                throw e;
            }
        } finally {
            SQLiteDatabase sQLiteDatabase4 = this.h;
            (sQLiteDatabase4 != null ? sQLiteDatabase4 : null).endTransaction();
        }
    }
}
