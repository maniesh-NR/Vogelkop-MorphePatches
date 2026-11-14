package defpackage;

import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class gc9 implements esk {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gc9(Object obj, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
    }

    public final Object get() throws Throwable {
        int iIntValue;
        byte b = this.a;
        hlh hlhVar = null;
        long j = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                pc9 pc9Var = (pc9) obj;
                kfo.Y(pc9Var.c().a, false, true, new x41(j, (byte) 12));
                jc9 jc9Var = pc9Var.j;
                if (jc9Var == null) {
                    return null;
                }
                HashMap map = jc9Var.a;
                Integer num = (Integer) map.remove(Long.valueOf(j));
                if (num == null) {
                    iIntValue = -1;
                } else {
                    for (Map.Entry entry : map.entrySet()) {
                        if (((Integer) entry.getValue()).intValue() > num.intValue()) {
                            entry.setValue(Integer.valueOf(((Integer) entry.getValue()).intValue() - 1));
                        }
                    }
                    iIntValue = num.intValue();
                }
                if (iIntValue >= 0) {
                    return Integer.valueOf(iIntValue);
                }
                return null;
            default:
                try {
                    Cursor cursorQuery = ((glh) obj).a.getWritableDatabase().query("reading", jlh.b, "id=?", new String[]{String.valueOf(j)}, null, null, null);
                    hlh hlhVar2 = new hlh(cursorQuery);
                    try {
                        ilh ilhVar = cursorQuery.moveToFirst() ? new ilh(hlhVar2) : null;
                        xvg.l(hlhVar2);
                        return ilhVar;
                    } catch (Throwable th) {
                        th = th;
                        hlhVar = hlhVar2;
                        xvg.l(hlhVar);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
        }
    }
}
