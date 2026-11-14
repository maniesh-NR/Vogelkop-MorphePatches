package defpackage;

import androidx.core.app.NotificationCompat;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class itk {
    public static final igk e = igk.DEFAULT;
    public static final ftk[] f = {ftk.S720P_16_9, ftk.S1080P_4_3, ftk.S1080P_16_9, ftk.S1440P_16_9, ftk.UHD, ftk.X_VGA};
    public static final Map g;
    public static final LinkedHashMap h;
    public final htk a;
    public final ftk b;
    public final igk c;
    public final int d;

    static {
        Map mapC = rbd.c(new Pair[]{new Pair(htk.b, 35), new Pair(htk.c, Integer.valueOf(NotificationCompat.FLAG_LOCAL_ONLY)), new Pair(htk.d, 4101), new Pair(htk.e, 32), new Pair(htk.a, 34)});
        g = mapC;
        Set<Map.Entry> setEntrySet = mapC.entrySet();
        int iA = qbd.a(k95.o(setEntrySet, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap.put(Integer.valueOf(((Number) entry.getValue()).intValue()), (htk) entry.getKey());
        }
        h = linkedHashMap;
    }

    public itk(htk htkVar, ftk ftkVar, igk igkVar) {
        this.a = htkVar;
        this.b = ftkVar;
        this.c = igkVar;
        Integer num = (Integer) g.get(htkVar);
        this.d = num != null ? num.intValue() : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof itk)) {
            return false;
        }
        itk itkVar = (itk) obj;
        return this.a == itkVar.a && this.b == itkVar.b && this.c == itkVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SurfaceConfig(configType=" + this.a + ", configSize=" + this.b + ", streamUseCase=" + this.c + ')';
    }
}
