package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class o00 implements srg {
    public final /* synthetic */ byte a;

    public /* synthetic */ o00(byte b) {
        this.a = b;
    }

    public final boolean apply(Object obj) {
        boolean z = false;
        switch (this.a) {
            case 0:
                return s00.q((w06) obj, 3);
            case 1:
                lgh lghVar = (lgh) obj;
                return (lghVar.c == null || lghVar.a == 3) ? false : true;
            case 2:
                return ((dn5) obj).d;
            case 3:
                return ((Map.Entry) obj).getKey() != null;
            case 4:
                return ((String) obj) != null;
            case 5:
                return ((gyj) obj).e;
            case 6:
                return !((String) obj).isEmpty();
            case 7:
                return !((String) obj).isEmpty();
            case 8:
                return !((String) obj).isEmpty();
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return !((String) obj).isEmpty();
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return true;
            case 11:
                byte b = ((ook) obj).e;
                if (b == 7 || b == 8) {
                }
                return !z;
            default:
                ArrayList arrayList = ((vun) obj).c;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    if (!((uun) obj2).b) {
                        break;
                    }
                }
                return !z;
        }
        z = true;
        return !z;
    }
}
