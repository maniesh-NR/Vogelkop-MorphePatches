package defpackage;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;
import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class b91 implements dr9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b91(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                c91 c91Var = (c91) obj5;
                sam samVarB = c91Var.e.b((lh9) obj, (ki9) obj2, ((gi9) obj3).a, ((hi9) obj4).a);
                if (samVarB instanceof ram) {
                    return (Typeface) ((ram) samVarB).a;
                }
                ghf ghfVar = new ghf(samVarB, c91Var.j);
                c91Var.j = ghfVar;
                return (Typeface) ghfVar.d;
            case 1:
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                ((ssk) obj5).l(new zo9(sQLiteQuery));
                return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
            default:
                ue5 ue5Var = (ue5) obj5;
                y4c y4cVar = (y4c) obj;
                ((Integer) obj2).getClass();
                ih5 ih5Var = (ih5) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((vt9) ih5Var).f(y4cVar) ? 4 : 2;
                }
                vt9 vt9Var = (vt9) ih5Var;
                if (vt9Var.N(iIntValue & 1, (iIntValue & 131) != 130)) {
                    ue5Var.invoke(y4cVar, vt9Var, Integer.valueOf(iIntValue & 14));
                } else {
                    vt9Var.Q();
                }
                return Unit.a;
        }
    }
}
