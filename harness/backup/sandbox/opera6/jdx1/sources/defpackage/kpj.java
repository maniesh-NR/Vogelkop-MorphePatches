package defpackage;

import android.graphics.Bitmap;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class kpj {
    public static final Bitmap.Config[] d;
    public static final Bitmap.Config[] e;
    public static final Bitmap.Config[] f;
    public static final Bitmap.Config[] g;
    public static final Bitmap.Config[] h;
    public final v3d a = new v3d((byte) 1);
    public final esg b = new esg((byte) 19);
    public final HashMap c = new HashMap();

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        d = configArr;
        e = configArr;
        f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String c(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapD = d(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapD.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapD.remove(num);
                return;
            } else {
                navigableMapD.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        StringBuilder sb = new StringBuilder("Tried to decrement empty size, size: ");
        sb.append(num);
        String strC = c(rm5.x(bitmap), bitmap.getConfig());
        sb.append(", removed: ");
        sb.append(strC);
        sb.append(", this: ");
        sb.append(this);
        throw new NullPointerException(sb.toString());
    }

    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int iW = rm5.w(i, i2, config);
        v3d v3dVar = this.a;
        ArrayDeque arrayDeque = (ArrayDeque) ((n1) v3dVar).b;
        sng sngVarH0 = (sng) arrayDeque.poll();
        if (sngVarH0 == null) {
            sngVarH0 = v3dVar.H0();
        }
        jpj jpjVar = (jpj) sngVarH0;
        jpjVar.b = iW;
        jpjVar.c = config;
        if (Bitmap.Config.RGBA_F16.equals(config)) {
            configArr = e;
        } else {
            int i3 = ipj.a[config.ordinal()];
            configArr = i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? new Bitmap.Config[]{config} : h : g : f : d;
        }
        int length = configArr.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i4];
            Integer num = (Integer) d(config2).ceilingKey(Integer.valueOf(iW));
            if (num == null || num.intValue() > (iW << 3)) {
                i4++;
            } else if (num.intValue() != iW || (config2 != null ? !config2.equals(config) : config != null)) {
                v3dVar.w0(jpjVar);
                int iIntValue = num.intValue();
                sng sngVarH02 = (sng) arrayDeque.poll();
                if (sngVarH02 == null) {
                    sngVarH02 = v3dVar.H0();
                }
                jpjVar = (jpj) sngVarH02;
                jpjVar.b = iIntValue;
                jpjVar.c = config2;
            }
        }
        Bitmap bitmap = (Bitmap) this.b.r(jpjVar);
        if (bitmap != null) {
            a(Integer.valueOf(jpjVar.b), bitmap);
            bitmap.reconfigure(i, i2, config);
        }
        return bitmap;
    }

    public final NavigableMap d(Bitmap.Config config) {
        HashMap map = this.c;
        NavigableMap navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    public final void e(Bitmap bitmap) {
        int iX = rm5.x(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        v3d v3dVar = this.a;
        sng sngVarH0 = (sng) ((ArrayDeque) ((n1) v3dVar).b).poll();
        if (sngVarH0 == null) {
            sngVarH0 = v3dVar.H0();
        }
        jpj jpjVar = (jpj) sngVarH0;
        jpjVar.b = iX;
        jpjVar.c = config;
        this.b.A(jpjVar, bitmap);
        NavigableMap navigableMapD = d(bitmap.getConfig());
        Integer num = (Integer) navigableMapD.get(Integer.valueOf(jpjVar.b));
        navigableMapD.put(Integer.valueOf(jpjVar.b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.b);
        sb.append(", sortedSizes=(");
        HashMap map = this.c;
        for (Map.Entry entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!map.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}
