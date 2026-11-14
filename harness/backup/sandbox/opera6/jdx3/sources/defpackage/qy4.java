package defpackage;

import J.N;
import android.content.SharedPreferences;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class qy4 implements js5 {
    public byte a;
    public Object b;
    public final Object c;
    public Object d;
    public Object e;

    /* JADX WARN: Multi-variable type inference failed */
    public qy4(int i, Callback callback, ChromiumContent chromiumContent, x5f x5fVar, ru9 ru9Var) {
        this.a = i;
        this.b = callback;
        this.c = chromiumContent;
        this.d = x5fVar;
        this.e = ru9Var;
    }

    public qy4(mv1 mv1Var, ole oleVar) {
        this.a = (byte) 0;
        this.b = mv1Var;
        this.c = oleVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public qy4(s6h s6hVar, ua6 ua6Var, int i) {
        this.c = new Object();
        this.d = s6hVar;
        this.e = ua6Var;
        this.a = i;
    }

    public final boolean a(qs5 qs5Var, boolean z) {
        sqh sqhVar;
        String strI;
        boolean z2 = qs5Var.u;
        if (z2 && (sqhVar = qs5Var.k) != null && (strI = wqm.i(sqhVar.a)) != null && strI.endsWith(".youtube.com")) {
            return false;
        }
        if (z2) {
            String str = qs5Var.e;
            String[] strArr = wqm.a;
            if (str != null && str.startsWith("blob:")) {
                return false;
            }
        }
        if (z && !qs5Var.g.isEmpty()) {
            return false;
        }
        if ((this.a & 8) != 0 && qs5Var.f.length() > 0 && qs5Var.j) {
            return true;
        }
        if (z) {
            return false;
        }
        return qs5Var.s || qs5Var.t || z2;
    }

    public final ArrayList b() {
        ta6 ta6VarClone;
        synchronized (this.c) {
            ta6VarClone = c().clone();
        }
        s6h s6hVar = (s6h) this.d;
        String string = ((SharedPreferences) ((k32) s6hVar.a).get()).getString(((String) s6hVar.b).concat("history"), null);
        if (string == null) {
            string = "";
        }
        int i = 0;
        ArrayList arrayListR = aik.r(false, string, ',');
        ArrayList arrayList = new ArrayList(arrayListR.size() + 1);
        int size = arrayListR.size();
        while (i < size) {
            Object obj = arrayListR.get(i);
            i++;
            arrayList.add(((ua6) this.e).f((String) obj));
        }
        arrayList.add(ta6VarClone);
        return arrayList;
    }

    public final ta6 c() {
        s6h s6hVar = (s6h) this.d;
        ua6 ua6Var = (ua6) this.e;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        ta6 ta6VarE = (ta6) this.b;
        if (ta6VarE == null) {
            String string = ((SharedPreferences) ((k32) s6hVar.a).get()).getString(((String) s6hVar.b).concat("today"), null);
            ta6VarE = string != null ? ua6Var.f(string) : ua6Var.e(gregorianCalendar);
        }
        if (!ta6VarE.e(gregorianCalendar)) {
            if (!ta6VarE.c()) {
                String string2 = ((SharedPreferences) ((k32) s6hVar.a).get()).getString(((String) s6hVar.b).concat("history"), null);
                if (string2 == null) {
                    string2 = "";
                }
                ArrayList arrayListR = aik.r(false, string2, ',');
                arrayListR.add(ua6Var.i(ta6VarE));
                int size = arrayListR.size();
                byte b = this.a;
                if (size > b) {
                    arrayListR.subList(0, arrayListR.size() - b).clear();
                }
                f(arrayListR);
            }
            s6hVar.P();
            ta6VarE = ua6Var.e(gregorianCalendar);
        }
        this.b = ta6VarE;
        return ta6VarE;
    }

    public final void d() {
        f(Collections.EMPTY_LIST);
        synchronized (this.c) {
            ((s6h) this.d).P();
            this.b = null;
        }
    }

    public final void e(qs5 qs5Var, k73 k73Var) {
        boolean z = qs5Var.u;
        ChromiumContent chromiumContent = (ChromiumContent) this.c;
        if (!z) {
            chromiumContent.p.d(new zs5(chromiumContent, qs5Var, k73Var, this.a, (Callback) this.b, (x5f) this.d, (ru9) this.e));
            return;
        }
        String str = qs5Var.e;
        sqh sqhVar = qs5Var.k;
        N.M8vd_RmR(chromiumContent.e(), str, sqhVar != null ? sqhVar.a : "");
    }

    public final void f(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(',');
        }
        ((s6h) this.d).O("history", sb.toString());
    }

    public final void g() {
        synchronized (this.c) {
            ((ua6) this.e).d(c());
            ((s6h) this.d).O("today", ((ua6) this.e).i((ta6) this.b));
        }
    }
}
