package defpackage;

import java.util.HashMap;
import kotlin.Pair;

/* loaded from: classes.dex */
public enum xkf {
    INFO(2132084975),
    WARNING(2132084977),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR(2132084974),
    /* JADX INFO: Fake field, exist only in values array */
    SUCCESS(2132084976);

    public static final j06 b = new j06((byte) 22);
    public static final int[] c = {2130968736, 2130969892, 2130969893, 2130970355, 2130970357, 2130970441, 2130970442, 2130970562, 2130970563, 2130971138, 2130971152};
    public static final HashMap d;
    public final int a;

    static {
        Pair[] pairArr = {new Pair(0, new lf5((byte) 13)), new Pair(1, new lf5((byte) 16)), new Pair(2, new lf5((byte) 17)), new Pair(3, new lf5((byte) 18)), new Pair(4, new lf5((byte) 19)), new Pair(5, new lf5((byte) 20)), new Pair(6, new lf5((byte) 21)), new Pair(7, new lf5((byte) 22)), new Pair(8, new lf5((byte) 23)), new Pair(9, new lf5((byte) 14)), new Pair(10, new lf5((byte) 15))};
        HashMap map = new HashMap(qbd.a(11));
        rbd.g(map, pairArr);
        d = map;
    }

    xkf(int i) {
        this.a = i;
    }
}
