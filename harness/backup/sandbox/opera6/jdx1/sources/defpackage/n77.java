package defpackage;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.TreeMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class n77 {
    public static final /* synthetic */ int a = 0;

    static {
        qs7.B("DiagnosticsWrkr");
    }

    public static final void a(c5o c5oVar, k5o k5oVar, vzk vzkVar, ArrayList arrayList) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            h5o h5oVar = (h5o) obj;
            w4o w4oVarG = y7h.g(h5oVar);
            String str = h5oVar.a;
            tzk tzkVarP = vzkVar.P(w4oVarG);
            Integer numValueOf = tzkVarP != null ? Integer.valueOf(tzkVarP.c) : null;
            c5oVar.getClass();
            TreeMap treeMap = e6i.i;
            e6i e6iVarE = aoh.e(1, "SELECT name FROM workname WHERE work_spec_id=?");
            e6iVarE.w(1, str);
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c5oVar.a;
            workDatabase_Impl.b();
            Cursor cursorS = workDatabase_Impl.s(e6iVarE);
            try {
                ArrayList arrayList2 = new ArrayList(cursorS.getCount());
                while (cursorS.moveToNext()) {
                    arrayList2.add(cursorS.getString(0));
                }
                cursorS.close();
                e6iVarE.release();
                String strP = CollectionsKt.P(arrayList2, ",", (CharSequence) null, (String) null, 0, (Function1) null, 62);
                String strP2 = CollectionsKt.P(k5oVar.m(str), ",", (CharSequence) null, (String) null, 0, (Function1) null, 62);
                StringBuilder sbS = p3p.s("\n", str, "\t ");
                sbS.append(h5oVar.c);
                sbS.append("\t ");
                sbS.append(numValueOf);
                sbS.append("\t ");
                sbS.append(z1m.x(h5oVar.b));
                sbS.append("\t ");
                sbS.append(strP);
                sbS.append("\t ");
                sbS.append(strP2);
                sbS.append('\t');
            } catch (Throwable th) {
                cursorS.close();
                e6iVarE.release();
                throw th;
            }
        }
    }
}
