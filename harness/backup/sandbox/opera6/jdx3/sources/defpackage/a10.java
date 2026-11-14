package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class a10 extends d10 {
    public HashMap L;

    @Override // defpackage.d10
    public final boolean v0() {
        return this.L != null;
    }

    @Override // defpackage.d10
    public final c10 w0(lgh lghVar, String str) {
        return new z00(this, lghVar.c.indexOf(str), str, ha2.M(this.E, 2131558742, 0));
    }

    @Override // defpackage.d10
    public final lgh y0(int i) {
        Object obj = f0().u.B;
        Object obj2 = Collections.EMPTY_MAP;
        if (obj == null) {
            obj = obj2;
        }
        HashMap map = (Map) obj;
        List list = ((lgh) this.H.get(i)).c;
        HashMap map2 = null;
        if (!list.isEmpty() && !map.isEmpty() && list.size() == map.size()) {
            Iterator it = map.values().iterator();
            int iIntValue = 0;
            while (it.hasNext()) {
                iIntValue += ((Integer) it.next()).intValue();
            }
            HashMap map3 = new HashMap();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i2 < list.size()) {
                    if (((Integer) map.get(String.valueOf(i2))) == null) {
                        break;
                    }
                    int iRound = iIntValue == 0 ? 0 : Math.round((r8.intValue() * 100.0f) / iIntValue);
                    i3 += iRound;
                    map3.put((String) list.get(i2), Integer.valueOf(iRound));
                    i2++;
                } else {
                    int i4 = 100 - i3;
                    while (Math.abs(i4) > 0) {
                        int i5 = 1;
                        String str = (String) list.get(Math.abs(i4) - 1);
                        if (i4 <= 0) {
                            i5 = -1;
                        }
                        map3.put(str, Integer.valueOf(((Integer) map3.get(str)).intValue() + i5));
                        i4 -= i5;
                    }
                    map2 = map3;
                }
            }
        }
        this.L = map2;
        return super.y0(i);
    }
}
