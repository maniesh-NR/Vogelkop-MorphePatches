package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public final /* synthetic */ class qhd implements did, vqd, urg, wdi {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qhd(long j, dp2 dp2Var) {
        this.a = j;
        this.b = dp2Var;
    }

    public /* synthetic */ qhd(long j, Object obj) {
        this.b = obj;
        this.a = j;
    }

    @Override // defpackage.wdi
    public final Object apply(Object obj) {
        dp2 dp2Var = (dp2) this.b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.a));
        String str = dp2Var.a;
        myg mygVar = dp2Var.c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(ryg.a(mygVar))}) < 1) {
            contentValues.put("backend_name", str);
            contentValues.put("priority", Integer.valueOf(ryg.a(mygVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    public final void c(ssa ssaVar, int i) {
        gid gidVar = (gid) this.b;
        ssaVar.y0(gidVar.c, i, this.a);
    }

    public final Object l(npd npdVar, nod nodVar, int i) {
        return npdVar.p(nodVar, h1b.v((qjd) this.b), 0, this.a);
    }

    @Override // defpackage.urg
    public final boolean test(Object obj) {
        vi5 vi5Var = (vi5) this.b;
        ilh ilhVar = (ilh) obj;
        if (ilhVar.k > vi5Var.c) {
            return false;
        }
        long j = this.a - ilhVar.d;
        return j >= vi5Var.a && j <= vi5Var.b;
    }
}
